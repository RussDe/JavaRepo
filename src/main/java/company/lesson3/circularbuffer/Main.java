package company.lesson3.circularbuffer;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int limit = 5;
    int startValue = 10;

    CircularBufferImpl<Integer> intBufferArray = new CircularBufferImpl<>(limit, Integer.class);
    CircularBufferImpl<String> stringBufferArray = new CircularBufferImpl<>(limit, Integer.class);
    String[] arrayTypeT2 = stringBufferArray.toArray();
    List<Integer> arrayTypeTList = intBufferArray.asList();
    List<Integer> listExample = new ArrayList<>(2);
  }
}
