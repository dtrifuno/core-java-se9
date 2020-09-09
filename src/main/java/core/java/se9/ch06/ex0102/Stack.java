package core.java.se9.ch06.ex0102;

import java.util.Optional;

public interface Stack<T> {
  public void push(T elem);
  public Optional<T> pop();
  public boolean isEmpty();
}
