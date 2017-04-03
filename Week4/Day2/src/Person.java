/**
 * Created by Nagy Dóra on 2017.04.03..
 */
public class Person {
  String name;
  int age;
  String gender;

  public Person(String name, int age, String gender) {

  }

  public Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }

  public void introduce() {
    System.out.println("Hi, I,m " + name + ", a " + age + " year old " + gender);
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
