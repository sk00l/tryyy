/*    */ package de.torui.coflsky.proxy;
/*    */ import de.torui.coflsky.CoflSky;
/*    */ import de.torui.coflsky.commands.models.ProxyRequest;
/*    */ import java.io.BufferedInputStream;
/*    */ import java.io.ByteArrayOutputStream;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.net.HttpURLConnection;
/*    */ import java.net.URL;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ 
/*    */ public class ProxyManager {
/* 14 */   private final String ProxyResponseUrl = "http://sky.coflnet.com/api/data/proxy";
/* 15 */   private final ExecutorService requestExecutor = Executors.newSingleThreadExecutor();
/*    */ 
/*    */   
/*    */   public void handleRequestAsync(ProxyRequest request) {
/* 19 */     CompletableFuture<String> req = doRequest(request.getUrl());
/* 20 */     if (request.isUploadEnabled()) {
/* 21 */       req.thenAcceptAsync(res -> uploadData(res, request.getId()));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   private String getString(HttpURLConnection con) {
/*    */     try {
/* 28 */       InputStream in = new BufferedInputStream(con.getInputStream());
/* 29 */       ByteArrayOutputStream result = new ByteArrayOutputStream();
/* 30 */       byte[] buffer = new byte[1024]; int length;
/* 31 */       while ((length = in.read(buffer)) != -1) {
/* 32 */         result.write(buffer, 0, length);
/*    */       }
/* 34 */       String resString = result.toString("UTF-8");
/* 35 */       return resString;
/* 36 */     } catch (IOException e) {
/* 37 */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void uploadData(final String data, final String id) {
/* 42 */     this.requestExecutor.submit(new Runnable()
/*    */         {
/*    */           public void run() {
/*    */             try {
/* 46 */               URL url = new URL("http://sky.coflnet.com/api/data/proxy");
/* 47 */               HttpURLConnection con = (HttpURLConnection)url.openConnection();
/* 48 */               con.setRequestMethod("POST");
/*    */               
/* 50 */               con.setRequestProperty("X-Request-Id", id);
/*    */               
/* 52 */               con.setDoOutput(true);
/* 53 */               con.setDoInput(true);
/*    */               
/* 55 */               OutputStream os = con.getOutputStream();
/* 56 */               os.write(data.getBytes("UTF-8"));
/* 57 */               os.close();
/* 58 */               String response = ProxyManager.this.getString(con);
/* 59 */               System.out.println("Response=" + response);
/* 60 */             } catch (Exception exception) {
/* 61 */               exception.printStackTrace();
/*    */             } 
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   private CompletableFuture<String> doRequest(final String targetUrl) {
/* 69 */     final CompletableFuture<String> future = new CompletableFuture<>();
/*    */     
/* 71 */     this.requestExecutor.submit(new Runnable()
/*    */         {
/*    */           public void run() {
/*    */             try {
/* 75 */               URL url = new URL(targetUrl);
/* 76 */               HttpURLConnection con = (HttpURLConnection)url.openConnection();
/* 77 */               con.setRequestMethod("GET");
/* 78 */               con.setRequestProperty("Accept", "application/json");
/* 79 */               con.setRequestProperty("User-Agent", "CoflMod");
/*    */               
/* 81 */               String key = (CoflSky.getAPIKeyManager().getApiInfo()).key;
/*    */               
/* 83 */               if (targetUrl.startsWith("https://api.hypixel.net") && !key.isEmpty()) {
/* 84 */                 con.setRequestProperty("API-Key", key);
/*    */               }
/*    */               
/* 87 */               con.setDoInput(true);
/* 88 */               future.complete(ProxyManager.this.getString(con));
/* 89 */             } catch (Exception exception) {
/* 90 */               exception.printStackTrace();
/*    */             } 
/*    */           }
/*    */         });
/*    */     
/* 95 */     return future;
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\proxy\ProxyManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */