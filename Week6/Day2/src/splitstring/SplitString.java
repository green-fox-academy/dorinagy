package splitstring;

import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class SplitString {

  public static void main(String[] args) {
    splitString(5, "lovebarbara");
  }

  public static String[] splitString(int index, String inputString) {
    try {
      String firstStr = inputString.substring(0, index - 1);
      String secondStr = inputString.substring(index - 1, inputString.length());
      String[] array = new String[] {firstStr, secondStr};
      System.out.println(Arrays.toString(array));
      return array;
    } catch(IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    return null;
  }
}
