import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.24..
 */
public class Anagram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type a word:");
    String userInput1 = scanner.nextLine();
    System.out.println("Type the other word:");
    String userInput2 = scanner.nextLine();
    isAnagram(userInput1, userInput2);
  }
  public static void isAnagram(String s1, String s2){
    char[] stringOne = s1.toLowerCase().toCharArray();
    char[] stringTwo = s2.toLowerCase().toCharArray();
    if (stringOne.length != stringTwo.length) {
      System.out.println(false);
    }
    Arrays.sort(stringOne);
    Arrays.sort(stringTwo);
    String firstString = new String(stringOne);
    String secondString = new String(stringTwo);
    if (firstString.equals(secondString)) {
      System.out.println(true);
    }
  }
}
