package company.lesson5;

public class Plain {

  private Crylo cryloLeft;
  private Crylo cryloRight;
  private Engine engine;
  private Shassi shassi;

  public Plain(Crylo cryloLeft, Crylo cryloRight, Engine engine, Shassi shassi) {
    this.cryloLeft = cryloLeft;
    this.cryloRight = cryloRight;
    this.engine = engine;
    this.shassi = shassi;
  }

  void fly() {
    System.out.println("Run engine");
    engine.start();
    System.out.println("Hide shassi");
    shassi.hide();
    System.out.println("Up left crylo");
    cryloLeft.upIt();
    System.out.println("Up right crylo");
    cryloLeft.upIt();
  }
}
