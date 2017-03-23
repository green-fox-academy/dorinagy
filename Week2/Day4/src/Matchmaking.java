import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.03.23..
 */
public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

    ArrayList<String> order = new ArrayList<String>();

    int length = girls.size();
    int length2 = boys.size();
    for (int i = 0; i < length; i++) {
      order.add(girls.get(i) + " " + boys.get(i));
    }
    if (length < boys.size()) {
      for (int i = length; i < length2; i++) {
        order.add(boys.get(i));
      }
      System.out.println(order);
    }
  }
}