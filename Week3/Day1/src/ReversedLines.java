import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.03.27..
 */
public class ReversedLines {
  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("assets/reversed-lines.txt");
      List<String>encryptedLines = Files.readAllLines(filePath);
      ArrayList<String> decryptedLines = new ArrayList<>();

      for (String line : encryptedLines) {
        decryptedLines.add(decryptLines(line));
      }
      for (String line : decryptedLines) {
        System.out.println(line);
      }

    } catch (Exception e) {
      System.out.println("Error " + e.getClass());
    }
  }
  public static String decryptLines(String inputLine) {
    String newLine = new String();
    for (int i = 1; i <= inputLine.length(); i++) {
      newLine += inputLine.charAt(inputLine.length() - i);
    }
    return newLine;
  }
}
