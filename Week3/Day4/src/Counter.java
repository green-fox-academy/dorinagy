import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class Counter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type in a number: ");
    int number = scanner.nextInt();
    counter(number);
  }
  public static int counter(int n) {
    if(n == 0) {
      System.out.println(n);
      return 0;
    } else {
      System.out.println(n);
      return n + counter(--n);
    }
  }
}
