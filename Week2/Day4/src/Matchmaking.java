import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.03.23..
 */
public class Matchmaking {
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

    int length = boys.size();
    if (length != girls.size()) {
    }

    ArrayList<String> order = new ArrayList<String>(length);
    for (int i = 0; i <= length; i++) {
      if (i <= girls.size()) {
        order.add(girls.get(i) + ", " + boys.get(i));
      }
      if (i > girls.size()) {
        order.add(boys.get(i));
      }
    }
    System.out.print(order);
  }
}