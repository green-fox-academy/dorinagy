import java.util.Date;

/**
 * Created by Nagy Dóra on 2017.04.20..
 */
public class ToDo {
  private String task;
  private int id;
  private Date createdAt;
  private Date completedAt;
  final static String DONE = "[x] ";
  final static String UNDONE = "[ ] ";

  public ToDo(String task) {
    setTask(task);
  }

  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public void check() {
    task = DONE + task.substring(UNDONE.length());
  }
}
