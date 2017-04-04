package Package1;

/**
 * Created by Nagy Dóra on 2017.04.04..
 */
public class Sponsor extends Person{
  String company;
  int hiredStudents;

  public Sponsor(String company) {
    this.company = company;
    hiredStudents = 0;
  }

  public Sponsor() {
    company = "Google";
    hiredStudents = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire() {
    this.hiredStudents++;
  }

  public static void main(String[] args) {
    Sponsor sponsor = new Sponsor();
    sponsor.introduce();
    sponsor.getGoal();
    sponsor.hire();
  }
}
