/*    */ package de.torui.coflsky.gui.tfm;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.FontRenderer;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ 
/*    */ public class ToolTipHelper {
/*    */   Minecraft mc;
/*    */   ItemStack stack;
/*    */   List<String> toolTipLines;
/*    */   FontRenderer font;
/*    */   
/*    */   public ToolTipHelper(ItemStack stack) {
/* 17 */     this.mc = Minecraft.func_71410_x();
/* 18 */     this.stack = stack;
/* 19 */     this.toolTipLines = stack.func_82840_a((EntityPlayer)this.mc.field_71439_g, this.mc.field_71474_y.field_82882_x);
/* 20 */     for (int i = 0; i < this.toolTipLines.size(); i++) {
/* 21 */       if (i == 0) {
/* 22 */         this.toolTipLines.set(i, (stack.func_77953_t()).field_77937_e + (String)this.toolTipLines.get(i));
/*    */       } else {
/* 24 */         this.toolTipLines.set(i, EnumChatFormatting.GRAY + (String)this.toolTipLines.get(i));
/*    */       } 
/*    */     } 
/*    */     
/* 28 */     this.font = stack.func_77973_b().getFontRenderer(stack);
/* 29 */     if (this.font == null) {
/* 30 */       this.font = this.mc.field_71466_p;
/*    */     }
/*    */   }
/*    */   
/*    */   public int determineWidth() {
/* 35 */     int width = 0;
/*    */     
/* 37 */     for (String textLine : this.toolTipLines) {
/* 38 */       int textWidth = this.font.func_78256_a(textLine);
/* 39 */       if (textWidth > width) {
/* 40 */         width = textWidth;
/*    */       }
/*    */     } 
/*    */     
/* 44 */     return width;
/*    */   }
/*    */   
/*    */   public int determineHeight() {
/* 48 */     int height = 8;
/* 49 */     if (this.toolTipLines.size() > 1) {
/* 50 */       height += (this.toolTipLines.size() - 1) * 10;
/*    */     }
/* 52 */     return height;
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\gui\tfm\ToolTipHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */