package core.java.se9.ch10.ex04;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

public class ZMatrixTest {
  @Test
  void testEquals() {
    ZMatrix a = new ZMatrix(1, 2, 3, 4);
    ZMatrix alsoA =
        new ZMatrix(BigInteger.ONE, BigInteger.TWO, BigInteger.valueOf(3), BigInteger.valueOf(4));
    assertTrue(a.equals(alsoA));
  }

  @Test
  void testDoesntEqual() {
    ZMatrix a = new ZMatrix(1, 2, 3, 4);
    ZMatrix notA = new ZMatrix(1, 2, 3, 5);
    assertFalse(a.equals(notA));
  }

  @Test
  void testMultiply() {
    ZMatrix a = new ZMatrix(4, 5, 2, -4);
    ZMatrix b = new ZMatrix(1, 2, 1, 5);
    assertEquals(a.multiply(b), new ZMatrix(9, 33, -2, -16));
  }
}
