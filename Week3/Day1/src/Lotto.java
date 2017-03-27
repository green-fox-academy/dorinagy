import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

      ArrayList lottoNumbers = new ArrayList();

      for (int i = 11; i < lineParts.size(); i += 16) {
        lottoNumbers.add(lineParts.get(i));
      }
      for (int j = 12; j < lineParts.size(); j += 16) {
        lottoNumbers.add(lineParts.get(j));
      }
      for (int k = 13; k < lineParts.size(); k += 16) {
        lottoNumbers.add(lineParts.get(k));
      }
      for (int l = 14; l < lineParts.size(); l += 16) {
        lottoNumbers.add(lineParts.get(l));
      }
      for (int n = 15; n < lineParts.size(); n += 16) {
        lottoNumbers.add(lineParts.get(n));
      }

      Collections.sort(lottoNumbers);


      System.out.println(lottoNumbers);


    } catch (Exception ex) {
      System.out.println("Error" + ex.getClass());
      }
  }
}
