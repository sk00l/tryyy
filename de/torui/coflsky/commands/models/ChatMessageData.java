/*    */ package de.torui.coflsky.commands.models;
/*    */ 
/*    */ import com.google.gson.annotations.SerializedName;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ChatMessageData
/*    */ {
/*    */   @SerializedName("text")
/*    */   public String Text;
/*    */   @SerializedName("onClick")
/*    */   public String OnClick;
/*    */   @SerializedName("hover")
/*    */   public String Hover;
/*    */   
/*    */   public ChatMessageData() {}
/*    */   
/*    */   public ChatMessageData(String text, String onClick, String hover) {
/* 20 */     this.Text = text;
/* 21 */     this.OnClick = onClick;
/* 22 */     this.Hover = hover;
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\commands\models\ChatMessageData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */