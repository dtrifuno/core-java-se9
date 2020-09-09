package core.java.se9.ch06.ex0102;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArrayListStack<T> implements Stack<T> {
  private final List<T> data;
  {
    data = new ArrayList<T>();
  } 

  @Override
  public void push(T elem) {
    data.add(elem);
  }

  @Override
  public Optional<T> pop() {
    if (data.isEmpty()) {
      return Optional.empty();
    }
    int idx = data.size() - 1;
    return Optional.of(data.remove(idx));
  }
  
  @Override
  public boolean isEmpty() {
    return data.isEmpty();
  }
}
