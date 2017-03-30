import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.30..
 */
public class Bunnies {
  public static void main(String[] args) {
    System.out.println("Give me the number of bunnies:  ");
    Scanner scanner = new Scanner(System.in);
    int bunnies = scanner.nextInt();
    System.out.println(ears(bunnies));

  }

  public static int ears(int bunny) {
    if (bunny == 0 ) {
      return 0;
    } else {
      return 2 + ears(--bunny);
    }
  }
}
