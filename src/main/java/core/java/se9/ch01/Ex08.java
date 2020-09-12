package core.java.se9.ch01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex08 {
  public static void main(String[] args) {
    System.out.println("Please enter a string: ");
    String input;
    try (Scanner in = new Scanner(System.in)) {
      input = in.nextLine();
    }

    Set<String> substrings = new HashSet<>();
    for (int i = 0; i < input.length(); i++) {
      for (int j = i + 1; j < input.length(); j++) {
        substrings.add(input.substring(i, j));
      }
    }
    System.out.println(substrings);
  }
}
