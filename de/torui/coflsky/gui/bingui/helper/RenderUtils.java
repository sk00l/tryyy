/*     */ package de.torui.coflsky.gui.bingui.helper;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.FontRenderer;
/*     */ import net.minecraft.client.renderer.RenderHelper;
/*     */ import net.minecraft.client.renderer.entity.RenderItem;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RenderUtils
/*     */ {
/*  18 */   public static Minecraft mc = Minecraft.func_71410_x();
/*     */ 
/*     */   
/*     */   public static void drawRect(float x, float y, float width, float height, int color) {
/*  22 */     float alpha = (color >> 24 & 0xFF) / 255.0F;
/*  23 */     float red = (color >> 16 & 0xFF) / 255.0F;
/*  24 */     float green = (color >> 8 & 0xFF) / 255.0F;
/*  25 */     float blue = (color & 0xFF) / 255.0F;
/*  26 */     GL11.glEnable(3042);
/*  27 */     GL11.glDisable(3553);
/*  28 */     GL11.glBlendFunc(770, 771);
/*  29 */     GL11.glColor4f(red, green, blue, alpha);
/*  30 */     GL11.glBegin(7);
/*  31 */     GL11.glVertex2d(x, y);
/*  32 */     GL11.glVertex2d(x, (y + height));
/*  33 */     GL11.glVertex2d((x + width), (y + height));
/*  34 */     GL11.glVertex2d((x + width), y);
/*  35 */     GL11.glEnd();
/*  36 */     GL11.glEnable(3553);
/*  37 */     GL11.glDisable(3042);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawRectOutline(int x, int y, int width, int height, float lineWidth, Color color) {
/*  43 */     GL11.glEnable(3042);
/*  44 */     GL11.glDisable(3553);
/*  45 */     GL11.glBlendFunc(770, 771);
/*  46 */     setColor(color);
/*  47 */     GL11.glLineWidth(lineWidth);
/*  48 */     GL11.glBegin(2);
/*  49 */     GL11.glVertex2d(x, y);
/*  50 */     GL11.glVertex2d((x + width), y);
/*  51 */     GL11.glVertex2d((x + width), (y + height));
/*  52 */     GL11.glVertex2d(x, (y + height));
/*  53 */     GL11.glEnd();
/*  54 */     GL11.glEnable(3553);
/*  55 */     GL11.glDisable(3042);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawCircle(int x, int y, int radius, Color color) {
/*  60 */     GL11.glEnable(3042);
/*  61 */     GL11.glDisable(3553);
/*  62 */     GL11.glBlendFunc(770, 771);
/*  63 */     setColor(color);
/*  64 */     GL11.glBegin(6);
/*  65 */     GL11.glVertex2d(x, y);
/*  66 */     for (int i = 0; i <= 360; i++) {
/*  67 */       GL11.glVertex2d(x + Math.sin(i * Math.PI / 180.0D) * radius, y + Math.cos(i * Math.PI / 180.0D) * radius);
/*     */     }
/*  69 */     GL11.glEnd();
/*  70 */     GL11.glEnable(3553);
/*  71 */     GL11.glDisable(3042);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawCircleOutline(int x, int y, float radius, float thickness, Color color) {
/*  76 */     GL11.glEnable(3042);
/*  77 */     GL11.glDisable(3553);
/*  78 */     GL11.glBlendFunc(770, 771);
/*  79 */     setColor(color);
/*  80 */     GL11.glBegin(2);
/*  81 */     for (int i = 0; i <= 360; i++) {
/*  82 */       GL11.glVertex2d(x + Math.sin(i * Math.PI / 180.0D) * radius, y + Math.cos(i * Math.PI / 180.0D) * radius);
/*     */     }
/*  84 */     GL11.glEnd();
/*  85 */     GL11.glEnable(3553);
/*  86 */     GL11.glDisable(3042);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawLine(float x1, float y1, float x2, float y2, float thickness, Color color) {
/*  91 */     GL11.glEnable(3042);
/*  92 */     GL11.glDisable(3553);
/*  93 */     GL11.glBlendFunc(770, 771);
/*  94 */     setColor(color);
/*  95 */     GL11.glLineWidth(thickness);
/*  96 */     GL11.glBegin(1);
/*  97 */     GL11.glVertex2d(x1, y1);
/*  98 */     GL11.glVertex2d(x2, y2);
/*  99 */     GL11.glEnd();
/* 100 */     GL11.glEnable(3553);
/* 101 */     GL11.glDisable(3042);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawTriangle(int x, int y, int x2, int y2, int x3, int y3, Color color) {
/* 106 */     GL11.glEnable(3042);
/* 107 */     GL11.glDisable(3553);
/* 108 */     GL11.glBlendFunc(770, 771);
/* 109 */     setColor(color);
/* 110 */     GL11.glBegin(4);
/* 111 */     GL11.glVertex2d(x, y);
/* 112 */     GL11.glVertex2d(x2, y2);
/* 113 */     GL11.glVertex2d(x3, y3);
/* 114 */     GL11.glEnd();
/* 115 */     GL11.glEnable(3553);
/* 116 */     GL11.glDisable(3042);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawTriangleOutline(int x, int y, int x2, int y2, int x3, int y3, Color color) {
/* 121 */     GL11.glEnable(3042);
/* 122 */     GL11.glDisable(3553);
/* 123 */     GL11.glBlendFunc(770, 771);
/* 124 */     setColor(color);
/* 125 */     GL11.glBegin(2);
/* 126 */     GL11.glVertex2d(x, y);
/* 127 */     GL11.glVertex2d(x2, y2);
/* 128 */     GL11.glVertex2d(x3, y3);
/* 129 */     GL11.glEnd();
/* 130 */     GL11.glEnable(3553);
/* 131 */     GL11.glDisable(3042);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawArc(int x, int y, int radius, int startAngle, int endAngle, Color color) {
/* 136 */     GL11.glEnable(3042);
/* 137 */     GL11.glDisable(3553);
/* 138 */     GL11.glBlendFunc(770, 771);
/* 139 */     setColor(color);
/* 140 */     GL11.glBegin(6);
/* 141 */     GL11.glVertex2d(x, y);
/* 142 */     for (int i = startAngle; i <= endAngle; i++) {
/* 143 */       GL11.glVertex2d(x + Math.sin(i * Math.PI / 180.0D) * radius, y + Math.cos(i * Math.PI / 180.0D) * radius);
/*     */     }
/* 145 */     GL11.glEnd();
/* 146 */     GL11.glEnable(3553);
/* 147 */     GL11.glDisable(3042);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawLoadingCircle(float x, float y, float radius, float thickness, float speed, Color color) {
/* 153 */     GL11.glEnable(3042);
/* 154 */     GL11.glDisable(3553);
/* 155 */     GL11.glBlendFunc(770, 771);
/* 156 */     setColor(color);
/* 157 */     GL11.glLineWidth(thickness);
/* 158 */     GL11.glBegin(3);
/* 159 */     for (int i = 0; i <= 360; i++) {
/* 160 */       GL11.glVertex2d(x + Math.sin((i + speed) * Math.PI / 180.0D) * radius, y + Math.cos((i + speed) * Math.PI / 180.0D) * radius);
/*     */     }
/* 162 */     GL11.glEnd();
/* 163 */     GL11.glEnable(3553);
/* 164 */     GL11.glDisable(3042);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawRoundedRect(int x, int y, int width, int height, int radius, @NotNull Color color) {
/* 171 */     drawRect((x + radius), y, (width - radius * 2), height, color.getRGB());
/* 172 */     drawRect(x, (y + radius), radius, (height - radius * 2), color.getRGB());
/* 173 */     drawRect((x + width - radius), (y + radius), radius, (height - radius * 2), color.getRGB());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 178 */     drawArc(x + radius, y + radius, radius, 180, 270, color);
/* 179 */     drawArc(x + width - radius, y + radius, radius, 90, 180, color);
/* 180 */     drawArc(x + radius, y + height - radius, radius, 270, 360, color);
/* 181 */     drawArc(x + width - radius, y + height - radius, radius, 0, 90, color);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawGradientRect(int x, int y, int width, int height, Color color1, Color color2) {
/* 193 */     GL11.glEnable(3042);
/* 194 */     GL11.glDisable(3553);
/* 195 */     GL11.glBlendFunc(770, 771);
/* 196 */     GL11.glShadeModel(7425);
/* 197 */     GL11.glBegin(7);
/* 198 */     setColor(color1);
/* 199 */     GL11.glVertex2d(x, y);
/* 200 */     GL11.glVertex2d((x + width), y);
/* 201 */     setColor(color2);
/* 202 */     GL11.glVertex2d((x + width), (y + height));
/* 203 */     GL11.glVertex2d(x, (y + height));
/* 204 */     GL11.glEnd();
/* 205 */     GL11.glShadeModel(7424);
/* 206 */     GL11.glEnable(3553);
/* 207 */     GL11.glDisable(3042);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawString(String text, int x, int y, Color color) {
/* 212 */     setColor(color);
/* 213 */     mc.field_71466_p.func_78276_b(text, x, y, color.getRGB());
/*     */   }
/*     */   
/*     */   public static void drawStringWithShadow(String text, int x, int y, Color color) {
/* 217 */     setColor(color);
/* 218 */     mc.field_71466_p.func_175063_a(text, x, y, color.getRGB());
/*     */   }
/*     */   
/*     */   public static void drawCenteredString(String text, int x, int y, Color color) {
/* 222 */     setColor(color);
/* 223 */     mc.field_71466_p.func_78276_b(text, x - mc.field_71466_p.func_78256_a(text) / 2, y, color.getRGB());
/*     */   }
/*     */   
/*     */   public static void drawCenteredStringWithShadow(String text, int x, int y, Color color) {
/* 227 */     setColor(color);
/* 228 */     mc.field_71466_p.func_175063_a(text, (x - mc.field_71466_p.func_78256_a(text) / 2), y, color.getRGB());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawString(String text, int x, int y, Color color, int scale) {
/* 233 */     setColor(color);
/* 234 */     FontRenderer fr = mc.field_71466_p;
/* 235 */     fr.func_78276_b(text, x, y, color.getRGB());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawStringWithShadow(String text, int x, int y, Color color, int scale) {
/* 240 */     setColor(color);
/* 241 */     FontRenderer fr = mc.field_71466_p;
/* 242 */     fr.func_175063_a(text, x, y, color.getRGB());
/*     */   }
/*     */   
/*     */   public static void drawCenteredString(String text, int x, int y, Color color, int scale) {
/* 246 */     setColor(color);
/* 247 */     FontRenderer fr = mc.field_71466_p;
/* 248 */     fr.func_78276_b(text, x - fr.func_78256_a(text) / 2, y, color.getRGB());
/*     */   }
/*     */   
/*     */   public static void drawCenteredStringWithShadow(String text, int x, int y, Color color, int scale) {
/* 252 */     setColor(color);
/* 253 */     FontRenderer fr = mc.field_71466_p;
/* 254 */     fr.func_175063_a(text, (x - fr.func_78256_a(text) / 2), y, color.getRGB());
/*     */   }
/*     */   
/*     */   public static void drawCenteredStringWithShadow(String text, int x, int y, Color color, int scale, boolean centered) {
/* 258 */     setColor(color);
/* 259 */     FontRenderer fr = mc.field_71466_p;
/* 260 */     if (centered) {
/* 261 */       fr.func_175063_a(text, (x - fr.func_78256_a(text) / 2), y, color.getRGB());
/*     */     } else {
/* 263 */       fr.func_175063_a(text, x, y, color.getRGB());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawItemStack(ItemStack itemStack, int x, int y, float scale) {
/* 269 */     GL11.glPushMatrix();
/* 270 */     GL11.glScalef(scale, scale, scale);
/* 271 */     mc.func_175599_af().func_175042_a(itemStack, x, y);
/* 272 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   public static void drawItemStackWithText(ItemStack stack, int x, int y, String text) {
/* 276 */     if (stack == null)
/* 277 */       return;  RenderItem itemRender = Minecraft.func_71410_x().func_175599_af();
/* 278 */     setColor(Color.WHITE);
/* 279 */     RenderHelper.func_74520_c();
/* 280 */     itemRender.field_77023_b = -145.0F;
/* 281 */     itemRender.func_180450_b(stack, x, y);
/* 282 */     itemRender.func_180453_a((Minecraft.func_71410_x()).field_71466_p, stack, x, y, text);
/* 283 */     itemRender.field_77023_b = 0.0F;
/* 284 */     RenderHelper.func_74518_a();
/*     */   }
/*     */   
/*     */   public static void drawItemStack(ItemStack stack, int x, int y) {
/* 288 */     drawItemStackWithText(stack, x, y, null);
/*     */   }
/*     */   
/*     */   public static void drawItemStack(ItemStack itemStack, int x, int y, float scaleX, float scaleY) {
/* 292 */     GL11.glPushMatrix();
/* 293 */     GL11.glScalef(scaleX, scaleY, 0.0F);
/* 294 */     drawItemStack(itemStack, x, y);
/* 295 */     GL11.glPopMatrix();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawCenteredItemStack(ItemStack itemStack, int x, int y, float scale) {
/* 300 */     GL11.glPushMatrix();
/* 301 */     GL11.glScalef(scale, scale, scale);
/* 302 */     drawItemStack(itemStack, (int)(x - scale / 2.0F), (int)(y - scale / 2.0F));
/* 303 */     GL11.glPopMatrix();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawCheckMark(int x, int y, int size, Color color) {
/* 308 */     GL11.glPushMatrix();
/* 309 */     GL11.glEnable(3042);
/* 310 */     GL11.glDisable(3553);
/* 311 */     GL11.glBlendFunc(770, 771);
/* 312 */     GL11.glLineWidth(2.0F);
/* 313 */     setColor(color);
/* 314 */     GL11.glBegin(1);
/* 315 */     GL11.glVertex2d(x, (y + size / 2));
/* 316 */     GL11.glVertex2d((x + size / 2), (y + size));
/* 317 */     GL11.glVertex2d((x + size / 2), (y + size));
/* 318 */     GL11.glVertex2d((x + size), y);
/* 319 */     GL11.glEnd();
/* 320 */     GL11.glEnable(3553);
/* 321 */     GL11.glDisable(3042);
/* 322 */     GL11.glPopMatrix();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void drawCrossMark(int x, int y, int x2, int y2, Color color) {
/* 327 */     GL11.glPushMatrix();
/* 328 */     GL11.glEnable(3042);
/* 329 */     GL11.glDisable(3553);
/* 330 */     GL11.glBlendFunc(770, 771);
/* 331 */     GL11.glLineWidth(2.0F);
/* 332 */     setColor(color);
/* 333 */     GL11.glBegin(1);
/* 334 */     GL11.glVertex2d(x, y);
/* 335 */     GL11.glVertex2d(x2, y2);
/* 336 */     GL11.glVertex2d(x2, y);
/* 337 */     GL11.glVertex2d(x, y2);
/* 338 */     GL11.glEnd();
/* 339 */     GL11.glEnable(3553);
/* 340 */     GL11.glDisable(3042);
/* 341 */     GL11.glPopMatrix();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Color setAlpha(Color color, int alpha) {
/* 347 */     return new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void setColor(int color) {
/* 352 */     float alpha = (color >> 24 & 0xFF) / 255.0F;
/* 353 */     float red = (color >> 16 & 0xFF) / 255.0F;
/* 354 */     float green = (color >> 8 & 0xFF) / 255.0F;
/* 355 */     float blue = (color & 0xFF) / 255.0F;
/* 356 */     GL11.glColor4f(red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public static void setColor(Color color) {
/* 360 */     setColor(color.getRGB());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void rotate(float angle) {
/* 365 */     GL11.glRotatef(angle, 0.0F, 0.0F, 1.0F);
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\gui\bingui\helper\RenderUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */