/**
 * Created by Nagy Dóra on 2017.03.22..
 */
public class PrintArguments {
  public static void main(String[] args) {
    String text1 = "text one";
    String text2 = "text two";
    String text3 = "text three";
    printer(text1, text2, text3);
  }
  public static void printer(String... print) {
    for(String i : print){
      System.out.println(i + " ");
    }
  }
}
