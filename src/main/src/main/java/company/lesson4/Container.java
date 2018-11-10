package company.lesson4;

import java.util.List;

public class Container<T extends Number> extends Object {
  T values[];

  public Container(T[] values) {
    this.values = values;
  }

  public static void main(String[] args) {
    Integer[] integers = {1, 2, 34, 5};
    Container<Integer> containerInt = new Container<>(integers);

    Container<Integer>[] containers = new Container<>[10];

    Container<?>[] containers1 = new Container<?>[10]; //Wild card - ?
    List list;
    List<Object> objectList;
  }

  class A<super Container> {

  }
}
