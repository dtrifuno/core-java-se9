package core.java.se9.ch10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class Ex01 {
  public static boolean findWord(String targetWord, Path pathToFile) {
    try (Stream<String> lines = Files.lines(pathToFile, StandardCharsets.UTF_8)) {
      return lines.anyMatch(
          line ->
              Arrays.stream(line.split("\\PL+"))
                  .anyMatch(x -> x.toLowerCase().equals(targetWord.toLowerCase())));
    } catch (IOException e) {
      System.err.println(e.getMessage());
      return false;
    }
  }

  private static Callable<Path> findWordTask(String targetWord, Path p) {
    return () -> {
      if (findWord(targetWord, p)) {
        return p;
      }
      throw new Exception();
    };
  }

  public static void main(String[] args) throws InterruptedException {
    String targetWord;
    try (Scanner in = new Scanner(System.in); ) {
      System.out.print("Please enter the target word: ");
      targetWord = in.next();
    }

    ExecutorService exec = Executors.newFixedThreadPool(4);
    List<Callable<Path>> anyTasks = new ArrayList<>();
    List<Callable<Path>> allTasks = new ArrayList<>();

    try (Stream<Path> entries = Files.list(Path.of("src", "main", "resources"))) {
      entries.forEach(
          p -> {
            anyTasks.add(findWordTask(targetWord, p));
            allTasks.add(findWordTask(targetWord, p));
          });
    } catch (IOException e) {
      System.err.println(e.getMessage());
      System.exit(1);
    }

    try {
      Path p = exec.invokeAny(anyTasks);
      System.out.printf("I first found \"%s\" in %s.\n", targetWord, p);
    } catch (Exception e) {
      System.out.printf("Couldn't find the word \"%s\".\n", targetWord);
      return;
    }

    System.out.printf("\nI found \"%s\" in:\n", targetWord);
    var paths = exec.invokeAll(anyTasks);
    for (Future<Path> fp : paths) {
      try {
        Path p = fp.get();
        System.out.println(p);
      } catch (Exception e) {
      }
    }
  }
}
