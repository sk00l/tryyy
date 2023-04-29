/*     */ package de.torui.coflsky.network;
/*     */ 
/*     */ import com.neovisionaries.ws.client.WebSocketException;
/*     */ import de.torui.coflsky.commands.Command;
/*     */ import de.torui.coflsky.commands.RawCommand;
/*     */ import de.torui.coflsky.minecraft_integration.CoflSessionManager;
/*     */ import de.torui.coflsky.minecraft_integration.PlayerDataProvider;
/*     */ import java.io.IOException;
/*     */ import java.net.URI;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.event.ClickEvent;
/*     */ import net.minecraft.util.ChatComponentText;
/*     */ import net.minecraft.util.ChatStyle;
/*     */ import net.minecraft.util.EnumChatFormatting;
/*     */ import net.minecraft.util.IChatComponent;
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
/*     */ public class WSClientWrapper
/*     */ {
/*     */   public WSClient socket;
/*     */   public boolean isRunning;
/*     */   private String[] uris;
/*     */   
/*     */   public WSClientWrapper(String[] uris) {
/*  34 */     this.uris = uris;
/*     */   }
/*     */   
/*     */   public void restartWebsocketConnection() {
/*  38 */     this.socket.stop();
/*     */     
/*  40 */     System.out.println("Sleeping...");
/*  41 */     (Minecraft.func_71410_x()).field_71439_g.func_145747_a((IChatComponent)new ChatComponentText("Lost connection to Coflnet, trying to reestablish the connection in 2 Seconds..."));
/*     */     
/*  43 */     this.socket = new WSClient(this.socket.uri);
/*  44 */     this.isRunning = false;
/*  45 */     while (!this.isRunning) {
/*  46 */       start();
/*     */       try {
/*  48 */         Thread.sleep(2000L);
/*  49 */       } catch (InterruptedException e) {
/*     */         
/*  51 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/*  54 */     this.socket.shouldRun = true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean startConnection() {
/*  60 */     if (this.isRunning) {
/*  61 */       return false;
/*     */     }
/*  63 */     for (String s : this.uris) {
/*     */       
/*  65 */       System.out.println("Trying connection with uri=" + s);
/*     */       
/*  67 */       if (initializeNewSocket(s)) {
/*  68 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  72 */     (Minecraft.func_71410_x()).field_71439_g.func_145747_a((new ChatComponentText("Cofl could not establish a connection to any server!\nIf you think this is a bug. Please report it on our Discord and include the "))
/*     */ 
/*     */         
/*  75 */         .func_150255_a((new ChatStyle()).func_150238_a(EnumChatFormatting.RED))
/*  76 */         .func_150257_a((new ChatComponentText("logs!"))
/*  77 */           .func_150255_a((new ChatStyle())
/*  78 */             .func_150228_d(Boolean.valueOf(true))
/*  79 */             .func_150238_a(EnumChatFormatting.BLUE)
/*  80 */             .func_150241_a(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.youtube.com/watch?v=9Kb29wEcMcs")))));
/*     */     
/*  82 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean initializeNewSocket(String uriPrefix) {
/*  92 */     String uri = uriPrefix;
/*  93 */     uri = uri + "?version=1.5.2-Alpha";
/*     */     
/*  95 */     String username = PlayerDataProvider.getUsername();
/*  96 */     uri = uri + "&player=" + username;
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 101 */       CoflSessionManager.UpdateCoflSessions();
/* 102 */       String coflSessionID = (CoflSessionManager.GetCoflSession(username)).SessionUUID;
/*     */       
/* 104 */       uri = uri + "&SId=" + coflSessionID;
/*     */       
/* 106 */       if (this.socket != null)
/* 107 */         this.socket.stop(); 
/* 108 */       this.socket = new WSClient(URI.create(uri));
/* 109 */       this.isRunning = false;
/* 110 */       boolean successfull = start();
/* 111 */       if (successfull) {
/* 112 */         this.socket.shouldRun = true;
/*     */       }
/* 114 */       return successfull;
/* 115 */     } catch (IOException e) {
/* 116 */       e.printStackTrace();
/*     */ 
/*     */       
/* 119 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private synchronized boolean start() {
/* 124 */     if (!this.isRunning) {
/*     */       
/*     */       try {
/* 127 */         this.socket.start();
/* 128 */         this.isRunning = true;
/*     */         
/* 130 */         return true;
/* 131 */       } catch (IOException e) {
/*     */         
/* 133 */         e.printStackTrace();
/* 134 */       } catch (WebSocketException e) {
/*     */         
/* 136 */         e.printStackTrace();
/* 137 */       } catch (NoSuchAlgorithmException e) {
/*     */         
/* 139 */         e.printStackTrace();
/*     */       } 
/* 141 */       return false;
/*     */     } 
/* 143 */     return false;
/*     */   }
/*     */   
/*     */   public synchronized void stop() {
/* 147 */     if (this.isRunning) {
/* 148 */       this.socket.shouldRun = false;
/* 149 */       this.socket.stop();
/* 150 */       this.isRunning = false;
/* 151 */       this.socket = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public synchronized void SendMessage(RawCommand cmd) {
/* 156 */     if (this.isRunning) {
/* 157 */       this.socket.SendCommand(cmd);
/*     */     } else {
/* 159 */       (Minecraft.func_71410_x()).field_71439_g.func_145747_a((IChatComponent)new ChatComponentText("tried sending a callback to coflnet but failed. the connection must be closed."));
/*     */     } 
/*     */   }
/*     */   public synchronized void SendMessage(Command cmd) {
/* 163 */     if (this.isRunning) {
/* 164 */       this.socket.SendCommand(cmd);
/*     */     } else {
/* 166 */       (Minecraft.func_71410_x()).field_71439_g.func_145747_a((IChatComponent)new ChatComponentText("tried sending a callback to coflnet but failed. the connection must be closed."));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String GetStatus() {
/* 173 */     return "" + this.isRunning + " " + ((this.socket != null) ? this.socket.currentState
/* 174 */       .toString() : "NOT_INITIALIZED");
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\network\WSClientWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */