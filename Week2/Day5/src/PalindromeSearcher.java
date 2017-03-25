import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.25..
 */
public class PalindromeSearcher {
  public static void main(String[] args) {
    System.out.println("Type in a text! I'll show you the palindromes in it.");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();
    searchPalindromes(userInput);
  }
  private static ArrayList<String> searchPalindromes(String inputText) {

    ArrayList<String> filteredText = new ArrayList<>();

    for (int i = 0; i < inputText.length() - 1; i++) {
      for (int j = i + 2; j < inputText.length(); j++) {
        if (inputText.charAt(i) == inputText.charAt(j)) {
          int left = i;
          int right = j;
          int placeOfFirstLetter = i;
          int placeOfLastLetter = j;
          while (inputText.charAt(left) == inputText.charAt(right) && right - left >= 1) {
            left++;
            right--;
          }
          if ((left - right) == -1 || (left - right) == 0 ) {
            String palindrome = inputText.substring(placeOfFirstLetter, placeOfLastLetter + 1);
            filteredText.add(palindrome);
          }
        }
      }
    }
    System.out.println(filteredText);
    return filteredText;
  }
}
