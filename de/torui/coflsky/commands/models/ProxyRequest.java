/*    */ package de.torui.coflsky.commands.models;
/*    */ 
/*    */ import com.google.gson.annotations.SerializedName;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ProxyRequest
/*    */ {
/*    */   @SerializedName("upload")
/*    */   private boolean uploadEnabled;
/*    */   @SerializedName("id")
/*    */   private String id;
/*    */   @SerializedName("url")
/*    */   private String url;
/*    */   
/*    */   public String getId() {
/* 17 */     return this.id;
/*    */   }
/*    */   
/*    */   public String getUrl() {
/* 21 */     return this.url;
/*    */   }
/*    */   
/*    */   public boolean isUploadEnabled() {
/* 25 */     return this.uploadEnabled;
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\commands\models\ProxyRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */