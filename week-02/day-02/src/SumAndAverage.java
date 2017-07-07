import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.25..
 */
public class SumAndAverage {
  public static void main(String[] args) {
    System.out.println("Give me a number!");
    Scanner scanner = new Scanner(System.in);
    int allNumbers = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < allNumbers; i++) {
      System.out.println("Type the number: ");
      int number = scanner.nextInt();
      sum += number;
    }
    System.out.println("Sum: " + sum + ", Average: " + (sum / allNumbers));
  }
}
