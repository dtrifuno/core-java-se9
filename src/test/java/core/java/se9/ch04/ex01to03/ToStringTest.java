package core.java.se9.ch04.ex01to03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ToStringTest {
  private final Point point = new Point(2.5, 3.5);
  private final LabeledPoint labeledPoint = new LabeledPoint("A", 2.5, 3.5);

  @Test
  void testPointToString() {
    assertEquals("core.java.se9.ch04.ex01to03.Point[x=2.500000,y=3.500000]", point.toString());
  }

  @Test
  void testLabeledPointToString() {
    assertEquals(
        "core.java.se9.ch04.ex01to03.LabeledPoint[x=2.500000,y=3.500000][label=\"A\"]",
        labeledPoint.toString());
  }
}
