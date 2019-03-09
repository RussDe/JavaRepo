package company.lesson7;

public class A {
  private String password;

  private A() {
    System.out.println("Object A is created!");
    password = "pass";
  }

  private A(String message) {
    System.out.println("Message " + message);
    password = "word";
  }

  private void print() {
    System.out.println("print no params");
  }

  private void print(String message) {
    //for (int i = 0; i < number; i++) {
    System.out.println(message);
    // }
  }

  private void print(String message, int number) {
    for (int i = 0; i < number; i++) {
      System.out.println(message);
    }
  }
}
