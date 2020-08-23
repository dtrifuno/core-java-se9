package core.java.se9.ch01;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ex15Test {
  public static final ArrayList<Integer> zerothRow = new ArrayList<>(Arrays.asList(1));

  @Test
  void testPascalTriangleForFour() {
    ArrayList<Integer> zerothRow = new ArrayList<>(Arrays.asList(1));
    ArrayList<Integer> firstRow = new ArrayList<>(Arrays.asList(1, 1));
    ArrayList<Integer> secondRow = new ArrayList<>(Arrays.asList(1, 2, 1));
    ArrayList<Integer> thirdRow = new ArrayList<>(Arrays.asList(1, 3, 3, 1));
    ArrayList<Integer> fourthRow = new ArrayList<>(Arrays.asList(1, 4, 6, 4, 1));
    ArrayList<ArrayList<Integer>> expectedPascalTriangle = new ArrayList<>(Arrays.asList(zerothRow, firstRow, secondRow, thirdRow, fourthRow));

    var pascalTriangle = Ex15.pascalTriangle(4);
    assertEquals(expectedPascalTriangle.size(), pascalTriangle.size());
    for (int i = 0; i < expectedPascalTriangle.size(); i++) {
      assertIterableEquals(expectedPascalTriangle.get(i), pascalTriangle.get(i));
    }
  }

  @Test
  void testWhetherPascalTriangleThrowsExceptionForNegativeNumbers() {
    assertThrows(IllegalArgumentException.class, () -> Ex15.pascalTriangle(-5));
  }
}