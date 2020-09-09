package core.java.se9.ch08;

import java.util.Set;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ex11Test {
  @Test
  void testEx11() {
    var actual = Ex11.stringsOfMaxLength(
      Stream.of(
        "carbon",
        "prove",
        "dressing",
        "hospital",
        "cable",
        "kidney",
        "bolt"
      )
    );
    var expected = Set.of("hospital", "dressing");
    assertEquals(actual, expected);
  }
}
