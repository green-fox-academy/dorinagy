/**
 * Created by Nagy Dóra on 2017.04.03..
 */
public class Station {
  int gasAmount;
  public void refill(Car gasAmount, Car capacity) {
    Car car = new Car();
    this.gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }
}
