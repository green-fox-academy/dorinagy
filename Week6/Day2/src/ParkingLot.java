import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class ParkingLot {
  List<Car> cars;
  Car car;
  public ParkingLot() {
    cars = new ArrayList<>();
    for(int i = 0; i < 256; i++){
      car = new Car();
      cars.add(car);
    }
  }

}
