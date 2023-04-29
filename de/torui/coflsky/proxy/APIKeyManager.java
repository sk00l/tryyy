/*    */ package de.torui.coflsky.proxy;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.annotations.SerializedName;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.File;
/*    */ import java.io.FileOutputStream;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.Paths;
/*    */ import net.minecraftforge.fml.common.Loader;
/*    */ 
/*    */ public class APIKeyManager {
/* 13 */   private final Gson gson = new Gson();
/* 14 */   private APIInfo apiInfo = new APIInfo();
/*    */   
/*    */   public APIInfo getApiInfo() {
/* 17 */     return this.apiInfo;
/*    */   }
/*    */   
/*    */   public class APIInfo
/*    */   {
/*    */     @SerializedName("api-key")
/*    */     public String key;
/*    */   }
/*    */   
/*    */   public void loadIfExists() throws Exception {
/* 27 */     Path dataPath = Paths.get(Loader.instance().getConfigDir().getPath(), new String[] { "CoflSky", "api-key.json" });
/* 28 */     File file = dataPath.toFile();
/* 29 */     if (file.exists()) {
/* 30 */       BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
/* 31 */       String raw = reader.lines().collect(Collectors.joining("\n"));
/* 32 */       this.apiInfo = (APIInfo)this.gson.fromJson(raw, APIInfo.class);
/* 33 */       reader.close();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void saveKey() throws Exception {
/* 39 */     Path dataPath = Paths.get(Loader.instance().getConfigDir().getPath(), new String[] { "CoflSky", "api-key.json" });
/* 40 */     File file = dataPath.toFile();
/* 41 */     if (file.exists()) {
/* 42 */       file.delete();
/*    */     }
/* 44 */     file.createNewFile();
/*    */     
/* 46 */     String data = this.gson.toJson(this.apiInfo);
/* 47 */     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
/* 48 */     bw.append(data);
/* 49 */     bw.flush();
/* 50 */     bw.close();
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\proxy\APIKeyManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */