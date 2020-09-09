package core.java.se9.ch06.ex0708;

public class Pair<E extends Comparable<E>> {
  private final E first;
  private final E second;

  Pair(E first, E second) {
    this.first = first;
    this.second = second;
  }

  public E getFirst() {
    return this.first;
  }

  public E getSecond() {
    return this.second;
  }

  public E max() {
    if (this.first.compareTo(this.second) >= 0) {
      return this.first;
    }
    return this.second;
  }

  public E min() {
    if (this.first.compareTo(this.second) <= 0) {
      return this.first;
    }
    return this.second;
  }
}
