/*    */ package de.torui.coflsky.commands.models;
/*    */ 
/*    */ import com.google.gson.annotations.SerializedName;
/*    */ import de.torui.coflsky.WSCommandHandler;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FlipData
/*    */ {
/*    */   @SerializedName("messages")
/*    */   public ChatMessageData[] Messages;
/*    */   @SerializedName("id")
/*    */   public String Id;
/*    */   @SerializedName("worth")
/*    */   public int Worth;
/*    */   @SerializedName("sound")
/*    */   public SoundData Sound;
/*    */   @SerializedName("render")
/*    */   public String Render;
/*    */   
/*    */   public FlipData() {}
/*    */   
/*    */   public FlipData(ChatMessageData[] messages, String id, int worth, SoundData sound, String render) {
/* 24 */     this.Messages = messages;
/* 25 */     this.Id = id;
/* 26 */     this.Worth = worth;
/* 27 */     this.Sound = sound;
/* 28 */     this.Render = render;
/*    */   }
/*    */   
/*    */   public String getMessageAsString() {
/* 32 */     return WSCommandHandler.ChatMessageDataToString(this.Messages);
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\commands\models\FlipData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */