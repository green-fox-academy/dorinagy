import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
class SharpieTest {
  Sharpie sharpie = new Sharpie("blue", 40.f);

  @Test
  void use() {
    float inkAmount = 99;
    assertEquals(inkAmount, sharpie.use());
  }

  @Test
  void isEmpty() {
    sharpie.inkAmount = 0;
    float inkAmount = 0;
    assertEquals(inkAmount, sharpie.use());
  }
}