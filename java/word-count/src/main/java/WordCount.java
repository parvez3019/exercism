import java.util.HashMap;
import java.util.Map;

public class WordCount {
  Map<String, Integer> wordCountMap;

  public WordCount() {
    this.wordCountMap = new HashMap<>();
  }

  public Map<String, Integer> phrase(String phrase) {
    String[] words = phrase.split("[\\p{Punct}\\s]+");
    for (int i = 0; i < words.length; i++) {
      putInHashMap(words[i]);
    }
    return wordCountMap;
  }

  private void putInHashMap(String word) {
    String wordToLowerCase = word.toLowerCase();
    if (!wordCountMap.containsKey(wordToLowerCase)) {
      wordCountMap.put(wordToLowerCase, 1);
    } else if (wordCountMap.containsKey(wordToLowerCase)) {
      int value = wordCountMap.get(wordToLowerCase);
      wordCountMap.put(wordToLowerCase, value + 1);
    }
  }
}
