/**
 * Created by Nagy Dóra on 2017.03.22..
 */
public class Factorial {
  public static void main(String[] args) {
    int num1 = 3;
    System.out.println(factorio(num1));
  }
  public static int factorio(int factor) {
    int factorial = factor;
    for (int i = 1; i < factor; i++){
      factorial = factorial * i;
    }
    return factorial;
  }
}
