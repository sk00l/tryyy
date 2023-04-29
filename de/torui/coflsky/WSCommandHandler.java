/*     */ package de.torui.coflsky;
/*     */ 
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.reflect.TypeToken;
/*     */ import de.torui.coflsky.commands.Command;
/*     */ import de.torui.coflsky.commands.CommandType;
/*     */ import de.torui.coflsky.commands.JsonStringCommand;
/*     */ import de.torui.coflsky.commands.RawCommand;
/*     */ import de.torui.coflsky.commands.models.ChatMessageData;
/*     */ import de.torui.coflsky.commands.models.FlipData;
/*     */ import de.torui.coflsky.commands.models.ModListData;
/*     */ import de.torui.coflsky.commands.models.ProxyRequest;
/*     */ import de.torui.coflsky.commands.models.SoundData;
/*     */ import de.torui.coflsky.commands.models.TimerData;
/*     */ import de.torui.coflsky.configuration.ConfigurationManager;
/*     */ import de.torui.coflsky.proxy.ProxyManager;
/*     */ import de.torui.coflsky.utils.FileUtils;
/*     */ import java.io.File;
/*     */ import java.util.Arrays;
/*     */ import java.util.stream.Stream;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.audio.ISound;
/*     */ import net.minecraft.client.audio.PositionedSoundRecord;
/*     */ import net.minecraft.client.audio.SoundHandler;
/*     */ import net.minecraft.command.ICommandSender;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.event.ClickEvent;
/*     */ import net.minecraft.event.HoverEvent;
/*     */ import net.minecraft.util.ChatComponentText;
/*     */ import net.minecraft.util.ChatStyle;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraftforge.client.ClientCommandHandler;
/*     */ import net.minecraftforge.fml.common.Loader;
/*     */ import net.minecraftforge.fml.common.ModContainer;
/*     */ 
/*     */ public class WSCommandHandler
/*     */ {
/*     */   public static transient String lastOnClickEvent;
/*  40 */   public static FlipHandler flipHandler = new FlipHandler();
/*  41 */   private static final ModListData modListData = new ModListData();
/*  42 */   private static final Gson gson = new Gson();
/*  43 */   private static final ProxyManager proxyManager = new ProxyManager();
/*     */   public static boolean HandleCommand(JsonStringCommand cmd, Entity sender) {
/*     */     SoundData sc;
/*  46 */     System.out.println("Handling Command=" + cmd.toString());
/*     */     
/*  48 */     switch (cmd.getType()) {
/*     */       case WriteToChat:
/*  50 */         WriteToChat(cmd.GetAs(new TypeToken<ChatMessageData>() {  }
/*     */             ));
/*     */         break;
/*     */       case Execute:
/*  54 */         Execute(cmd.GetAs(new TypeToken<String>() {  }, ), sender);
/*     */         break;
/*     */ 
/*     */       
/*     */       case PlaySound:
/*  59 */         sc = (SoundData)cmd.GetAs(new TypeToken<SoundData>() {  }).getData();
/*  60 */         PlaySound(sc.Name, sc.Pitch);
/*     */         break;
/*     */       case ChatMessage:
/*  63 */         ChatMessage(cmd.GetAs(new TypeToken<ChatMessageData[]>() {  }
/*     */             ));
/*     */         break;
/*     */       case Flip:
/*  67 */         Flip(cmd.GetAs(new TypeToken<FlipData>() {  }
/*     */             ));
/*     */         break;
/*     */       case PrivacySettings:
/*  71 */         (new ConfigurationManager()).UpdateConfiguration((String)cmd.getData());
/*     */       case Countdown:
/*  73 */         StartTimer(cmd.GetAs(new TypeToken<TimerData>() {  }
/*     */             ));
/*     */         break;
/*     */       case GetMods:
/*  77 */         getMods();
/*     */         break;
/*     */       case ProxyRequest:
/*  80 */         handleProxyRequest((ProxyRequest[])cmd.GetAs(new TypeToken<ProxyRequest[]>() {  }
/*  81 */             ).getData());
/*     */         break;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  87 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void Flip(Command<FlipData> cmd) {
/*  92 */     ChatMessageData[] messages = ((FlipData)cmd.getData()).Messages;
/*  93 */     SoundData sound = ((FlipData)cmd.getData()).Sound;
/*  94 */     if (sound != null && sound.Name != null) {
/*  95 */       PlaySound(sound.Name, sound.Pitch);
/*     */     }
/*  97 */     Command<ChatMessageData[]> showCmd = new Command(CommandType.ChatMessage, messages);
/*  98 */     ChatMessage(showCmd);
/*  99 */     flipHandler.fds.Insert((FlipData)cmd.getData());
/*     */     
/* 101 */     CoflSky.Events.onKeyEvent(null);
/*     */   }
/*     */   
/*     */   private static void handleProxyRequest(ProxyRequest[] request) {
/* 105 */     for (ProxyRequest req : request) {
/* 106 */       proxyManager.handleRequestAsync(req);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void cacheMods() {
/* 112 */     File modFolder = new File((Minecraft.func_71410_x()).field_71412_D, "mods");
/* 113 */     for (File mods : modFolder.listFiles()) {
/* 114 */       modListData.addFilename(mods.getName());
/*     */       try {
/* 116 */         modListData.addFileHashes(FileUtils.getMD5Checksum(mods));
/* 117 */       } catch (Exception exception) {
/*     */         
/* 119 */         exception.printStackTrace();
/*     */       } 
/*     */     } 
/*     */     
/* 123 */     for (ModContainer mod : Loader.instance().getModList()) {
/* 124 */       modListData.addModname(mod.getName());
/* 125 */       modListData.addModname(mod.getModId());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static void getMods() {
/* 131 */     CoflSky.Wrapper.SendMessage(new RawCommand("foundMods", gson.toJson(modListData)));
/*     */   }
/*     */   
/*     */   private static void PlaySound(String soundName, float pitch) {
/* 135 */     SoundHandler handler = Minecraft.func_71410_x().func_147118_V();
/*     */ 
/*     */ 
/*     */     
/* 139 */     PositionedSoundRecord psr = PositionedSoundRecord.func_147674_a(new ResourceLocation(soundName), pitch);
/*     */     
/* 141 */     handler.func_147682_a((ISound)psr);
/*     */   }
/*     */   
/*     */   private static void Execute(Command<String> cmd, Entity sender) {
/* 145 */     System.out.println("Execute: " + (String)cmd.getData() + " sender:" + sender);
/*     */     
/* 147 */     Execute((String)cmd.getData(), sender);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void StartTimer(Command<TimerData> cmd) {
/* 154 */     CountdownTimer.startCountdown((TimerData)cmd.getData());
/*     */   }
/*     */   
/*     */   public static void Execute(String cmd, Entity sender) {
/* 158 */     if (cmd.startsWith("/cofl") || cmd.startsWith("http")) {
/* 159 */       ClientCommandHandler.instance.func_71556_a((ICommandSender)sender, cmd);
/*     */     } else {
/* 161 */       (Minecraft.func_71410_x()).field_71439_g.func_71165_d(cmd);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static IChatComponent CommandToChatComponent(ChatMessageData wcmd, String fullMessage) {
/* 167 */     if (wcmd.OnClick != null) {
/* 168 */       if (wcmd.Text != null && wcmd.OnClick.startsWith("/viewauction")) {
/* 169 */         lastOnClickEvent = "/cofl openauctiongui " + wcmd.OnClick.split(" ")[1] + " false";
/*     */       } else {
/* 171 */         lastOnClickEvent = "/cofl callback " + wcmd.OnClick;
/*     */       } 
/*     */     }
/* 174 */     if (wcmd.Text != null) {
/* 175 */       ChatComponentText chatComponentText = new ChatComponentText(wcmd.Text);
/*     */ 
/*     */       
/* 178 */       if (wcmd.OnClick != null) {
/* 179 */         ChatStyle style; if (wcmd.OnClick.startsWith("http")) {
/* 180 */           style = (new ChatStyle()).func_150241_a(new ClickEvent(ClickEvent.Action.OPEN_URL, wcmd.OnClick));
/*     */         } else {
/*     */           
/* 183 */           style = (new ChatStyle()).func_150241_a(new ClickEvent(ClickEvent.Action.RUN_COMMAND, lastOnClickEvent));
/*     */         } 
/* 185 */         chatComponentText.func_150255_a(style);
/*     */       } 
/*     */       
/* 188 */       if (wcmd.Hover != null && !wcmd.Hover.isEmpty()) {
/* 189 */         if (chatComponentText.func_150256_b() == null)
/* 190 */           chatComponentText.func_150255_a(new ChatStyle()); 
/* 191 */         chatComponentText.func_150256_b().func_150209_a(new HoverEvent(HoverEvent.Action.SHOW_TEXT, (IChatComponent)new ChatComponentText(wcmd.Hover)));
/*     */       } 
/*     */       
/* 194 */       return (IChatComponent)chatComponentText;
/*     */     } 
/* 196 */     return null;
/*     */   }
/*     */   
/*     */   public static void sendChatMessage(IChatComponent message) {
/* 200 */     (Minecraft.func_71410_x()).field_71439_g.func_145747_a(message);
/*     */   }
/*     */   
/*     */   public static IChatComponent ChatMessage(Command<ChatMessageData[]> cmd) {
/* 204 */     ChatMessageData[] list = (ChatMessageData[])cmd.getData();
/*     */     
/* 206 */     ChatComponentText chatComponentText = new ChatComponentText("");
/* 207 */     String fullMessage = ChatMessageDataToString(list);
/*     */     
/* 209 */     for (ChatMessageData wcmd : list) {
/* 210 */       IChatComponent comp = CommandToChatComponent(wcmd, fullMessage);
/* 211 */       if (comp != null)
/* 212 */         chatComponentText.func_150257_a(comp); 
/*     */     } 
/* 214 */     (Minecraft.func_71410_x()).field_71439_g.func_145747_a((IChatComponent)chatComponentText);
/* 215 */     return (IChatComponent)chatComponentText;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void WriteToChat(Command<ChatMessageData> cmd) {
/* 220 */     ChatMessageData wcmd = (ChatMessageData)cmd.getData();
/*     */     
/* 222 */     IChatComponent comp = CommandToChatComponent(wcmd, wcmd.Text);
/* 223 */     if (comp != null) {
/* 224 */       (Minecraft.func_71410_x()).field_71439_g.func_145747_a(comp);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static String ChatMessageDataToString(ChatMessageData[] messages) {
/* 230 */     Stream<String> stream = Arrays.<ChatMessageData>stream(messages).map(message -> message.Text);
/* 231 */     String s = String.join(",", stream.<CharSequence>toArray(x$0 -> new String[x$0]));
/* 232 */     stream.close();
/* 233 */     return s;
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\WSCommandHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */