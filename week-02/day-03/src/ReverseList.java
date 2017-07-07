import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.03.22..
 */
public class ReverseList {
  public static void main(String[] args) {
    int[] list = {3, 4, 5, 6, 7};
    for (int i = 0; i < list.length / 2; i++) {
      int temp = list[i];
      list[i] = list[list.length - i - 1];
      list[list.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(list));
  }
}
