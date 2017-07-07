package garden;

import java.util.ArrayList;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class Garden {
  int waterAmount;
  ArrayList<Plants> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void watering(int waterAmount) {
    this.waterAmount = waterAmount;
    for(Plants plant : plants) {
      int waterForOne = waterAmount / plants.size();
      plant.watering(waterForOne);
    }
    System.out.println("Watering with " + waterAmount);
  }
}
