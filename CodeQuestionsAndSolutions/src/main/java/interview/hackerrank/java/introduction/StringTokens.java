package interview.hackerrank.java.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
 * <p>
 * Input Format
 * <p>
 * A single string, .
 * <p>
 * Constraints
 * <p>
 * is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
 * Output Format
 * <p>
 * On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .
 * <p>
 * Sample Input
 * <p>
 * He is a very very good boy, isn't he?
 * Sample Output
 * <p>
 * 10
 * He
 * is
 * a
 * very
 * very
 * good
 * boy
 * isn
 * t
 * he
 * Explanation
 * <p>
 * We consider a token to be a contiguous segment of alphabetic characters. There are a total of  such tokens in string , and each token is printed in the same order in which it appears in string .
 */
public class StringTokens {

    private static void showTokens(String string) {
        List<String> listString = new ArrayList<>();
        String[] list = string.split("[\\s,!?._'@]");
        for (String item : list) {
            if (item != null && item.length() > 0)
                listString.add(item);
        }
        System.out.println(listString.size());
        for (String item : listString) {
            if (item != null && item.length() > 0)
                System.out.println(item);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        showTokens(s);
        scan.close();
    }
}
