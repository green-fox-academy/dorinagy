package homework;

/**
 * Created by Nagy Dóra on 2017.04.17..
 */
public class Reptile extends Animal {

  public Reptile(String name) {
    super(name);
  }

  @Override
  public void greet() {
    System.out.println(name + "is greeting...");
  }

  @Override
  public String wantChild() {
    return "want a child from an egg!";
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void move() {
    System.out.println("is moving...");
  }
}
