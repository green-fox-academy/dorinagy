/**
 * Created by Nagy Dóra on 2017.04.05..
 */
public class Fibonacci {
  public int getFibonacci(int n) {
    if(n == 1)
      return 0;
    else if(n == 2)
      return 1;
    else
      return getFibonacci(n - 1) + getFibonacci(n - 2);
  }
}
