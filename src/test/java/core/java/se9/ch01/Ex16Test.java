package core.java.se9.ch01;

import org.junit.jupiter.api.Test;

import core.java.se9.ch01.Ex16;

import static org.junit.jupiter.api.Assertions.*;

public class Ex16Test {
  private static final double DELTA=0.0000000001;

  @Test
  void testAverageWithASingleEntry() {
    assertEquals(-1429.743, Ex16.average(-1429.743), DELTA);
  }

  @Test
  void testAverageWithTwoEntries() {
    assertEquals(7.5, Ex16.average(7, 8), DELTA);
  }

  @Test
  void testAverageWithThreeEntries() {
    assertEquals(26.75, Ex16.average(90, 27, -100, 90), DELTA);
  }

  @Test
  void testAverageWithConsecutiveIntegers() {
    assertEquals(3.0, Ex16.average(1, 2, 3, 4, 5), DELTA);
  }

  @Test
  void testAverageWithZeros() {
    assertEquals(59 / 6.0, Ex16.average(0, 36, 0, -23, 10, 36), DELTA);
  }

  @Test
  void testAverageWithDecimals() {
    assertEquals(0.3702, Ex16.average(13.512, -12.651, -7.234, 5.874, 2.35), DELTA);
  }
}