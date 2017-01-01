import java.util.HashMap;
import java.util.Map;

class DNA {
  private final String dnaString;
  private Map<Character, Integer> nucleotideHashMap;

  DNA(String dnaString) {
    this.dnaString = dnaString;
    this.nucleotideHashMap = new HashMap<>();
    initializeNucleotideHashMap();
  }

  private void initializeNucleotideHashMap() {
    nucleotideHashMap.put('A', 0);
    nucleotideHashMap.put('C', 0);
    nucleotideHashMap.put('G', 0);
    nucleotideHashMap.put('T', 0);
  }

  public int count(char nucleotide) {
    int count = 0;
    if (!nucleotideHashMap.containsKey(nucleotide)) {
      throw new IllegalArgumentException("Invalid Nucleotide");
    }
    for (int i = 0; i < dnaString.length(); i++) {
      count = getCount(nucleotide, count, i);
    }
    return count;
  }

  private int getCount(char nucleotide, int count, int i) {
    if (dnaString.charAt(i) == nucleotide) {
      count++;
    }
    return count;
  }


  public Map<Character, Integer> nucleotideCounts() {
    for (int i = 0; i < dnaString.length(); i++) {
      putNucleotideCountInHashMap(i);
    }
    return nucleotideHashMap;
  }

  private void putNucleotideCountInHashMap(int i) {
    if (nucleotideHashMap.containsKey(dnaString.charAt(i))) {
      int value = nucleotideHashMap.get(dnaString.charAt(i));
      nucleotideHashMap.put(dnaString.charAt(i), value + 1);
    }
  }
}
