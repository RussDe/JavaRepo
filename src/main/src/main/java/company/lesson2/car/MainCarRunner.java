package company.lesson2.car;

public class MainCarRunner {
  public static void main(String[] args) {
    Car car = new Car(60);
    Car.Motor motor = new Car.Motor(1000);
    Car.Motor.print2();
    Car car2 = null;
    car2.print();
  }
}
