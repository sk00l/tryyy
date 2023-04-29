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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum ThreadType
/*    */ {
/* 30 */   READING_THREAD,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 37 */   WRITING_THREAD,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 44 */   CONNECT_THREAD,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 51 */   FINISH_THREAD;
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\com\neovisionaries\ws\client\ThreadType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */