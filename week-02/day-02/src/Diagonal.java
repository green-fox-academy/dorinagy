import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.22..
 */
public class Diagonal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give me a number! I'll draw a square!");
    int size = input.nextInt();
    for (int i = 1; i <= size; i++) {
      if (i == 1 || i == size) {   //first and last line
        for (int j = 0; j < size; j++) {
          System.out.print("%");
        }
      }else {
        for (int j = 1; j <= size; j++) {
          if ( j == 1 || j == size || j == i) {   //slash
            System.out.print("%");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
