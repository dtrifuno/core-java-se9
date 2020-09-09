package core.java.se9.ch08;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import com.google.common.io.Resources;

import static java.util.stream.Collectors.*;

public class Ex07 {
  public static void main(String[] args) {
    Path theCloakPath = Paths.get(Resources.getResource("the_cloak.txt").getPath());
    String theCloak;
    try {
      theCloak = new String(Files.readAllBytes(theCloakPath));
    } catch (IOException e) {
      System.out.println(e.getMessage());
      return;
    }

    Stream<String> tokens = Stream.of(theCloak.split("\\PL+"));
    tokens.filter(Ex06::isWord).limit(100).distinct().forEach(System.out::println);

    tokens = Stream.of(theCloak.split("\\PL+"));
    Map<String, Long> counter = tokens
      .filter(Ex06::isWord)
      .collect(groupingBy(String::toLowerCase, counting()));

    counter
      .entrySet()
      .stream()
      .sorted(Comparator.comparing(Entry<String, Long>::getValue)
      .reversed())
      .limit(10)
      .forEach(System.out::println);
  }
}
