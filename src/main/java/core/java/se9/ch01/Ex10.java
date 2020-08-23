package core.java.se9.ch01;

import java.util.Random;

public class Ex10 {
  public static void main(String[] args) {
    Random gen = new Random();
    System.out.println(Long.toString(Math.abs(gen.nextLong()), 36));
  }
}