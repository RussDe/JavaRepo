package company.lesson1;

@FunctionalInterface
public interface Ex {
  int B = 10;

  void print();

 //void print1();

  default void print2() {
    System.out.println("hello");
  }

  static void print3() {
    System.out.println("hello3");
  }
}
