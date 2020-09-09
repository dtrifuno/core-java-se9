package core.java.se9.ch08;

import java.util.Set;
import java.util.TreeMap;
import static java.util.stream.Collectors.*;

import java.util.stream.Stream;

public class Ex11 {
  public static Set<String> stringsOfMaxLength(Stream<String> streamOfStrings) {
    TreeMap<Integer, Set<String>> groupedByLength = streamOfStrings.collect(groupingBy(
      String::length,
      TreeMap::new,
      toSet()
    ));

    if (groupedByLength.isEmpty()) {
      return Set.of();
    }
    return groupedByLength.lastEntry().getValue();
  }

  public static void main(String[] args) {
    System.out.println(stringsOfMaxLength(Stream.of(
      "can",
      "banana",
      "groups",
      "an",
      "ok",
      "fields",
      "rings"
    )));
  }
}
