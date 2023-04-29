/*    */ package de.torui.coflsky.commands.models;
/*    */ 
/*    */ import com.google.gson.annotations.SerializedName;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SoundData
/*    */ {
/*    */   @SerializedName("name")
/*    */   public String Name;
/*    */   @SerializedName("pitch")
/*    */   public float Pitch;
/*    */   
/*    */   public SoundData() {}
/*    */   
/*    */   public SoundData(String name, float pitch) {
/* 18 */     this.Name = name;
/* 19 */     this.Pitch = pitch;
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\commands\models\SoundData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */