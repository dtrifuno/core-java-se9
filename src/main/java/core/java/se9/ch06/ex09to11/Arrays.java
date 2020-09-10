package core.java.se9.ch06.ex09to11;

import java.util.ArrayList;
import java.util.Optional;

final public class Arrays {
  // Suppresses default constructor, ensuring non-instantiability.
  private Arrays() {
    throw new RuntimeException();
  }

  private static <E> void validateArrayList(ArrayList<E> a) {
    if (a == null || a.size() == 0) {
      throw new IllegalArgumentException("Method can only be called on a non-empty ArrayList.");
    } 
  }

  public static <E> Pair<E> firstLast(ArrayList<? extends E> a) {
    validateArrayList(a);
    return new Pair<E>(a.get(0), a.get(a.size() - 1));
  }

  public static <E extends Comparable<E>> Optional<E> max(ArrayList<? extends E> a) {
    if (a == null || a.size() == 0) {
      return Optional.empty();
    }

    E currentMax = a.get(0);
    for (E elem : a) {
      currentMax = elem.compareTo(currentMax) > 0 ? elem : currentMax;
    }
    return Optional.of(currentMax);
  }

  public static <E extends Comparable<E>> Optional<E> min(ArrayList<? extends E> a) {
    if (a == null || a.size() == 0) {
      return Optional.empty();
    }

    E currentMin = a.get(0);
    for (E elem : a) {
      currentMin = elem.compareTo(currentMin) < 0 ? elem : currentMin;
    }
    return Optional.of(currentMin);
  }

  public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<? extends E> a) {
    validateArrayList(a);
    E currentMin, currentMax;
    currentMin = currentMax = a.get(0);
    for (E elem : a) {
      currentMax = elem.compareTo(currentMax) > 0 ? elem : currentMax;
      currentMin = elem.compareTo(currentMin) < 0 ? elem : currentMin;
    }
    return new Pair<E>(currentMin, currentMax);
  }
}
