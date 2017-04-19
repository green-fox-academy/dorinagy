package splitstring;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class SplitString {

  public static void main(String[] args) {
    splitString(4, "lovebarbara");
  }

  public static String[] splitString(int index, String inputString) {
    try {
      String firstStr = inputString.substring(0, index - 1);
      String secondStr = inputString.substring(index, inputString.length() - 1);
      String[] array = {firstStr, secondStr};
      System.out.println(array);
      return array;
    } catch(IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    return null;
  }
}
