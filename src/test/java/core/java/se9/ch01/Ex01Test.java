package core.java.se9.ch01;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import core.java.se9.ch01.Ex01;

import static org.junit.jupiter.api.Assertions.*;

public class Ex01Test {

  private static Stream<Arguments> providesIntsToConvert() {
    return Stream.of(Arguments.of(0, "0", "0", "0"), Arguments.of(11, "1011", "13", "b"),
        Arguments.of(27, "11011", "33", "1b"), Arguments.of(136, "10001000", "210", "88"),
        Arguments.of(-23, "-10111", "-27", "-17"), Arguments.of(-59, "-111011", "-73", "-3b"));
  }

  @ParameterizedTest
  @MethodSource("providesIntsToConvert")
  void testEx01(int n, String expectedBinary, String expectedOctal, String expectedHexadecimal) {
    String result = Ex01.createResultString(n);
    assertTrue(result.contains(String.format("bin: %s", expectedBinary)),
        "Failed to find expected binary string for n=" + n + "\n");
    assertTrue(result.contains(String.format("oct: %s", expectedOctal)),
        "Failed to find expected octal string for n=" + n + "\n");
    assertTrue(result.contains(String.format("hex: %s", expectedHexadecimal)),
        "Failed to find expected hexadecimal string for n=" + n + "\n");
  }
}