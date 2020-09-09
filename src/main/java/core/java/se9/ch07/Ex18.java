package core.java.se9.ch07;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex18 {
  public static void main(String[] args) {
    // EMPTY_LIST, EMPTY_MAP, and EMPTY_SET are of type List, Map and Set
    // and need to be typecast before using with as variable of
    // type List<T> for some T
    @SuppressWarnings("unchecked")
    List<String> listOfStrings = (List<String>) Collections.EMPTY_LIST;
    @SuppressWarnings("unchecked")
    Map<String, Long> mapStringsToLength = (Map<String, Long>) Collections.EMPTY_LIST;
    @SuppressWarnings("unchecked")
    Set<String> setOfStrings = (Set<String>) Collections.EMPTY_LIST;
    
    // however, emptyList, emptyMap and emptySet are generic methods
    // and can infer the type
    List<Double> listOfDoubles = Collections.emptyList();
    Map<Double, Double> mapOfDoubles = Collections.emptyMap();
    Set<Double> setOfDoubles = Collections.emptySet();
  }
}
