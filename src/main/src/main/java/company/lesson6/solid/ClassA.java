package company.lesson6.solid;

public final class ClassA {

  public static final ClassA INSTANCE = new ClassA(2);
  //builder and singleton, prototype, fabric, structure adapter, bridge

  private final int index;

  private ClassA(int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }
}
