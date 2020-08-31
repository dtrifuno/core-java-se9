package core.java.se9.ch04.ex01to03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EqualsTest {
  private final Point pointA = new Point(2.5, 3.5);
  private final LabeledPoint labeledPointA = new LabeledPoint("A", 2.5, 3.5);

  @Test
  void testAPointIsEqualToItself() {
    assertEquals(pointA, pointA);
  }

  @Test
  void testAPointIsNotEqualToNull() {
    assertNotEquals(pointA, null);
  }

  @Test
  void testALabeledPointIsEqualToItself() {
    assertEquals(labeledPointA, labeledPointA);
  }

  @Test
  void testALabeledPointIsNotEqualToNull() {
    assertNotEquals(labeledPointA, null);
  }

  @Test
  void testALabeledPointIsNotEqualToAPoint() {
    assertNotEquals(labeledPointA, pointA);
  }

  @Test
  void testAPointIsNotEqualToALabeledPoint() {
    assertNotEquals(pointA, labeledPointA);
  }
  
  @Test
  void testLabeledPointsAreEqualIfTheyAgreeOnAllData() {
    assertEquals(new LabeledPoint("A", 4, 5), new LabeledPoint("A", 4, 5));
  }

  @Test
  void testLabeledPointsAreNotEqualIfTheyDifferInX() {
    assertNotEquals(new LabeledPoint("A", 4, 5), new LabeledPoint("A", 4.2, 5));
  }

  @Test
  void testLabeledPointsAreNotEqualIfTheyDifferInLabel() {
    assertNotEquals(new LabeledPoint("A", 4, 5), new LabeledPoint("B", 4, 5));
  }
}