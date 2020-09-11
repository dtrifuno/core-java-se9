package core.java.se9.ch10.ex04;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ex04Test {
  private static Stream<Arguments> providesArgsToTestFibonacci() {
      return Stream.of(
        Arguments.of(1, new BigInteger("1")),
        Arguments.of(5, new BigInteger("5")),
        Arguments.of(8, new BigInteger("21")),
        Arguments.of(13, new BigInteger("233")),
        Arguments.of(27, new BigInteger("196418")),
        Arguments.of(100, new BigInteger("354224848179261915075"))
      );
  }

  @ParameterizedTest
  @MethodSource("providesArgsToTestFibonacci")
  void testGetNthFibonacciNumber(int n, BigInteger expected) {
    assertEquals(Ex04.getNthFibonacciNumber(n), expected);
  }

}
