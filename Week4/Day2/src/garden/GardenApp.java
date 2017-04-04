package garden;

import java.util.ArrayList;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class GardenApp {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    ArrayList<Plants>plants = new ArrayList<>();
    Flower yellow = new Flower("yellow");
    plants.add(yellow);
    Flower blue = new Flower("blue");
    plants.add(blue);
    Tree purple = new Tree("purple");
    plants.add(purple);
    Tree orange = new Tree("orange");
    plants.add(orange);

    for(int i = 0; i < 3; i++) {
      yellow.needsWater();
      blue.needsWater();
      purple.needsWater();
      orange.needsWater();
      myGarden.watering();
    }
  }
}
