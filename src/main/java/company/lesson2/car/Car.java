package company.lesson2.car;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Car {
  private int speed;
  static void print(){
    System.out.println("Printing");
  }

  public static class Motor{
    Motor(int volume) {
      this.volume = volume;
    }



    private int volume;

    public int getVolume() {
      return volume;
    }

    private void work(){
      System.out.println("Motor is working!");
//      System.out.println(speed);
      print();
    }

    static void print2(){

    }
  }
}
