import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class SumDigit {
  public static void main(String[] args) {
    System.out.println("Give me a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(sumDigits(number));

  }

  public static int sumDigits(int n) {
    if (n % 10 == n) {
      return n;
    } else {
      int digit = n % 10;
      return digit + sumDigits(n / 10);
    }
  }
}
