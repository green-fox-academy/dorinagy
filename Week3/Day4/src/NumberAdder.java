import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class NumberAdder {
  public static void main(String[] args) {
    System.out.println("Give me a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(addNumbers(number));
  }
  public static int addNumbers(int n) {
    if (n == 0) {
      return 0;
    } else {
      return n + addNumbers(--n);
    }
  }
}
