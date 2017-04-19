package twentyplusone;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class Game {
  Random random;
  int randomNumber;
  Scanner scanner;
  Deck deck;

  public Game() {
    random = new Random();
    scanner = new Scanner(System.in);
    deck = new Deck();
  }

  public int generateRandomNum() {
    randomNumber = random.nextInt(7) + 15;
    System.out.println(randomNumber);
    return randomNumber;
  }

  public void pullCard() {
    if(scanner.nextLine().equals("first")) {
      deck.pullFirst();
    } else if(scanner.nextLine().equals("last")) {
      deck.pullLast();
    } else if(scanner.nextLine().equals("random")) {
      deck.pullRandom();
    } else {
      System.out.println("Pull a card: first, last or random");
    }
  }

  public void continueOrStop() {
    if(scanner.nextLine().equals("continue")) {
      pullCard();
    } else if(scanner.nextLine().equals("stop")) {

    } else {
      System.out.println("Do you want to continue or to stop?");
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Game game = new Game();
    Deck deck = new Deck();
    deck.addCards();
    deck.shuffleDeck();
    game.generateRandomNum();
    System.out.println("Pull a card: first, last or random");
    scanner.nextLine();
    game.pullCard();
    System.out.println("Do you want to continue or to stop?");
    game.continueOrStop();
    scanner.nextLine();
  }
}
