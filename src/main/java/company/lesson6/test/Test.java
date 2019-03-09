package company.lesson6.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
  public static void main(String[] args) {
    int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
    int numb = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int element : ar
    ) {
      if (map.containsKey(element)) {
        map.put(element, map.get(element) + 1);
      } else {
        map.put(element, 1);
      }
    }
    Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
    while (iter.hasNext()) {
      numb += iter.next().getValue() / 2;
    }
    System.out.println("Number = " + numb);
  }
}
