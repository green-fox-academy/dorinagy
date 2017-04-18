package charoperations;

/**
 * Created by Nagy Dóra on 2017.04.18..
 */
public class CharOperations implements CharSequence {

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String reversedStr = "";
    for(int i = end; i >= start; i--) {
      reversedStr += charAt(i);
    }
    return reversedStr;
  }

  public static void main(String[] args) {
    CharOperations charOp = new CharOperations();
    String string = "marshmallow";
    charOp.subSequence(0, 6);
    System.out.println(string.subSequence(0, 6));
  }
}
