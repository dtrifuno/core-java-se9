package core.java.se9.ch07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    System.out.println("Please enter a sentence:");
    Scanner in = new Scanner(System.in);
    String sentence = in.nextLine();

    ArrayList<String> words = new ArrayList<>(List.of(sentence.split("\\PL+")));
    Collections.shuffle(words.subList(1, words.size() - 1));
    System.out.println(String.join(" ", words));
    in.close();
  }
}
