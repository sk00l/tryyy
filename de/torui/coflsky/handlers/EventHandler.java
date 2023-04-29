/*     */ package de.torui.coflsky.handlers;
/*     */ 
/*     */ import de.torui.coflsky.CoflSky;
/*     */ import de.torui.coflsky.commands.Command;
/*     */ import de.torui.coflsky.commands.CommandType;
/*     */ import de.torui.coflsky.configuration.Configuration;
/*     */ import de.torui.coflsky.minecraft_integration.PlayerDataProvider;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.network.NetworkPlayerInfo;
/*     */ import net.minecraft.event.ClickEvent;
/*     */ import net.minecraft.scoreboard.Score;
/*     */ import net.minecraft.scoreboard.ScoreObjective;
/*     */ import net.minecraft.scoreboard.ScorePlayerTeam;
/*     */ import net.minecraft.scoreboard.Scoreboard;
/*     */ import net.minecraft.scoreboard.Team;
/*     */ import net.minecraft.util.ChatComponentText;
/*     */ import net.minecraft.util.ChatStyle;
/*     */ import net.minecraft.util.EnumChatFormatting;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ 
/*     */ public class EventHandler
/*     */ {
/*     */   public static boolean isInSkyblock = false;
/*     */   public static boolean isInTheCatacombs = false;
/*  28 */   private static long purse = 0L;
/*  29 */   private static long bits = 0L;
/*  30 */   private static String location = "";
/*  31 */   private static String server = "";
/*     */   
/*     */   public static void TabMenuData() {
/*  34 */     if (isInSkyblock && CoflSky.Wrapper.isRunning && (Configuration.getInstance()).collectTab) {
/*  35 */       List<String> tabdata = getTabList();
/*  36 */       int size = tabdata.size() - 1;
/*  37 */       for (int i = 0; i < tabdata.size(); i++) {
/*  38 */         String line = ((String)tabdata.get(size - i)).toLowerCase();
/*  39 */         ProcessTabMenu(line);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void UploadTabData() {
/*  45 */     if (!CoflSky.Wrapper.isRunning)
/*     */       return; 
/*  47 */     Command<List<String>> data = new Command(CommandType.uploadTab, getTabList());
/*  48 */     CoflSky.Wrapper.SendMessage(data);
/*     */   }
/*     */   
/*     */   public static void UploadScoreboardData() {
/*  52 */     if (!CoflSky.Wrapper.isRunning)
/*     */       return; 
/*  54 */     Command<List<String>> data = new Command(CommandType.uploadScoreboard, getScoreboard());
/*  55 */     CoflSky.Wrapper.SendMessage(data);
/*     */   }
/*     */   
/*     */   public static void ScoreboardData() {
/*     */     String s;
/*     */     try {
/*  61 */       Scoreboard scoreboard = (Minecraft.func_71410_x()).field_71441_e.func_96441_U();
/*  62 */       ScoreObjective objective = scoreboard.func_96539_a(1);
/*  63 */       s = EnumChatFormatting.func_110646_a(objective.func_96678_d());
/*  64 */     } catch (Exception e) {
/*     */       return;
/*     */     } 
/*  67 */     checkIfInSkyblock(s);
/*  68 */     if (!isInSkyblock || !CoflSky.Wrapper.isRunning) {
/*     */       return;
/*     */     }
/*  71 */     List<String> scoreBoardLines = getScoreboard();
/*  72 */     int size = scoreBoardLines.size() - 1;
/*  73 */     for (int i = 0; i < scoreBoardLines.size(); i++) {
/*  74 */       String line = EnumChatFormatting.func_110646_a(((String)scoreBoardLines.get(size - i)).toLowerCase());
/*  75 */       if ((Configuration.getInstance()).collectScoreboard) {
/*  76 */         ProcessScoreboard(line);
/*     */       }
/*  78 */       if (line.contains("⏣") && !line.equals(location)) {
/*  79 */         location = line;
/*     */         try {
/*  81 */           Thread.sleep(20L);
/*  82 */           UploadLocation();
/*  83 */           Thread.sleep(20L);
/*  84 */           UploadScoreboardData();
/*  85 */         } catch (InterruptedException e) {
/*  86 */           e.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void UploadLocation() {
/*  93 */     if (!(Configuration.getInstance()).collectLocation) {
/*     */       return;
/*     */     }
/*  96 */     Command<PlayerDataProvider.PlayerPosition> data = new Command(CommandType.updateLocation, PlayerDataProvider.getPlayerPosition());
/*  97 */     CoflSky.Wrapper.SendMessage(data);
/*     */   }
/*     */   
/*     */   private static List<String> getScoreboard() {
/* 101 */     ArrayList<String> scoreboardAsText = new ArrayList<>();
/* 102 */     if (Minecraft.func_71410_x() == null || (Minecraft.func_71410_x()).field_71441_e == null) {
/* 103 */       return scoreboardAsText;
/*     */     }
/* 105 */     Scoreboard scoreboard = (Minecraft.func_71410_x()).field_71441_e.func_96441_U();
/* 106 */     ScoreObjective sideBarObjective = scoreboard.func_96539_a(1);
/* 107 */     if (sideBarObjective == null) {
/* 108 */       return scoreboardAsText;
/*     */     }
/* 110 */     String scoreboardTitle = sideBarObjective.func_96678_d();
/* 111 */     scoreboardTitle = EnumChatFormatting.func_110646_a(scoreboardTitle);
/* 112 */     scoreboardAsText.add(scoreboardTitle);
/* 113 */     Collection<Score> scoreboardLines = scoreboard.func_96534_i(sideBarObjective);
/* 114 */     for (Score line : scoreboardLines) {
/* 115 */       String playerName = line.func_96653_e();
/* 116 */       if (playerName == null || playerName.startsWith("#")) {
/*     */         continue;
/*     */       }
/* 119 */       ScorePlayerTeam scorePlayerTeam = scoreboard.func_96509_i(playerName);
/* 120 */       String lineText = EnumChatFormatting.func_110646_a(
/* 121 */           ScorePlayerTeam.func_96667_a((Team)scorePlayerTeam, line.func_96653_e()));
/* 122 */       scoreboardAsText.add(lineText.replace(line.func_96653_e(), ""));
/*     */     } 
/* 124 */     return scoreboardAsText;
/*     */   }
/*     */   
/*     */   private static List<String> getTabList() {
/* 128 */     ArrayList<String> tabListAsString = new ArrayList<>();
/* 129 */     if (Minecraft.func_71410_x() == null || Minecraft.func_71410_x().func_147114_u() == null) {
/* 130 */       return tabListAsString;
/*     */     }
/* 132 */     Collection<NetworkPlayerInfo> playerInfoMap = Minecraft.func_71410_x().func_147114_u().func_175106_d();
/* 133 */     for (NetworkPlayerInfo playerInfo : playerInfoMap) {
/*     */       String toDisplay;
/* 135 */       if (playerInfo.func_178854_k() != null) {
/* 136 */         toDisplay = playerInfo.func_178854_k().func_150254_d();
/*     */       } else {
/* 138 */         toDisplay = ScorePlayerTeam.func_96667_a((Team)playerInfo.func_178850_i(), playerInfo
/* 139 */             .func_178845_a().getName());
/*     */       } 
/* 141 */       tabListAsString.add(EnumChatFormatting.func_110646_a(toDisplay));
/*     */     } 
/* 143 */     return tabListAsString;
/*     */   }
/*     */   
/*     */   private static void ProcessTabMenu(String line) {
/* 147 */     if (line.contains("server:")) {
/* 148 */       String server_ = line.split("server: ")[1];
/* 149 */       if (!server.equals(server_)) {
/* 150 */         server = server_;
/* 151 */         UploadTabData();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void checkIfInSkyblock(String s) {
/* 157 */     if (s.contains("SKYBLOCK") && !isInSkyblock) {
/* 158 */       if (CoflSky.config.autoStart) {
/* 159 */         CoflSky.Wrapper.stop();
/* 160 */         CoflSky.Wrapper.startConnection();
/*     */       } 
/* 162 */       isInSkyblock = true;
/* 163 */     } else if (!s.contains("SKYBLOCK") && isInSkyblock) {
/* 164 */       if (CoflSky.config.autoStart) {
/* 165 */         CoflSky.Wrapper.stop();
/* 166 */         (Minecraft.func_71410_x()).field_71439_g.func_145747_a((new ChatComponentText("connection to "))
/* 167 */             .func_150257_a((new ChatComponentText("C")).func_150255_a((new ChatStyle()).func_150238_a(EnumChatFormatting.DARK_BLUE)))
/* 168 */             .func_150257_a((new ChatComponentText("oflnet")).func_150255_a((new ChatStyle()).func_150238_a(EnumChatFormatting.GOLD)))
/* 169 */             .func_150257_a((IChatComponent)new ChatComponentText(" has been stopped since you left skyblock.\n    To reconnect enter "))
/* 170 */             .func_150257_a((new ChatComponentText("\"")).func_150255_a((new ChatStyle()).func_150238_a(EnumChatFormatting.AQUA)))
/* 171 */             .func_150257_a((IChatComponent)new ChatComponentText("/cofl start"))
/* 172 */             .func_150257_a((new ChatComponentText("\"")).func_150255_a((new ChatStyle()).func_150238_a(EnumChatFormatting.AQUA)))
/* 173 */             .func_150257_a((IChatComponent)new ChatComponentText(" or click this message"))
/* 174 */             .func_150255_a((new ChatStyle()).func_150241_a(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/cofl start"))));
/*     */       } 
/*     */       
/* 177 */       isInSkyblock = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void ProcessScoreboard(String line) {
/* 182 */     if (line.contains("purse") || line.contains("piggy")) {
/* 183 */       long purse_ = 0L;
/*     */       try {
/* 185 */         purse_ = Long.parseLong(line.split(" ")[1].replace(",", "").split("\\.")[0]);
/* 186 */       } catch (Exception e) {
/* 187 */         e.printStackTrace();
/* 188 */         System.out.println("unparsable purse: " + line);
/*     */       } 
/* 190 */       if (purse != purse_) {
/* 191 */         purse = purse_;
/* 192 */         Command<Long> data = new Command(CommandType.updatePurse, Long.valueOf(purse));
/* 193 */         CoflSky.Wrapper.SendMessage(data);
/* 194 */         UploadLocation();
/*     */       } 
/* 196 */     } else if (line.contains("bits")) {
/* 197 */       long bits_ = 0L;
/*     */       try {
/* 199 */         bits_ = Long.parseLong(line.split(" ")[1].replace(",", ""));
/* 200 */       } catch (NumberFormatException e) {
/* 201 */         e.printStackTrace();
/*     */       } 
/* 203 */       if (bits != bits_) {
/* 204 */         bits = bits_;
/* 205 */         Command<Long> data = new Command(CommandType.updateBits, Long.valueOf(bits));
/* 206 */         CoflSky.Wrapper.SendMessage(data);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\handlers\EventHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */