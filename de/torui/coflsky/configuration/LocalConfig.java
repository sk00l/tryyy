/*    */ package de.torui.coflsky.configuration;
/*    */ 
/*    */ import com.google.gson.Gson;
/*    */ import de.torui.coflsky.gui.GUIType;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Paths;
/*    */ 
/*    */ public class LocalConfig
/*    */ {
/*    */   public boolean autoStart;
/*    */   public boolean extendedtooltips;
/*    */   public GUIType purchaseOverlay;
/*    */   
/*    */   public LocalConfig(boolean autoStart, boolean extendedtooltips, GUIType purchaseOverlay) {
/* 18 */     this.autoStart = autoStart;
/* 19 */     this.extendedtooltips = extendedtooltips;
/* 20 */     this.purchaseOverlay = purchaseOverlay;
/*    */   }
/*    */   
/*    */   public static void saveConfig(File file, LocalConfig Config) {
/* 24 */     Gson gson = new Gson();
/*    */     try {
/* 26 */       if (!file.isFile()) {
/* 27 */         file.createNewFile();
/*    */       }
/* 29 */       Files.write(Paths.get(file.getAbsolutePath(), new String[0]), gson
/* 30 */           .toJson(Config).getBytes(StandardCharsets.UTF_8), new java.nio.file.OpenOption[0]);
/* 31 */     } catch (IOException e) {
/* 32 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */   
/*    */   public static LocalConfig createDefaultConfig() {
/* 37 */     return new LocalConfig(true, true, null);
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\configuration\LocalConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */