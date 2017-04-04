package Package1;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class Student extends Person{
  String previousOrganization;
  int skippedDays;

  public Student(String previousOrganization) {
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {

    skippedDays += numberOfDays;
  }

  public static void main(String[] args) {
    Student student = new Student();
    student.introduce();
    student.getGoal();
    student.skipDays(3);
  }
}
