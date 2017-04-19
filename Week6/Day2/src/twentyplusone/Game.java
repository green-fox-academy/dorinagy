package twentyplusone;

import java.util.Random;

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
    randomNumber = random.nextInt(21) + 15;
    return randomNumber;
  }

  public static void main(String[] args) {
    Game game = new Game();
    game.generateRandomNum();
  }
}
