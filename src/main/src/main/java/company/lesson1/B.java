package company.lesson1;

public class B extends A {
  int field;

  static {
    System.out.println("Static block from B here"); //1 Only one instance for the whole class.
  }

  {
    System.out.println("Non-static block frm B here"); //2
  }

  public B(int field) {
    super(field);
    System.out.println("Constructor B here"); //3
  }

  public  void  print(){
    System.out.println(this.field);
    System.out.println(super.field);
  }
}
