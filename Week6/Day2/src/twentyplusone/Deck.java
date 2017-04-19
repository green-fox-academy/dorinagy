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

  public Card pullFirst() {
    Card firstCard = deck.get(0);
    deck.remove(firstCard);
    return firstCard;
  }

  public Card pullLast() {
    Card lastCard = deck.get(deck.size());
    deck.remove(lastCard);
    return lastCard;
  }

  public Card pullRandom() {
    Card randomCard = deck.get((int) Math.random() * deck.size());
    deck.remove(randomCard);
    return randomCard;
  }
}
