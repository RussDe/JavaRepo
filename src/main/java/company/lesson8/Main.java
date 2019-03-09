package company.lesson8;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Comparator<String> comparator = ((o1, o2) -> (o1 == null || o2 == null) ? 1 : o1.compareTo(o2));

    Map<String, Student> maps = new TreeMap<>(comparator);
    maps.put(null, new Student("lastname", 1));
    maps.put("First", new Student("lastname", 1));
    maps.put("Second", new Student("lastname", 1));
    System.out.println(maps.size());
  }
}
