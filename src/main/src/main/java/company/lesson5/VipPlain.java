package company.lesson5;

public class VipPlain extends Plain {

  private int vipClass;

  public VipPlain(Crylo cryloLeft, Crylo cryloRight, Engine engine, Shassi shassi, int vipClass) {
    super(cryloLeft, cryloRight, engine, shassi);
    this.vipClass = vipClass;
  }

  void swim() {
    System.out.println("Swimming");
  }

  @Override
  void fly() {
    System.out.println("Super fly");
  }
}
