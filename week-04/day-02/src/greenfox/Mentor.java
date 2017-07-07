package greenfox;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class Mentor extends Person {
  String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    level = "intermediate";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers..");
  }

}
