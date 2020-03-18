package interview.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountChars {

    void counterChars(String string) {
        char[] charString = string.toCharArray();
        int counter;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charString.length; i++) {
            if (map.containsKey(charString[i])) {
                counter = map.get(charString[i]);
                map.put(charString[i], ++counter);
            } else {
                map.put(charString[i], 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }

    boolean counterCharsAsSet(String string) {
        char[] charString = string.toCharArray();
        int counter;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < charString.length; i++) {
            if (set.contains(charString[i])) {
                return true;
            } else {
                set.add(charString[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String string = "Hello world";
        CountChars cc = new CountChars();
        cc.counterChars(string);
        System.out.println(String.valueOf(cc.counterCharsAsSet(string)));
    }
}