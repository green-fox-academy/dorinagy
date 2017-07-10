import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    int[] inputArray = {1, 3, 8, 6, 7, 4};
    getBiggestOfSecondElements(inputArray);
  }

  public static int getBiggestOfSecondElements(int[] intArray) {
    List<Integer> secondElements = new ArrayList<>();
    int max = 0;
    for (int i = 1; i <= intArray.length; i += 2) {
      secondElements.add(intArray[i]);
    }
    for (int j = 0; j < secondElements.size(); j++) {
      if (secondElements.get(j) > max) {
        max = secondElements.get(j);
      }
    }
    System.out.println(max);
    return max;
  }
}
