package core.java.se9.ch08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class Ex15Test {
  @Test
  void testAverageWithManyEntries() {
    Stream<Double> stream = Stream.of(2.4, 3.5, 1.1, 7.0, 5.0, 9.0);
    var actual = Ex15.average(stream);
    assertEquals(28 / 6.0, actual);
  }

  @Test
  void testAverageWithOneEntry() {
    var actual = Ex15.average(Stream.of(3.4));
    assertEquals(3.4, actual);
  }

  @Test
  void testAverageWithNoEntries() {
    var actual = Ex15.average(Stream.empty());
    assertEquals(0.0, actual);
  }
}
