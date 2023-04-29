/*    */ package de.torui.coflsky;
/*    */ 
/*    */ import de.torui.coflsky.commands.models.TimerData;
/*    */ import java.util.Locale;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.FontRenderer;
/*    */ import net.minecraft.client.gui.ScaledResolution;
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ import net.minecraftforge.fml.common.gameevent.TickEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CountdownTimer
/*    */ {
/* 19 */   private static Minecraft mc = Minecraft.func_71410_x();
/* 20 */   private static FontRenderer fr = mc.field_71466_p;
/*    */   
/*    */   private static long currentEndTime;
/*    */   
/*    */   private static int currentWidth;
/*    */   
/*    */   private static int currentHeight;
/*    */   
/*    */   private static double currentScale;
/*    */   private static String currentPrefix;
/*    */   private static int currentPrecision;
/*    */   
/*    */   public static void onRenderTick(TickEvent.RenderTickEvent event) {
/* 33 */     if (currentEndTime - System.currentTimeMillis() > 0L) {
/* 34 */       drawTimer();
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void startCountdown(double seconds, int widthPercentage, int heightPercentage, double fontScale) {
/* 44 */     startCountdown(seconds, widthPercentage, heightPercentage, fontScale, "", 4);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void startCountdown(double seconds, int widthPercentage, int heightPercentage, double fontScale, String prefix, int maxPrecision) {
/* 56 */     System.out.println("###Starting countdown " + seconds);
/* 57 */     currentEndTime = (long)(System.currentTimeMillis() + seconds * 1000.0D);
/* 58 */     currentWidth = widthPercentage;
/* 59 */     currentHeight = heightPercentage;
/* 60 */     currentScale = fontScale;
/* 61 */     currentPrefix = prefix;
/* 62 */     currentPrecision = maxPrecision;
/*    */   }
/*    */   
/*    */   public static void startCountdown(TimerData data) {
/* 66 */     startCountdown(data.seconds, data.width, data.height, data.scale, data.prefix, data.maxPrecision);
/*    */   }
/*    */   
/*    */   private static void drawTimer() {
/* 70 */     long curMillis = currentEndTime - System.currentTimeMillis();
/* 71 */     String render = getStringFromDouble(curMillis / 1000.0D);
/*    */     
/* 73 */     ScaledResolution scaled = new ScaledResolution(mc);
/*    */     
/* 75 */     GlStateManager.func_179094_E();
/* 76 */     GlStateManager.func_179139_a(currentScale, currentScale, currentScale);
/* 77 */     int scaledX = (int)(scaled.func_78326_a() * currentWidth / 100.0D / currentScale);
/* 78 */     int scaledY = (int)(scaled.func_78328_b() * currentHeight / 100.0D / currentScale);
/* 79 */     drawHVCenteredString(currentPrefix + render, scaledX, scaledY);
/* 80 */     GlStateManager.func_179121_F();
/*    */   }
/*    */ 
/*    */   
/*    */   private static String getStringFromDouble(double seconds) {
/*    */     String render;
/* 86 */     if (seconds > 100.0D) {
/* 87 */       render = String.valueOf((int)seconds);
/*    */     } else {
/* 89 */       render = String.format(Locale.US, "%.3f", new Object[] { Double.valueOf(seconds) }).substring(0, currentPrecision);
/* 90 */       if (render.charAt(render.length() - 1) == '.') {
/* 91 */         render = render.substring(0, currentPrecision - 1);
/*    */       }
/*    */     } 
/* 94 */     return render + "s";
/*    */   }
/*    */   
/*    */   public static void drawHVCenteredString(String text, int x, int y) {
/* 98 */     text = text.replaceAll("§", "§");
/* 99 */     fr.func_175065_a(text, (x - (fr.func_78256_a(text) >> 1)), (y - (fr.field_78288_b >> 1)), -1, true);
/*    */   }
/*    */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\CountdownTimer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */