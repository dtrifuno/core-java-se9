package core.java.se9.ch08;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class Ex06Test {

  private static Stream<Arguments> providesValidWords() {
    return Stream.of(
      Arguments.of("banana"),
      Arguments.of("Damien"),
      Arguments.of("Gruber"),
      Arguments.of("family"),
      Arguments.of("humility")
    );
  }

  private static Stream<Arguments> providesInvalidWords() {
    return Stream.of(
      Arguments.of("hare-brained"),
      Arguments.of("two words"),
      Arguments.of("has0digit"),
      Arguments.of("has_underscore"),
      Arguments.of("")
    );
  }

  private static Stream<Arguments> providesValidIdentifiers() {
    return Stream.of(
      Arguments.of("stream"),
      Arguments.of("$stream"),
      Arguments.of("_stream"),
      Arguments.of("can_have_digits99"),
      Arguments.of("ClassName")
    );
  }

  private static Stream<Arguments> providesInvalidIdentifiers() {
    return Stream.of(
      Arguments.of("stream "),
      Arguments.of("2$stream"),
      Arguments.of(""),
      Arguments.of("can*_have_digits99"),
      Arguments.of("Cl!assName")
    );
  }

  @ParameterizedTest
  @MethodSource("providesValidWords")
  void testValidWords(String validWord){
    assertTrue(Ex06.isWord(validWord));
  }

  @ParameterizedTest
  @MethodSource("providesInvalidWords")
  void testInvalidWords(String invalidWord){
    assertFalse(Ex06.isWord(invalidWord));
  }

  @ParameterizedTest
  @MethodSource("providesValidIdentifiers")
  void testValidIdentifiers(String validIdentifier){
    assertTrue(Ex06.isJavaIdentifier(validIdentifier));
  }

  @ParameterizedTest
  @MethodSource("providesInvalidIdentifiers")
  void testInvalidIdentifiers(String invalidIdentifier){
    assertFalse(Ex06.isJavaIdentifier(invalidIdentifier));
  }
}