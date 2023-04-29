/*    */ package de.torui.coflsky.listeners;
/*    */ 
/*    */ import de.torui.coflsky.CoflSky;
/*    */ import de.torui.coflsky.utils.ChatUtils;
/*    */ import net.minecraftforge.client.event.ClientChatReceivedEvent;
/*    */ import net.minecraftforge.fml.common.eventhandler.EventPriority;
/*    */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*    */ 
/*    */ public class ChatListener
/*    */ {
/*    */   @SubscribeEvent(priority = EventPriority.LOW, receiveCanceled = true)
/*    */   public void onGuiChat(ClientChatReceivedEvent e) {
/* 13 */     String unformatted = ChatUtils.cleanColour(e.message.func_150260_c());
/*    */     
/* 15 */     if (unformatted.startsWith("Your new API key is "))
/*    */     {
/* 17 */       (CoflSky.getAPIKeyManager().getApiInfo()).key = unformatted.substring("Your new API key is ".length()).substring(0, 36);
/*    */     }
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\listeners\ChatListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */