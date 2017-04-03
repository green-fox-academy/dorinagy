/**
 * Created by Nagy Dóra on 2017.04.03..
 */
public class Sharpie {
  String color;
  float width;
  float inkAmount;

  @Override
  public String toString() {
    return "Sharpie " +
            "color = '" + color + '\'' +
            ", width = " + width +
            ", inkAmount = " + inkAmount;
  }

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 40;
  }

  public void use() {
    inkAmount -= 1;
  }

  public static void main(String[] args) {
    Sharpie red = new Sharpie("red", 40);
    System.out.println(red.toString());
  }
}
