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
/*    */ 
/*    */ class NoMoreFrameException
/*    */   extends WebSocketException
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   public NoMoreFrameException() {
/* 27 */     super(WebSocketError.NO_MORE_FRAME, "No more WebSocket frame from the server.");
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\com\neovisionaries\ws\client\NoMoreFrameException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */