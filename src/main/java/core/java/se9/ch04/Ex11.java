package core.java.se9.ch04;

import java.lang.reflect.InvocationTargetException;

public class Ex11 {
  public static void main(String[] args)
      throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    var f = java.lang.System.class.getField("out");
    var out = f.get(java.lang.System.class);
    var m = out.getClass().getMethod("println", String.class);
    m.invoke(out, "Hello, World");
  }
}