import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.03.23..
 */
public class QuoteSwap {
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    String temp = list.get(2);
    list.set(2, list.get(5));
    list.set(5, temp);

    System.out.println(list);
  }
}
