package core.java.se9.ch08;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex09 {
  static Set<Integer> stringToSet(String str) {
    return str.codePoints().mapToObj(Integer::valueOf).collect(Collectors.toSet());
  }

  public static void main(String[] args) {
    var path = Paths.get("/", "usr", "share", "dict", "american-english");
    var charset = StandardCharsets.UTF_8;

    var vowelsSet = stringToSet("aeiou");

    try (Stream<String> words = Files.lines(path, charset)) {
      String[] result =
          words
              .filter(word -> stringToSet(word.toLowerCase()).containsAll(vowelsSet))
              .toArray(String[]::new);
      System.out.println(Arrays.toString(result));
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
