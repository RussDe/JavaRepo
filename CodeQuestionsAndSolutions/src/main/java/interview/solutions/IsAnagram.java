package interview.solutions;

import java.util.HashMap;
import java.util.Map;

/*
Write a method that takes in two strings. If one is an anagram of the other, return true.
Otherwise return false.
 */
public class IsAnagram {
    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            } else {
                map.put(str1.charAt(i), 1);
            }
            if (map.containsKey(str2.charAt(i))) {
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            } else {
                map.put(str2.charAt(i), -1);
            }
        }
        int sum = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        return sum == 0;
    }
}
