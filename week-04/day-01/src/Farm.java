import java.util.*;

/**
 * Created by Nagy Dóra on 2017.04.03..
 */
public class Farm {
  ArrayList<Animal> animals = new ArrayList<>();
  int slots = 5;  //number of free places

  public void breed() {
    if(slots > 0) {
      animals.add(new Animal(""));
      slots--;
    }
  }

  public void slaughter() {
    String tempLeastHungry = "";
    for(int i = 1; i < animals.size(); i++) {
      if(animals.get(i).hunger < animals.get(i - 1).hunger) {
        tempLeastHungry.equals(animals.get(i));
      }
    }
    animals.remove(tempLeastHungry);
  }

  public static void main(String[] args) {
    Farm farm = new Farm();
    farm.breed();
    farm.slaughter();
  }
}
