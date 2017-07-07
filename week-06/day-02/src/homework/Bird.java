package homework;

/**
 * Created by Nagy Dóra on 2017.04.17..
 */
public class Bird extends Animal {

  public Bird(String name) {
    super(name);
  }

  @Override
  public void greet() {
    System.out.println("is nodding...");
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
    System.out.println("is flying...");
  }
}
