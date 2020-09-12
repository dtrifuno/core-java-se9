package core.java.se9.ch04.ex01to03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class hashCodeTest {
  private final Point pointA = new Point(2.5, 3.5);
  private final LabeledPoint labeledPointA = new LabeledPoint("A", 2.5, 3.5);

  @Test
  void testALabeledPointDoesNotHaveTheSameHashAsAPoint() {
    assertNotEquals(labeledPointA.hashCode(), pointA.hashCode());
  }

  @Test
  void testdPointsHaveTheSameHashIfTheyAgreeOnAllData() {
    assertEquals(new Point(4, 5).hashCode(), new Point(4, 5).hashCode());
  }

  @Test
  void testPointsHaveDifferentHashesIfTheyDifferInX() {
    assertNotEquals(new Point(4, 5).hashCode(), new Point(4.2, 5).hashCode());
  }

  @Test
  void testLabeledPointsHaveTheSameHashIfTheyAgreeOnAllData() {
    assertEquals(new LabeledPoint("A", 4, 5).hashCode(), new LabeledPoint("A", 4, 5).hashCode());
  }

  @Test
  void testLabeledPointsHaveDifferentHashesIfTheyDifferInX() {
    assertNotEquals(
        new LabeledPoint("A", 4, 5).hashCode(), new LabeledPoint("A", 4.2, 5).hashCode());
  }

  @Test
  void testLabeledPointsHaveDifferentHashesIfTheyDifferInLabel() {
    assertNotEquals(new LabeledPoint("A", 4, 5).hashCode(), new LabeledPoint("B", 4, 5).hashCode());
  }
}
