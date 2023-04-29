/*    */ package de.torui.coflsky.gui.tfm;
/*    */ import io.netty.channel.ChannelHandler.Sharable;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.channel.ChannelOutboundHandlerAdapter;
/*    */ import io.netty.channel.ChannelPipeline;
/*    */ import io.netty.channel.ChannelPromise;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.network.play.client.C01PacketChatMessage;
/*    */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.network.FMLNetworkEvent;
/*    */ 
/*    */ @Sharable
/*    */ public class ChatMessageSendHandler extends ChannelOutboundHandlerAdapter {
/*    */   public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) {
/* 15 */     if (msg instanceof C01PacketChatMessage && 
/* 16 */       FlipperChatCommand.useChatOnlyMode) {
/* 17 */       String message = ((C01PacketChatMessage)msg).func_149439_c();
/* 18 */       if (!message.startsWith("/")) {
/* 19 */         WSCommandHandler.Execute("/cofl chat " + message, (Entity)(Minecraft.func_71410_x()).field_71439_g);
/*    */         
/*    */         return;
/*    */       } 
/*    */     } 
/* 24 */     ctx.write(msg, promise);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void connect(FMLNetworkEvent.ClientConnectedToServerEvent event) {
/* 29 */     ChannelPipeline pipeline = event.manager.channel().pipeline();
/* 30 */     pipeline.addBefore("packet_handler", getClass().getName(), (ChannelHandler)this);
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\gui\tfm\ChatMessageSendHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */