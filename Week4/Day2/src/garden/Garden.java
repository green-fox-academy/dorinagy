package garden;

import java.util.ArrayList;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class Garden {
  int waterAmount = 10;
  ArrayList<Plants> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void watering(int waterAmount) {
    for(Plants plant : plants) {}
    waterAmount += 30;
    System.out.println("Watering with " + waterAmount);
  }
}
