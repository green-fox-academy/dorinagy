/**
 * Created by Nagy Dóra on 2017.04.05..
 */
public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100.f;
  }

  public float use() {
    if(inkAmount > 0) {
    inkAmount--;
    }
    return inkAmount;
  }
}
