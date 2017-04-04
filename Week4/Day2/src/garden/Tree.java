package garden;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class Tree extends Plants {

  public Tree(String color) {
    super(color);
    type = "Tree";
  }

  public void needsWater() {
    if(currentWaterAmount < 10) {
      needsWater = true;
      System.out.println("The " + color + " " + type + " needs water");
    } else {
      needsWater = false;
      System.out.println("The " + color + " " + type + " doesn't need water");
    }
  }

  public void watering(double waterAmount) {
    if (currentWaterAmount < 10) {
      System.out.println("Watering with " + waterAmount);
      currentWaterAmount += (waterAmount / 4) * 0.4;
    }
  }
}
