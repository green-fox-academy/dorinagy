import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class Power {
  public static void main(String[] args) {
    System.out.println("Give me two numbers(base and the power):  ");
    Scanner scanner = new Scanner(System.in);
    int base = scanner.nextInt();
    int n = scanner.nextInt();
    System.out.println(powerN(base, n));

  }

  public static int powerN(int base, int n) {
    if (n == 0 ) {
      return 1;
    } else {
      return base * powerN(base, n - 1);
    }
  }
}
