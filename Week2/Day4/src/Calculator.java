import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.23..
 */
public class Calculator {
  public static void main(String... args) {

    System.out.println("Please type in the expression:");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();

    String[] array = userInput.split(" ");

    int operand1 = 0;
    int operand2 = 0;

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
