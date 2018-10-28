package company.lesson2.day;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DayWeek implements Weekend {
  MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5),
  SATURDAY(6) {
    public boolean isWeekend() {
      return true;
    }
  },
  SUNDAY(7) {
    public boolean isWeekend() {
      return true;
    }
  };

  private int index;

  @Override
  public boolean isWeekend() {
    return false;
  }
}
