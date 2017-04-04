package Package1;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class Mentor extends Person{
  String level;

  public Mentor(String level) {
    this.level = level;
  }

  public Mentor() {
    level = "intermediate";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers..");
  }

  public static void main(String[] args) {
    Mentor mentor = new Mentor();
    mentor.introduce();
    mentor.getGoal();
  }
}
