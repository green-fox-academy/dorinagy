package garden;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class Tree extends Garden {

  public Tree(String color, double waterAmount, double currentWaterAmount) {
    this.color = color;
    this.waterAmount = waterAmount;
    this.currentWaterAmount = currentWaterAmount;
  }

  public Tree() {
    this.color = "";
  }

  public void needsWater() {
    if(currentWaterAmount < 10) {
      System.out.println("The " + color + " Tree needs water");
    }
  }

  public void watering(double waterAmount) {
    if (currentWaterAmount < 10) {
      currentWaterAmount += (waterAmount / 4) * 0.4;
    }
  }

}
