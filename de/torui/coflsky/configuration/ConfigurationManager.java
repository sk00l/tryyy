/*     */ package de.torui.coflsky.configuration;
/*     */ 
/*     */ import de.torui.coflsky.network.WSClient;
/*     */ import java.lang.reflect.Field;
/*     */ import java.util.Arrays;
/*     */ import net.minecraft.event.HoverEvent;
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
/*     */ public class ConfigurationManager
/*     */ {
/*  19 */   public Configuration Config = Configuration.getInstance();
/*     */ 
/*     */ 
/*     */   
/*     */   public void UpdateConfiguration(String data) {
/*  24 */     Configuration newConfig = (Configuration)WSClient.gson.fromJson(data, Configuration.class);
/*     */     
/*  26 */     if (newConfig == null) {
/*  27 */       System.out.println("Could not deserialize configuration " + data);
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/*  32 */       if (CompareProperties(this.Config, newConfig)) {
/*  33 */         Configuration.setInstance(newConfig);
/*     */       }
/*  35 */     } catch (IllegalArgumentException e) {
/*     */       
/*  37 */       e.printStackTrace();
/*  38 */     } catch (IllegalAccessException e) {
/*     */       
/*  40 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean CompareProperties(Configuration old, Configuration newConfiguration) throws IllegalArgumentException, IllegalAccessException {
/*  47 */     int updatedProperties = 0;
/*  48 */     for (Field f : Configuration.class.getFields()) {
/*     */       
/*  50 */       switch (f.getGenericType().getTypeName()) {
/*     */         
/*     */         case "int":
/*  53 */           if (f.getInt(old) != f.getInt(newConfiguration)) {
/*  54 */             UpdatedProperty(f, newConfiguration);
/*  55 */             updatedProperties++;
/*     */           } 
/*     */           break;
/*     */         case "boolean":
/*  59 */           if (f.getBoolean(old) != f.getBoolean(newConfiguration)) {
/*  60 */             UpdatedProperty(f, newConfiguration);
/*  61 */             updatedProperties++;
/*     */           } 
/*     */           break;
/*     */         
/*     */         case "java.lang.String":
/*  66 */           if (f.get(old) != null && !f.get(old).equals(f.get(newConfiguration))) {
/*  67 */             UpdatedProperty(f, newConfiguration);
/*  68 */             updatedProperties++;
/*     */           } 
/*     */           break;
/*     */         case "java.lang.String[]":
/*  72 */           if (!Arrays.deepEquals((Object[])f.get(old), (Object[])f.get(newConfiguration))) {
/*  73 */             UpdatedProperty(f, newConfiguration);
/*  74 */             updatedProperties++;
/*     */           } 
/*     */           break;
/*     */         
/*     */         default:
/*  79 */           throw new RuntimeException("Invalid Configuration Type " + f.getGenericType().getTypeName());
/*     */       } 
/*     */ 
/*     */     
/*     */     } 
/*  84 */     return (updatedProperties > 0);
/*     */   }
/*     */   
/*     */   private IChatComponent GetNameFormatted(Field propertyName) {
/*  88 */     Description description = propertyName.<Description>getAnnotation(Description.class);
/*  89 */     ChatComponentText toReturn = new ChatComponentText(propertyName.getName());
/*     */     
/*  91 */     ChatStyle style = new ChatStyle();
/*  92 */     style.func_150238_a(EnumChatFormatting.WHITE);
/*     */     
/*  94 */     if (description != null) {
/*  95 */       style.func_150209_a(new HoverEvent(HoverEvent.Action.SHOW_TEXT, (IChatComponent)new ChatComponentText(description
/*  96 */               .value())));
/*     */     }
/*     */     
/*  99 */     return toReturn.func_150255_a(style);
/*     */   }
/*     */ 
/*     */   
/*     */   public void UpdatedProperty(Field propertyName, Configuration confignew) throws IllegalAccessException {
/* 104 */     System.out.println("The Configuration Setting " + propertyName.getName() + " has been updated to " + propertyName.get(confignew));
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\configuration\ConfigurationManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */