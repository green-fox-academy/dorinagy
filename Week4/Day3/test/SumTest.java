import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
class SumTest {
  Sum sum = new Sum();

  @BeforeEach
  void createList() {
    sum = new Sum();
  }

  @Test
  void sum() {
    int a = 2;
    int b = 5;
    int c = 7;
    sum.addInts(a);
    sum.addInts(b);
    sum.addInts(c);
    assertEquals(sum.sumList(),(a + b + c));
  }

  @Test
  void sumIsEmpty() {
    assertEquals(sum.sumList(),0);
  }

  @Test
  void sumOneElement() {
    int a = 2;
    sum.addInts(a);
    assertEquals(sum.sumList(),a);
  }
  @Test
  void sumNull() {
    assertEquals(sum.sumList(),null);
  }
}