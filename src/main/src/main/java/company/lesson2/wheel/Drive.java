package company.lesson2.wheel;

@FunctionalInterface
public interface Drive {
  void drive(); //Only if we use it once (see lamda)
  default void fastDrive(){
    System.out.println("Fast Drive");
  }
  static void veryFastDrive(){
    System.out.println("veryFastDrive");
  }
}
