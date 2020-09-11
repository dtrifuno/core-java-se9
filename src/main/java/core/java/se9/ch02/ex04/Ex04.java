package core.java.se9.ch02.ex04;

// We can't swap int variables because they are primitive types passed by value
// We can't swap Integer variables because they are immutable
public class Ex04 {
  public static void swap(IntHolder a, IntHolder b) {
    int temp = b.value;
    b.value = a.value;
    a.value = temp;
  }
}
