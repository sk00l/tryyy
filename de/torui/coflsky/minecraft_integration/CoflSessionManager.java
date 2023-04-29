/*     */ package de.torui.coflsky.minecraft_integration;
/*     */ 
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.TypeAdapter;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.google.gson.stream.JsonWriter;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.time.Duration;
/*     */ import java.time.ZonedDateTime;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
/*     */ import java.util.stream.Collectors;
/*     */ import net.minecraftforge.fml.common.Loader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CoflSessionManager
/*     */ {
/*  32 */   public static Gson gson = (new GsonBuilder()).registerTypeAdapter(ZonedDateTime.class, new TypeAdapter<ZonedDateTime>()
/*     */       {
/*     */         public void write(JsonWriter out, ZonedDateTime value) throws IOException {
/*  35 */           out.value(value.toString());
/*     */         }
/*     */ 
/*     */         
/*     */         public ZonedDateTime read(JsonReader in) throws IOException {
/*  40 */           return ZonedDateTime.parse(in.nextString());
/*     */         }
/*  43 */       }).enableComplexMapKeySerialization().create();
/*     */ 
/*     */   
/*     */   public static class CoflSession
/*     */   {
/*     */     public String SessionUUID;
/*     */     
/*     */     public CoflSession(String sessionUUID, ZonedDateTime timestampCreated) {
/*  51 */       this.SessionUUID = sessionUUID;
/*  52 */       this.timestampCreated = timestampCreated;
/*     */     }
/*     */     public ZonedDateTime timestampCreated;
/*     */     public CoflSession() {} }
/*     */   
/*     */   public static void UpdateCoflSessions() throws IOException {
/*  58 */     Map<String, CoflSession> sessions = GetCoflSessions();
/*     */     
/*  60 */     for (String username : sessions.keySet()) {
/*  61 */       if (!isValidSession(sessions.get(username))) {
/*  62 */         DeleteCoflSession(username);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static Path GetTempFileFolder() {
/*  69 */     Path dataPath = Paths.get(Loader.instance().getConfigDir().getPath(), new String[] { "CoflSky", "sessions" });
/*  70 */     dataPath.toFile().mkdirs();
/*     */     
/*  72 */     return dataPath;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Map<String, CoflSession> GetCoflSessions() throws IOException {
/*  77 */     File[] sessions = GetTempFileFolder().toFile().listFiles();
/*     */     
/*  79 */     Map<String, CoflSession> map = new HashMap<>();
/*     */     
/*  81 */     for (int i = 0; i < sessions.length; i++) {
/*  82 */       map.put(sessions[i].getName(), GetCoflSession(sessions[i].getName()));
/*     */     }
/*     */     
/*  85 */     return map;
/*     */   }
/*     */   
/*     */   public static boolean isValidSession(CoflSession session) {
/*  89 */     if (session.timestampCreated.plus(Duration.ofDays(180L)).isAfter(ZonedDateTime.now())) {
/*  90 */       return true;
/*     */     }
/*  92 */     return false;
/*     */   }
/*     */   
/*     */   private static Path GetUserPath(String username) {
/*  96 */     return Paths.get(GetTempFileFolder().toString() + "/" + username, new String[0]);
/*     */   }
/*     */   
/*     */   public static void DeleteCoflSession(String username) {
/* 100 */     Path path = GetUserPath(username);
/* 101 */     path.toFile().delete();
/*     */   }
/*     */   public static void DeleteAllCoflSessions() {
/* 104 */     Path path = GetTempFileFolder();
/* 105 */     File[] sessions = path.toFile().listFiles();
/* 106 */     for (File f : sessions) {
/* 107 */       f.delete();
/*     */     }
/*     */   }
/*     */   
/*     */   public static CoflSession GetCoflSession(String username) throws IOException {
/* 112 */     Path path = GetUserPath(username);
/* 113 */     File file = path.toFile();
/*     */     
/* 115 */     if (!file.exists()) {
/* 116 */       CoflSession coflSession = new CoflSession(UUID.randomUUID().toString(), ZonedDateTime.now());
/* 117 */       OverwriteCoflSession(username, coflSession);
/* 118 */       return coflSession;
/*     */     } 
/*     */     
/* 121 */     BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
/* 122 */     String raw = reader.lines().collect(Collectors.joining("\n"));
/*     */     
/* 124 */     reader.close();
/* 125 */     CoflSession session = (CoflSession)gson.fromJson(raw, CoflSession.class);
/* 126 */     return session;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean OverwriteCoflSession(String username, CoflSession session) throws IOException {
/* 132 */     Path path = GetUserPath(username);
/* 133 */     File file = path.toFile();
/* 134 */     file.createNewFile();
/*     */     
/* 136 */     String data = gson.toJson(session);
/*     */     
/* 138 */     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
/* 139 */     bw.append(data);
/* 140 */     bw.flush();
/* 141 */     bw.close();
/*     */     
/* 143 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\minecraft_integration\CoflSessionManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */