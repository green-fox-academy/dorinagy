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
    //int year = Integer.parseInt(str.substring(0, 3));
    //int month = Integer.parseInt(str.substring(5, 6));
    //int day = Integer.parseInt(str.substring(8, 9));
    //LocalDate birthdayDate = LocalDate.of(year, month, day);

    LocalDate localDate = LocalDate.now();
    return localDate;

    //return birthdayDate;
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
    int yearInDays = date.getYear() * 365;
    int monthInDays = date.getMonth().getValue() * 30;
    int days = date.getDayOfMonth();
    int birthdayDays = yearInDays + monthInDays + days;
    LocalDate localDate = LocalDate.now();
    int localYearInDays = localDate.getYear() * 365;
    int localMonthInDays = localDate.getMonth().getValue() * 30;
    int localDay = localDate.getDayOfMonth();
    int localDays = localYearInDays + localMonthInDays + localDay;
    if(localDays > birthdayDays) {
      return localDays - birthdayDays;
    } else if(localDays > birthdayDays) {
      return birthdayDays - localDays;
    } else return 0;
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
