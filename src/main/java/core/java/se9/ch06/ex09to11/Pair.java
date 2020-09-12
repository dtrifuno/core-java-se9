package core.java.se9.ch06.ex09to11;

public class Pair<E> {
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

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (this.getClass() != obj.getClass()) {
      return false;
    }
    @SuppressWarnings("unchecked")
    Pair<E> otherPair = (Pair<E>) obj;
    return this.getFirst().equals(otherPair.getFirst())
        && this.getSecond().equals(otherPair.getSecond());
  }

  @Override
  public String toString() {
    return String.format(
        "Pair<%s>[first=%s, second=%s]",
        this.first.getClass().getName(), this.first.toString(), this.second.toString());
  }
}
