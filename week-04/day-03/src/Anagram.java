import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
public class Anagram {

  public boolean isAnagram(String s1, String s2) {
    boolean isAnagram = false;
    char[] stringOne = s1.toLowerCase().toCharArray();
    char[] stringTwo = s2.toLowerCase().toCharArray();
    if (stringOne.length != stringTwo.length) {
      return false;
    }
    Arrays.sort(stringOne);
    Arrays.sort(stringTwo);
    String firstString = new String(stringOne);
    String secondString = new String(stringTwo);
    if (firstString.equals(secondString)) {
      return true;
    }
    return false;
  }
}
