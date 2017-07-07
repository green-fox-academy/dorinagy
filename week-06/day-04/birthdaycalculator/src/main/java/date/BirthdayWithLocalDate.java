package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by Nagy Dóra on 2017.04.20..
 */
public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

  @Override
  public LocalDate parseDate(String str) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return LocalDate.parse(str, formatter);
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    int month = date.getMonth().getValue();
    int day = date.getDayOfMonth();
    return month + ". " + day + ".";
  }

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    int birthMonth = date.getMonthValue();
    int birthDay = date.getDayOfMonth();
    return (birthMonth == LocalDate.now().getMonthValue() && birthDay == LocalDate.now().getDayOfMonth());
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
    int daysToAnniversary;
    if (LocalDate.now().getDayOfYear() <= date.getDayOfYear()) {
      daysToAnniversary = date.getDayOfYear() - LocalDate.now().getDayOfYear();
      } else {
        daysToAnniversary = date.getDayOfYear() - LocalDate.now().getDayOfYear() + 365;
      }
    return daysToAnniversary;
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
