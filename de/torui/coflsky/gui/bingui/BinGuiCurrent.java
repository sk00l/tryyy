/*     */ package de.torui.coflsky.gui.bingui;
/*     */ 
/*     */ import de.torui.coflsky.CoflSky;
/*     */ import de.torui.coflsky.gui.GUIType;
/*     */ import de.torui.coflsky.gui.bingui.helper.ColorPallet;
/*     */ import de.torui.coflsky.gui.bingui.helper.RenderUtils;
/*     */ import de.torui.coflsky.handlers.EventHandler;
/*     */ import java.util.Base64;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.GuiScreen;
/*     */ import net.minecraft.client.gui.inventory.GuiChest;
/*     */ import net.minecraft.command.NumberInvalidException;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.inventory.ContainerChest;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemArmor;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ import net.minecraft.util.ChatComponentText;
/*     */ import net.minecraft.util.EnumChatFormatting;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraftforge.client.event.ClientChatReceivedEvent;
/*     */ import net.minecraftforge.client.event.GuiOpenEvent;
/*     */ import net.minecraftforge.client.event.GuiScreenEvent;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.fml.common.eventhandler.EventPriority;
/*     */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.gameevent.TickEvent;
/*     */ import org.lwjgl.input.Mouse;
/*     */ 
/*     */ public class BinGuiCurrent extends GuiChest {
/*     */   private String message;
/*     */   private String[] lore;
/*     */   private ItemStack itemStack;
/*  44 */   private String buyText = "Buy(You can click anywhere)";
/*  45 */   private BuyState buyState = BuyState.INIT;
/*  46 */   private int pixelsScrolled = 0;
/*     */   
/*     */   private boolean wasMouseDown;
/*     */   
/*     */   private boolean isRendered = false;
/*     */   private boolean hasInitialMouseSet = false;
/*  52 */   private String buyer = null;
/*     */   
/*  54 */   private static final Pattern CAN_BUY_IN_MATCHER = Pattern.compile("Can buy in: (.*)");
/*  55 */   private static final Pattern BUYER_MATCHER = Pattern.compile("Buyer: (.*)");
/*     */   
/*     */   private GuiChest chestGui;
/*     */   
/*     */   public BinGuiCurrent(IInventory playerInventory, IInventory chestInventory, String message, String extraData) {
/*  60 */     super(playerInventory, chestInventory);
/*  61 */     this.message = message;
/*  62 */     this.lore = new String[] { "Loading..." };
/*  63 */     if (extraData.length() >= 32) {
/*  64 */       this.itemStack = getSkull("Name", "00000000-0000-0000-0000-000000000000", extraData);
/*     */     } else {
/*  66 */       this.itemStack = new ItemStack(getItemByText(extraData));
/*     */       
/*  68 */       if (this.itemStack.func_77973_b() == null)
/*  69 */         return;  if (this.itemStack.func_77973_b() instanceof ItemArmor && (this.itemStack.func_77973_b() == Items.field_151024_Q || this.itemStack.func_77973_b() == Items.field_151027_R || this.itemStack.func_77973_b() == Items.field_151026_S || this.itemStack.func_77973_b() == Items.field_151021_T)) {
/*  70 */         ((ItemArmor)this.itemStack.func_77973_b()).func_82813_b(this.itemStack, 0);
/*     */       }
/*     */     } 
/*  73 */     MinecraftForge.EVENT_BUS.register(this);
/*     */   }
/*     */   
/*     */   private boolean shouldSkip(GuiScreen screen) {
/*  77 */     return (!(screen instanceof GuiChest) || CoflSky.config.purchaseOverlay != GUIType.COFL || !EventHandler.isInSkyblock);
/*     */   }
/*     */ 
/*     */   
/*     */   @SubscribeEvent(priority = EventPriority.HIGHEST)
/*     */   public void onGuiOpen(GuiOpenEvent event) {
/*  83 */     if (event.gui == null) {
/*  84 */       resetGUI();
/*     */     }
/*     */     
/*  87 */     this.isRendered = false;
/*  88 */     GuiScreen gui = event.gui;
/*     */     
/*  90 */     if (this.message == null || this.message.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/*  94 */     if (shouldSkip(gui)) {
/*     */       return;
/*     */     }
/*     */     
/*  98 */     GuiChest chest = (GuiChest)gui;
/*     */     
/* 100 */     IInventory inventory = ((ContainerChest)chest.field_147002_h).func_85151_d();
/* 101 */     if (inventory == null)
/*     */       return; 
/* 103 */     String guiName = inventory.func_145748_c_().func_150260_c().trim();
/* 104 */     if (guiName.equalsIgnoreCase("BIN Auction View") || guiName.equalsIgnoreCase("Confirm Purchase")) {
/* 105 */       this.chestGui = (GuiChest)event.gui;
/* 106 */       this.field_147002_h = ((GuiChest)event.gui).field_147002_h;
/* 107 */       event.gui = (GuiScreen)this;
/*     */     } 
/*     */   }
/*     */   
/*     */   @SubscribeEvent(priority = EventPriority.HIGHEST)
/*     */   public void onDrawGuiScreen(GuiScreenEvent.DrawScreenEvent.Pre event) {
/* 113 */     this.isRendered = false;
/* 114 */     GuiScreen gui = event.gui;
/*     */     
/* 116 */     if (this.message == null || this.message.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 120 */     if (shouldSkip(gui)) {
/*     */       return;
/*     */     }
/*     */     
/* 124 */     GuiChest chest = (GuiChest)gui;
/*     */     
/* 126 */     IInventory inventory = ((ContainerChest)chest.field_147002_h).func_85151_d();
/* 127 */     if (inventory == null)
/*     */       return; 
/* 129 */     String guiName = inventory.func_145748_c_().func_150260_c().trim();
/* 130 */     if (guiName.equalsIgnoreCase("auction view")) {
/*     */       return;
/*     */     }
/*     */     
/* 134 */     ItemStack item = inventory.func_70301_a(13);
/* 135 */     if (item == null)
/*     */       return; 
/* 137 */     String[] tooltip = (String[])item.func_82840_a((EntityPlayer)this.field_146297_k.field_71439_g, false).toArray((Object[])new String[0]);
/*     */     
/* 139 */     this.itemStack = item;
/*     */     
/* 141 */     if (guiName.equalsIgnoreCase("BIN Auction View")) {
/* 142 */       this.lore = tooltip;
/* 143 */       this.buyer = isAlreadyBought(tooltip);
/*     */     } 
/* 145 */     if (guiName.equalsIgnoreCase("BIN Auction View") && this.buyState == BuyState.PURCHASE) {
/* 146 */       if (waitingForBed(chest)) {
/* 147 */         (Minecraft.func_71410_x()).field_71439_g.func_145747_a((IChatComponent)new ChatComponentText("[§1C§6oflnet§f]§7: §cBed is not purchasable yet."));
/* 148 */         this.buyState = BuyState.INIT;
/*     */       } else {
/* 150 */         this.field_146297_k.field_71442_b.func_78753_a(this.chestGui.field_147002_h.field_75152_c, 31, 2, 3, (EntityPlayer)this.field_146297_k.field_71439_g);
/* 151 */         this.wasMouseDown = false;
/* 152 */         this.buyState = BuyState.CONFIRM;
/*     */       } 
/* 154 */     } else if (guiName.equalsIgnoreCase("Confirm Purchase") && this.buyState == BuyState.BUYING) {
/* 155 */       this.field_146297_k.field_71442_b.func_78753_a(this.chestGui.field_147002_h.field_75152_c, 11, 2, 3, (EntityPlayer)this.field_146297_k.field_71439_g);
/* 156 */       resetGUI();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_73863_a(int mouseX, int mouseY, float partialTicks) {
/* 162 */     Mouse.setGrabbed(false);
/* 163 */     this.isRendered = true;
/*     */     
/* 165 */     int screenWidth = this.field_146294_l;
/* 166 */     int screenHeight = this.field_146295_m;
/*     */     
/* 168 */     int width = (this.field_146297_k.field_71466_p.func_78256_a(this.message) > 500) ? (this.field_146297_k.field_71466_p.func_78256_a(this.message) + 5) : 500;
/* 169 */     int height = 300;
/*     */ 
/*     */     
/* 172 */     if (!this.hasInitialMouseSet) {
/* 173 */       Mouse.setCursorPosition(this.field_146297_k.field_71443_c / 2, this.field_146297_k.field_71440_d / 2);
/* 174 */       this.hasInitialMouseSet = true;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     RenderUtils.drawRoundedRect(screenWidth / 2 - width / 2, 10, width, height, 10, ColorPallet.PRIMARY.getColor());
/*     */ 
/*     */     
/* 185 */     RenderUtils.drawRoundedRect(screenWidth / 2 - width / 2 + 5, 15, width - 10, 14, 5, ColorPallet.SECONDARY.getColor());
/* 186 */     RenderUtils.drawString(this.message, screenWidth / 2 - width / 2 + 7, 18, ColorPallet.WHITE.getColor());
/*     */ 
/*     */     
/* 189 */     RenderUtils.drawRoundedRect(screenWidth / 2 - width / 2 + 5, 34, 20, 20, 5, ColorPallet.TERTIARY.getColor());
/*     */ 
/*     */     
/* 192 */     if (this.itemStack == null) {
/*     */       
/* 194 */       RenderUtils.drawString("?", screenWidth / 2 - width / 2 + 5 + 5, 36, ColorPallet.WHITE.getColor(), 40);
/*     */     } else {
/* 196 */       RenderUtils.drawItemStack(this.itemStack, screenWidth / 2 - width / 2 + 5 + 2, 36);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 201 */     RenderUtils.drawRoundedRect(screenWidth / 2 - width / 2 + 5 + 20 + 5, 34, width - 10 - 25, height - 100, 5, ColorPallet.SECONDARY.getColor());
/*     */ 
/*     */     
/* 204 */     int y = 36;
/* 205 */     for (int i = 0; i < this.lore.length; i++) {
/* 206 */       if (y + this.pixelsScrolled > 34 && y + this.pixelsScrolled < 34 + height - 100) {
/* 207 */         RenderUtils.drawString(this.lore[i], screenWidth / 2 - width / 2 + 5 + 20 + 5 + 2, y + this.pixelsScrolled, ColorPallet.WHITE.getColor());
/*     */       }
/* 209 */       y += 10;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 215 */     RenderUtils.drawRoundedRect(screenWidth / 2 - width / 2 + 5, 34 + height - 100 + 5, (width - 10) / 2 - 25, 60, 5, ColorPallet.ERROR.getColor());
/* 216 */     RenderUtils.drawString("Cancel", screenWidth / 2 - width / 2 + 5 + 5, 34 + height - 100 + 5 + 5, ColorPallet.WHITE.getColor(), 40);
/* 217 */     if (isMouseOverCancel(mouseX, mouseY, screenWidth, screenHeight, width, height)) {
/* 218 */       RenderUtils.drawRoundedRect(screenWidth / 2 - width / 2 + 5, 34 + height - 100 + 5, (width - 10) / 2 - 25, 60, 5, RenderUtils.setAlpha(ColorPallet.WHITE.getColor(), 100));
/* 219 */       RenderUtils.drawString("Cancel", screenWidth / 2 - width / 2 + 5 + 5, 34 + height - 100 + 5 + 5, ColorPallet.WHITE.getColor(), 40);
/* 220 */       if (isClicked()) {
/*     */         
/* 222 */         this.field_146297_k.field_71439_g.func_85030_a("random.anvil_land", 1.0F, 1.0F);
/* 223 */         resetGUI();
/* 224 */         this.field_146297_k.field_71439_g.func_71053_j();
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 230 */     if (this.buyer == null) {
/* 231 */       RenderUtils.drawRoundedRect(screenWidth / 2 - width / 2 + 5 + (width - 10) / 2 - 20, 34 + height - 100 + 5, (width - 10) / 2 + 20, 60, 5, ColorPallet.SUCCESS.getColor());
/* 232 */       RenderUtils.drawString(this.buyText, screenWidth / 2 - width / 2 + 5 + (width - 10) / 2 + 5 - 20, 34 + height - 100 + 5 + 5, ColorPallet.WHITE.getColor(), 40);
/*     */     } else {
/* 234 */       RenderUtils.drawRoundedRect(screenWidth / 2 - width / 2 + 5 + (width - 10) / 2 - 20, 34 + height - 100 + 5, (width - 10) / 2 + 20, 60, 5, ColorPallet.WARNING.getColor());
/* 235 */       RenderUtils.drawString(getAlreadyBoughtText(this.buyer), screenWidth / 2 - width / 2 + 5 + (width - 10) / 2 + 5 - 20, 34 + height - 100 + 5 + 5, ColorPallet.WHITE.getColor(), 40);
/*     */     } 
/* 237 */     if (!isMouseOverCancel(mouseX, mouseY, screenWidth, screenHeight, width, height)) {
/* 238 */       if (this.buyer == null) {
/* 239 */         RenderUtils.drawRoundedRect(screenWidth / 2 - width / 2 + 5 + (width - 10) / 2 - 20, 34 + height - 100 + 5, (width - 10) / 2 + 20, 60, 5, RenderUtils.setAlpha(ColorPallet.WHITE.getColor(), 50));
/* 240 */         RenderUtils.drawString(this.buyText, screenWidth / 2 - width / 2 + 5 + (width - 10) / 2 + 5 - 20, 34 + height - 100 + 5 + 5, ColorPallet.WHITE.getColor(), 40);
/*     */       } 
/* 242 */       if (isClicked() && this.buyer == null) {
/* 243 */         if (this.buyState == BuyState.INIT) {
/*     */           
/* 245 */           this.field_146297_k.field_71439_g.func_85030_a("random.click", 1.0F, 1.0F);
/* 246 */           this.buyText = "Click again to confirm";
/* 247 */           this.buyState = BuyState.PURCHASE;
/* 248 */         } else if (this.buyState == BuyState.CONFIRM) {
/* 249 */           this.field_146297_k.field_71439_g.func_85030_a("random.click", 1.0F, 1.0F);
/* 250 */           this.buyText = "Buying";
/* 251 */           this.buyState = BuyState.BUYING;
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAlreadyBoughtText(String buyer) {
/* 259 */     return "§5§o§7Bought by §b" + buyer;
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onGuiMouseInput(GuiScreenEvent.MouseInputEvent event) {
/* 264 */     if (event.gui instanceof BinGuiCurrent) {
/* 265 */       int dwheel = Mouse.getDWheel();
/* 266 */       this.pixelsScrolled += dwheel / 4;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void resetGUI() {
/* 271 */     this.buyState = BuyState.INIT;
/* 272 */     this.buyText = "Buy (You can click anywhere)";
/* 273 */     this.itemStack = null;
/* 274 */     this.hasInitialMouseSet = false;
/* 275 */     this.isRendered = false;
/* 276 */     Mouse.setGrabbed(true);
/* 277 */     MinecraftForge.EVENT_BUS.unregister(this);
/*     */   }
/*     */   
/*     */   public static Item getItemByText(String id) {
/*     */     try {
/* 282 */       ResourceLocation resourcelocation = new ResourceLocation(id);
/* 283 */       if (!Item.field_150901_e.func_148741_d(resourcelocation)) {
/* 284 */         throw new NumberInvalidException("block.notFound", new Object[] { resourcelocation });
/*     */       }
/* 286 */       Item item = (Item)Item.field_150901_e.func_82594_a(resourcelocation);
/* 287 */       if (item == null) {
/* 288 */         throw new NumberInvalidException("block.notFound", new Object[] { resourcelocation });
/*     */       }
/* 290 */       return item;
/* 291 */     } catch (Exception e) {
/* 292 */       System.out.println("Error: " + e.getMessage());
/* 293 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static ItemStack getSkull(String displayName, String uuid, String value) {
/* 299 */     String url = "https://textures.minecraft.net/texture/" + value;
/* 300 */     ItemStack render = new ItemStack(Items.field_151144_bL, 1, 3);
/*     */     
/* 302 */     NBTTagCompound skullOwner = new NBTTagCompound();
/* 303 */     skullOwner.func_74778_a("Id", uuid);
/* 304 */     skullOwner.func_74778_a("Name", uuid);
/*     */     
/* 306 */     byte[] encodedData = Base64.getEncoder().encode(String.format("{textures:{SKIN:{url:\"%s\"}}}", new Object[] { url }).getBytes());
/* 307 */     NBTTagCompound textures_0 = new NBTTagCompound();
/* 308 */     textures_0.func_74778_a("Value", new String(encodedData));
/*     */     
/* 310 */     NBTTagList textures = new NBTTagList();
/* 311 */     textures.func_74742_a((NBTBase)textures_0);
/*     */     
/* 313 */     NBTTagCompound display = new NBTTagCompound();
/* 314 */     display.func_74778_a("Name", displayName);
/*     */     
/* 316 */     NBTTagCompound tag = new NBTTagCompound();
/* 317 */     tag.func_74782_a("display", (NBTBase)display);
/*     */     
/* 319 */     NBTTagCompound properties = new NBTTagCompound();
/* 320 */     properties.func_74782_a("textures", (NBTBase)textures);
/* 321 */     skullOwner.func_74782_a("Properties", (NBTBase)properties);
/* 322 */     tag.func_74782_a("SkullOwner", (NBTBase)skullOwner);
/* 323 */     render.func_77982_d(tag);
/* 324 */     return render;
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onChatEvent(ClientChatReceivedEvent event) {
/* 329 */     String message = event.message.func_150254_d().toLowerCase(Locale.ROOT);
/* 330 */     if (message
/* 331 */       .contains("you have bought") || message
/* 332 */       .contains("you don't have enough coins") || message
/* 333 */       .contains("this auction wasn't found") || message
/* 334 */       .contains("there was an error with the auction house") || message
/* 335 */       .contains("you didn't participate in this auction") || message
/* 336 */       .contains("you claimed") || message
/* 337 */       .contains("you purchased") || message
/* 338 */       .contains("you cannot view this auction")) {
/*     */ 
/*     */       
/* 341 */       resetGUI();
/* 342 */       this.field_146297_k.field_71439_g.func_71053_j();
/*     */     } 
/*     */   }
/*     */   
/*     */   public ItemStack getItem(int slotNum, GuiChest currentScreen) {
/* 347 */     ContainerChest container = (ContainerChest)currentScreen.field_147002_h;
/* 348 */     return container.func_75139_a(slotNum).func_75211_c();
/*     */   }
/*     */   
/*     */   public boolean waitingForBed(GuiChest currentScreen) {
/* 352 */     ItemStack bedStack = getItem(31, currentScreen);
/* 353 */     if (bedStack == null || !bedStack.func_77973_b().equals(Item.func_111206_d("minecraft:bed"))) {
/* 354 */       return false;
/*     */     }
/*     */     
/* 357 */     ItemStack itemStack = getItem(13, currentScreen);
/* 358 */     if (itemStack == null) {
/* 359 */       return false;
/*     */     }
/* 361 */     List<String> itemTooltip = itemStack.func_82840_a((EntityPlayer)(Minecraft.func_71410_x()).field_71439_g, false);
/* 362 */     for (String data : itemTooltip) {
/* 363 */       Matcher matcher = CAN_BUY_IN_MATCHER.matcher(EnumChatFormatting.func_110646_a(data));
/* 364 */       if (!matcher.find()) {
/*     */         continue;
/*     */       }
/* 367 */       String timeData = matcher.group(1);
/* 368 */       if (timeData.equals("Soon!")) {
/* 369 */         return true;
/*     */       }
/*     */     } 
/* 372 */     return false; } public String isAlreadyBought(String[] tooltip) {
/*     */     String[] arrayOfString;
/*     */     int i;
/*     */     byte b;
/* 376 */     for (arrayOfString = tooltip, i = arrayOfString.length, b = 0; b < i; ) { String data = arrayOfString[b];
/* 377 */       Matcher matcher = BUYER_MATCHER.matcher(EnumChatFormatting.func_110646_a(data));
/* 378 */       if (!matcher.find()) {
/*     */         b++; continue;
/*     */       } 
/* 381 */       return data.replaceAll("§5§o§7Buyer: ", ""); }
/*     */     
/* 383 */     return null;
/*     */   }
/*     */   
/*     */   private static boolean isMouseOverCancel(int mouseX, int mouseY, int screenWidth, int screenHeight, int width, int height) {
/* 387 */     return (mouseX > screenWidth / 2 - width / 2 + 5 && mouseX < screenWidth / 2 - width / 2 + 5 + (width - 10) / 2 - 25 && mouseY > 34 + height - 100 + 5 && mouseY < 34 + height - 100 + 5 + 60);
/*     */   }
/*     */   
/*     */   private static boolean isMouseOverAccept(int mouseX, int mouseY, int screenWidth, int screenHeight, int width, int height) {
/* 391 */     return (mouseX > screenWidth / 2 - width / 2 + 5 + (width - 10) / 2 - 20 && mouseX < screenWidth / 2 - width / 2 + 5 + (width - 10) / 2 - 20 + (width - 10) / 2 + 20 && mouseY > 34 + height - 100 + 5 && mouseY < 34 + height - 100 + 5 + 60);
/*     */   }
/*     */   
/*     */   public boolean isClicked() {
/* 395 */     return (this.wasMouseDown && !Mouse.isButtonDown(0));
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onRenderEvent(TickEvent.RenderTickEvent event) {
/* 400 */     if (Minecraft.func_71410_x() == null)
/* 401 */       return;  if (event.phase == TickEvent.Phase.END) {
/* 402 */       this.wasMouseDown = Mouse.isButtonDown(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onMouseClicked(GuiScreenEvent.MouseInputEvent.Pre event) {
/* 408 */     if (!Mouse.getEventButtonState()) {
/*     */       return;
/*     */     }
/* 411 */     if (this.isRendered)
/* 412 */       event.setCanceled(true); 
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\gui\bingui\BinGuiCurrent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */