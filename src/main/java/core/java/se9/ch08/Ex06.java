package core.java.se9.ch08;

public class Ex06 {
  public static boolean isWord(String token) {
    if (token.length() == 0) {
      return false;
    }

    return (token
    .codePoints()
    .reduce(1, (flag, element) -> Character.isAlphabetic(element) ? flag : 0)
    == 1);
  }

  public static boolean isJavaIdentifier(String token) {
    if (token.length() == 0) {
      return false;
    }

    if (!Character.isJavaIdentifierStart(token.codePointAt(0))) {
      return false;
    }

    return (token
    .codePoints()
    .reduce(1, (flag, element) -> Character.isJavaIdentifierPart(element) ? flag : 0)
    == 1);
  }
}
