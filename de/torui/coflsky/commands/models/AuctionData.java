/*    */ package de.torui.coflsky.commands.models;
/*    */ 
/*    */ import com.google.gson.annotations.SerializedName;
/*    */ 
/*    */ public class AuctionData
/*    */ {
/*    */   @SerializedName("auctionId")
/*    */   private String auctionId;
/*    */   
/*    */   public String getAuctionId() {
/* 11 */     return this.auctionId;
/*    */   } @SerializedName("itemId")
/*    */   private String itemId; public void setAuctionId(String auctionId) {
/* 14 */     this.auctionId = auctionId;
/*    */   }
/*    */   public String getItemId() {
/* 17 */     return this.itemId;
/*    */   }
/*    */   public void setItemId(String itemId) {
/* 20 */     this.itemId = itemId;
/*    */   }
/*    */   
/*    */   public AuctionData(String auctionId, String itemId) {
/* 24 */     this.auctionId = auctionId;
/* 25 */     this.itemId = itemId;
/*    */   }
/*    */   
/*    */   public AuctionData() {}
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\commands\models\AuctionData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */