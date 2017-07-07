/**
 * Created by Nagy Dóra on 2017.03.22..
 */
public class Pyramid {
  public static void main(String[] args) {
    int number = 4;
    for (int i = 1; i <= (number * 2); i += 2) {
      for (int k=0; k < (4 - i / 2); k++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
