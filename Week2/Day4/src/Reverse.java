/**
 * Created by Nagy Dóra on 2017.03.23..
 */
public class Reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    System.out.print("");
    for (int i = reversed.length() - 1; i > 0; i--) {
      System.out.print(reversed.charAt(i));
    }
  }
}
