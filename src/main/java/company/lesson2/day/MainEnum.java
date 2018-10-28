package company.lesson2.day;

import company.lesson2.day.DayWeek;

public class MainEnum {

  public static void main(String[] args) {
    System.out.println(DayWeek.WEDNESDAY.getIndex());
// yaml TOREAD
// swagger TOREAD
// lombok
    System.out.println(DayWeek.FRIDAY.isWeekend());
    System.out.println(DayWeek.SATURDAY.isWeekend());

  }
}
