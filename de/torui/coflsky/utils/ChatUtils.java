/*   */ package de.torui.coflsky.utils;
/*   */ 
/*   */ public class ChatUtils
/*   */ {
/*   */   public static String cleanColour(String in) {
/* 6 */     return in.replaceAll("(?i)\\u00A7.", "");
/*   */   }
/*   */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsk\\utils\ChatUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */