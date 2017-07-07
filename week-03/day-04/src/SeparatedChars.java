import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class SeparatedChars {
  public static void main(String[] args) {
    System.out.println("Type a text:  ");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();
    int index = 0;
    int length = string.length();
    System.out.println(separateChar(string, length, index));
  }

  public static String separateChar(String str, int length, int i) {
     if(length == 1){
      return str;
    } else {
      String firstPart = str.substring(0, i + 1);
      String secondPart = str.substring(i + 1);
      str = firstPart + "*" + secondPart;
      i += 2;
      length -= 1;
      return separateChar(str, length, i);
     }
  }
}
