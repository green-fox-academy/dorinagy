package carloft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class Car {
  CarType type;
  Color color;
  Random random;
  List<CarType> carTypeList;
  List<Color> colorList;

  public Car() {
    random = new Random();
    carTypeList = new ArrayList<>(Arrays.asList(CarType.values()));
    colorList = new ArrayList<>(Arrays.asList(Color.values()));
    this.type = carTypeList.get(random.nextInt(carTypeList.size()));
    this.color = colorList.get(random.nextInt(colorList.size()));
  }
}
