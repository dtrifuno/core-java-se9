package core.java.se9.ch03.ex06;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

public class SquareSequenceTest {

  @Test
  void testSquareSequence() {
    var seq = new SquareSequence();
    assertTrue(seq.hasNext());
    assertEquals(seq.next(), BigInteger.valueOf(1));
    assertEquals(seq.next(), BigInteger.valueOf(4));
    assertEquals(seq.next(), BigInteger.valueOf(9));
    assertEquals(seq.next(), BigInteger.valueOf(16));
    assertEquals(seq.next(), BigInteger.valueOf(25));
    assertEquals(seq.next(), BigInteger.valueOf(36));
    assertEquals(seq.next(), BigInteger.valueOf(49));
    assertEquals(seq.next(), BigInteger.valueOf(64));
    assertEquals(seq.next(), BigInteger.valueOf(81));
    assertEquals(seq.next(), BigInteger.valueOf(100));
    assertEquals(seq.next(), BigInteger.valueOf(121));
    assertEquals(seq.next(), BigInteger.valueOf(144));
    assertTrue(seq.hasNext());
  }
}
