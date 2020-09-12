package core.java.se9.ch02.ex05to08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MutablePointTest {
  @Test
  void testGetters() {
    MutablePoint p = new MutablePoint(3.5, 2.1);
    assertEquals(p.getX(), 3.5);
    assertEquals(p.getY(), 2.1);
  }

  @Test
  void testDefaultConstructor() {
    MutablePoint p = new MutablePoint();
    assertEquals(p.getX(), 0);
    assertEquals(p.getY(), 0);
  }

  @Test
  void testTranslate() {
    MutablePoint p = new MutablePoint(3.5, 2.1);
    p.translate(-1.5, -0.1);
    assertEquals(p.getX(), 2.0);
    assertEquals(p.getY(), 2.0);
  }

  @Test
  void testScale() {
    MutablePoint p = new MutablePoint(2.0, 3.0);
    p.scale(4.0);
    assertEquals(p.getX(), 8.0);
    assertEquals(p.getY(), 12.0);
  }

  @Test
  void testTranslateAndScale() {
    MutablePoint p = new MutablePoint(3, 4);
    p.translate(1, 3);
    p.scale(0.5);
    assertEquals(p.getX(), 2);
    assertEquals(p.getY(), 3.5);
  }
}
