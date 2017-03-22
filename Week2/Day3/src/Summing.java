/**
 * Created by Nagy Dóra on 2017.03.22..
 */
public class Summing {
  public static void main(String[] args) {
    int num1 = 8;
    System.out.println(sum(num1));
  }
  public static int sum(int addTheNumbersTogether) {
    int sum = addTheNumbersTogether;
    for (int i = 0; i < addTheNumbersTogether; i++){
      sum = sum + i;
    }
    return sum;
  }
}
