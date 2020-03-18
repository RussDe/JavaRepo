package interview.solutions;

import java.util.HashMap;
import java.util.Map;

public class LetterFrequency {
    private char ch;
    private int n;

    static LetterFrequency[] frequency(String str) {
        Map<Character, Integer> table = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (table.containsKey(str.charAt(i))) {
                table.put(str.charAt(i), table.get(str.charAt(i)) + 1);
            } else {
                table.put(str.charAt(i), 1);
            }
        }
        LetterFrequency[] result = new LetterFrequency[table.size()];
        int i = 0;
        for (Map.Entry<Character, Integer> entry : table.entrySet()) {
            result[i] = new LetterFrequency();
            result[i].ch = entry.getKey();
            result[i].n = entry.getValue();
            i++;
        }
        return result;
    }

    public String toString() {
        return "{ch = " + this.ch + ", n = " + this.n + "}";
    }
}
