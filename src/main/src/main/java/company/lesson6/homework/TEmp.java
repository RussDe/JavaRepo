package company.lesson6.homework;

public class TEmp {
  public static void main(String[] args) {
    int a = 10;
    int b = 10;

    System.out.println("a=" + a);
    System.out.println("b=" + b);

    if (10 > 0 || a++ > 1) {
      System.out.println("ok1");
    }
    if (10 > 0 | b++ < 2) {
      System.out.println("ok2");
    }

    System.out.println("a=" + a); // ok1  a=11
    System.out.println("b=" + b); // b=11
  }
}
