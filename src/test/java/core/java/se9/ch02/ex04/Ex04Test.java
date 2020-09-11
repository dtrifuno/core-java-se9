package core.java.se9.ch02.ex04;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

public class Ex04Test {
  private static Stream<Arguments> providesPairsOfInts() {
    return Stream.of(
      Arguments.of(0, 4),
      Arguments.of(-5, -6),
      Arguments.of(3, -1),
      Arguments.of(-11, 5)
    );
  }

  @ParameterizedTest
  @MethodSource("providesPairsOfInts")
  void testSwap(int first, int second) {
    IntHolder a = new IntHolder(first);
    IntHolder b = new IntHolder(second);
    assertEquals(a.value, first);
    assertEquals(b.value, second);

    Ex04.swap(a, b);
    assertEquals(a.value, second);
    assertEquals(b.value, first);
    
  }
  
}
