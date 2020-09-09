package core.java.se9.ch06.ex0102;

public class ArrayStackTest extends StackTest<ArrayStack<String>> {
  @Override
  protected ArrayStack<String> createInstance() {
    return new ArrayStack<>();
  }
}
