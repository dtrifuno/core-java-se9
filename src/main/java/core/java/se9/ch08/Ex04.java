package core.java.se9.ch08;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex04 {

  public static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
    return Stream.iterate(seed, xn -> (a * xn + c) % m);
  }

  public static void main(String[] args) {
    System.out.println(
      generateRandomStream(0, 25214903917L, 11, 2L << 47)
      .limit(10)
      .map(Object::toString)
      .collect(Collectors.joining(" "))
    );
    
  }
  
}