package interview.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Given a string, find out the lexicographically smallest and largest substring of length .
 * <p>
 * [Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]
 * <p>
 * Input Format
 * <p>
 * First line will consist a string containing english alphabets which has at most  characters. 2nd line will consist an integer .
 * <p>
 * Output Format
 * <p>
 * In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.
 * <p>
 * Sample Input
 * <p>
 * welcometojava
 * 3
 * Sample Output
 * <p>
 * ava
 * wel
 * Explanation
 * <p>
 * Here is the list of all substrings of length :
 * <p>
 * wel
 * elc
 * lco
 * com
 * ome
 * met
 * eto
 * toj
 * oja
 * jav
 * ava
 * Among them ava is the smallest and wel is the largest.
 */
public class JavaStringCompare {

    static void compare(String string, int size) {
        if (string.length() == size) {
            System.out.println(string);
            System.out.println(string);
        } else {
            List<String> subs = new ArrayList<>();
            for (int i = 0; i <= string.length() - size; i++) {
                subs.add(string.substring(i, i + size));
            }
            Collections.sort(subs);
            System.out.println(subs.get(0));
            System.out.println(subs.get(subs.size()-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int size = sc.nextInt();
        compare(string, size);
    }
}

/*
public class JavaStringCompare {

    static void compare(String string, int size) {
        if (string.length() == size) {
            System.out.println(string);
            System.out.println(string);
        } else {

            List<String> subs = new ArrayList<>();
            for (int i = 0; i <= string.length() - size; i++) {
                subs.add(string.substring(i, i + size));
            }

            String min;
            String max;
            if (subs.get(0).compareTo(subs.get(1)) > 0) {
                max = subs.get(0);
                min = subs.get(1);
            } else {
                max = subs.get(1);
                min = subs.get(0);
            }
            for (int i = 2; i < subs.size(); i++) {
                if (subs.get(i).compareTo(max) > 0)
                    max = subs.get(i);
                if (subs.get(i).compareTo(min) < 0)
                    min = subs.get(i);
            }
            System.out.println(min);
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int size = sc.nextInt();
        compare(string, size);
    }
}
 */