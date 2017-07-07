/**
 * Created by Nagy Dóra on 2017.03.22..
 */
public class Triangle {
  public static void main(String[] args) {
    int number = 6;
    for( int i = 1; i <= number; i++ ){
      for( int j = 0; j < i; j++ ){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
