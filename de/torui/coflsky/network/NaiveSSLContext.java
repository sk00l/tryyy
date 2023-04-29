/*     */ package de.torui.coflsky.network;
/*     */ 
/*     */ import java.security.KeyManagementException;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.NoSuchProviderException;
/*     */ import java.security.Provider;
/*     */ import java.security.cert.X509Certificate;
/*     */ import javax.net.ssl.SSLContext;
/*     */ import javax.net.ssl.TrustManager;
/*     */ import javax.net.ssl.X509TrustManager;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NaiveSSLContext
/*     */ {
/*     */   public static SSLContext getInstance(String protocol) throws NoSuchAlgorithmException {
/*  59 */     return init(SSLContext.getInstance(protocol));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SSLContext getInstance(String protocol, Provider provider) throws NoSuchAlgorithmException {
/*  70 */     return init(SSLContext.getInstance(protocol, provider));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SSLContext getInstance(String protocol, String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
/*  81 */     return init(SSLContext.getInstance(protocol, provider));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static SSLContext init(SSLContext context) {
/*     */     try {
/*  93 */       context.init(null, new TrustManager[] { new NaiveTrustManager() }, null);
/*     */     }
/*  95 */     catch (KeyManagementException e) {
/*     */       
/*  97 */       throw new RuntimeException("Failed to initialize an SSLContext.", e);
/*     */     } 
/*     */     
/* 100 */     return context;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static class NaiveTrustManager
/*     */     implements X509TrustManager
/*     */   {
/*     */     private NaiveTrustManager() {}
/*     */ 
/*     */     
/*     */     public X509Certificate[] getAcceptedIssuers() {
/* 112 */       return null;
/*     */     }
/*     */     
/*     */     public void checkClientTrusted(X509Certificate[] certs, String authType) {}
/*     */     
/*     */     public void checkServerTrusted(X509Certificate[] certs, String authType) {}
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\network\NaiveSSLContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */