package company.lesson5;

public class Engine {

  private int volume;
  private String brand;

  public Engine(int volume, String brand) {
    this.volume = volume;
    this.brand = brand;
  }

  public void start() {
    System.out.println("Engine has started");
  }
}
