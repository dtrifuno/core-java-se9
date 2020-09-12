package core.java.se9.ch01;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex15 {
  public static ArrayList<ArrayList<Integer>> pascalTriangle(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Expected nonnegative integer. Received: " + n);
    }

    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    ArrayList<Integer> previousRow;
    ArrayList<Integer> currentRow = new ArrayList<Integer>(Arrays.asList(1));
    result.add(currentRow);

    for (int i = 1; i <= n; i++) {
      previousRow = currentRow;
      currentRow = new ArrayList<Integer>();

      currentRow.add(1);
      for (int j = 1; j < i; j++) {
        currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
      }
      currentRow.add(1);
      result.add(currentRow);
    }
    return result;
  }
}
