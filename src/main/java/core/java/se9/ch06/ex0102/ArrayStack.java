package core.java.se9.ch06.ex0102;

import java.util.Optional;

public class ArrayStack<T> implements Stack<T> {
  private int capacity;
  private int idx;
  private T[] data;

  @SuppressWarnings("unchecked")
  public ArrayStack() {
    this.capacity = 4;
    this.idx = -1;
    this.data = (T[]) new Object[this.capacity];
  }

  private void growArray() {
    int newCapacity = 2 * capacity;
    @SuppressWarnings("unchecked")
    T[] newData = (T[]) new Object[capacity * 2];

    System.arraycopy(this.data, 0, newData, 0, this.idx + 1);

    this.data = newData;
    this.capacity = newCapacity;
  }

  @Override
  public void push(T elem) {
    if (idx + 1 >= capacity) {
      this.growArray();
    }

    this.data[++this.idx] = elem;
  }

  @Override
  public Optional<T> pop() {
    if (this.isEmpty()) {
      return Optional.empty();
    }
    return Optional.of(data[idx--]);
  }
  
  @Override
  public boolean isEmpty() {
    return idx < 0;
  }
}
