import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nagy Dóra on 2017.03.25..
 */
public class StudentCounter {
  public static void main(String... args) {
    ArrayList<Map<String, Object>> map = new ArrayList<>();

    Map<String, Object> row0 = new HashMap<>();
    row0.put("name", "Rezso");
    row0.put("age", 9.5);
    row0.put("candies", 2);
    map.add(row0);

    Map<String, Object> row1 = new HashMap<>();
    row1.put("name", "Gerzson");
    row1.put("age", 10);
    row1.put("candies", 1);
    map.add(row1);

    Map<String, Object> row2 = new HashMap<>();
    row2.put("name", "Aurel");
    row2.put("age", 7);
    row2.put("candies", 3);
    map.add(row2);

    Map<String, Object> row3 = new HashMap<>();
    row3.put("name", "Zsombor");
    row3.put("age", 12);
    row3.put("candies", 5);
    map.add(row3);

    Map<String, Object> row4 = new HashMap<>();
    row4.put("name", "Olaf");
    row4.put("age", 12);
    row4.put("candies", 7);
    map.add(row4);

    Map<String, Object> row5 = new HashMap<>();
    row5.put("name", "Teodor");
    row5.put("age", 3);
    row5.put("candies", 2);
    map.add(row5);

    int sumAge = 0;
    String whoHasMoreCandies = "More than 4 candies: ";

    for (int i = 0; i < map.size(); i++) {
      int numberOfCandies = (Integer)map.get(i).get("candies");
      Double ageOfChildren = new Double(map.get(i).get("age").toString());

      if(numberOfCandies > 4) {
        Object name = map.get(i).get("name");
        String nameToString = name.toString();
        whoHasMoreCandies += nameToString + " ";
      }
      if (numberOfCandies < 5) {
        sumAge += ageOfChildren;
      }
    }
    System.out.println(whoHasMoreCandies);
    System.out.println("Sum of ages who has less then 5 candies: " + sumAge);
  }
}
