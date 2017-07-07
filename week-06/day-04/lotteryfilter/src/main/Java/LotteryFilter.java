import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.04.20..
 */
public class LotteryFilter {
  public static void main(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("y").withRequiredArg();
    parser.accepts("f").withRequiredArg();
    parser.accepts("o").withRequiredArg();
    OptionSet options = parser.parse(args);

    if (options.has("y") && options.has("f")) {
      String filename = options.valueOf("f").toString();
      String year = options.valueOf("y").toString();
      CSVReader reader = null;
      try {
        reader = new CSVReader(new FileReader(filename), ';');
        List<String[]> lines = reader.readAll();

      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
