import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
class CountLettersTest {
  CountLetters count = new CountLetters();
  String myString = "sjkkk";

  @Test
  void countLetters() {
    HashMap<Character, Integer>myMap = new HashMap<>();

    myMap.put(myString.charAt(0), 1);
    myMap.put(myString.charAt(1), 1);
    myMap.put(myString.charAt(2), 3);

    assertEquals(myMap, count.countLetters(myString));
  }

}