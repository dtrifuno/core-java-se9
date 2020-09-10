package core.java.se9.ch01;

public class Ex09 {
  public static void main(String[] args) {
    String a = "banana";
    String b = "ba";
    b += "na";
    b += "na";

    System.out.printf("The strings \"%s\" and \"%s\" are %s, ", a, b, a.equals(b) ? "equal" : "not equal");
    System.out.printf("but \"%s\" %s \"%s\".\n", a, a == b ? "==" : "!=", b);
  }
}
