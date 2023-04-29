/*     */ package de.torui.coflsky.gui.bingui.helper;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.FontRenderer;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.client.renderer.RenderHelper;
/*     */ import net.minecraft.client.renderer.Tessellator;
/*     */ import net.minecraft.client.renderer.WorldRenderer;
/*     */ import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GuiUtilsClone
/*     */ {
/*     */   public static final String UNDO_CHAR = "↶";
/*     */   public static final String RESET_CHAR = "☄";
/*     */   public static final String VALID = "✔";
/*     */   public static final String INVALID = "✕";
/*  39 */   public static int[] colorCodes = new int[] { 0, 170, 43520, 43690, 11141120, 11141290, 16755200, 11184810, 5592405, 5592575, 5635925, 5636095, 16733525, 16733695, 16777045, 16777215, 0, 42, 10752, 10794, 2752512, 2752554, 2763264, 2763306, 1381653, 1381695, 1392405, 1392447, 4134165, 4134207, 4144917, 4144959 };
/*     */ 
/*     */   
/*     */   public static int getColorCode(char c, boolean isLighter) {
/*  43 */     return colorCodes[isLighter ? "0123456789abcdef".indexOf(c) : ("0123456789abcdef".indexOf(c) + 16)];
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawContinuousTexturedBox(int x, int y, int u, int v, int width, int height, int textureWidth, int textureHeight, int borderSize, float zLevel) {
/*  64 */     drawContinuousTexturedBox(x, y, u, v, width, height, textureWidth, textureHeight, borderSize, borderSize, borderSize, borderSize, zLevel);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawContinuousTexturedBox(ResourceLocation res, int x, int y, int u, int v, int width, int height, int textureWidth, int textureHeight, int borderSize, float zLevel) {
/*  86 */     drawContinuousTexturedBox(res, x, y, u, v, width, height, textureWidth, textureHeight, borderSize, borderSize, borderSize, borderSize, zLevel);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawContinuousTexturedBox(ResourceLocation res, int x, int y, int u, int v, int width, int height, int textureWidth, int textureHeight, int topBorder, int bottomBorder, int leftBorder, int rightBorder, float zLevel) {
/* 111 */     Minecraft.func_71410_x().func_110434_K().func_110577_a(res);
/* 112 */     drawContinuousTexturedBox(x, y, u, v, width, height, textureWidth, textureHeight, topBorder, bottomBorder, leftBorder, rightBorder, zLevel);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawContinuousTexturedBox(int x, int y, int u, int v, int width, int height, int textureWidth, int textureHeight, int topBorder, int bottomBorder, int leftBorder, int rightBorder, float zLevel) {
/* 136 */     GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
/* 137 */     GlStateManager.func_179147_l();
/* 138 */     GlStateManager.func_179120_a(770, 771, 1, 0);
/*     */     
/* 140 */     int fillerWidth = textureWidth - leftBorder - rightBorder;
/* 141 */     int fillerHeight = textureHeight - topBorder - bottomBorder;
/* 142 */     int canvasWidth = width - leftBorder - rightBorder;
/* 143 */     int canvasHeight = height - topBorder - bottomBorder;
/* 144 */     int xPasses = canvasWidth / fillerWidth;
/* 145 */     int remainderWidth = canvasWidth % fillerWidth;
/* 146 */     int yPasses = canvasHeight / fillerHeight;
/* 147 */     int remainderHeight = canvasHeight % fillerHeight;
/*     */ 
/*     */ 
/*     */     
/* 151 */     drawTexturedModalRect(x, y, u, v, leftBorder, topBorder, zLevel);
/*     */     
/* 153 */     drawTexturedModalRect(x + leftBorder + canvasWidth, y, u + leftBorder + fillerWidth, v, rightBorder, topBorder, zLevel);
/*     */     
/* 155 */     drawTexturedModalRect(x, y + topBorder + canvasHeight, u, v + topBorder + fillerHeight, leftBorder, bottomBorder, zLevel);
/*     */     
/* 157 */     drawTexturedModalRect(x + leftBorder + canvasWidth, y + topBorder + canvasHeight, u + leftBorder + fillerWidth, v + topBorder + fillerHeight, rightBorder, bottomBorder, zLevel);
/*     */     
/* 159 */     for (int i = 0; i < xPasses + ((remainderWidth > 0) ? 1 : 0); ) {
/*     */       
/* 161 */       drawTexturedModalRect(x + leftBorder + i * fillerWidth, y, u + leftBorder, v, (i == xPasses) ? remainderWidth : fillerWidth, topBorder, zLevel);
/*     */       
/* 163 */       drawTexturedModalRect(x + leftBorder + i * fillerWidth, y + topBorder + canvasHeight, u + leftBorder, v + topBorder + fillerHeight, (i == xPasses) ? remainderWidth : fillerWidth, bottomBorder, zLevel);
/*     */ 
/*     */       
/* 166 */       int k = 0; for (;; i++) { if (k < yPasses + ((remainderHeight > 0) ? 1 : 0)) {
/* 167 */           drawTexturedModalRect(x + leftBorder + i * fillerWidth, y + topBorder + k * fillerHeight, u + leftBorder, v + topBorder, (i == xPasses) ? remainderWidth : fillerWidth, (k == yPasses) ? remainderHeight : fillerHeight, zLevel); k++; continue;
/*     */         }  }
/*     */     
/*     */     } 
/* 171 */     for (int j = 0; j < yPasses + ((remainderHeight > 0) ? 1 : 0); j++) {
/*     */       
/* 173 */       drawTexturedModalRect(x, y + topBorder + j * fillerHeight, u, v + topBorder, leftBorder, (j == yPasses) ? remainderHeight : fillerHeight, zLevel);
/*     */       
/* 175 */       drawTexturedModalRect(x + leftBorder + canvasWidth, y + topBorder + j * fillerHeight, u + leftBorder + fillerWidth, v + topBorder, rightBorder, (j == yPasses) ? remainderHeight : fillerHeight, zLevel);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void drawTexturedModalRect(int x, int y, int u, int v, int width, int height, float zLevel) {
/* 180 */     float uScale = 0.00390625F;
/* 181 */     float vScale = 0.00390625F;
/* 182 */     Tessellator tessellator = Tessellator.func_178181_a();
/* 183 */     WorldRenderer wr = tessellator.func_178180_c();
/* 184 */     wr.func_181668_a(7, DefaultVertexFormats.field_181707_g);
/* 185 */     wr.func_181662_b(x, (y + height), zLevel).func_181673_a((u * uScale), ((v + height) * vScale)).func_181675_d();
/* 186 */     wr.func_181662_b((x + width), (y + height), zLevel).func_181673_a(((u + width) * uScale), ((v + height) * vScale)).func_181675_d();
/* 187 */     wr.func_181662_b((x + width), y, zLevel).func_181673_a(((u + width) * uScale), (v * vScale)).func_181675_d();
/* 188 */     wr.func_181662_b(x, y, zLevel).func_181673_a((u * uScale), (v * vScale)).func_181675_d();
/* 189 */     tessellator.func_78381_a();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void drawHoveringText(List<String> textLines, int mouseX, int mouseY, int screenWidth, int screenHeight, int maxTextWidth, FontRenderer font) {
/* 208 */     if (!textLines.isEmpty()) {
/* 209 */       GlStateManager.func_179101_C();
/* 210 */       RenderHelper.func_74518_a();
/* 211 */       GlStateManager.func_179140_f();
/* 212 */       GlStateManager.func_179097_i();
/* 213 */       int tooltipTextWidth = 0;
/*     */       
/* 215 */       for (String textLine : textLines) {
/* 216 */         int textLineWidth = font.func_78256_a(textLine);
/*     */         
/* 218 */         if (textLineWidth > tooltipTextWidth) {
/* 219 */           tooltipTextWidth = textLineWidth;
/*     */         }
/*     */       } 
/*     */       
/* 223 */       boolean needsWrap = false;
/*     */       
/* 225 */       int titleLinesCount = 1;
/* 226 */       int tooltipX = mouseX + 4;
/* 227 */       if (tooltipX + tooltipTextWidth + 4 > screenWidth) {
/* 228 */         tooltipX = mouseX - 16 - tooltipTextWidth;
/* 229 */         if (tooltipX < 4) {
/*     */           
/* 231 */           if (mouseX > screenWidth / 2) {
/* 232 */             tooltipTextWidth = mouseX - 12 - 8;
/*     */           } else {
/* 234 */             tooltipTextWidth = screenWidth - 16 - mouseX;
/*     */           } 
/* 236 */           needsWrap = true;
/*     */         } 
/*     */       } 
/*     */       
/* 240 */       if (maxTextWidth > 0 && tooltipTextWidth > maxTextWidth) {
/* 241 */         tooltipTextWidth = maxTextWidth;
/* 242 */         needsWrap = true;
/*     */       } 
/*     */       
/* 245 */       if (needsWrap) {
/* 246 */         int wrappedTooltipWidth = 0;
/* 247 */         List<String> wrappedTextLines = new ArrayList<>();
/* 248 */         for (int i = 0; i < textLines.size(); i++) {
/* 249 */           String textLine = textLines.get(i);
/* 250 */           List<String> wrappedLine = font.func_78271_c(textLine, tooltipTextWidth);
/* 251 */           if (i == 0) {
/* 252 */             titleLinesCount = wrappedLine.size();
/*     */           }
/*     */           
/* 255 */           for (String line : wrappedLine) {
/* 256 */             int lineWidth = font.func_78256_a(line);
/* 257 */             if (lineWidth > wrappedTooltipWidth) {
/* 258 */               wrappedTooltipWidth = lineWidth;
/*     */             }
/* 260 */             wrappedTextLines.add(line);
/*     */           } 
/*     */         } 
/* 263 */         tooltipTextWidth = wrappedTooltipWidth;
/* 264 */         textLines = wrappedTextLines;
/*     */         
/* 266 */         if (mouseX > screenWidth / 2) {
/* 267 */           tooltipX = mouseX - 16 - tooltipTextWidth;
/*     */         } else {
/* 269 */           tooltipX = mouseX + 12;
/*     */         } 
/*     */       } 
/*     */       
/* 273 */       int tooltipY = mouseY + 4;
/* 274 */       int tooltipHeight = 8;
/*     */       
/* 276 */       if (textLines.size() > 1) {
/* 277 */         tooltipHeight += (textLines.size() - 1) * 10;
/* 278 */         if (textLines.size() > titleLinesCount) {
/* 279 */           tooltipHeight += 2;
/*     */         }
/*     */       } 
/*     */       
/* 283 */       if (tooltipY + tooltipHeight + 6 > screenHeight) {
/* 284 */         tooltipY = screenHeight - tooltipHeight - 6;
/*     */       }
/*     */       
/* 287 */       int zLevel = 300;
/* 288 */       int backgroundColor = -267386864;
/* 289 */       drawGradientRect(300, tooltipX - 3, tooltipY - 4, tooltipX + tooltipTextWidth + 3, tooltipY - 3, -267386864, -267386864);
/* 290 */       drawGradientRect(300, tooltipX - 3, tooltipY + tooltipHeight + 3, tooltipX + tooltipTextWidth + 3, tooltipY + tooltipHeight + 4, -267386864, -267386864);
/* 291 */       drawGradientRect(300, tooltipX - 3, tooltipY - 3, tooltipX + tooltipTextWidth + 3, tooltipY + tooltipHeight + 3, -267386864, -267386864);
/* 292 */       drawGradientRect(300, tooltipX - 4, tooltipY - 3, tooltipX - 3, tooltipY + tooltipHeight + 3, -267386864, -267386864);
/* 293 */       drawGradientRect(300, tooltipX + tooltipTextWidth + 3, tooltipY - 3, tooltipX + tooltipTextWidth + 4, tooltipY + tooltipHeight + 3, -267386864, -267386864);
/* 294 */       int borderColorStart = 1347420415;
/* 295 */       int borderColorEnd = 1344798847;
/* 296 */       drawGradientRect(300, tooltipX - 3, tooltipY - 3 + 1, tooltipX - 3 + 1, tooltipY + tooltipHeight + 3 - 1, 1347420415, 1344798847);
/* 297 */       drawGradientRect(300, tooltipX + tooltipTextWidth + 2, tooltipY - 3 + 1, tooltipX + tooltipTextWidth + 3, tooltipY + tooltipHeight + 3 - 1, 1347420415, 1344798847);
/* 298 */       drawGradientRect(300, tooltipX - 3, tooltipY - 3, tooltipX + tooltipTextWidth + 3, tooltipY - 3 + 1, 1347420415, 1347420415);
/* 299 */       drawGradientRect(300, tooltipX - 3, tooltipY + tooltipHeight + 2, tooltipX + tooltipTextWidth + 3, tooltipY + tooltipHeight + 3, 1344798847, 1344798847);
/*     */       
/* 301 */       for (int lineNumber = 0; lineNumber < textLines.size(); lineNumber++) {
/* 302 */         String line = textLines.get(lineNumber);
/* 303 */         font.func_175063_a(line, tooltipX, tooltipY, -1);
/*     */         
/* 305 */         if (lineNumber + 1 == titleLinesCount) {
/* 306 */           tooltipY += 2;
/*     */         }
/*     */         
/* 309 */         tooltipY += 10;
/*     */       } 
/*     */       
/* 312 */       GlStateManager.func_179145_e();
/* 313 */       GlStateManager.func_179126_j();
/* 314 */       RenderHelper.func_74519_b();
/* 315 */       GlStateManager.func_179091_B();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void drawGradientRect(int zLevel, int left, int top, int right, int bottom, int startColor, int endColor) {
/* 320 */     float startAlpha = (startColor >> 24 & 0xFF) / 255.0F;
/* 321 */     float startRed = (startColor >> 16 & 0xFF) / 255.0F;
/* 322 */     float startGreen = (startColor >> 8 & 0xFF) / 255.0F;
/* 323 */     float startBlue = (startColor & 0xFF) / 255.0F;
/* 324 */     float endAlpha = (endColor >> 24 & 0xFF) / 255.0F;
/* 325 */     float endRed = (endColor >> 16 & 0xFF) / 255.0F;
/* 326 */     float endGreen = (endColor >> 8 & 0xFF) / 255.0F;
/* 327 */     float endBlue = (endColor & 0xFF) / 255.0F;
/*     */     
/* 329 */     GlStateManager.func_179090_x();
/* 330 */     GlStateManager.func_179147_l();
/* 331 */     GlStateManager.func_179118_c();
/* 332 */     GlStateManager.func_179120_a(770, 771, 1, 0);
/* 333 */     GlStateManager.func_179103_j(7425);
/*     */     
/* 335 */     Tessellator tessellator = Tessellator.func_178181_a();
/* 336 */     WorldRenderer worldrenderer = tessellator.func_178180_c();
/* 337 */     worldrenderer.func_181668_a(7, DefaultVertexFormats.field_181706_f);
/* 338 */     worldrenderer.func_181662_b(right, top, zLevel).func_181666_a(startRed, startGreen, startBlue, startAlpha).func_181675_d();
/* 339 */     worldrenderer.func_181662_b(left, top, zLevel).func_181666_a(startRed, startGreen, startBlue, startAlpha).func_181675_d();
/* 340 */     worldrenderer.func_181662_b(left, bottom, zLevel).func_181666_a(endRed, endGreen, endBlue, endAlpha).func_181675_d();
/* 341 */     worldrenderer.func_181662_b(right, bottom, zLevel).func_181666_a(endRed, endGreen, endBlue, endAlpha).func_181675_d();
/* 342 */     tessellator.func_78381_a();
/*     */     
/* 344 */     GlStateManager.func_179103_j(7424);
/* 345 */     GlStateManager.func_179084_k();
/* 346 */     GlStateManager.func_179141_d();
/* 347 */     GlStateManager.func_179098_w();
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\gui\bingui\helper\GuiUtilsClone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */