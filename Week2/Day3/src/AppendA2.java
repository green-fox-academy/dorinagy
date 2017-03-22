import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.03.22..
 */
public class AppendA2 {
  public static void main(String[] args) {
    String[] nimals = {"kuty", "macsk", "cic"};
    for (int i = 0; i < nimals.length; i++) {
      nimals[i] += "a";
    }
    System.out.println(Arrays.toString(nimals));
  }
}
