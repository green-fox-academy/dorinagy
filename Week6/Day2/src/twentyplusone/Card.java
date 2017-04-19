package twentyplusone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class Card {
  Random random;
  Color color;
  Suit suit;
  Rank rank;
  List<Color> colorList;
  List<Suit> suitList;
  List<Rank> rankList;

  public Card() {
    random = new Random();
    colorList = new ArrayList<>(Arrays.asList(Color.values()));
    suitList = new ArrayList<>(Arrays.asList(Suit.values()));
    rankList = new ArrayList<>(Arrays.asList(Rank.values()));
    this.color = colorList.get(random.nextInt(colorList.size()));
    this.suit = suitList.get(random.nextInt(suitList.size()));
    this.rank = rankList.get(random.nextInt(rankList.size()));
  }
}
