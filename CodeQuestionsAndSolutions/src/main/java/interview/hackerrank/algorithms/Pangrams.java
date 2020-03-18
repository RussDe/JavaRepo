package interview.hackerrank.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence
 * "The quick brown fox jumps over the lazy dog" repeatedly,
 * because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)
 * <p>
 * After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.
 * <p>
 * Given a sentence , tell Roy if it is a pangram or not.
 * <p>
 * Input Format
 * <p>
 * Input consists of a string .
 * <p>
 * Constraints
 * Length of  can be at most   and it may contain spaces, lower case and upper case letters. Lower-case and upper-case instances of a letter are considered the same.
 * <p>
 * Output Format
 * <p>
 * Output a line containing pangram if  is a pangram, otherwise Output not pangram.
 * <p>
 * Sample Input
 * <p>
 * Input #1
 * <p>
 * We promptly judged antique ivory buckles for the next prize
 * Input #2
 * <p>
 * We promptly judged antique ivory buckles for the prize
 * Sample Output
 * <p>
 * Output #1
 * <p>
 * pangram
 * Output #2
 * <p>
 * not pangram
 * Explanation
 * <p>
 * In the first test case, the answer is pangram because the sentence contains all the letters of the English alphabet.
 */
public class Pangrams {

    public static String checkIfPangram(String string) {
        assert string.length() > 0;
        String answerYes = "pangram";
        String answerNo = "not pangram";
        if (string.length() < 26) {
            return answerNo;
        }
        char chars[] = string.toLowerCase().toCharArray();
        Map<Character, Integer> alphabet = new HashMap<>();
        for (Character letter : chars) {
            if (alphabet.containsKey(letter)) {
                alphabet.put(letter, alphabet.get(letter) + 1);
            } else {
                alphabet.put(letter, 1);
            }
        }
        if (alphabet.size() != 26)
            return answerNo;
        else
            return answerYes;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print Output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(checkIfPangram(string.replaceAll("[^A-Za-z]", "")));

    }
}
