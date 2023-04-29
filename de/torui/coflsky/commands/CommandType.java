/*    */ package de.torui.coflsky.commands;
/*    */ 
/*    */ import com.google.gson.annotations.SerializedName;
/*    */ import java.lang.reflect.Field;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public enum CommandType
/*    */ {
/* 10 */   WriteToChat,
/*    */   
/* 12 */   set,
/*    */ 
/*    */   
/* 15 */   Execute,
/*    */ 
/*    */   
/* 18 */   TokenLogin,
/*    */ 
/*    */   
/* 21 */   Clicked,
/*    */ 
/*    */   
/* 24 */   PlaySound,
/*    */ 
/*    */   
/* 27 */   ChatMessage,
/*    */ 
/*    */   
/* 30 */   PurchaseStart,
/*    */ 
/*    */   
/* 33 */   PurchaseConfirm,
/*    */ 
/*    */   
/* 36 */   Reset,
/*    */   
/* 38 */   Flip,
/*    */   
/* 40 */   PrivacySettings,
/*    */   
/* 42 */   Countdown,
/*    */   
/* 44 */   updatePurse,
/*    */   
/* 46 */   updateBits,
/*    */   
/* 48 */   updateServer,
/*    */   
/* 50 */   updateLocation,
/*    */   
/* 52 */   chatBatch,
/*    */   
/* 54 */   uploadTab,
/*    */   
/* 56 */   uploadScoreboard,
/*    */   
/* 58 */   GetMods,
/*    */   
/* 60 */   ProxyRequest;
/*    */   
/*    */   public static Map<CommandType, String> data;
/*    */ 
/*    */   
/*    */   static {
/* 66 */     data = new HashMap<>();
/* 67 */     for (CommandType ct : values()) {
/*    */       try {
/* 69 */         Field f = CommandType.class.getField(ct.name());
/*    */         
/* 71 */         if (f.isAnnotationPresent((Class)SerializedName.class)) {
/* 72 */           SerializedName sn = f.<SerializedName>getAnnotation(SerializedName.class);
/* 73 */           data.put(ct, sn.value());
/*    */         } else {
/* 75 */           throw new RuntimeException("Commandtype must have SerializeName Annotation!");
/*    */         }
/*    */       
/* 78 */       } catch (NoSuchFieldException|SecurityException e) {
/* 79 */         System.err.println("This should never occur!");
/* 80 */         e.printStackTrace();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public String ToJson() {
/* 86 */     return data.get(this);
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\commands\CommandType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */