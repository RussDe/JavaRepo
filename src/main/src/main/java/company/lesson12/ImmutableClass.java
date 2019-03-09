package company.lesson12;

public final class ImmutableClass {
  private final String pole;

  public ImmutableClass(String pole) {
    this.pole = pole;
  }

  public String getPole() {
    return pole;
  }
}
