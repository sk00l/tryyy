/*     */ package de.torui.coflsky;
/*     */ import de.torui.coflsky.commands.models.FlipData;
/*     */ import java.util.TimerTask;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ 
/*     */ public class FlipHandler {
/*     */   public FlipDataStructure fds;
/*     */   public String lastClickedFlipMessage;
/*     */   
/*     */   public static class FlipDataStructure {
/*  11 */     private Map<Long, FlipData> Flips = new ConcurrentHashMap<>();
/*  12 */     private Map<FlipData, Long> ReverseMap = new ConcurrentHashMap<>();
/*     */     
/*  14 */     private FlipData HighestFlip = null;
/*  15 */     private FlipData LastFlip = null;
/*     */     
/*  17 */     private Timer t = new Timer();
/*  18 */     private TimerTask CurrentTask = null;
/*     */     
/*     */     public synchronized void RunHouseKeeping() {
/*  21 */       synchronized (this.Flips) {
/*     */         
/*  23 */         Long RemoveAllPrior = Long.valueOf(System.currentTimeMillis() - 42000L);
/*  24 */         this.Flips.keySet().stream().filter(l -> (l.longValue() <= RemoveAllPrior.longValue())).forEach(l -> RemoveLong(l));
/*  25 */         if (!this.Flips.isEmpty()) {
/*  26 */           this.HighestFlip = this.Flips.values().stream().max((f1, f2) -> f1.Worth - f2.Worth).orElse(null);
/*     */         } else {
/*  28 */           this.HighestFlip = null;
/*     */         } 
/*     */       } 
/*     */       
/*  32 */       if (this.CurrentTask != null) {
/*  33 */         this.CurrentTask.cancel();
/*  34 */         this.CurrentTask = null;
/*  35 */         this.t.purge();
/*     */       } 
/*  37 */       if (!this.Flips.isEmpty()) {
/*  38 */         this.CurrentTask = new TimerTask()
/*     */           {
/*     */             public void run() {
/*  41 */               FlipHandler.FlipDataStructure.this.RunHouseKeeping();
/*     */             }
/*     */           };
/*  44 */         this.t.schedule(this.CurrentTask, 42150L);
/*     */       } 
/*     */     }
/*     */     
/*     */     public synchronized void Insert(FlipData flip) {
/*  49 */       Long l = Long.valueOf(System.currentTimeMillis());
/*  50 */       this.LastFlip = flip;
/*     */       
/*  52 */       synchronized (this.Flips) {
/*  53 */         this.Flips.put(l, flip);
/*  54 */         this.ReverseMap.put(flip, l);
/*     */       } 
/*     */       
/*  57 */       RunHouseKeeping();
/*     */     }
/*     */     
/*     */     private void RemoveLong(Long l) {
/*  61 */       if (l == null)
/*     */         return; 
/*  63 */       synchronized (this.Flips) {
/*  64 */         FlipData f = this.Flips.get(l);
/*  65 */         if (f != null) {
/*  66 */           this.ReverseMap.remove(f);
/*  67 */           this.Flips.remove(l);
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     private void RemoveFlip(FlipData f) {
/*  73 */       if (f == null) {
/*     */         return;
/*     */       }
/*  76 */       synchronized (this.Flips) {
/*  77 */         Long l = this.ReverseMap.get(f);
/*  78 */         if (l != null) {
/*  79 */           this.Flips.remove(l);
/*  80 */           this.ReverseMap.remove(f);
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public FlipData GetHighestFlip() {
/*  86 */       return this.HighestFlip;
/*     */     }
/*     */     
/*     */     public FlipData GetLastFlip() {
/*  90 */       if (this.LastFlip == null) {
/*  91 */         return null;
/*     */       }
/*  93 */       Long l = this.ReverseMap.get(this.LastFlip);
/*  94 */       if (l == null) {
/*  95 */         this.LastFlip = null;
/*     */       }
/*  97 */       return this.LastFlip;
/*     */     }
/*     */     
/*     */     public FlipData getFlipById(String id) {
/* 101 */       FlipData[] flips = (FlipData[])this.Flips.values().stream().filter(flipData -> flipData.Id.equals(id)).toArray(x$0 -> new FlipData[x$0]);
/* 102 */       this.Flips.forEach((key, value) -> System.out.println(value.Id));
/* 103 */       if (flips.length == 0) {
/* 104 */         return null;
/*     */       }
/* 106 */       return flips[0];
/*     */     }
/*     */     
/*     */     public void InvalidateFlip(FlipData flip) {
/* 110 */       RemoveFlip(flip);
/* 111 */       RunHouseKeeping();
/*     */     }
/*     */     
/*     */     public int CurrentFlips() {
/* 115 */       return this.Flips.size();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlipHandler() {
/* 124 */     this.fds = new FlipDataStructure();
/*     */   }
/*     */ }


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\FlipHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */