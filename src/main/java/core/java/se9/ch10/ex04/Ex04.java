package core.java.se9.ch10.ex04;

import java.math.BigInteger;
import java.util.Arrays;

public class Ex04 {
  public static BigInteger getNthFibonacciNumber(int n) {
    if (n == 1) {
      return BigInteger.ONE;
    }

    ZMatrix[] array = new ZMatrix[n-1];
    Arrays.parallelSetAll(array, (i) -> new ZMatrix(1, 1, 1, 0));
    Arrays.parallelPrefix(array, ZMatrix::multiply);
    return array[n-2].getUpperLeft();
  }

  public static void main(String[] args) {
    System.out.println("The first 10 Fibonacci numbers are: ");
    for (int i = 1; i <= 10; i++) {
      System.out.print(getNthFibonacciNumber(i) + " ");
    }
    System.out.println();
  }
}
