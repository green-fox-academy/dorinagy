import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.03.27..
 */
public class ReversedOrder {
  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("assets/reversed-order.txt");
      List<String> lines = Files.readAllLines(filePath);

    } catch (Exception e) {
      System.out.println("Error " + e.getClass());
    }
  }
}
