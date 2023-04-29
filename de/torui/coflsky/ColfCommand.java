/*    */ package de.torui.coflsky;
/*    */ 
/*    */ import net.minecraft.command.CommandBase;
/*    */ import net.minecraft.command.CommandException;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ 
/*    */ public class ColfCommand
/*    */   extends CommandBase
/*    */ {
/*    */   public int func_82362_a() {
/* 11 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String func_71517_b() {
/* 17 */     return "colf";
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String func_71518_a(ICommandSender sender) {
/* 23 */     return "you misspelled /cofl";
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_71515_b(ICommandSender sender, String[] args) throws CommandException {
/* 28 */     throw new CommandException("you misspelled /cofl", new Object[0]);
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\ColfCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */