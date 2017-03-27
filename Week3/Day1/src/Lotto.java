import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.03.27..
 */
public class Lotto {
  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("assets/otos.csv");
      List<String> lines = Files.readAllLines(filePath);

      List<String>lineParts = new ArrayList<>(Arrays.asList(lines.toString().split("[;,]")));

      //System.out.println(lines.get(1));

      for (int i = 11; i < lineParts.size(); i += 16) {
        System.out.println(lineParts.get(i));
      }

      //ArrayList<>

    } catch (Exception ex) {
      System.out.println("Error" + ex.getClass());
    }
  }
}
