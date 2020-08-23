package core.java.se9.ch01;

public class Ex16 {
  public static double average(double first, double... rest) {
    double sum = first;
    double c = 0;

    // Kahan summation
    for (double x : rest) {
      double y = x - c;
      double t = sum + y;
      c = (t - sum) - y;
      sum = t;

    }

    return sum / (rest.length + 1.0);
  }
  
}