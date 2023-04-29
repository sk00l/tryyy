/*     */ package de.torui.coflsky;
/*     */ 
/*     */ import com.google.gson.Gson;
/*     */ import de.torui.coflsky.configuration.LocalConfig;
/*     */ import de.torui.coflsky.gui.GUIType;
/*     */ import de.torui.coflsky.gui.tfm.ButtonRemapper;
/*     */ import de.torui.coflsky.gui.tfm.ChatMessageSendHandler;
/*     */ import de.torui.coflsky.handlers.EventRegistry;
/*     */ import de.torui.coflsky.listeners.ChatListener;
/*     */ import de.torui.coflsky.network.WSClientWrapper;
/*     */ import de.torui.coflsky.proxy.APIKeyManager;
/*     */ import java.io.File;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Paths;
/*     */ import net.minecraft.client.settings.KeyBinding;
/*     */ import net.minecraft.command.ICommand;
/*     */ import net.minecraftforge.client.ClientCommandHandler;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.fml.client.registry.ClientRegistry;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventHandler;
/*     */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*     */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Mod(modid = "CoflSky", version = "1.5.2-Alpha")
/*     */ public class CoflSky
/*     */ {
/*     */   public static final String MODID = "CoflSky";
/*     */   public static final String VERSION = "1.5.2-Alpha";
/*     */   public static WSClientWrapper Wrapper;
/*     */   public static KeyBinding[] keyBindings;
/*     */   public static EventRegistry Events;
/*     */   public static File configFile;
/*     */   private File coflDir;
/*     */   public static LocalConfig config;
/*  42 */   public static final String[] webSocketURIPrefix = new String[] { "wss://sky.coflnet.com/modsocket", "wss://sky-mod.coflnet.com/modsocket", "ws://sky.coflnet.com/modsocket", "ws://sky-mod.coflnet.com/modsocket" };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  49 */   public static String CommandUri = Config.BaseUrl + "/api/mod/commands";
/*  50 */   private static final APIKeyManager apiKeyManager = new APIKeyManager();
/*     */ 
/*     */   
/*     */   @EventHandler
/*     */   public void preInit(FMLPreInitializationEvent event) {
/*  55 */     String configString = null;
/*  56 */     Gson gson = new Gson();
/*  57 */     this.coflDir = new File(event.getModConfigurationDirectory(), "CoflSky");
/*  58 */     this.coflDir.mkdirs();
/*  59 */     configFile = new File(this.coflDir, "config.json");
/*     */     try {
/*  61 */       if (configFile.isFile()) {
/*  62 */         configString = new String(Files.readAllBytes(Paths.get(configFile.getPath(), new String[0])));
/*  63 */         config = (LocalConfig)gson.fromJson(configString, LocalConfig.class);
/*     */       } 
/*  65 */     } catch (Exception e) {
/*  66 */       e.printStackTrace();
/*     */     } 
/*  68 */     if (config == null) {
/*  69 */       config = LocalConfig.createDefaultConfig();
/*     */     }
/*     */     
/*     */     try {
/*  73 */       this; apiKeyManager.loadIfExists();
/*  74 */     } catch (Exception exception) {
/*  75 */       exception.printStackTrace();
/*     */     } 
/*     */     
/*  78 */     MinecraftForge.EVENT_BUS.register(new ChatListener());
/*     */ 
/*     */     
/*  81 */     WSCommandHandler.cacheMods();
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void init(FMLInitializationEvent event) {
/*  86 */     Wrapper = new WSClientWrapper(webSocketURIPrefix);
/*     */     
/*  88 */     keyBindings = new KeyBinding[] { new KeyBinding("key.replay_last.onclick", 0, "SkyCofl"), new KeyBinding("key.start_highest_bid", 0, "SkyCofl") };
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     if (event.getSide() == Side.CLIENT) {
/*  94 */       ClientCommandHandler.instance.func_71560_a((ICommand)new CoflSkyCommand());
/*  95 */       ClientCommandHandler.instance.func_71560_a((ICommand)new ColfCommand());
/*  96 */       ClientCommandHandler.instance.func_71560_a((ICommand)new FlipperChatCommand());
/*     */       
/*  98 */       for (int i = 0; i < keyBindings.length; i++) {
/*  99 */         ClientRegistry.registerKeyBinding(keyBindings[i]);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 104 */     Events = new EventRegistry();
/* 105 */     MinecraftForge.EVENT_BUS.register(Events);
/* 106 */     if (config.purchaseOverlay == GUIType.TFM) {
/* 107 */       MinecraftForge.EVENT_BUS.register(ButtonRemapper.getInstance());
/*     */     }
/* 109 */     MinecraftForge.EVENT_BUS.register(new ChatMessageSendHandler());
/* 110 */     Runtime.getRuntime().addShutdownHook(new Thread(() -> {
/*     */             LocalConfig.saveConfig(configFile, config);
/*     */             try {
/*     */               apiKeyManager.saveKey();
/* 114 */             } catch (Exception exception) {
/*     */               exception.printStackTrace();
/*     */             } 
/*     */           }));
/*     */   }
/*     */   
/*     */   public static APIKeyManager getAPIKeyManager() {
/* 121 */     return apiKeyManager;
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\CoflSky.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */