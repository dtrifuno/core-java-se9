package core.java.se9.ch01;

public class Ex02 {
  public static int normalizeAngle(int angle) {
    return ((angle % 360) + 360) % 360;
  }

  public static int normalizeAngleFloorMod(int angle) {
    return Math.floorMod(angle, 360);
  }
}
