/**
 * Created by Nagy Dóra on 2017.03.23..
 */
public class TakesLonger {
  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String firstPart = quote.substring(0, 20);
    String secondPart = quote.substring(20);

    System.out.println(firstPart + " always takes longer than" + secondPart);
  }
}
