/**
 * Created by Nagy Dóra on 2017.04.21..
 */
public class ArgumentHandler {
  public void handleArguments(String[] args) {
    ToDoApp todoapp = new ToDoApp();
    ToDoList todoList = new ToDoList();
    if (args[0].equals("-l")) {
      todoList.printTasks();
    } else {
      try {
        if (args[0].equals("-a")) {
          todoList.addTask(ToDo.UNDONE + args[1]);
        } else if (args[0].equals("-r")) {
          todoList.removeTask(Integer.parseInt(args[1]) - 1);
        } else if (args[0].equals("-c")) {
          todoList.checkTask(Integer.parseInt(args[1]) - 1);
        } else {
          System.out.println("Error: Unsupported argument");
          todoapp.printUsage();
          return;
        }
        todoList.saveTasks();
      } catch (Exception ex) {
        String err = "Unable to ";
        err += ((args[0].equals("-a")) ? "add" :
                (args[0].equals("-r")) ? "remove" :
                        (args[0].equals("-c")) ? "check" :
                                "") + ": ";
        err += (ex instanceof ArrayIndexOutOfBoundsException) ?
                ((args[0].equals("-a")) ? "no task provided" : "no index provided") :
                (ex instanceof IndexOutOfBoundsException) ? "index is out of bound" :
                        (ex instanceof NumberFormatException) ? "index is not a number" :
                                "";
        System.out.println(err);
      }
    }
  }
}
