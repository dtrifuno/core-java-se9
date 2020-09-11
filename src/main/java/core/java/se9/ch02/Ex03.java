package core.java.se9.ch02;

public class Ex03 {
  private int count = 0;

  // The following is a mutator method since it increments the count
  // variable before returning it
  public int count() {
    return ++count;
  }

  // The following is a void accessor method, it doesn't modify the state of
  // the object, but it causes a side-effect using the data of the object
  void countOff() {
    System.out.println("The current count is " + count + ".");
  }

  public static void main(String[] args) {
    Ex03 counter = new Ex03();
    counter.count();
    counter.count();
    counter.count();
    counter.count();
    counter.countOff();
  }
}
