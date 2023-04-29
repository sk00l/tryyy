/*    */ package de.torui.coflsky.commands;
/*    */ 
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.reflect.TypeToken;
/*    */ import de.torui.coflsky.network.WSClient;
/*    */ 
/*    */ public class JsonStringCommand
/*    */   extends Command<String>
/*    */ {
/*    */   public JsonStringCommand(String type, String data) {
/* 11 */     setType((CommandType)WSClient.gson.fromJson(type, CommandType.class));
/* 12 */     setData(data);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public JsonStringCommand() {}
/*    */ 
/*    */   
/*    */   public JsonStringCommand(CommandType type, String data) {
/* 21 */     super(type, data);
/*    */   }
/*    */   
/*    */   public <T> Command<T> GetAs(TypeToken<T> type) {
/* 25 */     T t = (T)(new GsonBuilder()).create().fromJson(getData(), type.getType());
/* 26 */     Command<?> cmd = new Command(getType(), t);
/*    */     
/* 28 */     return (Command)cmd;
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\commands\JsonStringCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */