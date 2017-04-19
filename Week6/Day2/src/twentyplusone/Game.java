package twentyplusone;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class Game {
  Random random;
  int randomNumber;

  public Game() {
    random = new Random();
  }

  public int generateRandomNum() {
    randomNumber = random.nextInt(7) + 15;
    System.out.println(randomNumber);
    return randomNumber;
  }

  public static void main(String[] args) {
    Game game = new Game();
    Scanner scanner = new Scanner(System.in);
    game.generateRandomNum();
    System.out.println("Do you want to continue or to stop?");
    scanner.nextLine();
  }
}
