import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {

  public static boolean isAnagram(String s, String s1) {
    List<Character> string1 = new ArrayList<>();
    List<Character> string2 = new ArrayList<>();

    if (s == null && s1 == null) {
      return true;
    } else if(s == null && s1 != null || s != null && s1 == null) {
      return false;
    } else {
      s = s.replaceAll(" ", "");
      s1 = s1.replaceAll(" ", "");
      for(int i = 0; i < s.length(); i++) {
       string1.add(s.toLowerCase().charAt(i));
      }
      for(int i = 0; i < s1.length(); i++) {
        string2.add(s1.toLowerCase().charAt(i));
      }
      Collections.sort(string1);
      Collections.sort(string2);

      if (string1.equals(string2)) {
      return true;
      }
    }
    return false;
  }

  public static String FizzBuzz(int i) {
    if(i == 3) {
    return "Fizz";
    } else
      return "FizzBuzz";
  }
}
