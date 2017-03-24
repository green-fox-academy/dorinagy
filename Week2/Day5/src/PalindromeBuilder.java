import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.24..
 */
public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println("Enter a text or number:");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();
    palindrome(userInput);
  }

  private static void palindrome(String original) {
    String palindromeSecondPart =new StringBuilder(original).reverse().toString();
    original = original.concat(palindromeSecondPart);
    System.out.println(original);
  }
}
