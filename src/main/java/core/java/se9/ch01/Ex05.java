package core.java.se9.ch01;

public class Ex05 {
  public static void main(String[] args) {
    double d = 4000000001.0;
    System.out.printf("Converting the double %f into an int returns Integer.MAX_VALUE: %d.\n", d, (int) d);
  }
}