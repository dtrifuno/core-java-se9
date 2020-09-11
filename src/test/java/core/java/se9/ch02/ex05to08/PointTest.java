package core.java.se9.ch02.ex05to08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {
  @Test
  void testGetters() {
    Point p = new Point(3.5, 2.1);
    assertEquals(p.getX(), 3.5);
    assertEquals(p.getY(), 2.1);
  }

  @Test
  void testDefaultConstructor() {
    Point p = new Point();
    assertEquals(p.getX(), 0);
    assertEquals(p.getY(), 0);
  }

  @Test
  void testTranslate() {
    Point p = new Point(3.5, 2.1).translate(-1.5, -0.1);
    assertEquals(p.getX(), 2.0);
    assertEquals(p.getY(), 2.0);
  }

  @Test
  void testScale() {
    Point p = new Point(2.0, 3.0).scale(4.0);
    assertEquals(p.getX(), 8.0);
    assertEquals(p.getY(), 12.0);
  }

  @Test
  void testTranslateAndScale() {
    Point p = new Point(3, 4).translate(1, 3).scale(0.5);
    assertEquals(p.getX(), 2);
    assertEquals(p.getY(), 3.5);
  }
}
