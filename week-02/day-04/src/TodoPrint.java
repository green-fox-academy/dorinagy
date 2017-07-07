/**
 * Created by Nagy Dóra on 2017.03.23..
 */
public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    String myTodo = "My todo:\n";
    String download = " - Download games\n";
    String diablo = "    - Diablo";

    myTodo = myTodo.concat(todoText + download + diablo);

    System.out.println(myTodo);
  }
}
