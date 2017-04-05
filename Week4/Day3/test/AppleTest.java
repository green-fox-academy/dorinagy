import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
class AppleTest {
  String apple = "apple";
  Apple Apple = new Apple(apple);

  @Test
  void getApple() {

    assertEquals(apple + apple, Apple.getApple());
  }
}