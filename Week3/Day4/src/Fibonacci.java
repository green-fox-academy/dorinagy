import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("Give me a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(fibonacci(number));
  }
  public static int fibonacci(int n) {
    if (n == 1) {
      return 0;
    }
    if(n == 2) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}
