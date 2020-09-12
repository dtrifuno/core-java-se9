package core.java.se9.ch01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex13 {
  public static final int DRAWS = 6;

  public static void main(String[] args) {
    ArrayList<Integer> numbers =
        new ArrayList<Integer>(IntStream.range(1, 50).boxed().collect(Collectors.toList()));
    ArrayList<Integer> drawn = new ArrayList<Integer>(DRAWS);
    Random gen = new Random();
    for (int i = 0; i < DRAWS; i++) {
      int idx = gen.nextInt(numbers.size());
      drawn.add(numbers.remove(idx));
    }
    drawn.sort(Comparator.naturalOrder());
    System.out.println("You have drawn the numbers: ");
    System.out.println(drawn);
  }
}
