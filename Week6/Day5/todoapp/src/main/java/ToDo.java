import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Nagy Dóra on 2017.04.20..
 */
public class ToDo {
  private String task;
  private static int id;
  private DayOfWeek createdAt;
  private DayOfWeek completedAt;
  //final static String DONE = "[x] ";
  //final static String UNDONE = "[ ] ";
  final static String ID = "[" + id + "] ";

  public ToDo(String task) {
    setTask(task);
  }

  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
    createdAt = LocalDate.now().getDayOfWeek();
  }

  public void check() {
    task = ID + task.substring(ID.length());
    completedAt = LocalDate.now().getDayOfWeek();
  }

  public void setID(int id) {
    this.id = id;
  }

  public int complitionTime(String task) {
    this.task = task;
    int timeRequired = completedAt.getValue() - createdAt.getValue();
    return timeRequired;
  }
}
