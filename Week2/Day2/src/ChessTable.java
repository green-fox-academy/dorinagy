/**
 * Created by Nagy Dóra on 2017.03.25..
 */
public class ChessTable {
  public static void main(String[] args) {
    for (int j = 0; j < 8; j++) {
      System.out.println();
      for (int i = 0; i < 4; i++) {
        if (j % 2 == 0){
        System.out.print("% ");
        } else {
          System.out.print(" %");
        }
      }
    }
  }
}
