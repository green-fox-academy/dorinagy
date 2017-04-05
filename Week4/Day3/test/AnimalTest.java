import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
class AnimalTest {
  Animal animal = new Animal("tiger");

  @Test
  void eat() {
    int hunger = 49;
    assertEquals(hunger, animal.eat());
  }

  @Test
  void eatIfZero() {
    animal.hunger = 0;
    int hunger = 0;
    assertEquals(hunger, animal.eat());
  }

  @Test
  void drink() {
    int thirst = 49;
    assertEquals(thirst, animal.drink());
  }

  @Test
  void drinkIfZero() {
    animal.thirst = 0;
    int thirst = 0;
    assertEquals(thirst, animal.drink());
  }

  @Test
  void play() {
    int[]myPlay = new int[2];
    myPlay[0] = 49;
    myPlay[1] = 49;
    assertEquals(myPlay, animal.play());
  }

}