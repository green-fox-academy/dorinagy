package homework;

/**
 * Created by Nagy Dóra on 2017.04.17..
 */
public class Mammal extends Animal {

  public Mammal(String name) {
    super(name);
  }

  @Override
  public void greet() {
    System.out.println(name + "is waving...");
  }

  @Override
  public String wantChild() {
    return "want a child from the uterus!";
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void move() {
    System.out.println("is walking...");
  }
}
