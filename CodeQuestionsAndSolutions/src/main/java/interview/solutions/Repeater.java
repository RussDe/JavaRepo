package interview.solutions;

import java.util.HashMap;
import java.util.Map;

public class Repeater {
    private static void repeatedNumber(int[] array) {
        int number = 0;
        boolean found = false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                number = array[i];
                found = true;
                i = array.length;
            } else {
                map.put(array[i], 1);
            }
        }
        if (found) {
            System.out.println("Found repeated number: " + number);
        } else {
            System.out.println("Repeated number not found!");
        }
    }

    public static void main(String[] args) {
        int array[] = new int[]{1, 4, 8, 2, 2, 4, 12, 8, 1};
        repeatedNumber(array);
    }
}
