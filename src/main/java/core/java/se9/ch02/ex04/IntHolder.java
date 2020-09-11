package core.java.se9.ch02.ex04;

// We are using Java 11, in which IntHolder is no longer available, so we have
// to write our own
public class IntHolder {
  public int value = 0;

  IntHolder() {
  }

  IntHolder(int value) {
    this.value = value;
  }
}
