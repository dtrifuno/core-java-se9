package core.java.se9.ch1;

import java.math.BigInteger;

public class Ex06 {
  public static BigInteger factorial(int n) {
    BigInteger result = BigInteger.ONE;
    for (int i = 2; i <= n; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println("1000! = " + factorial(1000));
  }  
}