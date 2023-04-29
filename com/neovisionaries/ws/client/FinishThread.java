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
/*    */ class FinishThread
/*    */   extends WebSocketThread
/*    */ {
/*    */   public FinishThread(WebSocket ws) {
/* 23 */     super("FinishThread", ws, ThreadType.FINISH_THREAD);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void runMain() {
/* 30 */     this.mWebSocket.finish();
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\com\neovisionaries\ws\client\FinishThread.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */