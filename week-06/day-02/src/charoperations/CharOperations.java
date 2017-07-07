package charoperations;

/**
 * Created by Nagy Dóra on 2017.04.18..
 */
public class CharOperations implements CharSequence {

  String myString;

  public CharOperations(String myString) {
    this.myString = myString;
  }

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
    String input = myString;
    String reversedStr = "";
    for(int i = end; i >= start; i--) {
      reversedStr += input.charAt(i);
    }
    return reversedStr;
  }

  public static void main(String[] args) {
    CharOperations charOp = new CharOperations("marshmallow");
    System.out.println(charOp.subSequence(0, 6));
  }
}
