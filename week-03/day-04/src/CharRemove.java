import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class CharRemove {
  public static void main(String[] args) {
    System.out.println("Type a text:  ");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();
    System.out.println(removeChar(string));

  }

  public static String removeChar(String str) {
    if (str.contains("x")) {
      String firstPart = str.substring(0, str.indexOf("x"));
      String secondPart = str.substring(str.indexOf("x") + 1);
      str = firstPart + "" + secondPart;
      return removeChar(str);
    } else {
      return str;
    }
  }
}
