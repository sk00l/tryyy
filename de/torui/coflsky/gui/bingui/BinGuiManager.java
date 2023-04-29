/*    */ package de.torui.coflsky.gui.bingui;
/*    */ import de.torui.coflsky.CoflSky;
/*    */ import de.torui.coflsky.gui.GUIType;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.GuiScreen;
/*    */ import net.minecraft.client.gui.inventory.GuiChest;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.inventory.InventoryBasic;
/*    */ import org.lwjgl.input.Mouse;
/*    */ 
/*    */ public class BinGuiManager {
/*    */   public static void openNewFlipGui(String message, String extraData) {
/* 13 */     if (CoflSky.config.purchaseOverlay != GUIType.COFL) {
/*    */       return;
/*    */     }
/*    */     
/* 17 */     GuiChest currentGui = new BinGuiCurrent((IInventory)(Minecraft.func_71410_x()).field_71439_g.field_71071_by, (IInventory)new InventoryBasic("", false, 27), message, extraData);
/* 18 */     Mouse.setGrabbed(false);
/* 19 */     Minecraft.func_71410_x().func_147108_a((GuiScreen)currentGui);
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\gui\bingui\BinGuiManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */