package twentyplusone;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public enum Rank {
 ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK("J"), QUEEN("Q"), KING("K"), ACE("A");

  private Object value;

  private Rank(Object value) {
    this.value = value;
  }
}
