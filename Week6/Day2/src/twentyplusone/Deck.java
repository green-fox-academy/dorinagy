package twentyplusone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class Deck {
  List<Card> deck;
  Card card;

  public Deck() {
    deck = new ArrayList<>();
  }

  public void addCards() {
    card = new Card();
    deck.add(card);
  }


  public void shuffleDeck() {
    ArrayList<Card> tempDeck = new ArrayList<>();
    while (deck.size() > 0) {
      Card card = deck.get(getRandomCard(deck.size()));
      tempDeck.add(card);
      deck.remove(card);
    }
    deck = tempDeck;
  }

  private int getRandomCard(int deckSize) {
    int getACard = (int) (Math.random() * deckSize);
    return getACard;
  }

  public void pullFirst() {

  }

  public void pullLast() {

  }

  public void pullRandom() {

  }
}
