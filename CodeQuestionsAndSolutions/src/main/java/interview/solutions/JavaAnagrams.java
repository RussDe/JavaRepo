package interview.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Two strings  and  are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of  is .
 * <p>
 * Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not. The strings may consist at most  English characters; the comparison should NOT be case sensitive.
 * <p>
 * This exercise will verify that you can sort the characters of a string, or compare frequencies of characters.
 * <p>
 * Sample Input 0
 * <p>
 * anagram
 * margana
 * Sample Output 0
 * <p>
 * Anagrams
 * Sample Input 1
 * <p>
 * anagramm
 * marganaa
 * Sample Output 1:
 * <p>
 * Not Anagrams
 */
public class JavaAnagrams {

    static boolean checkIsAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i)))
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            else {
                map.put(str1.charAt(i), 1);
            }
            if (map.containsKey(str2.charAt(i)))
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            else {
                map.put(str2.charAt(i), -1);
            }
        }
        for (int each : map.values()) {
            if (each != 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(checkIsAnagram(str1, str2) ? "Anagrams" : "Not Anagrams");
    }
}
