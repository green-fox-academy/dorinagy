/**
 * Created by Nagy Dóra on 2017.03.24..
 */
public class PrintNumbers {
  public static void main(String[] args) {
    int min = 1;
    int max = 100;
    for (int i = min; i <= max; i++) {
      if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else if (i % 5 == 0 && i % 3 == 0) {
        System.out.println("FizzBuzz");
      } else {
      System.out.println(i);
      }
    }
  }
}
