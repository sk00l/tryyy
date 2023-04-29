/*    */ package com.neovisionaries.ws.client;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class PongSender
/*    */   extends PeriodicalFrameSender
/*    */ {
/*    */   private static final String TIMER_NAME = "PongSender";
/*    */   
/*    */   public PongSender(WebSocket webSocket, PayloadGenerator generator) {
/* 26 */     super(webSocket, "PongSender", generator);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected WebSocketFrame createFrame(byte[] payload) {
/* 33 */     return WebSocketFrame.createPongFrame(payload);
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\com\neovisionaries\ws\client\PongSender.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */