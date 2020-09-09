package core.java.se9.ch08;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Ex16 {
  public static void main(String[] args) {
    BigInteger seed = BigInteger.TEN.pow(50).add(BigInteger.ONE);

    long startSerial = System.nanoTime();
    Stream
      .iterate(seed, x -> x.add(BigInteger.TWO))
      .filter(x -> x.isProbablePrime(10))
      .limit(500)
      .toArray();
    long endSerial = System.nanoTime();
    System.out.printf("The regular stream computation took %.0f ms.\n", (endSerial - startSerial) / 1e6);

    long startParallel = System.nanoTime();
    Stream
      .iterate(seed, x -> x.add(BigInteger.TWO))
      .parallel()
      .filter(x -> x.isProbablePrime(10))
      .limit(500)
      .toArray();
    long endParallel = System.nanoTime();
    System.out.printf("The parallel stream computation took %.0f ms.\n", (endParallel - startParallel) / 1e6);

    // The parallel computation does not seem to be any faster. 
  }
}
