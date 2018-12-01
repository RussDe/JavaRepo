//package company.lesson4;
//
//public class GenericExample<E extends Comparable<E>> {
//  private double d = 10;
//  private E e;
//
//  public <T extends Number> GenericExample(T t) {
//    this.d = t.doubleValue();
//  }
//
//  public <T extends String> GenericExample(T t) {
//
//  }
//
//
//  public GenericExample(double d) {
//    this.d = d;
//  }
//
//  private static <T extends Number> double getNumberElement(T t) {
//    return t.doubleValue();
//  }
//
//  private static <T extends Number> T get(T t, boolean f) {
//    // something todo
//    return t;
//  }
//
//  private static Number get(Number number) {
//    return t;
//  }
//
//  public static void main(String[] args) {
//    System.out.println(getNumberElement(1));
//    Integer integer = get(1, true);
//    if (get(1) instanceof Integer) {
//      int integer1 = (Integer) get(1);
//    }
//
//  }
//}
