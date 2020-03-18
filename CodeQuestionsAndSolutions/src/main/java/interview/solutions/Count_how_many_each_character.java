package interview.solutions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 4. count how many times each character appears in string
 */
public class Count_how_many_each_character {
    private abstract class HashEntry implements Map.Entry<Character, Integer> {
        @Override
        public String toString() {
            return getKey() + ":" + getValue();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Input your string: ");
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine().toLowerCase();
        char[] myChar = myString.toCharArray();

        //Using Array
        int[] myNumber = new int[255];
        for (char aMyChar : myChar) {
            myNumber[aMyChar]++;
        }
        for (int i = 0; i < 255; i++) {
            if (myNumber[i] > 0)
                System.out.printf("%c = %d time(s)\n", (char) i, myNumber[i]);
        }

        //Using HashMap
        Map<Character, Integer> myMap = new HashMap<>();
        for (char ch : myChar) {
            if (myMap.containsKey(ch)) {
                int number = myMap.get(ch);
                myMap.put(ch, number + 1);
            } else
                myMap.put(ch, 1);
        }

        System.out.println(myMap.toString());

    }
}
