import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if(b > a && b > c) {
      return b;
    } else {
      return c;
    }
  }

  int median(List<Integer> pool) {
    Collections.sort(pool);
    int median;
    if (pool.size() % 2 == 0) {
      median = (pool.get((pool.size() - 1)/2) + pool.get((pool.size() + 1)/2))/2;
    } else {
      median = pool.get(pool.size()/2);
      }
      return median;
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i+=2;
        length+=2;
      }
    }
    return teve;
  }
}
