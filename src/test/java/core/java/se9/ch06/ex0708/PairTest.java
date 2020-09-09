package core.java.se9.ch06.ex0708;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PairTest {

  private static Stream<Arguments> providesArgsToCreatePairs() {
    return Stream.of(
      Arguments.of(0.0, 1.5),
      Arguments.of(3.12, -45.3),
      Arguments.of(2.731, 67.235),
      Arguments.of(-3.14, 7.777),
      Arguments.of(16.1616, -5.271)
    );
  }

  private static Stream<Arguments> providesArgsToMax() {
    return Stream.of(
      Arguments.of(0.4064, 0.6734, 0.6734),
      Arguments.of(0.171, 0.5227, 0.5227),
      Arguments.of(0.0284, 0.3179, 0.3179),
      Arguments.of(0.342, 0.8542, 0.8542),
      Arguments.of(0.51, 0.1038, 0.51)
    );
  }

  private static Stream<Arguments> providesArgsToMin() {
    return Stream.of(
      Arguments.of(0.1316, 0.8505, 0.1316),
      Arguments.of(0.0182, 0.9325, 0.0182),
      Arguments.of(0.5110, 0.6055, 0.5110),
      Arguments.of(0.6894, 0.4159, 0.4159),
      Arguments.of(0.5118, 0.4859, 0.4859)
    );
  }

  @ParameterizedTest
  @MethodSource("providesArgsToCreatePairs")
  void testGetFirst(double first, double second) {
    Pair<Double> pair = new Pair<>(first, second);
    assertEquals(first, pair.getFirst());
  }

  @ParameterizedTest
  @MethodSource("providesArgsToCreatePairs")
  void testGetSecond(double first, double second) {
    Pair<Double> pair = new Pair<>(first, second);
    assertEquals(second, pair.getSecond());
  }

  @ParameterizedTest
  @MethodSource("providesArgsToMax")
  void testMax(double first, double second, double expectedMax) {
    Pair<Double> pair = new Pair<>(first, second);
    assertEquals(expectedMax, pair.max());
  }

  @ParameterizedTest
  @MethodSource("providesArgsToMin")
  void testMin(double first, double second, double expectedMin) {
    Pair<Double> pair = new Pair<>(first, second);
    assertEquals(expectedMin, pair.min());
  }
}
