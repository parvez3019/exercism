import java.util.*;

public class Etl {
  public Map<String, Integer> transform(Map<Integer, List<String>> old) {
    Map<String, Integer> newHashMap = new HashMap<>();
    for (Integer key : old.keySet()) {
      putInNewHashMap(old, newHashMap, key);
    }
    return newHashMap;
  }

  private void putInNewHashMap(Map<Integer, List<String>> old,
                               Map<String, Integer> newHashMap, Integer key) {
    List<String> oldMapStringValues = old.get(key);
    for (String string : oldMapStringValues) {
      newHashMap.put(string.toLowerCase(),key);
    }
  }
}