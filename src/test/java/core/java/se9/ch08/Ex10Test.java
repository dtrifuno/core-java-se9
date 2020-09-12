package core.java.se9.ch08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class Ex10Test {
  @Test
  void testAverageStringLengthWithManyStrings() {
    var actual =
        Ex10.averageStringLength(
            Stream.of("carbon", "proves", "dressing", "hospital", "cable", "kidney", "bolt"));
    double expected = 6.142857142857143;
    assertEquals(actual, expected);
  }

  @Test
  void testAverageStringLengthWithNoStrings() {
    var actual = Ex10.averageStringLength(Stream.empty());
    assertEquals(0, actual);
  }

  @Test
  void testAverageStringLengthWithOneString() {
    var actual = Ex10.averageStringLength(Stream.of("honesty"));
    assertEquals(7, actual);
  }
}
