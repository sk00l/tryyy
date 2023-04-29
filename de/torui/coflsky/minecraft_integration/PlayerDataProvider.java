/*    */ package de.torui.coflsky.minecraft_integration;
/*    */ 
/*    */ import de.torui.coflsky.network.WSClient;
/*    */ import java.io.BufferedInputStream;
/*    */ import java.io.ByteArrayOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.net.HttpURLConnection;
/*    */ import java.net.URL;
/*    */ import java.util.UUID;
/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ 
/*    */ public class PlayerDataProvider
/*    */ {
/*    */   private static class UUIDHelper
/*    */   {
/*    */     public String id;
/*    */     public String name;
/*    */   }
/*    */   
/*    */   public static class PlayerPosition
/*    */   {
/*    */     public double X;
/*    */     public double Y;
/*    */     public double Z;
/*    */     public float Yaw;
/*    */     public float Pitch;
/*    */   }
/*    */   
/*    */   public static String getActivePlayerUUID() {
/*    */     try {
/* 34 */       URL url = new URL("https://api.mojang.com/profiles/minecraft");
/*    */       
/* 36 */       HttpURLConnection con = (HttpURLConnection)url.openConnection();
/* 37 */       con.setRequestMethod("POST");
/*    */       
/* 39 */       con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
/* 40 */       con.setRequestProperty("Accept", "application/json");
/* 41 */       con.setDoInput(true);
/* 42 */       con.setDoOutput(true);
/*    */ 
/*    */ 
/*    */       
/* 46 */       OutputStream os = con.getOutputStream();
/* 47 */       byte[] bytes = ("[\"" + getUsername() + "\"]").getBytes("UTF-8");
/* 48 */       os.write(bytes);
/* 49 */       os.close();
/*    */       
/* 51 */       InputStream in = new BufferedInputStream(con.getInputStream());
/* 52 */       ByteArrayOutputStream result = new ByteArrayOutputStream();
/* 53 */       byte[] buffer = new byte[1024]; int length;
/* 54 */       while ((length = in.read(buffer)) != -1) {
/* 55 */         result.write(buffer, 0, length);
/*    */       }
/*    */       
/* 58 */       String resString = result.toString("UTF-8");
/*    */       
/* 60 */       System.out.println("Result= " + resString);
/* 61 */       UUIDHelper[] helpers = (UUIDHelper[])WSClient.gson.fromJson(resString, UUIDHelper[].class);
/* 62 */       if (helpers.length == 1) {
/* 63 */         return (helpers[0]).id;
/*    */       
/*    */       }
/*    */     }
/* 67 */     catch (IOException e) {
/*    */       
/* 69 */       e.printStackTrace();
/*    */     } 
/* 71 */     return UUID.randomUUID().toString();
/*    */   }
/*    */   
/*    */   public static String getUsername() {
/* 75 */     String username = (String)Minecraft.func_175596_ai().get("X-Minecraft-Username");
/* 76 */     return username;
/*    */   }
/*    */   
/*    */   public static PlayerPosition getPlayerPosition() {
/* 80 */     PlayerPosition pos = new PlayerPosition();
/* 81 */     pos.X = (Minecraft.func_71410_x()).field_71439_g.field_70165_t;
/* 82 */     pos.Y = (Minecraft.func_71410_x()).field_71439_g.field_70163_u;
/* 83 */     pos.Z = (Minecraft.func_71410_x()).field_71439_g.field_70161_v;
/* 84 */     pos.Yaw = (Minecraft.func_71410_x()).field_71439_g.field_70177_z;
/* 85 */     pos.Pitch = (Minecraft.func_71410_x()).field_71439_g.field_70125_A;
/* 86 */     return pos;
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\minecraft_integration\PlayerDataProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */