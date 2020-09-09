package core.java.se9.ch08;

public class Ex06 {
  public static boolean isWord(String token) {
    if (token.length() == 0) {
      return false;
    }

    return (token
    .codePoints()
    .reduce(1, (acc, element) -> Character.isAlphabetic(element) ? 1 * acc : 0)
    == 1);
  }

  public static boolean isJavaIdentifier(String token) {
    if (token.length() == 0) {
      return false;
    }

    if (Character.isDigit(token.codePointAt(0))) {
      return false;
    }

    return (token
    .codePoints()
    .reduce(1, (acc, element) -> {
      if (Character.isAlphabetic(element) || Character.isDigit(element) || element == '$' || element == '_') {
        return 1 * acc;
      } else {
        return 0;
      }
    })
    == 1);
  }
}
