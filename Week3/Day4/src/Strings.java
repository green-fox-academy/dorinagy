import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class Strings {
  public static void main(String[] args) {
    System.out.println("Type a text:  ");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();
    System.out.println(replaceChar(string));

  }

  public static String replaceChar(String str) {
    if (str.contains("x")) {
      String newStr = str.replace("x", "y");
      return replaceChar(newStr);
    } else {
      return str;
    }
  }
}
