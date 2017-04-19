package sortthearray;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class SortTheArray {

  public static void main(String[] args) {
    Integer[] intArray = {1, 5, 8, 3, 9};
    Double[] doubleArray = {2.2, 4.4, 3.3, 1.1};
    sortArray(intArray);
    sortArray(doubleArray);
  }

  public static <T extends Number> void sortArray(T[] inputArray) {
    Arrays.sort(inputArray, Collections.reverseOrder());
    System.out.println(Arrays.toString(inputArray));
  }
}
