/**
 * Created by Nagy Dóra on 2017.04.20..
 */
public class ToDoApp {
  static ToDoList todoList;

  public static void main(String[] args) {
    if (args.length == 0) {
      PrintUsage.printUsage();
    } else {
      todoList = new ToDoList();
      ArgumentHandler handler = new ArgumentHandler();
      handler.handleArguments(args);
    }
  }
}
