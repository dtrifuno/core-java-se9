package core.java.se9.ch1;

public class Ex2 {
  public static int normalizeAngle(int angle) {
    return ((angle % 360) + 360) % 360;
  }

  public static int normalizeAngleFloorMod(int angle) {
    return Math.floorMod(angle, 360);
  }
}