package company.lesson12;

public class A {
  private int age;

  public A(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public A setAge(int age) {
    this.age = age;
    return this;
  }

  @Override
  public String toString() {
    return "A{" +
            "age=" + age +
            '}';
  }
}
