import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nagy Dóra on 2017.04.05..
 */
class FibonacciTest {
  Fibonacci fibonacci = new Fibonacci();

  @Test
  void fibonacciOne() {
    int n = 1;
    assertEquals(0, fibonacci.getFibonacci(n));
  }

  @Test
  void fibonacciTwo() {
    int n = 2;
    assertEquals(1, fibonacci.getFibonacci(n));
  }

  @Test
  void fibonacciMore() {
    int n = 6;
    assertEquals(5, fibonacci.getFibonacci(n));
  }

}