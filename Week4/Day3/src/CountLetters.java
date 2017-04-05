import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
public class CountLetters {

  public Map countLetters(String myString) {
    HashMap<Character, Integer>myMap = new HashMap<>();
    int occurance = 0;
    for(int i = 0; i < myString.length(); i++) {
      char letter = myString.charAt(i);
      for(int j = 0; j < myString.length(); j++) {
        if(myString.charAt(j) == letter) {
          occurance++;
        }
      }
      if(!myMap.containsKey(letter)) {
        myMap.put(letter, occurance);
      }
      occurance = 0;
    }
    return myMap;
  }
}
