
public class Main {

  public static void main(String[] args) {
    int[] inputArray = {1, 3, 8, 6, 7, 4};
    getMaxOfSecondElements(inputArray);
  }

  public static int getMaxOfSecondElements(int[] intArray) {
    int max = 0;
    for (int i = 1; i <= intArray.length; i += 2) {
      if (intArray[i] > max) {
        max = intArray[i];
      }
    }
    return max;
  }
}
