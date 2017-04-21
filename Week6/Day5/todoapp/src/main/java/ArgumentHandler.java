import joptsimple.OptionParser;
import joptsimple.OptionSet;

/**
 * Created by Nagy Dóra on 2017.04.21..
 */
public class ArgumentHandler {
  public void handleArguments(String[] args) {
    ToDoList todoList = new ToDoList();
    OptionParser parser = new OptionParser();
    parser.accepts("-l");
    parser.accepts("-a").withRequiredArg();
    parser.accepts("-r").withRequiredArg();
    parser.accepts("-c").withRequiredArg();
    OptionSet options = parser.parse(args);
    if(options.has("-l")) {
      todoList.printTasks();
    } else {
      try {
        if(options.has("-a")) {
          todoList.addTask(ToDo.UNDONE + options.valueOf("-a").toString());
        } else if(options.has("-r")) {
          todoList.removeTask((int) options.valueOf("-r") - 1);
        } else if(options.has("-c")) {
          todoList.checkTask((int) options.valueOf("-c") - 1);
        } else {
          System.out.println("Error: Unsupported argument");
          PrintUsage.printUsage();
        }
        todoList.saveTasks();
      } catch(Exception ex) {
        String err = "";
        if(options.has("-a") && options.valueOf("-a").toString().equals("")) {
          err = "Unable to add, no task provided";
        } else if(options.has("-r") && options.valueOf("-r").toString().equals("")) {
          err = "Unable to remove, no index provided";
        } else if(options.has("-c") && options.valueOf("-c").toString().equals("")) {
          err = "Unable to check, no index provided";
        } else if(!todoList.isIndexValid((int) options.valueOf("-r")) || !todoList.isIndexValid((int) options.valueOf("-c"))) {
          err = "Index is out of exception";
        }
        System.out.println(err);
      }
    }
  }
}
