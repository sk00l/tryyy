/*    */ package de.torui.coflsky;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import net.minecraft.command.CommandException;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.util.ChatComponentText;
/*    */ import net.minecraft.util.IChatComponent;
/*    */ 
/*    */ 
/*    */ public class FlipperChatCommand
/*    */   extends CoflSkyCommand
/*    */ {
/*    */   public static boolean useChatOnlyMode = false;
/*    */   
/*    */   public String func_71517_b() {
/* 17 */     return "fc";
/*    */   }
/*    */ 
/*    */   
/*    */   public List func_71514_a() {
/* 22 */     ArrayList<String> al = new ArrayList<>();
/* 23 */     al.add("coflchat");
/* 24 */     return al;
/*    */   }
/*    */ 
/*    */   
/*    */   public String func_71518_a(ICommandSender sender) {
/* 29 */     return "Shorthand for /cofl chat";
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_71515_b(ICommandSender sender, String[] args) throws CommandException {
/* 34 */     (new Thread(() -> {
/*    */           if (args.length == 1 && args[0].equals("toggle")) {
/*    */             useChatOnlyMode = !useChatOnlyMode;
/*    */             
/*    */             sender.func_145747_a((IChatComponent)new ChatComponentText("[§1C§6oflnet§f]§7: §7Set §bChat only mode §7to: §f" + (useChatOnlyMode ? "true" : "false")));
/*    */           } else {
/*    */             String[] newArgs = new String[args.length + 1];
/*    */             System.arraycopy(args, 0, newArgs, 1, args.length);
/*    */             newArgs[0] = "chat";
/*    */             SendCommandToServer(newArgs, sender);
/*    */           } 
/* 45 */         })).start();
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\FlipperChatCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */