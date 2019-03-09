package company.lesson6.builder.inheritance;

public class Person {
  String name;
  String position;


  protected Person(PersonBuilder personBuilder) {
    this.name = personBuilder.name;
    this.position = personBuilder.position;
  }

  public static class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    private String name;
    private String position;

    public Person build() {
      return new Person(this);
    }

    public SELF withName(String name) {
      this.name = name;
      return self();
    }

    public SELF withPosition(String position) {
      this.position = position;
      return self();
    }

    protected SELF self() {
      return (SELF) this;
    }
  }
}
