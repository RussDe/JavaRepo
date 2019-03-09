package company.lesson2.wheel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractDrive {
  private int speed;
  public abstract int speedLimit();
  public abstract int speedLimit2();
  public int speedLimit3(){
    return 1;
  };

}
