package core.java.se9.ch03.ex06;

import java.math.BigInteger;

public class SquareSequence implements Sequence<BigInteger> {
  private BigInteger i = BigInteger.ZERO;

  @Override
  public boolean hasNext() {
    return true;
  }

  @Override
  public BigInteger next() {
    i = i.add(BigInteger.ONE);
    return i.multiply(i);
  }
}
