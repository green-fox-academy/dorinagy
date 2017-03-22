import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.22..
 */
public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type a nuber:");
    int userInput = scanner.nextInt();
    for (int a = 1; a <= 10; a++) {
    System.out.println(a + " * " + userInput + " = " + (userInput * a));
    }
  }
}
