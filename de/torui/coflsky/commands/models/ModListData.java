/*    */ package de.torui.coflsky.commands.models;
/*    */ 
/*    */ import com.google.gson.annotations.SerializedName;
/*    */ import java.util.LinkedList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class ModListData
/*    */ {
/*    */   @SerializedName("fileNames")
/* 10 */   private final List<String> fileNames = new LinkedList<>();
/*    */   
/*    */   @SerializedName("modNames")
/* 13 */   private final List<String> modNames = new LinkedList<>();
/*    */   
/*    */   @SerializedName("fileHashes")
/* 16 */   private final List<String> fileHashes = new LinkedList<>();
/*    */ 
/*    */ 
/*    */   
/*    */   public void addFilename(String name) {
/* 21 */     this.fileNames.add(name);
/*    */   }
/*    */   
/*    */   public void addModname(String modname) {
/* 25 */     this.modNames.add(modname);
/*    */   }
/*    */   
/*    */   public void addFileHashes(String hash) {
/* 29 */     this.fileHashes.add(hash);
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\commands\models\ModListData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */