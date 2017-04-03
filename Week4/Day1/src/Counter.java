/**
 * Created by Nagy Dóra on 2017.04.03..
 */
public class Counter {
  int value;
  int initvalue;

  public Counter() {
    value = 0;
    initvalue = value;
  }

  public Counter(int value) {
    this.value = value;
    initvalue = value;
  }

  public void add(int number) {
    value = value + number;
  }

  public void add() {
    value += 1;
  }

  public int get() {
    return value;
  }

  public void reset() {
    value = initvalue;
  }
}
