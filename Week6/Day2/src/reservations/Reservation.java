package reservations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Nagy Dóra on 2017.04.18..
 */
public class Reservation implements Reservationy {
  Random random;
  List<String> codeList;
  List<String> dow;

  public Reservation() {
    random = new Random();
    dow = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));
    codeList = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B",	"C", "D", "E", "F", "G", "H", "I", "J", "K", "L",	"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",	"W", "X",	"Y", "Z"));
  }

  @Override
  public String getDowBooking() {
    int index = random.nextInt(dow.size());
    return dow.get(index);
  }

  @Override
  public String getCodeBooking() {
    String code = "";
    for(int i = 0; i < 8; i++) {
    int index = random.nextInt(codeList.size());
    code += codeList.get(index);
    }
    return code;
  }

  @Override
  public String toString() {
    return String.format("Booking# %s for %s", getCodeBooking(), getDowBooking());
  }
}
