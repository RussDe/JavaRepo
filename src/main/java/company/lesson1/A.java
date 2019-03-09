package company.lesson1;

public class A extends Object {
  int field;
  static int statField;

  static {
    System.out.println("Static block from A here"); //1 Only one INSTANCE for the whole class.
  }

  {
    field = 1;
    System.out.println("Non-static block A here"); //2
  }

  public A(int field) {
   this();
    System.out.println("Constructor here"); //3
    System.out.println("1st" + this.field); //3
    this.field = field;
    System.out.println("2nd" + this.field); //3
  }

  public A() {
  }
}
