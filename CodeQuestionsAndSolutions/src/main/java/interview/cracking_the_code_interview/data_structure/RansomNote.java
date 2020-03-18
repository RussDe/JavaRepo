package interview.cracking_the_code_interview.data_structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * A kidnapper wrote a ransom note but is worried it will be traced back to him. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use whole words available in the magazine, meaning he cannot use substrings or concatenation to create the words he needs.
 * <p>
 * Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
 * <p>
 * Input Format
 * <p>
 * The first line contains two space-separated integers describing the respective values of  (the number of words in the magazine) and  (the number of words in the ransom note).
 * The second line contains  space-separated TagContentExtractor denoting the words present in the magazine.
 * The third line contains  space-separated TagContentExtractor denoting the words present in the ransom note.
 * <p>
 * Constraints
 * <p>
 * <p>
 * .
 * Each word consists of English alphabetic letters (i.e.,  to  and  to ).
 * The words in the note and magazine are case-sensitive.
 * Output Format
 * <p>
 * Print Yes if he can use the magazine to create an untraceable replica of his ransom note; otherwise, print No.
 * <p>
 * Sample Input
 * <p>
 * 6 4
 * give me one grand today night
 * give one grand today
 * Sample Output
 * <p>
 * Yes
 * Explanation
 * <p>
 * All four words needed to write an untraceable replica of the ransom note are present in the magazine, so we print Yes as our answer.
 */
public class RansomNote {

    public static boolean checkWords(String magazine[], String ransom[]) {
        if (ransom.length > magazine.length)
            return false;
        Map<String, Integer> map = new HashMap<>();
        //setting up the Map for magazine
        for (int i = 0; i < magazine.length; i++) {
            if (map.containsKey(magazine[i]))
                map.put(magazine[i], map.get(magazine[i]) + 1);
            else
                map.put(magazine[i], 1);
        }
        //checking if note words matches magazine's
        for (int i = 0; i < ransom.length; i++) {
            if (map.containsKey(ransom[i]))
                map.put(ransom[i], map.get(ransom[i]) - 1);
            else
                map.put(ransom[i], -1);
        }

/*        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() < 0)
                return false;
            else
                return true;
        }*/


        for (Integer wordCount : map.values()) {
            if (wordCount < 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int magazineNumber = in.nextInt();
        int noteNumber = in.nextInt();
        String magazine[] = new String[magazineNumber];
        for (int magazine_i = 0; magazine_i < magazineNumber; magazine_i++) {
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[noteNumber];
        for (int ransom_i = 0; ransom_i < noteNumber; ransom_i++) {
            ransom[ransom_i] = in.next();
        }

        System.out.print(checkWords(magazine, ransom) ? "Yes" : "No");
    }
}
