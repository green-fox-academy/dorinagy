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
    int livesRemaining = 5;

    System.out.println("Now try to guess it! You have 5 lives.");
    int guessedNumber = scanner.nextInt();
    boolean guess = false;

      while(guess == false && livesRemaining > 1) {
        if(guessedNumber > myNumber) {
          livesRemaining -= 1;
        System.out.println("Too high. You have " + livesRemaining + " lives left.");
        } else if(guessedNumber < myNumber){
          livesRemaining -= 1;
          System.out.println("Too low. You have " + livesRemaining + " lives left.");
          } else if (guessedNumber == myNumber) {
            System.out.println("Congratulations. You won");
            guess = true;
        }
        guessedNumber = scanner.nextInt();
      }
      if (livesRemaining == 1) {
      System.out.println("You died.");
    }
  }
}

