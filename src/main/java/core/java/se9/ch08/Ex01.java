package core.java.se9.ch08;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.google.common.io.Resources;


public class Ex01 {
  public static void main(String[] args) {
    Path warAndPeacePath = Paths.get(Resources.getResource("war_and_peace.txt").getPath());
    String warAndPeace;
    try {
      warAndPeace = new String(Files.readAllBytes(warAndPeacePath));
    } catch (IOException e) {
      System.out.println(e.getMessage());
      return;
    }

    Stream<String> words = Stream.of(warAndPeace.split("\\PL+"));
    words
    .filter(word -> {
      if (word.length() > 12) {
        System.out.println("Found a match: " + word);
        return true;
      } 
      return false;
    }
    )
    .limit(5).toArray();
  }
}
