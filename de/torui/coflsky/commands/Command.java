/*    */ package de.torui.coflsky.commands;
/*    */ 
/*    */ import com.google.gson.annotations.SerializedName;
/*    */ 
/*    */ 
/*    */ public class Command<T>
/*    */ {
/*    */   @SerializedName("type")
/*    */   private CommandType Type;
/*    */   @SerializedName("data")
/*    */   private T data;
/*    */   
/*    */   public Command() {}
/*    */   
/*    */   public Command(CommandType type, T data) {
/* 16 */     this.Type = type;
/* 17 */     this.data = data;
/*    */   }
/*    */   
/*    */   public CommandType getType() {
/* 21 */     return this.Type;
/*    */   }
/*    */   
/*    */   public void setType(CommandType type) {
/* 25 */     this.Type = type;
/*    */   }
/*    */   
/*    */   public T getData() {
/* 29 */     return this.data;
/*    */   }
/*    */   
/*    */   public void setData(T data) {
/* 33 */     this.data = data;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 38 */     return "Command [Type=" + this.Type + ", data=" + this.data + "]";
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\commands\Command.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */