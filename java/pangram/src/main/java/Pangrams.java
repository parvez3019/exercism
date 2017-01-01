import java.util.HashSet;
import java.util.Set;

class Pangrams {

  public static boolean isPangram(String string) {
    String stringToLowerCase = string.toLowerCase();
    String removeSpacesPunctuation = stringToLowerCase.replaceAll("[^A-Za-z]+","");
    char[] charArray = removeSpacesPunctuation.toCharArray();
    Set setOfCharacters = new HashSet();
    for(char c : charArray){
      setOfCharacters.add(c);
    }
    return setOfCharacters.size() == 26;

  }
}
