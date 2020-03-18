package interview.solutions;

import java.util.HashMap;
import java.util.Map;

public class WordAnagram {

    private static boolean isAnagram(String first, String second) {
        char firstWord[] = first.toLowerCase().toCharArray();
        char secondWord[] = second.toLowerCase().toCharArray();
        if (firstWord.length != secondWord.length)
            return false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : firstWord) {
            int count = 1;
            if (map.containsKey(c)) {
                count = map.get(c) + 1;
            }
            map.put(c, count);
        }
        for (char c : secondWord) {
            int count = -1;
            if (map.containsKey(c)) {
                count = map.get(c) - 1;
            }
            map.put(c, count);
        }
        for (char c : map.keySet()) {
            if (map.get(c) != 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String first = "Mary";
        String second = "Army";
        if (isAnagram(first, second))
            System.out.println("yes!");
        else System.out.println("No!");
    }
}
