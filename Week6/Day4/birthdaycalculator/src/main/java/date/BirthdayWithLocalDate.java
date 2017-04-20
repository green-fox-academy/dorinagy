package date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.04.20..
 */
public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

  @Override
  public LocalDate parseDate(String str) {
    //String year = str.substring(0, 3);
    //String month = str.substring(5, 6);
    //String day = str.substring(7, 8);
    //LocalDate localDate;
    LocalDate localDate = LocalDate.now();

    return localDate;
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    int month = date.getMonth().getValue();
    int day = date.getDayOfMonth();
    String string = month + "." + day + ".";
    return string;
  }

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    LocalDate localDate = LocalDate.now();
    if(localDate == date) {
      return true;
    } else return false;
  }

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
    int year = birthday.getYear();
    LocalDate localDate = LocalDate.now();
    int currentYear = localDate.getYear();
    int ageInYears = currentYear - year;
    return ageInYears;
  }

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
    return 0;
  }

  public static void main(String[] args) {
    new BirthdayWithLocalDate().run();
  }

  private void run() {

    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    if (isAnniversaryToday(birthdayDate)) {
      int ageInYears = calculateAgeInYears(birthdayDate);
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }

  private final Scanner input = new Scanner(System.in, "UTF-8");

}
