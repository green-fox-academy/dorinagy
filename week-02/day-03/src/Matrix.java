/**
 * Created by Nagy Dóra on 2017.03.22..
 */
public class Matrix {
  public static void main(String[] args) {
    String[][] array = new String[4][4];
    for (int i = 0; i <array.length; i++) {
      for (int j = 0; j <array.length; j++){
        if (i == j){
          array[i][j] = "1 ";
          System.out.print(array[i][j]);
        } else {
          array[i][j] = "0 ";
          System.out.print(array[i][j]);
        }
      }
      System.out.println();
    }
  }
}