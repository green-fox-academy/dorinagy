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

      int count = 0;
      Object number = 0;
      for (int y = 0; y < lottoNumbers.size();y++) {
        Object tempNumber = lottoNumbers.get(y);
        int tempCount = 0;
        for (int z = 0; z < lottoNumbers.size(); z++) {
          if (lottoNumbers.get(z).equals(tempNumber)) {
            tempCount = tempCount + 1;
          }
          if (tempCount > count) {
            number = tempNumber;
            count = tempCount;
          }
        }
      }
        System.out.println(number + " " + count);

      ArrayList<Object>numberList = new ArrayList<>(Arrays.asList(number));
      lottoNumbers.removeAll(numberList);

      int count2 = 0;
      Object number2 = 0;
      for (int y = 0; y < lottoNumbers.size();y++) {
        int tempCount2 = 0;
        Object tempNumber2 = lottoNumbers.get(y);
        for (int z = 0; z < lottoNumbers.size(); z++) {
          if (lottoNumbers.get(z).equals(tempNumber2)) {
            tempCount2 = tempCount2 + 1;
          }
          if (tempCount2 > count2) {
            number2 = tempNumber2;
            count2 = tempCount2;
          }
        }
      }
      System.out.println(number2 + " " + count2);

      ArrayList<Object>numberList2 = new ArrayList<>(Arrays.asList(number2));
      lottoNumbers.removeAll(numberList2);

      int count3 = 0;
      Object number3 = 0;
      for (int y = 0; y < lottoNumbers.size();y++) {
        int tempCount3 = 0;
        Object tempNumber3 = lottoNumbers.get(y);
        for (int z = 0; z < lottoNumbers.size(); z++) {
          if (lottoNumbers.get(z).equals(tempNumber3)) {
            tempCount3 = tempCount3 + 1;
          }
          if (tempCount3 > count3) {
            number3 = tempNumber3;
            count3 = tempCount3;
          }
        }
      }
      System.out.println(number3 + " " + count3);

      ArrayList<Object>numberList3 = new ArrayList<>(Arrays.asList(number3));
      lottoNumbers.removeAll(numberList3);

      int count4 = 0;
      Object number4 = 0;
      for (int y = 0; y < lottoNumbers.size();y++) {
        int tempCount4 = 0;
        Object tempNumber4 = lottoNumbers.get(y);
        for (int z = 0; z < lottoNumbers.size(); z++) {
          if (lottoNumbers.get(z).equals(tempNumber4)) {
            tempCount4 = tempCount4 + 1;
          }
          if (tempCount4 > count4) {
            number4 = tempNumber4;
            count4 = tempCount4;
          }
        }
      }
      System.out.println(number4 + " " + count4);

      ArrayList<Object>numberList4 = new ArrayList<>(Arrays.asList(number4));
      lottoNumbers.removeAll(numberList4);

      int count5 = 0;
      Object number5 = 0;
      for (int y = 0; y < lottoNumbers.size();y++) {
        int tempCount5 = 0;
        Object tempNumber5 = lottoNumbers.get(y);
        for (int z = 0; z < lottoNumbers.size(); z++) {
          if (lottoNumbers.get(z).equals(tempNumber5)) {
            tempCount5 = tempCount5 + 1;
          }
          if (tempCount5 > count5) {
            number5 = tempNumber5;
            count5 = tempCount5;
          }
        }
      }
      System.out.println(number5 + " " + count5);

    } catch (Exception ex) {
      System.out.println("Error" + ex.getClass());
      }
  }
}
