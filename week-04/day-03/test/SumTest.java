import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
class SumTest {
  ArrayList<Integer> list = new ArrayList<>();

  @Test
  void sum() {
    Sum sum = new Sum(list);
    int a = 2;
    int b = 5;
    int c = 7;
    sum.addInts(a);
    sum.addInts(b);
    sum.addInts(c);
    assertEquals(sum.sumList(),(a + b + c));
  }

  @Test
  void testIsEmpty() {
    Sum sum = new Sum(list);
    assertEquals(sum.sumList(),0);
  }

  @Test
  void testOneElement() {
    Sum sum = new Sum(list);
    int a = 2;
    sum.addInts(a);
    assertEquals(sum.sumList(),a);
  }
  @Test
  void testNull() {
    Sum sum = new Sum();
    assertNull(sum.sumList());
  }
}