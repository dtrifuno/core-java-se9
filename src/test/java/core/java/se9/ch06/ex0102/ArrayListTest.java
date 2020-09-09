package core.java.se9.ch06.ex0102;

public class ArrayListTest extends StackTest<ArrayListStack<String>> {
  @Override
  protected ArrayListStack<String> createInstance() {
    return new ArrayListStack<>();
  }
}
