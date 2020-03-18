package interview.solutions;

import java.util.HashMap;
import java.util.Map;

public class SumTwoNumbers {
    public static void main(String[] args) {
        int[] array = new int[]{2, 45, 7, 5, 5, 9, 3, 5, 1, 8, 9};
        int sum = 10;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                System.out.println(array[i] + "," + map.get(array[i]));
            } else map.put(sum - array[i], array[i]);
        }
    }
}
