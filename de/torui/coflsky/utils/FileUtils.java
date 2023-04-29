/*    */ package de.torui.coflsky.utils;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.InputStream;
/*    */ import java.security.MessageDigest;
/*    */ 
/*    */ public class FileUtils {
/*    */   public static byte[] createChecksum(File file) throws Exception {
/*    */     int numRead;
/* 11 */     InputStream fis = new FileInputStream(file);
/*    */     
/* 13 */     byte[] buffer = new byte[1024];
/* 14 */     MessageDigest complete = MessageDigest.getInstance("MD5");
/*    */ 
/*    */     
/*    */     do {
/* 18 */       numRead = fis.read(buffer);
/* 19 */       if (numRead <= 0)
/* 20 */         continue;  complete.update(buffer, 0, numRead);
/*    */     }
/* 22 */     while (numRead != -1);
/*    */     
/* 24 */     fis.close();
/* 25 */     return complete.digest();
/*    */   }
/*    */ 
/*    */   
/*    */   public static String getMD5Checksum(File file) throws Exception {
/* 30 */     byte[] b = createChecksum(file);
/* 31 */     String result = "";
/*    */     
/* 33 */     for (int i = 0; i < b.length; i++) {
/* 34 */       result = result + Integer.toString((b[i] & 0xFF) + 256, 16).substring(1);
/*    */     }
/* 36 */     return result;
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsk\\utils\FileUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */