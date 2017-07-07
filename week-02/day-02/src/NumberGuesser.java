import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.25..
 */
public class NumberGuesser {
  public static void main(String[] args) {
    int storedNumber = 8;
    System.out.println("I got a number, try to guess it!");

    Scanner scanner = new Scanner(System.in);
    int guessedNumber = scanner.nextInt();

    while (guessedNumber != storedNumber) {
      if(guessedNumber > storedNumber) {
        System.out.println("The stored number is lower");
      } else if (guessedNumber < storedNumber) {
        System.out.println("The stored number is higher");
        }
        guessedNumber = scanner.nextInt();
    }
    System.out.println("You found the number: " + storedNumber);
  }
}
