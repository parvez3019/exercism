import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
  private String string;
  private ArrayList<String> list;

  public Anagram(String string) {
    this.string = string;
    list = new ArrayList<>();
  }


  public List<String> match(List<String> strings) {
    for (String s: strings) {
      if(!s.equalsIgnoreCase(string) && isAnagram(s.toLowerCase(),string.toLowerCase())){
        list.add(s);
      }
    }
    return list;
  }

  public boolean isAnagram(String firstWord, String secondWord) {
    char[] word1 = firstWord.toCharArray();
    char[] word2 = secondWord.toCharArray();
    Arrays.sort(word1);
    Arrays.sort(word2);
    return Arrays.equals(word1, word2);
  }

  public boolean isEmpty() {
    return list.size() == 0;
  }
}
