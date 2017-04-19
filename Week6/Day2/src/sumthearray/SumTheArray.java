package sumthearray;

import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class SumTheArray {

  public static void main(String[] args) {
    Integer[] intArray = {1, 5, 8, 3, 9};
    Double[] doubleArray = {2.2, 4.4, 3.3, 1.1};
    sumArray(intArray, 5);
    sumArray(doubleArray, 4);
  }

  public static <T extends Number> double sumArray(T[] inputArray, int length) {
    try {
      Double sum = 0.0;
      for(int i = 0; i < length; i++) {
        sum += inputArray[i].doubleValue();
      }
      System.out.println(Arrays.toString(inputArray));
      System.out.println("Sum: " + sum);
      return sum;
    } catch(IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    return 0.0;
  }
}
