package core.java.se9.ch1;

import java.util.Scanner;

public class Ex1 {
  static String createResultString(int n) {
    return String.format("bin: %s\noct: %s\nhex: %s\ninv hex: %s", Integer.toBinaryString(n), Integer.toHexString(n),
        Integer.toOctalString(n), Double.toHexString(1.0 / n));
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter an integer to convert: ");
    int n = in.nextInt();
    System.out.println(createResultString(n));
    in.close();
  }
}