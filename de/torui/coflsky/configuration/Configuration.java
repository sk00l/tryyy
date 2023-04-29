/*    */ package de.torui.coflsky.configuration;
/*    */ import de.torui.coflsky.CoflSky;
/*    */ import de.torui.coflsky.handlers.EventRegistry;
/*    */ import java.util.regex.Pattern;
/*    */ 
/*    */ public class Configuration {
/*    */   private static Configuration instance;
/*    */   public String chatRegex;
/*    */   public boolean collectChat;
/*    */   public boolean collectInventory;
/*    */   public boolean collectTab;
/*    */   public boolean collectScoreboard;
/*    */   public boolean allowProxy;
/*    */   
/*    */   public static Configuration getInstance() {
/* 16 */     if (instance == null)
/* 17 */       instance = new Configuration(); 
/* 18 */     return instance;
/*    */   } public boolean collectInvClick; public boolean collectChatClicks; public boolean collectLobbyChanges; public boolean collectEntities; public boolean collectLocation; public boolean autoStart; @Description("Wherever or not to send item descriptions for extending to the server")
/*    */   public boolean extendDescriptions; @Description("Chat input starting with one of these prefixes is sent to the server")
/*    */   public String[] CommandPrefixes; public static void setInstance(Configuration config) {
/* 22 */     instance = config;
/* 23 */     CoflSky.config.autoStart = instance.autoStart;
/* 24 */     CoflSky.config.extendedtooltips = instance.extendDescriptions;
/* 25 */     EventRegistry.chatpattern = Pattern.compile(instance.chatRegex, 2);
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\configuration\Configuration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */