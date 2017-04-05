import java.util.ArrayList;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
public class Sum {
  ArrayList<Integer>myList;
  int sum = 0;

  public Sum() {
    this.myList = new ArrayList<>();
  }

  public void addInts(int a) {
    myList.add(a);
  }

  public int sumList() {
    for(Integer ints : myList) {
      sum += ints;
    }
    return sum;
  }
}
