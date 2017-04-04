package garden;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class Flower extends Garden {

  public Flower(String color, double waterAmount) {
    this.color = color;
    this.waterAmount = waterAmount;
  }

  public Flower() {
    this.color = "";
  }

  public void needsWater() {
    if(waterAmount < 5) {
      System.out.println("The " + color + " Flower needs water");
    }
  }


}
