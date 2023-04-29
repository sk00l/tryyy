/*     */ package de.torui.coflsky;
/*     */ 
/*     */ import de.torui.coflsky.commands.Command;
/*     */ import de.torui.coflsky.commands.CommandType;
/*     */ import de.torui.coflsky.commands.JsonStringCommand;
/*     */ import de.torui.coflsky.commands.RawCommand;
/*     */ import de.torui.coflsky.commands.models.FlipData;
/*     */ import de.torui.coflsky.gui.GUIType;
/*     */ import de.torui.coflsky.gui.bingui.BinGuiManager;
/*     */ import de.torui.coflsky.gui.tfm.ButtonRemapper;
/*     */ import de.torui.coflsky.minecraft_integration.CoflSessionManager;
/*     */ import de.torui.coflsky.minecraft_integration.PlayerDataProvider;
/*     */ import de.torui.coflsky.network.QueryServerCommands;
/*     */ import de.torui.coflsky.network.WSClient;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Base64;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.command.CommandBase;
/*     */ import net.minecraft.command.CommandException;
/*     */ import net.minecraft.command.ICommandSender;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.event.ClickEvent;
/*     */ import net.minecraft.util.ChatComponentText;
/*     */ import net.minecraft.util.ChatStyle;
/*     */ import net.minecraft.util.EnumChatFormatting;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ 
/*     */ public class CoflSkyCommand extends CommandBase {
/*     */   public static final String HelpText = "Available local sub-commands:\n§bstart: §7starts a new connection\n§bstop: §7stops the connection\n§bconnect: §7Connects to a different server\n§breset: §7resets all local session information and stops the connection\n§bstatus: §7Emits status information\n§bsetgui: §7Changes the auction purchase GUI\nServer-Only Commands:";
/*     */   
/*     */   public int func_82362_a() {
/*  36 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_71517_b() {
/*  41 */     return "cofl";
/*     */   }
/*     */ 
/*     */   
/*     */   public List func_71514_a() {
/*  46 */     ArrayList<String> al = new ArrayList<>();
/*  47 */     al.add("Cofl");
/*  48 */     al.add("coflnet");
/*  49 */     al.add("cl");
/*  50 */     return al;
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_71518_a(ICommandSender sender) {
/*  55 */     return "Available local sub-commands:\n§bstart: §7starts a new connection\n§bstop: §7stops the connection\n§bconnect: §7Connects to a different server\n§breset: §7resets all local session information and stops the connection\n§bstatus: §7Emits status information\n§bsetgui: §7Changes the auction purchase GUI\nServer-Only Commands:";
/*     */   }
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
/*     */   public void func_71515_b(ICommandSender sender, String[] args) throws CommandException {
/*  68 */     (new Thread(() -> {
/*     */           System.out.println(Arrays.toString((Object[])args));
/*     */           if (args.length >= 1) {
/*     */             FlipData flip;
/*     */             boolean shouldInvalidate;
/*     */             String oneLineMessage;
/*     */             switch (args[0].toLowerCase()) {
/*     */               case "start":
/*     */                 CoflSky.Wrapper.stop();
/*     */                 sender.func_145747_a((IChatComponent)new ChatComponentText("starting connection..."));
/*     */                 CoflSky.Wrapper.startConnection();
/*     */ 
/*     */ 
/*     */               
/*     */               case "stop":
/*     */                 CoflSky.Wrapper.stop();
/*     */                 sender.func_145747_a((new ChatComponentText("you stopped the connection to ")).func_150257_a((new ChatComponentText("C")).func_150255_a((new ChatStyle()).func_150238_a(EnumChatFormatting.DARK_BLUE))).func_150257_a((new ChatComponentText("oflnet")).func_150255_a((new ChatStyle()).func_150238_a(EnumChatFormatting.GOLD))).func_150257_a((IChatComponent)new ChatComponentText(".\n    To reconnect enter ")).func_150257_a((new ChatComponentText("\"")).func_150255_a((new ChatStyle()).func_150238_a(EnumChatFormatting.AQUA))).func_150257_a((IChatComponent)new ChatComponentText("/cofl start")).func_150257_a((new ChatComponentText("\"")).func_150255_a((new ChatStyle()).func_150238_a(EnumChatFormatting.AQUA))).func_150257_a((IChatComponent)new ChatComponentText(" or click this message")).func_150255_a((new ChatStyle()).func_150241_a(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/cofl start"))));
/*     */ 
/*     */ 
/*     */               
/*     */               case "debug":
/*     */                 return;
/*     */ 
/*     */ 
/*     */               
/*     */               case "callback":
/*     */                 CallbackCommand(args);
/*     */ 
/*     */ 
/*     */               
/*     */               case "dev":
/*     */                 if (Config.BaseUrl.contains("localhost")) {
/*     */                   CoflSky.Wrapper.startConnection();
/*     */                   Config.BaseUrl = "https://sky.coflnet.com";
/*     */                 } else {
/*     */                   CoflSky.Wrapper.initializeNewSocket("ws://localhost:8009/modsocket");
/*     */                   Config.BaseUrl = "http://localhost:5005";
/*     */                 } 
/*     */                 sender.func_145747_a((IChatComponent)new ChatComponentText("toggled dev mode, now using " + Config.BaseUrl));
/*     */ 
/*     */ 
/*     */               
/*     */               case "status":
/*     */                 sender.func_145747_a((IChatComponent)new ChatComponentText(StatusMessage()));
/*     */ 
/*     */               
/*     */               case "reset":
/*     */                 HandleReset();
/*     */ 
/*     */               
/*     */               case "connect":
/*     */                 if (args.length == 2) {
/*     */                   String destination = args[1];
/*     */                   if (!destination.contains("://")) {
/*     */                     destination = new String(Base64.getDecoder().decode(destination));
/*     */                   }
/*     */                   sender.func_145747_a((IChatComponent)new ChatComponentText("Stopping connection!"));
/*     */                   CoflSky.Wrapper.stop();
/*     */                   sender.func_145747_a((IChatComponent)new ChatComponentText("Opening connection to " + destination));
/*     */                   if (CoflSky.Wrapper.initializeNewSocket(destination)) {
/*     */                     sender.func_145747_a((IChatComponent)new ChatComponentText("Success"));
/*     */                   } else {
/*     */                     sender.func_145747_a((IChatComponent)new ChatComponentText("Could not open connection, please check the logs"));
/*     */                   } 
/*     */                 } else {
/*     */                   sender.func_145747_a((IChatComponent)new ChatComponentText("§cPleace specify a server to connect to"));
/*     */                 } 
/*     */ 
/*     */               
/*     */               case "openauctiongui":
/*     */                 flip = WSCommandHandler.flipHandler.fds.getFlipById(args[1]);
/* 139 */                 shouldInvalidate = (args.length >= 3 && args[2].equals("true"));
/*     */                 if (flip == null) {
/*     */                   WSCommandHandler.flipHandler.lastClickedFlipMessage = "";
/*     */                   (Minecraft.func_71410_x()).field_71439_g.func_71165_d("/viewauction " + args[1]);
/*     */                   return;
/*     */                 } 
/*     */                 oneLineMessage = String.join(" ", new CharSequence[] { flip.getMessageAsString() }).replaceAll("\n", "").split(",§7 sellers ah")[0];
/*     */                 if (shouldInvalidate) {
/*     */                   WSCommandHandler.flipHandler.fds.InvalidateFlip(flip);
/*     */                 }
/*     */                 WSCommandHandler.flipHandler.lastClickedFlipMessage = oneLineMessage;
/*     */                 BinGuiManager.openNewFlipGui(oneLineMessage, flip.Render);
/*     */                 (Minecraft.func_71410_x()).field_71439_g.func_71165_d("/viewauction " + flip.Id);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*     */               case "setgui":
/*     */                 if (args.length != 2) {
/*     */                   sender.func_145747_a((IChatComponent)new ChatComponentText("[§1C§6oflnet§f]§7: §7Available GUIs:"));
/*     */                   sender.func_145747_a((IChatComponent)new ChatComponentText("[§1C§6oflnet§f]§7: §7Cofl"));
/*     */                   sender.func_145747_a((IChatComponent)new ChatComponentText("[§1C§6oflnet§f]§7: §7TFM"));
/*     */                   sender.func_145747_a((IChatComponent)new ChatComponentText("[§1C§6oflnet§f]§7: §7Off"));
/*     */                   return;
/*     */                 } 
/*     */                 if (args[1].equalsIgnoreCase("cofl")) {
/*     */                   CoflSky.config.purchaseOverlay = GUIType.COFL;
/*     */                   sender.func_145747_a((IChatComponent)new ChatComponentText("[§1C§6oflnet§f]§7: §7Set §bPurchase Overlay §7to: §fCofl"));
/*     */                   MinecraftForge.EVENT_BUS.unregister(ButtonRemapper.getInstance());
/*     */                 } 
/*     */                 if (args[1].equalsIgnoreCase("tfm")) {
/*     */                   CoflSky.config.purchaseOverlay = GUIType.TFM;
/*     */                   sender.func_145747_a((IChatComponent)new ChatComponentText("[§1C§6oflnet§f]§7: §7Set §bPurchase Overlay §7to: §fTFM"));
/*     */                   MinecraftForge.EVENT_BUS.register(ButtonRemapper.getInstance());
/*     */                 } 
/*     */                 if (args[1].equalsIgnoreCase("off") || args[1].equalsIgnoreCase("false")) {
/*     */                   CoflSky.config.purchaseOverlay = null;
/*     */                   sender.func_145747_a((IChatComponent)new ChatComponentText("[§1C§6oflnet§f]§7: §7Set §bPurchase Overlay §7to: §fOff"));
/*     */                   MinecraftForge.EVENT_BUS.unregister(ButtonRemapper.getInstance());
/*     */                 } 
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             SendCommandToServer(args, sender);
/*     */           } 
/*     */           ListHelp(sender);
/* 192 */         })).start();
/*     */   }
/*     */   
/*     */   private void HandleReset() {
/* 196 */     CoflSky.Wrapper.SendMessage(new Command(CommandType.Reset, ""));
/* 197 */     CoflSky.Wrapper.stop();
/* 198 */     (Minecraft.func_71410_x()).field_71439_g.func_145747_a((IChatComponent)new ChatComponentText("Stopping Connection to CoflNet"));
/* 199 */     CoflSessionManager.DeleteAllCoflSessions();
/* 200 */     (Minecraft.func_71410_x()).field_71439_g.func_145747_a((IChatComponent)new ChatComponentText("Deleting CoflNet sessions..."));
/* 201 */     if (CoflSky.Wrapper.startConnection()) {
/* 202 */       (Minecraft.func_71410_x()).field_71439_g.func_145747_a((IChatComponent)new ChatComponentText("Started the Connection to CoflNet"));
/*     */     }
/*     */   }
/*     */   
/*     */   public String StatusMessage() {
/* 207 */     String vendor = System.getProperty("java.vm.vendor");
/* 208 */     String name = System.getProperty("java.vm.name");
/* 209 */     String version = System.getProperty("java.version");
/* 210 */     String detailedVersion = System.getProperty("java.vm.version");
/*     */     
/* 212 */     String status = vendor + " " + name + " " + version + " " + detailedVersion + "|Connection = " + ((CoflSky.Wrapper != null) ? CoflSky.Wrapper.GetStatus() : "UNINITIALIZED_WRAPPER");
/*     */     try {
/* 214 */       status = status + "  uri=" + CoflSky.Wrapper.socket.uri.toString();
/* 215 */     } catch (NullPointerException nullPointerException) {}
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 220 */       CoflSessionManager.CoflSession session = CoflSessionManager.GetCoflSession(PlayerDataProvider.getUsername());
/* 221 */       String sessionString = CoflSessionManager.gson.toJson(session);
/* 222 */       status = status + "  session=" + sessionString;
/* 223 */     } catch (IOException iOException) {}
/*     */ 
/*     */     
/* 226 */     return status;
/*     */   }
/*     */   
/*     */   public void SendCommandToServer(String[] args, ICommandSender sender) {
/* 230 */     String command = String.join(" ", Arrays.<CharSequence>copyOfRange((CharSequence[])args, 1, args.length));
/*     */ 
/*     */     
/* 233 */     RawCommand rc = new RawCommand(args[0], WSClient.gson.toJson(command));
/* 234 */     if (CoflSky.Wrapper.isRunning) {
/* 235 */       CoflSky.Wrapper.SendMessage(rc);
/*     */     } else {
/* 237 */       SendAfterStart(sender, rc);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static synchronized void SendAfterStart(ICommandSender sender, RawCommand rc) {
/* 242 */     sender.func_145747_a((new ChatComponentText("CoflSky wasn't active.")).func_150255_a((new ChatStyle()).func_150238_a(EnumChatFormatting.RED)));
/*     */     
/* 244 */     CoflSky.Wrapper.startConnection();
/* 245 */     CoflSky.Wrapper.SendMessage(rc);
/*     */   }
/*     */   
/*     */   public void ListHelp(ICommandSender sender) {
/* 249 */     sender.func_145747_a((IChatComponent)new ChatComponentText("Available local sub-commands:\n§bstart: §7starts a new connection\n§bstop: §7stops the connection\n§bconnect: §7Connects to a different server\n§breset: §7resets all local session information and stops the connection\n§bstatus: §7Emits status information\n§bsetgui: §7Changes the auction purchase GUI\nServer-Only Commands:"));
/* 250 */     sender.func_145747_a((IChatComponent)new ChatComponentText(QueryServerCommands.QueryCommands()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void CallbackCommand(String[] args) {
/* 255 */     String command = String.join(" ", Arrays.<CharSequence>copyOfRange((CharSequence[])args, 1, args.length));
/* 256 */     System.out.println("CallbackData: " + command);
/*     */     
/* 258 */     System.out.println("Callback: " + command);
/* 259 */     WSCommandHandler.HandleCommand(new JsonStringCommand(CommandType.Execute, WSClient.gson.toJson(command)), (Entity)(Minecraft.func_71410_x()).field_71439_g);
/* 260 */     CoflSky.Wrapper.SendMessage((Command)new JsonStringCommand(CommandType.Clicked, WSClient.gson.toJson(command)));
/*     */     
/* 262 */     System.out.println("Sent!");
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\CoflSkyCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */