package core.java.se9.ch07;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex18 {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    // EMPTY_LIST, EMPTY_MAP, and EMPTY_SET are of type List, Map and Set
    // and must undergo a type conversion before using with variables of
    // type List<T> for some T
    @SuppressWarnings("unchecked")
    List<String> listOfStrings = Collections.EMPTY_LIST;
    @SuppressWarnings("unchecked")
    Map<String, Long> mapStringsToLength = Collections.EMPTY_MAP;
    @SuppressWarnings("unchecked")
    Set<String> setOfStrings = Collections.EMPTY_SET;
    
    // however, emptyList, emptyMap and emptySet are generic methods
    // and can infer the type
    List<Double> listOfDoubles = Collections.emptyList();
    Map<Double, Double> mapOfDoubles = Collections.emptyMap();
    Set<Double> setOfDoubles = Collections.emptySet();
  }
}
