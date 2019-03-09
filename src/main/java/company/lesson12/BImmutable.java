package company.lesson12;

public final class BImmutable {
  private final A a;
  private final String definition;

  public BImmutable(A a, String definition) {
    this.a = new A(a.getAge());
    this.definition = definition;
  }


  public A getA() {
    return new A(a.getAge());
  }

  public String getDefinition() {
    return definition;
  }

  @Override
  public String toString() {
    return "BImmutable{" +
            "a=" + a +
            ", definition='" + definition + '\'' +
            '}';
  }
}
