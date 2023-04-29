/*     */ package de.torui.coflsky.network;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import de.torui.coflsky.CoflSky;
/*     */ import de.torui.coflsky.minecraft_integration.CoflSessionManager;
/*     */ import de.torui.coflsky.minecraft_integration.PlayerDataProvider;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.URL;
/*     */ import java.util.Arrays;
/*     */ 
/*     */ public class QueryServerCommands {
/*  17 */   private static Gson gson = (new GsonBuilder()).create();
/*     */ 
/*     */   
/*     */   public static String QueryCommands() {
/*  21 */     String queryResult = GetRequest(CoflSky.CommandUri);
/*     */     
/*  23 */     if (queryResult != null) {
/*  24 */       CommandInfo[] commands = (CommandInfo[])gson.fromJson(queryResult, CommandInfo[].class);
/*     */       
/*  26 */       System.out.println(">>> " + Arrays.toString((Object[])commands));
/*     */       
/*  28 */       StringBuilder sb = new StringBuilder();
/*     */       
/*  30 */       if (commands.length > 0) {
/*  31 */         for (CommandInfo cm : commands) {
/*  32 */           sb.append(cm + "\n");
/*     */         }
/*     */       }
/*  35 */       return sb.toString().trim();
/*     */     } 
/*     */ 
/*     */     
/*  39 */     return "§4ERROR: Could not connect to command server!";
/*     */   }
/*     */ 
/*     */   
/*     */   private static class CommandInfo
/*     */   {
/*     */     public String subCommand;
/*     */     public String description;
/*     */     
/*     */     public CommandInfo() {}
/*     */     
/*     */     public CommandInfo(String subCommand, String description) {
/*  51 */       this.subCommand = subCommand;
/*  52 */       this.description = description;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  57 */       return this.subCommand + ": " + this.description;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String GetRequest(String uri) {
/*     */     try {
/*  66 */       System.out.println("Get request");
/*  67 */       URL url = new URL(uri);
/*     */       
/*  69 */       HttpURLConnection con = (HttpURLConnection)url.openConnection();
/*  70 */       con.setRequestMethod("GET");
/*     */ 
/*     */       
/*  73 */       con.setRequestProperty("Accept", "application/json");
/*  74 */       con.setRequestProperty("User-Agent", "CoflMod");
/*     */       
/*  76 */       con.setDoInput(true);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  85 */       System.out.println("InputStream");
/*  86 */       InputStream in = new BufferedInputStream(con.getInputStream());
/*  87 */       ByteArrayOutputStream result = new ByteArrayOutputStream();
/*  88 */       byte[] buffer = new byte[1024]; int length;
/*  89 */       while ((length = in.read(buffer)) != -1) {
/*  90 */         result.write(buffer, 0, length);
/*     */       }
/*     */       
/*  93 */       String resString = result.toString("UTF-8");
/*     */       
/*  95 */       System.out.println("Result= " + resString);
/*  96 */       return resString;
/*  97 */     } catch (IOException e) {
/*     */       
/*  99 */       e.printStackTrace();
/*     */ 
/*     */       
/* 102 */       return null;
/*     */     } 
/*     */   } public static String PostRequest(String uri, String data) {
/*     */     try {
/* 106 */       String username = PlayerDataProvider.getUsername();
/* 107 */       URL url = new URL(uri);
/*     */       
/* 109 */       HttpURLConnection con = (HttpURLConnection)url.openConnection();
/* 110 */       con.setRequestMethod("POST");
/*     */       
/* 112 */       con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
/* 113 */       con.setRequestProperty("Accept", "application/json");
/* 114 */       con.setRequestProperty("User-Agent", "CoflMod");
/* 115 */       con.setRequestProperty("conId", (CoflSessionManager.GetCoflSession(username)).SessionUUID);
/* 116 */       con.setRequestProperty("uuid", username);
/* 117 */       con.setDoInput(true);
/* 118 */       con.setDoOutput(true);
/*     */ 
/*     */       
/* 121 */       OutputStream os = con.getOutputStream();
/* 122 */       byte[] bytes = data.getBytes("UTF-8");
/* 123 */       os.write(bytes);
/* 124 */       os.close();
/*     */       
/* 126 */       InputStream in = new BufferedInputStream(con.getInputStream());
/* 127 */       ByteArrayOutputStream result = new ByteArrayOutputStream();
/* 128 */       byte[] buffer = new byte[1024]; int length;
/* 129 */       while ((length = in.read(buffer)) != -1) {
/* 130 */         result.write(buffer, 0, length);
/*     */       }
/*     */       
/* 133 */       String resString = result.toString("UTF-8");
/*     */       
/* 135 */       return resString;
/* 136 */     } catch (IOException e) {
/*     */       
/* 138 */       e.printStackTrace();
/*     */ 
/*     */       
/* 141 */       return null;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\network\QueryServerCommands.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */