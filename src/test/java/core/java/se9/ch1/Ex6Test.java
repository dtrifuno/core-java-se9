package core.java.se9.ch1;

import java.math.BigInteger;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class Ex6Test {

  private static Stream<Arguments> providesArgsForMax() {
    return Stream.of(
      Arguments.of(-1, BigInteger.ONE),
      Arguments.of(0, BigInteger.ONE),
      Arguments.of(1, BigInteger.ONE),
      Arguments.of(2, BigInteger.TWO),
      Arguments.of(10, BigInteger.valueOf(3628800)),
      Arguments.of(21, new BigInteger("51090942171709440000"))
    );
  }

  @ParameterizedTest
  @MethodSource("providesArgsForMax")
  void testFactorial(int n, BigInteger expectedFactorial) {
    BigInteger factorial = Ex6.factorial(n);
    assertTrue(factorial.equals(expectedFactorial),
        String.format("%d! should be %s, but got %s instead.", n, expectedFactorial, factorial));
  }
}