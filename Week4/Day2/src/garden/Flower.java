package garden;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class Flower extends Plants {

  public Flower(String color) {
    super(color);
    type = "Flower";
  }

  public void needsWater() {
    if(currentWaterAmount < 5) {
      needsWater = true;
      System.out.println("The " + color + " " + type + " needs water");
    } else {
      needsWater = false;
      System.out.println("The " + color + " " + type + " doesn't need water");
    }
  }

  public void watering(int waterForOne) {
    if (currentWaterAmount < 10) {
      System.out.println("Watering with " + waterForOne);
      currentWaterAmount += (waterForOne * 0.75);
    }
  }
}
