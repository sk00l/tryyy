/*    */ package de.torui.coflsky.commands;
/*    */ 
/*    */ import com.google.gson.annotations.SerializedName;
/*    */ 
/*    */ public class RawCommand
/*    */ {
/*    */   @SerializedName("type")
/*    */   private String Type;
/*    */   @SerializedName("data")
/*    */   private String Data;
/*    */   
/*    */   public RawCommand(String type, String data) {
/* 13 */     this.Type = type;
/* 14 */     this.Data = data;
/*    */   }
/*    */   
/*    */   public String getType() {
/* 18 */     return this.Type;
/*    */   }
/*    */   
/*    */   public void setType(String type) {
/* 22 */     this.Type = type;
/*    */   }
/*    */   
/*    */   public String getData() {
/* 26 */     return this.Data;
/*    */   }
/*    */   
/*    */   public void setData(String data) {
/* 30 */     this.Data = data;
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\commands\RawCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */