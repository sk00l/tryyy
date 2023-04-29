package de.torui.coflsky.configuration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Description {
  String value();
}


/* Location:              D:\cs2\minecr\AOTF-release.v.1.jar!\de\torui\coflsky\configuration\Description.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */