package core.java.se9.ch08;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
  public static void main(String[] args) {
    int[] values = { 1, 4, 9, 16 };
    Stream<int[]> streamOfArray = Stream.of(values);
    if (streamOfArray.count() == 1) {
      System.out.println("streamOfArray is a stream containing one object, the array {1, 4, 9, 16}.");
    }

    IntStream streamOfInts = IntStream.of(values);
    if (streamOfInts.count() == 4) {
      System.out.println("streamOfInts is an IntStream containing the four int entries 1, 4, 9, and 16.");
    }
  }
}