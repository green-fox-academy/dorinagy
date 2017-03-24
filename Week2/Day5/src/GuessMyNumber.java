import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.24..
 */
public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Define two numbers I can choose between:");
    int min = scanner.nextInt();
    int max = scanner.nextInt();
    Random randomNumber = new Random();
    int myNumber = randomNumber.nextInt(max - min) + min;
    //System.out.println(myNumber);

    System.out.println("Now try to guess it!");

    int guessedNumber = scanner.nextInt();
    while(guessedNumber != myNumber) {
      if (guessedNumber > myNumber) {
        System.out.println("Too high. Guess again.");
      } else {
        System.out.println("Too low. Guess again.");
      }
      guessedNumber = scanner.nextInt();
    }
    System.out.println("Congratulations. You won");
  }
}
