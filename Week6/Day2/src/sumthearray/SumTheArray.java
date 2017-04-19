package sumthearray;

/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class SumTheArray {

  public static void main(String[] args) {
    Integer[] intArray = {1, 5, 8, 3, 9};
    Double[] doubleArray = {2.2, 4.4, 3.3, 1.1};
    sumArray(intArray, 4);
    sumArray(doubleArray, 3);
  }

  public static <T extends Number> double sumArray(T[] inputArray, int length) {
    Double sum = 0.0;
    for(int i = 0; i < length; i++) {
      sum += inputArray[i].doubleValue();
    }
    System.out.println(sum);
    return sum;
  }
}
