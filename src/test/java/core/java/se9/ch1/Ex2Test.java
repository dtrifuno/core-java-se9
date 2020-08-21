package core.java.se9.ch1;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class Ex2Test {

  private static Stream<Arguments> providesAnglesForNormalize() {
    return Stream.of(
      Arguments.of(0, 0),
      Arguments.of(90, 90),
      Arguments.of(270, 270),
      Arguments.of(349, 1429),
      Arguments.of(67, -293),
      Arguments.of(11, -1429)
    );
  }

  @ParameterizedTest
  @MethodSource("providesAnglesForNormalize")
  void testNormalize(int expectedNormalizedAngle, int inputAngle) {
    assertEquals(expectedNormalizedAngle, Ex2.normalizeAngle(inputAngle));
  }

  @ParameterizedTest
  @MethodSource("providesAnglesForNormalize")
  void testNormalizeFloorMod(int expectedNormalizedAngle, int inputAngle) {
    assertEquals(expectedNormalizedAngle, Ex2.normalizeAngleFloorMod(inputAngle));
  }

}