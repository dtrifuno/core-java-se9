package core.java.se9.ch06.ex0102;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

public abstract class StackTest<T extends Stack<String>> {
  protected abstract T createInstance();

  @Test
  public void testStack() {
    Stack<String> stack = createInstance();
    stack.push("a");
    stack.push("bear");
    stack.push("can");
    stack.push("do");
    stack.push("everything");

    assertFalse(stack.isEmpty());
    assertEquals(Optional.of("everything"), stack.pop());
    assertEquals(Optional.of("do"), stack.pop());
    assertEquals(Optional.of("can"), stack.pop());
    assertEquals(Optional.of("bear"), stack.pop());
    assertEquals(Optional.of("a"), stack.pop());
    assertEquals(Optional.empty(), stack.pop());
    assertTrue(stack.isEmpty());
   }
}
