/*     */ package de.torui.coflsky.handlers;
/*     */ 
/*     */ import de.torui.coflsky.Config;
/*     */ import de.torui.coflsky.network.QueryServerCommands;
/*     */ import de.torui.coflsky.network.WSClient;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Base64;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.gui.inventory.GuiChest;
/*     */ import net.minecraft.client.gui.inventory.GuiContainer;
/*     */ import net.minecraft.inventory.ContainerChest;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.inventory.Slot;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.CompressedStreamTools;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ import net.minecraftforge.client.event.GuiOpenEvent;
/*     */ import net.minecraftforge.event.entity.player.ItemTooltipEvent;
/*     */ 
/*     */ public class DescriptionHandler {
/*     */   private static class InventoryWrapper {
/*     */     public String chestName;
/*     */     public String fullInventoryNbt;
/*     */     
/*     */     private InventoryWrapper() {}
/*     */   }
/*     */   
/*     */   private static class DescModification {
/*     */     public String type;
/*     */     public String value;
/*     */     public int line;
/*     */   }
/*  38 */   public static HashMap<ItemStack, DescModification[]> tooltipItemMap = (HashMap)new HashMap<>();
/*  39 */   public static HashMap<String, DescModification[]> tooltipItemIdMap = (HashMap)new HashMap<>();
/*     */   
/*  41 */   public static final DescModification[] EMPTY_ARRAY = new DescModification[0];
/*  42 */   public static final NBTTagCompound EMPTY_COMPOUND = new NBTTagCompound();
/*     */   
/*     */   private boolean IsOpen = true;
/*     */   private boolean shouldUpdate = false;
/*     */   
/*     */   public void Close() {
/*  48 */     this.IsOpen = false;
/*     */   }
/*     */   
/*     */   public static String ExtractStackableIdFromItemStack(ItemStack stack) {
/*  52 */     if (stack != null) {
/*     */       
/*     */       try {
/*  55 */         String uuid = stack.serializeNBT().func_74775_l("tag").func_74775_l("ExtraAttributes").func_74779_i("id") + ":" + stack.field_77994_a;
/*  56 */         if (uuid.length() == 0) {
/*  57 */           throw new Exception();
/*     */         }
/*  59 */         return uuid;
/*  60 */       } catch (Exception exception) {}
/*     */     }
/*     */     
/*  63 */     return "";
/*     */   }
/*     */   
/*     */   public static String ExtractIdFromItemStack(ItemStack stack) {
/*  67 */     if (stack != null) {
/*     */       
/*     */       try {
/*  70 */         String uuid = stack.serializeNBT().func_74775_l("tag").func_74775_l("ExtraAttributes").func_74779_i("uuid");
/*  71 */         if (uuid.length() == 0) {
/*  72 */           throw new Exception();
/*     */         }
/*  74 */         return uuid;
/*  75 */       } catch (Exception exception) {}
/*     */     }
/*     */     
/*  78 */     return ExtractStackableIdFromItemStack(stack);
/*     */   }
/*     */   
/*     */   private DescModification[] getTooltipData(ItemStack itemStack) {
/*  82 */     if (tooltipItemMap.containsKey(itemStack)) {
/*  83 */       return tooltipItemMap.getOrDefault(itemStack, EMPTY_ARRAY);
/*     */     }
/*  85 */     String id = ExtractIdFromItemStack(itemStack);
/*  86 */     if (tooltipItemIdMap.containsKey(id)) {
/*  87 */       return tooltipItemIdMap.getOrDefault(id, EMPTY_ARRAY);
/*     */     }
/*  89 */     this.shouldUpdate = true;
/*     */     
/*  91 */     return EMPTY_ARRAY;
/*     */   }
/*     */ 
/*     */   
/*     */   public void loadDescriptionAndListenForChanges(GuiOpenEvent event) {
/*  96 */     GuiContainer gc = (GuiContainer)event.gui;
/*     */     
/*  98 */     loadDescriptionForInventory(event, gc, false);
/*  99 */     int iteration = 0;
/* 100 */     while (this.IsOpen) {
/* 101 */       iteration++;
/*     */       try {
/* 103 */         Thread.sleep((300 + iteration));
/* 104 */       } catch (InterruptedException e) {
/* 105 */         throw new RuntimeException(e);
/*     */       } 
/* 107 */       if (this.shouldUpdate || (iteration % 10 == 0 && hasAnyStackChanged(gc))) {
/* 108 */         this.shouldUpdate = false;
/* 109 */         loadDescriptionForInventory(event, gc, true);
/*     */       } 
/* 111 */       if (iteration >= 30)
/* 112 */         iteration = 30; 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean hasAnyStackChanged(GuiContainer gc) {
/* 117 */     for (Slot obj : gc.field_147002_h.field_75151_b) {
/* 118 */       ItemStack stack = obj.func_75211_c();
/* 119 */       if (stack != null && !tooltipItemMap.containsKey(stack)) {
/* 120 */         return true;
/*     */       }
/*     */     } 
/* 123 */     return false;
/*     */   }
/*     */   
/*     */   private static void loadDescriptionForInventory(GuiOpenEvent event, GuiContainer gc, boolean skipLoadCheck) {
/* 127 */     InventoryWrapper wrapper = new InventoryWrapper();
/* 128 */     if (event.gui instanceof GuiChest) {
/* 129 */       if (!skipLoadCheck) {
/* 130 */         waitForChestContentLoad(event, gc);
/*     */       }
/* 132 */       ContainerChest chest = (ContainerChest)((GuiChest)event.gui).field_147002_h;
/* 133 */       IInventory inv = chest.func_85151_d();
/* 134 */       if (inv.func_145818_k_()) {
/* 135 */         String chestName = inv.func_70005_c_();
/* 136 */         wrapper.chestName = chestName;
/*     */       } 
/*     */     } 
/*     */     
/* 140 */     NBTTagCompound compound = new NBTTagCompound();
/* 141 */     NBTTagList tl = new NBTTagList();
/*     */     
/* 143 */     for (Slot obj : gc.field_147002_h.field_75151_b) {
/* 144 */       ItemStack stack = obj.func_75211_c();
/* 145 */       if (stack != null) {
/* 146 */         tl.func_74742_a((NBTBase)stack.serializeNBT()); continue;
/*     */       } 
/* 148 */       tl.func_74742_a((NBTBase)EMPTY_COMPOUND);
/*     */     } 
/*     */ 
/*     */     
/* 152 */     ByteArrayOutputStream baos = new ByteArrayOutputStream();
/*     */     try {
/* 154 */       compound.func_74782_a("i", (NBTBase)tl);
/* 155 */       CompressedStreamTools.func_74799_a(compound, baos);
/*     */       
/* 157 */       wrapper.fullInventoryNbt = Base64.getEncoder().encodeToString(baos.toByteArray());
/*     */       
/* 159 */       List<ItemStack> stacks = new ArrayList<>();
/* 160 */       for (Slot obj : gc.field_147002_h.field_75151_b) {
/* 161 */         stacks.add(obj.func_75211_c());
/*     */       }
/*     */       
/* 164 */       String data = WSClient.gson.toJson(wrapper);
/* 165 */       String info = QueryServerCommands.PostRequest(Config.BaseUrl + "/api/mod/description/modifications", data);
/*     */       
/* 167 */       DescModification[][] arr = (DescModification[][])WSClient.gson.fromJson(info, DescModification[][].class);
/* 168 */       int i = 0;
/* 169 */       for (ItemStack stack : stacks) {
/* 170 */         tooltipItemMap.put(stack, arr[i]);
/* 171 */         String id = ExtractIdFromItemStack(stack);
/* 172 */         if (id.length() > 0)
/* 173 */           tooltipItemIdMap.put(id, arr[i]); 
/* 174 */         i++;
/*     */       }
/*     */     
/* 177 */     } catch (IOException e) {
/* 178 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void waitForChestContentLoad(GuiOpenEvent event, GuiContainer gc) {
/* 183 */     for (int i = 1; i < 10 && (
/* 184 */       (Slot)gc.field_147002_h.field_75151_b.get(gc.field_147002_h.field_75151_b.size() - 37)).func_75211_c() == null; i++) {
/*     */ 
/*     */       
/*     */       try {
/*     */         
/* 189 */         Thread.sleep((20 * i));
/* 190 */       } catch (InterruptedException e) {
/* 191 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setTooltips(ItemTooltipEvent event) {
/* 197 */     DescModification[] data = getTooltipData(event.itemStack);
/*     */     
/* 199 */     if (data == null || data.length == 0) {
/*     */       return;
/*     */     }
/* 202 */     for (DescModification datum : data) {
/* 203 */       if (event.toolTip.size() <= datum.line) {
/* 204 */         System.out.println("Skipped line modification " + datum.line + " for " + event.itemStack.func_82833_r());
/*     */       } else {
/*     */         
/* 207 */         switch (datum.type) {
/*     */           case "APPEND":
/* 209 */             event.toolTip.add(datum.value);
/*     */             break;
/*     */           case "REPLACE":
/* 212 */             event.toolTip.set(datum.line, datum.value);
/*     */             break;
/*     */           case "INSERT":
/* 215 */             event.toolTip.add(datum.line, datum.value);
/*     */             break;
/*     */           case "DELETE":
/* 218 */             event.toolTip.remove(datum.line);
/*     */             break;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void emptyTooltipData() {
/* 228 */     tooltipItemMap.clear();
/* 229 */     tooltipItemIdMap.clear();
/* 230 */     tooltipItemIdMap.clear();
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\handlers\DescriptionHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */