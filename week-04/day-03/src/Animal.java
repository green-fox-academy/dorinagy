/**
 * Created by Nagy Dóra on 2017.04.05..
 */
public class Animal {
  int hunger;
  int thirst;
  String name;

  public Animal(String name) {
    hunger = 50;
    thirst = 50;
    this.name = name;
  }

  public int eat() {
    if(hunger > 0) {
      hunger -= 1;
    }
    return hunger;
  }

  public int drink() {
    if(thirst > 0) {
      thirst -= 1;
    }
    return thirst;
  }

  public int[] play() {
    thirst -= 1;
    hunger -= 1;
    int[]play = {hunger, thirst};
    return play;
  }
}
