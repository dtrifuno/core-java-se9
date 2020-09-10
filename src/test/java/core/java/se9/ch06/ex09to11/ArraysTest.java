package core.java.se9.ch06.ex09to11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class ArraysTest {

  @Test
  void testFirstLast() {
    ArrayList<Double> al = new ArrayList<>();
    al.add(1.6);
    al.add(2.2);
    al.add(3.5);

    var result = Arrays.firstLast(al);
    assertEquals(new Pair<Double>(1.6, 3.5), result);
  }

  @Test
  void testFirstLastEmpty() {
    assertThrows(IllegalArgumentException.class, () -> {
      Arrays.firstLast(new ArrayList<>());
    });
  }

  @Test
  void testMin() {
    ArrayList<Double> al = new ArrayList<>(List.of(-4.5, 6.0, 11.0, 17.0, -5.5, 11.0, 16.0));
    assertEquals(Optional.of(-5.5), Arrays.min(al));
  }

  @Test
  void testMinEmpty() {
    assertEquals(Optional.empty(), Arrays.min(new ArrayList<>()));
  }

  @Test
  void testMax() {
    ArrayList<Integer> al = new ArrayList<>(List.of(11, 7, 36, 49, -150, 50, 110, -500));
    assertEquals(Optional.of(110), Arrays.max(al));
  }

  @Test
  void testMaxEmpty() {
    assertEquals(Optional.empty(), Arrays.max(new ArrayList<>()));
  }

  @Test
  void testMinMax() {
    ArrayList<Integer> al = new ArrayList<>(List.of(11, 7, 36, 49, -150, 50, 110, -500));
    assertEquals(new Pair<Integer>(-500, 110), Arrays.minMax(al));
  }

  @Test
  void testMinMaxEmpty() {
    assertThrows(IllegalArgumentException.class, () -> {
      Arrays.minMax(new ArrayList<>());
    });
  }
}
