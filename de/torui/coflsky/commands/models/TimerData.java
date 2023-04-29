package de.torui.coflsky.commands.models;

import com.google.gson.annotations.SerializedName;

public class TimerData {
  @SerializedName("seconds")
  public double seconds;
  
  @SerializedName("heightPercent")
  public int height;
  
  @SerializedName("widthPercent")
  public int width;
  
  @SerializedName("scale")
  public double scale;
  
  @SerializedName("prefix")
  public String prefix;
  
  @SerializedName("maxPrecision")
  public int maxPrecision;
}


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\commands\models\TimerData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */