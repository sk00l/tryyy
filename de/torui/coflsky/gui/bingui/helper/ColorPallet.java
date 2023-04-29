/*    */ package de.torui.coflsky.gui.bingui.helper;
/*    */ 
/*    */ import java.awt.Color;
/*    */ 
/*    */ public enum ColorPallet
/*    */ {
/*  7 */   PRIMARY(new Color(34, 40, 49, 255)),
/*  8 */   SECONDARY(new Color(57, 62, 70, 255)),
/*  9 */   TERTIARY(new Color(0, 173, 181, 255)),
/* 10 */   WHITE(new Color(238, 238, 238, 255)),
/* 11 */   ERROR(new Color(178, 30, 30, 255)),
/* 12 */   SUCCESS(new Color(114, 208, 0, 255)),
/* 13 */   WARNING(new Color(208, 121, 22, 255)),
/* 14 */   INFO(new Color(204, 253, 233, 255));
/*    */   
/*    */   private Color color;
/*    */   
/*    */   ColorPallet(Color color) {
/* 19 */     this.color = color;
/*    */   }
/*    */   
/*    */   public Color getColor() {
/* 23 */     return this.color;
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\gui\bingui\helper\ColorPallet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */