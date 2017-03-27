import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.03.27..
 */
public class ReversedLines {
  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("assets/reversed-lines.txt");
      List<String> lines = Files.readAllLines(filePath);
      String string = lines.toString();

      String reverse = "";
      for(int i = string.length() - 1; i >= 0; i--) {
        reverse = reverse + string.charAt(i);
      }
      System.out.println(reverse);

    } catch (Exception e) {
      System.out.println("Error " + e.getClass());
    }
  }
}
