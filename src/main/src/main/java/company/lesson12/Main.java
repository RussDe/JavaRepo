package company.lesson12;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("First");
    list.add("Second");
    List<String> listImmutable = Collections.unmodifiableList(list);
    System.out.println(listImmutable.size());
    list.add("Third");
    System.out.println(listImmutable.size());
    for (String element :
            listImmutable) {
      System.out.println(element);
    }

    listImmutable.forEach(System.out::println);


  }
}
