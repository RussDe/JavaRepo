package company.lesson12;

public class MainRunner {
  public static void main(String[] args) {
    A a =new A(10);
    BImmutable bImmutable =new BImmutable(a, "One");
    System.out.println(bImmutable);
    a.setAge(1000);
    System.out.println(bImmutable);
    bImmutable.getA().setAge(150);
    System.out.println(bImmutable);

    System.out.println(Thread.currentThread().getName());
  }
}
