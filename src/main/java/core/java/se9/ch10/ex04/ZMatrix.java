package core.java.se9.ch10.ex04;

import java.math.BigInteger;

public class ZMatrix {
  private final BigInteger upperLeft;
  private final BigInteger upperRight;
  private final BigInteger lowerLeft;
  private final BigInteger lowerRight;

  ZMatrix(long upperLeft, long upperRight, long lowerLeft, long lowerRight) {
    this.upperLeft = BigInteger.valueOf(upperLeft);
    this.upperRight = BigInteger.valueOf(upperRight);
    this.lowerLeft = BigInteger.valueOf(lowerLeft);
    this.lowerRight = BigInteger.valueOf(lowerRight);
  }

  ZMatrix(
      BigInteger upperLeft, BigInteger upperRight, BigInteger lowerLeft, BigInteger lowerRight) {
    this.upperLeft = upperLeft;
    this.upperRight = upperRight;
    this.lowerLeft = lowerLeft;
    this.lowerRight = lowerRight;
  }

  public BigInteger getUpperLeft() {
    return upperLeft;
  }

  public BigInteger getUpperRight() {
    return upperRight;
  }

  public BigInteger getLowerLeft() {
    return lowerLeft;
  }

  public BigInteger getLowerRight() {
    return lowerRight;
  }

  public ZMatrix multiply(ZMatrix other) {
    return new ZMatrix(
        upperLeft.multiply(other.upperLeft).add(upperRight.multiply(other.lowerLeft)),
        upperLeft.multiply(other.upperRight).add(upperRight.multiply(other.lowerRight)),
        lowerLeft.multiply(other.upperLeft).add(lowerRight.multiply(other.lowerLeft)),
        lowerLeft.multiply(other.upperRight).add(lowerRight.multiply(other.lowerRight)));
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }
    ZMatrix other = (ZMatrix) obj;
    return (getUpperLeft().equals(other.getUpperLeft())
        && getUpperRight().equals(other.getUpperRight())
        && getLowerLeft().equals(other.getLowerLeft())
        && getLowerRight().equals(other.getLowerRight()));
  }
}
