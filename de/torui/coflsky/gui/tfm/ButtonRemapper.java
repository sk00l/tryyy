/*     */ package de.torui.coflsky.gui.tfm;
/*     */ 
/*     */ import de.torui.coflsky.CoflSky;
/*     */ import de.torui.coflsky.WSCommandHandler;
/*     */ import de.torui.coflsky.gui.GUIType;
/*     */ import de.torui.coflsky.handlers.EventHandler;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.List;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.FontRenderer;
/*     */ import net.minecraft.client.gui.Gui;
/*     */ import net.minecraft.client.gui.GuiScreen;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.client.gui.inventory.GuiChest;
/*     */ import net.minecraft.client.gui.inventory.GuiContainer;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.ContainerChest;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.EnumChatFormatting;
/*     */ import net.minecraftforge.client.event.GuiScreenEvent;
/*     */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*     */ import net.minecraftforge.fml.relauncher.ReflectionHelper;
/*     */ import org.lwjgl.input.Mouse;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ButtonRemapper
/*     */ {
/*     */   private static ButtonRemapper instance;
/*     */   private static final int BUY_BUTTON_SLOT = 31;
/*     */   private static final int ITEM_SLOT = 13;
/*     */   private static final int CONFIRM_BUTTON_SLOT = 11;
/*     */   private static final int CANCEL_CONFIRM_SLOT = 15;
/*     */   private static final int BACK_BUTTON_SLOT = 49;
/*     */   private static final double SCALE_VALUE = 2.0D;
/*  40 */   private static final Pattern BED_TIME_PATTERN = Pattern.compile("Can buy in: (.*)");
/*     */   
/*     */   private final Method drawItemMethod;
/*     */   
/*     */   private final Method renderToolTipMethod;
/*     */   
/*     */   private ButtonRemapper() {
/*  47 */     String[] methodNames = { "drawItemStack", "func_146982_a" };
/*  48 */     this.drawItemMethod = ReflectionHelper.findMethod(GuiContainer.class, null, methodNames, new Class[] { ItemStack.class, int.class, int.class, String.class });
/*  49 */     this.drawItemMethod.setAccessible(true);
/*     */     
/*  51 */     methodNames = new String[] { "renderToolTip", "func_146285_a" };
/*  52 */     this.renderToolTipMethod = ReflectionHelper.findMethod(GuiScreen.class, null, methodNames, new Class[] { ItemStack.class, int.class, int.class });
/*     */   }
/*     */   
/*     */   public static ButtonRemapper getInstance() {
/*  56 */     if (instance == null) {
/*  57 */       instance = new ButtonRemapper();
/*     */     }
/*  59 */     return instance;
/*     */   }
/*     */   
/*     */   public ItemStack getItem(int slotNum, GuiChest currentScreen) {
/*  63 */     ContainerChest container = (ContainerChest)currentScreen.field_147002_h;
/*  64 */     return container.func_75139_a(slotNum).func_75211_c();
/*     */   }
/*     */   
/*     */   public boolean waitingForBed(GuiChest currentScreen) {
/*  68 */     ItemStack bedStack = getItem(31, currentScreen);
/*  69 */     if (bedStack == null || !bedStack.func_77973_b().equals(Item.func_111206_d("minecraft:bed"))) {
/*  70 */       return false;
/*     */     }
/*     */     
/*  73 */     ItemStack itemStack = getItem(13, currentScreen);
/*  74 */     if (itemStack == null) {
/*  75 */       return false;
/*     */     }
/*  77 */     List<String> itemTooltip = itemStack.func_82840_a((EntityPlayer)(Minecraft.func_71410_x()).field_71439_g, false);
/*  78 */     for (String data : itemTooltip) {
/*  79 */       Matcher matcher = BED_TIME_PATTERN.matcher(EnumChatFormatting.func_110646_a(data));
/*  80 */       if (!matcher.find()) {
/*     */         continue;
/*     */       }
/*  83 */       String timeData = matcher.group(1);
/*  84 */       if (!timeData.equals("Soon!")) {
/*  85 */         return true;
/*     */       }
/*     */     } 
/*  88 */     return false;
/*     */   }
/*     */   
/*     */   private int[] getBuyBoxDimensions() {
/*  92 */     int centerX = getGuiCenterX();
/*  93 */     int centerY = getGuiCenterY();
/*  94 */     double multiplier = 0.1D;
/*  95 */     return new int[] { (int)(centerX - centerX * multiplier), (int)(centerY + centerY * multiplier), (int)(centerX + centerX * multiplier), (int)(centerY - centerY * multiplier) };
/*     */   }
/*     */ 
/*     */   
/*     */   private int[] getCancelBoxDimensions() {
/* 100 */     int centerX = getGuiCenterX();
/* 101 */     int centerY = (int)(getGuiCenterY() * 1.25D);
/* 102 */     double multiplier = 0.05D;
/* 103 */     return new int[] { (int)(centerX - centerX * multiplier), (int)(centerY + centerY * multiplier), (int)(centerX + centerX * multiplier), (int)(centerY - centerY * multiplier) };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void drawBoxWithShadow(int leftX, int topY, int rightX, int bottomY, int colour, int shadowSize, int shadowColour) {
/* 109 */     Gui.func_73734_a(leftX - shadowSize, topY + shadowSize, rightX + shadowSize, bottomY - shadowSize, shadowColour);
/* 110 */     Gui.func_73734_a(leftX, topY, rightX, bottomY, colour);
/*     */   }
/*     */   
/*     */   private void drawTfmBox(boolean isConfirm) {
/*     */     String titleText;
/* 115 */     if (isConfirm) {
/* 116 */       titleText = "Cofl - Confirm Purchase";
/*     */     } else {
/* 118 */       titleText = "Cofl - Auction View";
/*     */     } 
/* 120 */     int outerBox = -11579569;
/*     */     
/* 122 */     drawBoxWithShadow((int)(getGuiCenterX() * 0.5D), (int)(getGuiCenterY() * 1.6D), (int)(getGuiCenterX() * 1.5D), (int)(getGuiCenterY() * 0.4D), outerBox, 1, -16777216);
/* 123 */     (Minecraft.func_71410_x()).field_71466_p.func_175063_a(titleText, (int)(getGuiCenterX() * 0.55D), (int)(getGuiCenterY() * 0.45D), -1);
/*     */   }
/*     */   
/*     */   private void renderTooltip(GuiChest chest, ItemStack item) {
/* 127 */     ToolTipHelper toolTipData = new ToolTipHelper(item);
/* 128 */     int toolTipY = getGuiCenterY() - toolTipData.determineHeight() / 2;
/* 129 */     int toolTipX = (int)(getGuiCenterX() * 1.25D) - toolTipData.determineWidth() / 2;
/* 130 */     if (toolTipX < getGuiCenterX()) {
/* 131 */       toolTipX = getGuiCenterX() + 10;
/*     */     }
/*     */     try {
/* 134 */       this.renderToolTipMethod.invoke(chest, new Object[] { item, Integer.valueOf(toolTipX), Integer.valueOf(toolTipY) });
/* 135 */     } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException e) {
/* 136 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void renderItem(GuiChest chest, ItemStack item) {
/* 141 */     GlStateManager.func_179094_E();
/* 142 */     GlStateManager.func_179139_a(2.0D, 2.0D, 0.0D);
/* 143 */     int itemX = (int)((getGuiCenterX() - 16) / 2.0D);
/* 144 */     int itemY = (int)((getGuiCenterY() - 16) / 2.0D);
/*     */     try {
/* 146 */       this.drawItemMethod.invoke(chest, new Object[] { item, Integer.valueOf(itemX), Integer.valueOf(itemY), null });
/* 147 */     } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException e) {
/* 148 */       e.printStackTrace();
/*     */     } 
/* 150 */     GlStateManager.func_179121_F();
/*     */   }
/*     */   
/*     */   private void drawBuyBox(boolean shouldBeRed) {
/* 154 */     int colour = shouldBeRed ? 16711680 : 65280;
/* 155 */     colour -= Integer.MIN_VALUE;
/* 156 */     int[] dim = getBuyBoxDimensions();
/* 157 */     drawBoxWithShadow(dim[0], dim[1], dim[2], dim[3], colour, 1, -16777216);
/*     */   }
/*     */   
/*     */   private void drawCancelBox() {
/* 161 */     int colour = 2147418112;
/* 162 */     int[] dim = getCancelBoxDimensions();
/* 163 */     drawBoxWithShadow(dim[0], dim[1], dim[2], dim[3], colour, 1, -16777216);
/*     */   }
/*     */   
/*     */   public void drawProfitInfo() {
/* 167 */     FontRenderer font = (Minecraft.func_71410_x()).field_71466_p;
/* 168 */     String text = WSCommandHandler.flipHandler.lastClickedFlipMessage;
/*     */     
/* 170 */     if (text == null) {
/*     */       return;
/*     */     }
/*     */     
/* 174 */     StringBuilder current = new StringBuilder();
/* 175 */     int lineNo = 0;
/* 176 */     for (int i = 0; i < text.length(); i++) {
/* 177 */       char character = text.charAt(i);
/* 178 */       current.append(character);
/* 179 */       if (current.length() > 50 && character == ' ') {
/* 180 */         font.func_175063_a(current.toString(), (int)(getGuiCenterX() * 0.55D), (int)(getGuiCenterY() * 0.5D + (15 * lineNo)), -7368817);
/* 181 */         current = new StringBuilder();
/* 182 */         lineNo++;
/*     */       } 
/*     */     } 
/* 185 */     font.func_175063_a(current.toString(), (int)(getGuiCenterX() * 0.55D), (int)(getGuiCenterY() * 0.5D + (15 * lineNo)), -7368817);
/*     */   }
/*     */   
/*     */   private void drawBox(GuiChest chest, boolean shouldBeRed, boolean isConfirm) {
/* 189 */     GlStateManager.func_179094_E();
/*     */     
/* 191 */     GlStateManager.func_179137_b(0.0D, 0.0D, 512.0D);
/* 192 */     ItemStack item = getItem(13, chest);
/*     */     
/* 194 */     drawTfmBox(isConfirm);
/* 195 */     drawBuyBox(shouldBeRed);
/* 196 */     drawCancelBox();
/*     */     
/* 198 */     if (item != null) {
/* 199 */       drawProfitInfo();
/* 200 */       renderItem(chest, item);
/* 201 */       renderTooltip(chest, item);
/*     */     } 
/*     */     
/* 204 */     GlStateManager.func_179121_F();
/*     */   }
/*     */   
/*     */   private int getGuiCenterX() {
/* 208 */     ScaledResolution resolution = new ScaledResolution(Minecraft.func_71410_x());
/* 209 */     return resolution.func_78326_a() / 2;
/*     */   }
/*     */   
/*     */   private int getGuiCenterY() {
/* 213 */     ScaledResolution resolution = new ScaledResolution(Minecraft.func_71410_x());
/* 214 */     return resolution.func_78328_b() / 2;
/*     */   }
/*     */   
/*     */   private boolean isInBox(int x, int y) {
/* 218 */     int[] dim = getBuyBoxDimensions();
/* 219 */     return (x > dim[0] && x < dim[2] && y > dim[3] && y < dim[1]);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isInCancelBox(int x, int y) {
/* 224 */     int[] dim = getCancelBoxDimensions();
/* 225 */     return (x > dim[0] && x < dim[2] && y > dim[3] && y < dim[1]);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawBuyButton(GuiChest currentScreen) {
/* 230 */     if (!shouldDrawGui(currentScreen)) {
/*     */       return;
/*     */     }
/* 233 */     drawBox(currentScreen, waitingForBed(currentScreen), false);
/*     */   }
/*     */   
/*     */   public boolean shouldDrawGui(GuiChest currentScreen) {
/* 237 */     ItemStack stack = getItem(31, currentScreen);
/* 238 */     return (stack != null && (stack.func_77973_b().equals(Item.func_111206_d("minecraft:bed")) || stack.func_77973_b().equals(Item.func_111206_d("minecraft:gold_nugget"))));
/*     */   }
/*     */   
/*     */   public void drawConfirmButton(GuiChest currentScreen) {
/* 242 */     drawBox(currentScreen, false, true);
/*     */   }
/*     */   
/*     */   private boolean shouldSkip(GuiScreen screen) {
/* 246 */     return (!(screen instanceof GuiChest) || CoflSky.config.purchaseOverlay != GUIType.TFM || !EventHandler.isInSkyblock);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onPostRenderEvent(GuiScreenEvent.DrawScreenEvent.Post event) {
/* 251 */     if (shouldSkip(event.gui)) {
/*     */       return;
/*     */     }
/*     */     
/* 255 */     GuiChest auctionView = (GuiChest)event.gui;
/* 256 */     ContainerChest container = (ContainerChest)auctionView.field_147002_h;
/* 257 */     String containerName = container.func_85151_d().func_145748_c_().func_150260_c();
/* 258 */     if (containerName.trim().equals("BIN Auction View")) {
/* 259 */       drawBuyButton(auctionView);
/* 260 */     } else if (containerName.trim().equals("Confirm Purchase")) {
/* 261 */       drawConfirmButton(auctionView);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void clickSlot(int windowId, int slot) {
/* 266 */     (Minecraft.func_71410_x()).field_71442_b.func_78753_a(windowId, slot, 2, 3, 
/* 267 */         (EntityPlayer)(Minecraft.func_71410_x()).field_71439_g);
/*     */   }
/*     */   
/*     */   private void handleBuyClick(GuiChest currentScreen, GuiScreenEvent.MouseInputEvent.Pre event) {
/* 271 */     if (waitingForBed(currentScreen) || !shouldDrawGui(currentScreen)) {
/*     */       return;
/*     */     }
/* 274 */     event.setCanceled(true);
/* 275 */     clickSlot(currentScreen.field_147002_h.field_75152_c, 31);
/*     */   }
/*     */   
/*     */   private void handleConfirmClick(GuiChest currentScreen, int windowId) {
/* 279 */     clickSlot(windowId, 11);
/*     */   }
/*     */   
/*     */   private void handlePositiveClick(GuiScreen screen, GuiScreenEvent.MouseInputEvent.Pre event) {
/* 283 */     if (shouldSkip(screen)) {
/*     */       return;
/*     */     }
/*     */     
/* 287 */     GuiChest auctionView = (GuiChest)screen;
/* 288 */     ContainerChest container = (ContainerChest)auctionView.field_147002_h;
/* 289 */     String containerName = container.func_85151_d().func_145748_c_().func_150260_c();
/* 290 */     if (containerName.trim().equals("BIN Auction View")) {
/* 291 */       handleBuyClick(auctionView, event);
/* 292 */     } else if (containerName.trim().equals("Confirm Purchase")) {
/* 293 */       handleConfirmClick(auctionView, container.field_75152_c);
/* 294 */       event.setCanceled(true);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void doCancelClick(ContainerChest chest, int slotId) {
/* 299 */     clickSlot(chest.field_75152_c, slotId);
/*     */   }
/*     */   
/*     */   private void handleCancelClick(GuiScreen screen, GuiScreenEvent.MouseInputEvent.Pre event) {
/* 303 */     if (shouldSkip(screen)) {
/*     */       return;
/*     */     }
/*     */     
/* 307 */     GuiChest auctionView = (GuiChest)screen;
/* 308 */     ContainerChest container = (ContainerChest)auctionView.field_147002_h;
/* 309 */     String containerName = container.func_85151_d().func_145748_c_().func_150260_c();
/* 310 */     if (containerName.trim().equals("BIN Auction View")) {
/* 311 */       doCancelClick(container, 49);
/* 312 */     } else if (containerName.trim().equals("Confirm Purchase")) {
/* 313 */       doCancelClick(container, 15);
/*     */     } else {
/*     */       return;
/*     */     } 
/* 317 */     event.setCanceled(true);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onMouseClicked(GuiScreenEvent.MouseInputEvent.Pre event) {
/* 322 */     if (!Mouse.getEventButtonState()) {
/*     */       return;
/*     */     }
/* 325 */     GuiScreen screen = event.gui;
/* 326 */     if (screen == null) {
/*     */       return;
/*     */     }
/* 329 */     int x = Mouse.getEventX() * screen.field_146294_l / (Minecraft.func_71410_x()).field_71443_c;
/* 330 */     int y = screen.field_146295_m - Mouse.getEventY() * screen.field_146295_m / (Minecraft.func_71410_x()).field_71440_d - 1;
/* 331 */     if (isInBox(x, y)) {
/* 332 */       handlePositiveClick(screen, event);
/* 333 */     } else if (isInCancelBox(x, y)) {
/* 334 */       handleCancelClick(screen, event);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\gui\tfm\ButtonRemapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */