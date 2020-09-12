package core.java.se9.ch01;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int x, y;
    while (true) {
      try {
        System.out.print("Please enter the first integer: ");
        x = Integer.parseUnsignedInt(in.next());
      } catch (NumberFormatException e) {
        System.out.println("Invalid argument. Enter an integer between 0 and 4294967295.");
        continue;
      }
      break;
    }
    while (true) {
      try {
        System.out.print("Please enter the second integer: ");
        y = Integer.parseUnsignedInt(in.next());
      } catch (NumberFormatException e) {
        System.out.println("Invalid argument. Enter an integer between 0 and 4294967295.");
        continue;
      }
      break;
    }

    System.out.printf(
        "%s + %s = %s\n",
        Integer.toUnsignedString(x), Integer.toUnsignedString(y), Integer.toUnsignedString(x + y));
    System.out.printf(
        "%s - %s = %s\n",
        Integer.toUnsignedString(x), Integer.toUnsignedString(y), Integer.toUnsignedString(x - y));
    System.out.printf(
        "%s * %s = %s\n",
        Integer.toUnsignedString(x), Integer.toUnsignedString(y), Integer.toUnsignedString(x * y));
    System.out.printf(
        "%s / %s = %s\n",
        Integer.toUnsignedString(x),
        Integer.toUnsignedString(y),
        Integer.toUnsignedString(Integer.divideUnsigned(x, y)));

    in.close();
  }
}
