package core.java.se9.ch03.ex0405;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IntSequenceTest {

  @Test
  void testConstant() {
    int constant = 11;
    var seq = IntSequence.constant(constant);
    assertTrue(seq.hasNext());
    assertEquals(seq.next(), constant);
    assertEquals(seq.next(), constant);
    assertEquals(seq.next(), constant);
    assertEquals(seq.next(), constant);
    assertEquals(seq.next(), constant);
    assertEquals(seq.next(), constant);
    assertEquals(seq.next(), constant);
    assertEquals(seq.next(), constant);
    assertTrue(seq.hasNext());
  }

  @Test
  void testEmptyOf() {
    var seq = IntSequence.of();
    assertFalse(seq.hasNext());
  }

  @Test
  void testOfSingleElement() {
    var seq = IntSequence.of(4);
    assertTrue(seq.hasNext());
    assertEquals(4, seq.next());
    assertFalse(seq.hasNext());
  }

  @Test
  void testOfMultipleElement() {
    var seq = IntSequence.of(1, 2, 3, 4);
    assertTrue(seq.hasNext());
    assertEquals(1, seq.next());
    assertEquals(2, seq.next());
    assertEquals(3, seq.next());
    assertEquals(4, seq.next());
    assertFalse(seq.hasNext());
  }
}
