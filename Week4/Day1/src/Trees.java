import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nagy Dóra on 2017.04.02..
 */
public class Trees {
  private static Map<String, Object>createTree(String type, String leafColor, int age, String sex) {
    Map<String, Object> tree = new HashMap<>();
    tree.put("type", type);
    tree.put("leafColor", leafColor);
    tree.put("age", age);
    tree.put("sex", sex);
    return tree;
  }

  public static void main(String[] args) {
    Map<String, Object>apple = createTree("apple", "green", 40, "female");
    Map<String, Object>cherry = createTree("cherry", "dark green", 25, "male");
    Map<String, Object>pine = createTree("pine", "silver", 100, "female");
    Map<String, Object>maple = createTree("maple", "red", 50, "male");
    Map<String, Object>ginkgo = createTree("ginkgo", "light green", 60, "female");

    System.out.println(apple);
    System.out.println(cherry);
    System.out.println(pine);
    System.out.println(maple);
    System.out.println(ginkgo);
  }
}
