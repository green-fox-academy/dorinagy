import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

/**
 * Created by Nagy Dóra on 2017.03.27..
 */
public class Doubled {
  public static void main(String[] args) {
    try {
    Path filePath = Paths.get("assets/duplicated-chars.txt");
    List<String> lines = Files.readAllLines(filePath);
    String string = lines.toString();
    removeDuplicates(string);

    } catch (Exception e) {
      System.out.println("Error" + e.getClass());
    }
  }
  public static void removeDuplicates (String str) {
    String removed = "";
    for (int i = 0; i < str.length(); i++) {
      if (i == 0) {
        removed = "" + str.charAt(i);
      } else if(str.charAt(i - 1) != str.charAt(i)) {
        removed = removed + str.charAt(i);
      }
    }
    System.out.println(removed);
  }
}
