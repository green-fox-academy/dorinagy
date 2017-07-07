package homework;

/**
 * Created by Nagy Dóra on 2017.04.17..
 */
public abstract class Animal {
  String name;
  String gender;
  int age;

  public Animal(String name) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public abstract void greet();
  public abstract String wantChild();
  public abstract String getName();
  public abstract void move();
}
