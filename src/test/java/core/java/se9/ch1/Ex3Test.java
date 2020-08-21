package core.java.se9.ch1;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class Ex3Test {

  private static Stream<Arguments> providesArgsForMax() {
    return Stream.of(
      Arguments.of(0, 0, -1, -2),
      Arguments.of(90, 27, -100, 90),
      Arguments.of(36, -23, 10, 36),
      Arguments.of(349, -1429, 349, 100),
      Arguments.of(60, 60, 20, 10),
      Arguments.of(-11, -30, -11, -1429)
    );
  }

  @ParameterizedTest
  @MethodSource("providesArgsForMax")
  void testMax(int expectedMax, int a, int b, int c) {
    assertEquals(expectedMax, Ex3.max(a, b, c));
  }

  @ParameterizedTest
  @MethodSource("providesArgsForMax")
  void testMaxWithMath(int expectedMax, int a, int b, int c) {
    assertEquals(expectedMax, Ex3.maxWithMath(a, b, c));
  }

}