package core.java.se9.ch08;

import java.util.stream.Stream;

public class Ex15 {
  public static double average(Stream<Double> stream) {
    class Pair {
      public final double sum;
      public final int count;

      public Pair(double sum, int count) {
        this.count = count;
        this.sum = sum;
      }
    }

    Pair p =
        stream.reduce(
            new Pair(0.0, 0),
            (Pair pr, Double val) -> new Pair(pr.sum + val, pr.count + 1),
            (Pair a, Pair b) -> new Pair(a.sum + b.sum, a.count + b.count));
    if (p.count == 0) {
      return 0;
    }
    return p.sum / p.count;
  }
}
