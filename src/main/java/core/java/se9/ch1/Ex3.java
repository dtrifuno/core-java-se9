package core.java.se9.ch1;

public class Ex3 {
  public static int max(int a, int b, int c) {
    int maxOfAAndB = a > b ? a : b;
    return maxOfAAndB > c ? maxOfAAndB : c;
  }

  public static int maxWithMath(int a, int b, int c) {
    return Math.max(Math.max(a, b), c);
  }
}