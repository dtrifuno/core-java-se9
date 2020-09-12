package core.java.se9.ch08;

import static java.util.stream.Collectors.*;

import java.util.Map;
import java.util.stream.Stream;

public class Ex10 {
  public static double averageStringLength(Stream<String> streamOfStrings) {
    Map<Integer, Long> countOfStringsByLength =
        streamOfStrings.collect(groupingBy(String::length, counting()));

    long sum = 0;
    long count = 0;
    for (var entry : countOfStringsByLength.entrySet()) {
      var length = entry.getKey();
      var thisLengthCount = entry.getValue();
      count += thisLengthCount;
      sum += length * thisLengthCount;
    }

    if (count == 0) {
      return 0.0;
    }
    return sum / (double) count;
  }
}
