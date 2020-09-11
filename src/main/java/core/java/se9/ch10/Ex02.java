package core.java.se9.ch10;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {
  public static void main(String[] args) {
    System.out.println("array size  regular (ms)  parallel (ms)  speedup (%)");
    System.out.println("----------------------------------------------------");

    long n = 1024;
    for (int i = 0; i < 16; i++) {
      n *= 2L;
      int[] array = new Random().ints(n).toArray();
      int[] parallelArray = array.clone();

      long startSortTime = System.nanoTime();
      Arrays.sort(array);
      long endSortTime = System.nanoTime();
      long sortTime = endSortTime - startSortTime;

      long startParallelSortTime = System.nanoTime();
      Arrays.parallelSort(parallelArray);
      long endParallelSortTime = System.nanoTime();
      long parallelSortTime = endParallelSortTime - startParallelSortTime;

      double speedUp = 100 * (sortTime / (double) parallelSortTime) - 100.0;

      System.out.printf("%9d %10d %11d %16.2f\n", n, sortTime / 1000000, parallelSortTime / 1000000, speedUp);
    }
  }
  
}
