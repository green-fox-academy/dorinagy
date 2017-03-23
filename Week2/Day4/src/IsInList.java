import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.03.23..
 */
public class IsInList {
  public static void main(String... args){
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    ArrayList<Integer> elements = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
    if (list.containsAll(elements)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
