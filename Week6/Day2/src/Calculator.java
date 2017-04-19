/**
 * Created by Nagy Dóra on 2017.04.19..
 */
public class Calculator {

  public static void main(String[] args) {
    add(2, 6);
    add(2.3, 4.2);
    subtract(9,6);
    multiply(4, 4);
    multiply(2.4, 3.6);
    divide(6, 3);
  }

  public static <T extends Number> double add(T a, T b) {
    System.out.println(a + " + " + b + " = " + a.doubleValue() + b.doubleValue());
    return a.doubleValue() + b.doubleValue();
  }
  public static <T extends Number> double subtract(T a, T b) {
    Double sum = a.doubleValue();
    Double double2 = b.doubleValue();
    sum -= double2;
    System.out.println(a + " - " + b + " = " + sum);
    return a.doubleValue() - b.doubleValue();
  }
  public static <T extends Number> double multiply(T a, T b) {
    System.out.println(a + " * " + b + " = " + a.doubleValue() * b.doubleValue());
    return a.doubleValue() * b.doubleValue();
  }
  public static <T extends Number> double divide(T a, T b) {
    try {
      System.out.println(a + " / " + b + " = " + a.doubleValue() / b.doubleValue());
      return a.doubleValue() / b.doubleValue();
    } catch(Exception e) {
      System.out.println("Can't divide by zero");
      e.printStackTrace();
    }
    return 0;
  }
}
