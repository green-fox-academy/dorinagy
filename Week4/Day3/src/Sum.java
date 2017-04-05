import java.util.ArrayList;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
public class Sum {
  ArrayList<Integer>list;
  int sum;

  public Sum(ArrayList<Integer>list) {
    this.list = list;
  }

  public Sum(){}

  public ArrayList<Integer> getList() {
    return list;
  }

  public void addInts(int a) {
    list.add(a);
  }

  public int sumList() {
    for(Integer ints : list) {
      sum += ints;
    }
    return sum;
  }
}
