package date;

/**
 * Created by Nagy Dóra on 2017.04.20..
 */
public interface BirthdayCalculator<T> {

  T parseDate(String str);

  String printMonthAndDay(T date);

  boolean isAnniversaryToday(T date);

  int calculateAgeInYears(T birthday);

  int calculateDaysToNextAnniversary(T date);

}
