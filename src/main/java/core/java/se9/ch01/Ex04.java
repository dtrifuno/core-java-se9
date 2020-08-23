package core.java.se9.ch01;

public class Ex04 {
  public static void main(String[] args) {
    System.out.println("Smallest positive double: " + Math.nextUp(0));
    System.out.println("Largest positive double: " + Math.nextDown(Double.POSITIVE_INFINITY));
  }
}