/*     */ package de.torui.coflsky.network;
/*     */ 
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.neovisionaries.ws.client.WebSocket;
/*     */ import com.neovisionaries.ws.client.WebSocketAdapter;
/*     */ import com.neovisionaries.ws.client.WebSocketException;
/*     */ import com.neovisionaries.ws.client.WebSocketFactory;
/*     */ import com.neovisionaries.ws.client.WebSocketListener;
/*     */ import com.neovisionaries.ws.client.WebSocketState;
/*     */ import de.torui.coflsky.CoflSky;
/*     */ import de.torui.coflsky.WSCommandHandler;
/*     */ import de.torui.coflsky.commands.Command;
/*     */ import de.torui.coflsky.commands.JsonStringCommand;
/*     */ import de.torui.coflsky.commands.RawCommand;
/*     */ import java.io.IOException;
/*     */ import java.net.URI;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.entity.Entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WSClient
/*     */   extends WebSocketAdapter
/*     */ {
/*  29 */   public static Gson gson = (new GsonBuilder())
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  37 */     .create();
/*     */   
/*     */   public URI uri;
/*     */   private WebSocket socket;
/*     */   public boolean shouldRun = false;
/*  42 */   public WebSocketState currentState = WebSocketState.CLOSED;
/*     */   
/*     */   public WSClient(URI uri) {
/*  45 */     this.uri = uri;
/*     */   }
/*     */ 
/*     */   
/*     */   public void start() throws IOException, WebSocketException, NoSuchAlgorithmException {
/*  50 */     WebSocketFactory factory = new WebSocketFactory();
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
/*  71 */     factory.setVerifyHostname(false);
/*  72 */     factory.setSSLContext(NaiveSSLContext.getInstance("TLSv1.2"));
/*  73 */     factory.setConnectionTimeout(10000);
/*  74 */     this.socket = factory.createSocket(this.uri);
/*  75 */     this.socket.addListener((WebSocketListener)this);
/*  76 */     this.socket.connect();
/*     */   }
/*     */   
/*     */   public void stop() {
/*  80 */     System.out.println("Closing Socket");
/*  81 */     if (this.socket == null)
/*     */       return; 
/*  83 */     this.socket.clearListeners();
/*  84 */     this.socket.disconnect();
/*  85 */     System.out.println("Socket closed");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onStateChanged(WebSocket websocket, WebSocketState newState) throws Exception {
/*  91 */     System.out.println("WebSocket Changed state to: " + newState);
/*  92 */     this.currentState = newState;
/*     */     
/*  94 */     if (newState == WebSocketState.CLOSED && this.shouldRun) {
/*  95 */       CoflSky.Wrapper.restartWebsocketConnection();
/*     */     }
/*     */     
/*  98 */     super.onStateChanged(websocket, newState);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onTextMessage(WebSocket websocket, String text) throws Exception {
/* 107 */     System.out.println("Received: " + text);
/* 108 */     JsonStringCommand cmd = (JsonStringCommand)gson.fromJson(text, JsonStringCommand.class);
/*     */     
/* 110 */     WSCommandHandler.HandleCommand(cmd, (Entity)(Minecraft.func_71410_x()).field_71439_g);
/*     */   }
/*     */ 
/*     */   
/*     */   public void SendCommand(Command cmd) {
/* 115 */     SendCommand(new RawCommand(cmd.getType().ToJson(), gson.toJson(cmd.getData())));
/*     */   }
/*     */   public void SendCommand(RawCommand cmd) {
/* 118 */     Send(cmd);
/*     */   }
/*     */   
/*     */   public void Send(Object obj) {
/* 122 */     String json = gson.toJson(obj);
/* 123 */     System.out.println("###Sending message of json value " + json);
/* 124 */     if (this.socket == null)
/*     */       
/*     */       try {
/* 127 */         start();
/* 128 */       } catch (Exception e) {
/*     */         
/* 130 */         System.out.println("Ran into an error on implicit start for send: " + e);
/*     */       }  
/* 132 */     this.socket.sendText(json);
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\network\WSClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */