/*     */ package de.torui.coflsky.handlers;
/*     */ 
/*     */ import com.mojang.realmsclient.util.Pair;
/*     */ import de.torui.coflsky.CoflSky;
/*     */ import de.torui.coflsky.CountdownTimer;
/*     */ import de.torui.coflsky.WSCommandHandler;
/*     */ import de.torui.coflsky.commands.Command;
/*     */ import de.torui.coflsky.commands.CommandType;
/*     */ import de.torui.coflsky.commands.JsonStringCommand;
/*     */ import de.torui.coflsky.commands.models.AuctionData;
/*     */ import de.torui.coflsky.commands.models.FlipData;
/*     */ import de.torui.coflsky.configuration.Configuration;
/*     */ import de.torui.coflsky.network.WSClient;
/*     */ import java.time.LocalDateTime;
/*     */ import java.util.Timer;
/*     */ import java.util.TimerTask;
/*     */ import java.util.concurrent.ExecutorService;
/*     */ import java.util.concurrent.Executors;
/*     */ import java.util.concurrent.LinkedBlockingQueue;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.inventory.GuiChest;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.inventory.ContainerChest;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraftforge.client.event.ClientChatReceivedEvent;
/*     */ import net.minecraftforge.client.event.GuiOpenEvent;
/*     */ import net.minecraftforge.client.event.GuiScreenEvent;
/*     */ import net.minecraftforge.client.event.RenderGameOverlayEvent;
/*     */ import net.minecraftforge.event.entity.player.ItemTooltipEvent;
/*     */ import net.minecraftforge.fml.common.eventhandler.EventPriority;
/*     */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.gameevent.InputEvent;
/*     */ import net.minecraftforge.fml.common.gameevent.TickEvent;
/*     */ import net.minecraftforge.fml.common.network.FMLNetworkEvent;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EventRegistry
/*     */ {
/*  47 */   public static Pattern chatpattern = Pattern.compile("a^", 2);
/*  48 */   public final ExecutorService chatThreadPool = Executors.newFixedThreadPool(2);
/*  49 */   public final ExecutorService tickThreadPool = Executors.newFixedThreadPool(2);
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onDisconnectedFromServerEvent(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {
/*  53 */     if (CoflSky.Wrapper.isRunning) {
/*  54 */       System.out.println("Disconnected from server");
/*  55 */       CoflSky.Wrapper.stop();
/*  56 */       System.out.println("CoflSky stopped");
/*     */     } 
/*     */   }
/*     */   
/*  60 */   public long LastClick = System.currentTimeMillis();
/*     */   
/*     */   private DescriptionHandler descriptionHandler;
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
/*     */   public void onKeyEvent(InputEvent.KeyInputEvent event) {
/*  67 */     if (CoflSky.keyBindings[0].func_151468_f() && 
/*  68 */       WSCommandHandler.lastOnClickEvent != null) {
/*  69 */       FlipData f = WSCommandHandler.flipHandler.fds.GetLastFlip();
/*  70 */       if (f != null) {
/*  71 */         WSCommandHandler.Execute("/cofl openauctiongui " + f.Id + " false", 
/*  72 */             (Entity)(Minecraft.func_71410_x()).field_71439_g);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  77 */     if (CoflSky.keyBindings[1].func_151470_d() && 
/*  78 */       System.currentTimeMillis() - this.LastClick >= 300L) {
/*     */       
/*  80 */       FlipData f = WSCommandHandler.flipHandler.fds.GetHighestFlip();
/*     */       
/*  82 */       if (f != null) {
/*  83 */         WSCommandHandler.Execute("/cofl openauctiongui " + f.Id + " true", 
/*  84 */             (Entity)(Minecraft.func_71410_x()).field_71439_g);
/*  85 */         LastViewAuctionUUID = f.Id;
/*  86 */         LastViewAuctionInvocation = System.currentTimeMillis();
/*  87 */         this.LastClick = System.currentTimeMillis();
/*  88 */         String command = WSClient.gson.toJson("/viewauction " + f.Id);
/*     */         
/*  90 */         CoflSky.Wrapper.SendMessage((Command)new JsonStringCommand(CommandType.Clicked, command));
/*  91 */         WSCommandHandler.Execute("/cofl track besthotkey " + f.Id, (Entity)(Minecraft.func_71410_x()).field_71439_g);
/*     */       
/*     */       }
/*  94 */       else if (CoflSky.keyBindings[1].func_151468_f()) {
/*  95 */         WSCommandHandler.Execute("/cofl dialog nobestflip", (Entity)(Minecraft.func_71410_x()).field_71439_g);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void DrawOntoGUI(RenderGameOverlayEvent rgoe) {
/* 105 */     if (rgoe.type == RenderGameOverlayEvent.ElementType.CROSSHAIRS) {
/* 106 */       Minecraft mc = Minecraft.func_71410_x();
/* 107 */       mc.field_71456_v.func_73731_b((Minecraft.func_71410_x()).field_71466_p, "Flips in Pipeline:" + WSCommandHandler.flipHandler.fds
/* 108 */           .CurrentFlips(), 0, 0, 2147483647);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static String ExtractUuidFromInventory(IInventory inventory) {
/* 114 */     ItemStack stack = inventory.func_70301_a(13);
/* 115 */     if (stack != null) {
/*     */       
/*     */       try {
/* 118 */         String uuid = stack.serializeNBT().func_74775_l("tag").func_74775_l("ExtraAttributes").func_74779_i("uuid");
/* 119 */         if (uuid.length() == 0) {
/* 120 */           throw new Exception();
/*     */         }
/* 122 */         System.out.println("Item has the UUID: " + uuid);
/* 123 */         return uuid;
/* 124 */       } catch (Exception e) {
/* 125 */         System.out.println("Clicked item " + stack
/* 126 */             .func_82833_r() + " has the following meta: " + stack.serializeNBT());
/*     */       } 
/*     */     }
/* 129 */     return "";
/*     */   }
/*     */   
/* 132 */   public static ItemStack GOLD_NUGGET = new ItemStack((Item)Item.field_150901_e
/* 133 */       .func_82594_a(new ResourceLocation("minecraft:gold_nugget")));
/*     */   
/* 135 */   public static final Pair<String, Pair<String, LocalDateTime>> EMPTY = Pair.of(null, Pair.of("", LocalDateTime.MIN));
/* 136 */   public static Pair<String, Pair<String, LocalDateTime>> last = EMPTY;
/* 137 */   private LocalDateTime lastBatchStart = LocalDateTime.now();
/* 138 */   private LinkedBlockingQueue<String> chatBatch = new LinkedBlockingQueue<>();
/*     */   
/*     */   @SubscribeEvent
/*     */   public void HandleChatEvent(ClientChatReceivedEvent sce) {
/* 142 */     if (!CoflSky.Wrapper.isRunning || !(Configuration.getInstance()).collectChat)
/*     */       return; 
/* 144 */     this.chatThreadPool.submit(() -> {
/*     */           try {
/*     */             String msg = sce.message.func_150260_c();
/*     */             
/*     */             Matcher matcher = chatpattern.matcher(msg);
/*     */             
/*     */             boolean matchFound = matcher.find();
/*     */             if (!matchFound) {
/*     */               return;
/*     */             }
/*     */             this.chatBatch.add(msg);
/*     */             long nanoSeconds = 500000000L;
/*     */             if (!this.lastBatchStart.plusNanos(nanoSeconds).isBefore(LocalDateTime.now())) {
/*     */               System.out.println(msg + " was not sent because it was too soon");
/*     */               return;
/*     */             } 
/*     */             this.lastBatchStart = LocalDateTime.now();
/*     */             (new Timer()).schedule(new TimerTask()
/*     */                 {
/*     */                   public void run()
/*     */                   {
/* 165 */                     System.out.println("Sending batch of " + EventRegistry.this.chatBatch.size() + " messages");
/* 166 */                     Command data = new Command(CommandType.chatBatch, EventRegistry.this.chatBatch.toArray((Object[])new String[0]));
/* 167 */                     EventRegistry.this.chatBatch.clear();
/* 168 */                     CoflSky.Wrapper.SendMessage(data);
/*     */                   }
/*     */                 }500L);
/*     */           }
/* 172 */           catch (Exception e) {
/*     */             e.printStackTrace();
/*     */           } 
/*     */         });
/*     */   }
/*     */   
/* 178 */   public static long lastStartTime = Long.MIN_VALUE;
/*     */   
/* 180 */   public static long LastViewAuctionInvocation = Long.MIN_VALUE;
/* 181 */   public static String LastViewAuctionUUID = null;
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   @SubscribeEvent
/*     */   public void OnGuiClick(GuiScreenEvent.MouseInputEvent mie) {
/* 186 */     if (!CoflSky.Wrapper.isRunning)
/*     */       return; 
/* 188 */     if (!(mie.gui instanceof GuiChest))
/*     */       return; 
/* 190 */     if (!(((GuiChest)mie.gui).field_147002_h instanceof ContainerChest))
/*     */       return; 
/* 192 */     ContainerChest chest = (ContainerChest)((GuiChest)mie.gui).field_147002_h;
/* 193 */     IInventory inv = chest.func_85151_d();
/* 194 */     if (inv.func_145818_k_()) {
/* 195 */       String chestName = inv.func_70005_c_();
/* 196 */       if (chestName.equalsIgnoreCase("BIN Auction View")) {
/*     */         
/* 198 */         ItemStack heldItem = (Minecraft.func_71410_x()).field_71439_g.field_71071_by.func_70445_o();
/*     */         
/* 200 */         if (heldItem != null) {
/* 201 */           System.out.println("Clicked on: " + heldItem.func_77973_b().getRegistryName());
/*     */           
/* 203 */           String itemUUID = ExtractUuidFromInventory(inv);
/*     */           
/* 205 */           if (System.currentTimeMillis() > lastStartTime)
/*     */           {
/* 207 */             if (heldItem.func_77969_a(GOLD_NUGGET)) {
/* 208 */               AuctionData ad = new AuctionData();
/* 209 */               ad.setItemId(itemUUID);
/*     */               
/* 211 */               if (LastViewAuctionInvocation + 60000L >= System.currentTimeMillis()) {
/* 212 */                 ad.setAuctionId(LastViewAuctionUUID);
/*     */               } else {
/* 214 */                 ad.setAuctionId("");
/*     */               } 
/*     */               
/* 217 */               Command<AuctionData> data = new Command(CommandType.PurchaseStart, ad);
/* 218 */               CoflSky.Wrapper.SendMessage(data);
/* 219 */               System.out.println("PurchaseStart");
/* 220 */               last = Pair.of("You claimed ", Pair.of(itemUUID, LocalDateTime.now()));
/* 221 */               lastStartTime = System.currentTimeMillis() + 200L;
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void OnRenderTick(TickEvent.RenderTickEvent event) {
/* 231 */     CountdownTimer.onRenderTick(event);
/*     */   }
/*     */   
/* 234 */   long UpdateThisTick = 0L;
/*     */   
/*     */   @SubscribeEvent(priority = EventPriority.LOW)
/*     */   public void onTick(TickEvent.ClientTickEvent event) {
/* 238 */     this.UpdateThisTick++;
/* 239 */     if (this.UpdateThisTick % 200L == 0L) {
/* 240 */       this.tickThreadPool.submit(() -> {
/*     */             try {
/*     */               EventHandler.ScoreboardData();
/*     */               EventHandler.TabMenuData();
/* 244 */             } catch (Exception e) {
/*     */               e.printStackTrace();
/*     */             } 
/*     */           });
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent(priority = EventPriority.LOWEST)
/*     */   public void onGuiOpen(GuiOpenEvent event) {
/* 257 */     if (event.gui == null) {
/* 258 */       WSCommandHandler.flipHandler.lastClickedFlipMessage = "";
/*     */     }
/*     */     
/* 261 */     if (!CoflSky.config.extendedtooltips)
/*     */       return; 
/* 263 */     if (this.descriptionHandler != null)
/* 264 */       this.descriptionHandler.Close(); 
/* 265 */     if (event.gui == null) {
/* 266 */       DescriptionHandler.emptyTooltipData();
/*     */     }
/* 268 */     if (!(event.gui instanceof net.minecraft.client.gui.inventory.GuiContainer))
/*     */       return; 
/* 270 */     (new Thread(() -> {
/*     */           try {
/*     */             this.descriptionHandler = new DescriptionHandler();
/*     */             this.descriptionHandler.loadDescriptionAndListenForChanges(event);
/* 274 */           } catch (Exception e) {
/*     */             System.out.println("failed to update description " + e);
/*     */           } 
/* 277 */         })).start();
/*     */   }
/*     */   
/*     */   @SubscribeEvent(priority = EventPriority.HIGHEST)
/*     */   public void onItemTooltipEvent(ItemTooltipEvent event) {
/* 282 */     if (!CoflSky.config.extendedtooltips)
/*     */       return; 
/* 284 */     if (this.descriptionHandler == null)
/*     */       return; 
/* 286 */     this.descriptionHandler.setTooltips(event);
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\handlers\EventRegistry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */