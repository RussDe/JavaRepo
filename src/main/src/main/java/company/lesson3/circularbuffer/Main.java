package company.lesson3.circularbuffer;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int limit = 5;
    int startValue = 10;
    String startStringValue = "start";

    CircularBufferImpl<Integer> intBufferArray = new CircularBufferImpl<>(limit, Integer.class);
    System.out.println("Putting all");
    for (int i = 0; i < limit - 1; i++) {
      intBufferArray.put(startValue++);
    }

    System.out.println("Printing");
    intBufferArray.printBuffer();

    System.out.println("Get an item");
    intBufferArray.get();
    intBufferArray.get();
    intBufferArray.get();

    System.out.println("Getting a buffer as an Object array");
    Object[] objArray = intBufferArray.toObjectArray();
    for (Object obj : objArray
    ) {
      System.out.println(obj);
    }

    System.out.println("Getting a buffer as a T array");
    Integer[] arrayTypeT = intBufferArray.toArray();
    for (Integer number : arrayTypeT
    ) {
      System.out.println(number);
    }

//    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    CircularBufferImpl<String> stringBufferArray = new CircularBufferImpl<>(limit, Integer.class);

    System.out.println("Putting all");
    for (int i = 0; i < limit - 1; i++) {
      stringBufferArray.put(startStringValue);
      startStringValue = startStringValue.concat("-1");
    }
    System.out.println("Printing");
    stringBufferArray.printBuffer();

    stringBufferArray.get();

    System.out.println("Getting a buffer as a T array");
    String[] arrayTypeT2 = stringBufferArray.toArray();
    for (String number : arrayTypeT2
    ) {
      System.out.println(number);
    }

    //    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    System.out.println("Getting a buffer as a List<T>");
    List<Integer> arrayTypeTList = intBufferArray.asList();
    for (Integer number : arrayTypeTList
    ) {
      System.out.println(number);
    }

    //    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    List<Integer> listExample = new ArrayList<>(2);
    listExample.add(100);
    listExample.add(200);

    intBufferArray.addAll(listExample);
    System.out.println("Printing");
    intBufferArray.printBuffer();

    //    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }
}
