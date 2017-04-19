import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class ParkingLot {
  List<Car> cars;
  HashMap<Integer, CarType> countedCars;
  Car car;
  int count;

  public ParkingLot() {
    cars = new ArrayList<>();
    countedCars = new HashMap<>();
    for(int i = 0; i < 256; i++){
      car = new Car();
      cars.add(car);
    }
  }

  public Map<Integer, CarType> countEachType(){
    for(int i = 0; i < cars.size(); i++) {
      for(int j = 0; j < cars.size(); j++) {
        if(cars.get(i).type.equals(cars.get(j).type)) {
          count++;
        }
      }
      if(!countedCars.containsValue(cars.get(i).type)) {
        countedCars.put(count, cars.get(i).type);
      }
      count = 0;
    }
    System.out.println(countedCars);
    return countedCars;
  }

  public static void main(String[] args) {
    ParkingLot parkingLot = new ParkingLot();
    parkingLot.countEachType();
  }
}
