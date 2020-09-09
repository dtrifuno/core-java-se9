package core.java.se9.ch08;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.google.common.io.Resources;


public class Ex02 {
  public static void main(String[] args) {
    Path warAndPeacePath = Paths.get(Resources.getResource("war_and_peace.txt").getPath());
    String warAndPeace;
    try {
      warAndPeace = new String(Files.readAllBytes(warAndPeacePath));
    } catch (IOException e) {
      System.out.println(e.getMessage());
      return;
    }

    Stream<String> wordsSerial = Stream.of(warAndPeace.split("\\PL+"));
    long startSerial = System.currentTimeMillis();
    wordsSerial
    .filter(x -> x.length() > 12)
    .count();
    long endSerial = System.currentTimeMillis();

    Stream<String> wordsParallel = Stream.of(warAndPeace.split("\\PL+"));
    long startParallel = System.currentTimeMillis();
    wordsParallel
    .parallel()
    .filter(x -> x.length() > 12)
    .count();
    long endParallel = System.currentTimeMillis();

    System.out.println("Processing with a regular stream took " + (endSerial - startSerial) + " ms.");
    System.out.println("Processing with a parallel stream took " + (endParallel - startParallel) + " ms.");
  }
}
