import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
class AnagramTest {
  String s1 = "apples";
  String s2 = "bubble";
  Anagram anagram = new Anagram();

  @Test
  void isAnagram() {
    assertEquals(anagram.isAnagram(s1, s2), false);
  }

}