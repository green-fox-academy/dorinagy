import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.23..
 */
public class Calculator {
  public static void main(String... args) {

    System.out.println("Please type in the expression (eg. + 3 4): ");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();

    String[] inputParts = userInput.split(" ");

    int operand1 = Integer.parseInt(inputParts[2]);
    int operand2 = Integer.parseInt(inputParts[3]);

    if (userInput.contains("+")) {
      System.out.println("The answer is: " + (operand1 + operand2));
    }
    if (userInput.contains("-")) {
      System.out.println("The answer is: " + (operand1 - operand2));
    }
    if (userInput.contains("*")) {
      System.out.println("The answer is: " + (operand1 * operand2));
    }
    if (userInput.contains("/")) {
      System.out.println("The answer is: " + (operand1 / operand2));
    }
  }
}
