package interview.cracking_the_code_interview.data_structure;

import java.util.Scanner;

/*Alice is taking a cryptography class and finding anagrams to be very useful. We consider two TagContentExtractor to be anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both TagContentExtractor must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

        Alice decides on an encryption scheme involving two large TagContentExtractor where encryption is dependent on the minimum number of character deletions required to make the two TagContentExtractor anagrams. Can you help her find this number?

        Given two TagContentExtractor,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the TagContentExtractor.

        This challenge is also available in the following translations:

        Chinese
        Russian
        Input Format

        The first line contains a single string, .
        The second line contains a single string, .

        Constraints


        It is guaranteed that  and  consist of lowercase English alphabetic letters (i.e.,  through ).
        Output Format

        Print a single integer denoting the number of characters you must delete to make the two TagContentExtractor anagrams of each other.

        Sample Input

        cde
        abc
        Sample Output

        4
        Explanation

        We delete the following characters from our two TagContentExtractor to turn them into anagrams of each other:

        Remove d and e from cde to get c.
        Remove a and b from abc to get c.
        We must delete  characters to make both TagContentExtractor anagrams, so we print  on a new line.*/

public class MakingAnagrams {

    public static int numberNeeded(String first, String second) {
        int counter[] = new int[26];
        char arrayFirst[] = first.toLowerCase().toCharArray();
        char arraySecond[] = second.toLowerCase().toCharArray();
        for (int i = 0; i < arrayFirst.length; i++) {
            counter[(arrayFirst[i] - 97)]++;
        }
        for (int i = 0; i < arraySecond.length; i++) {
            counter[(arraySecond[i] - 97)]--;
        }
        int total = 0;
        for (int i : counter) {
            total += Math.abs(i);
        }
        return total;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.next();
        String second = in.next();
        System.out.println(numberNeeded(first, second));
    }
}