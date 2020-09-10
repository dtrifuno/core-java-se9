package core.java.se9.ch01;

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    System.out.println("Please enter a string: ");
    String input;
    try (Scanner in = new Scanner(System.in)) {
      input = in.nextLine();
    }

    System.out.println("codepoint     value");
    input
      .codePoints()
      .filter(x -> x > 127)
      .distinct()
      .forEach(x -> System.out.printf("    %s          %d\n", Character.toString(x), x));
  }
}
