package interview.solutions;

import java.util.HashMap;

/**
 * Find from a list of numbers where each number is repeating even number of times except one. Find that number ?
 */
public class OddNumber {

    public static int returnNumber() {
        int[] array = new int[]{0, 1, 2, 3, 4, 0, 3, 2, 4, 4, 4};
        int number = 1000;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key)%2 != 0) {
                number = key;
            }
        }
        return number;
    }

    public static int returnOddNumber() {

        int[] array = new int[]{0, 1, 2, 3, 4, 0, 3, 2, 4, 4, 4};
        int no = array[0];
        for (int i = 1; i < array.length; i++) {
            no = no ^ array[i];
        }
        return no;
    }
}
