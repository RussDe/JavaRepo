package interview.solutions;

import java.util.Scanner;

/**
 * This exercise is to test your understanding of Java Strings. A sample String declaration:
 * <p>
 * String myString = "Hello World!"
 * The elements of a String are called characters. The number of characters in a String is called the length,
 * and it can be retrieved with the String.length() method.
 * <p>
 * Given two strings of lowercase English letters,  and , perform the following operations:
 * <p>
 * Sum the lengths of  and .
 * Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
 * Capitalize the first letter in  and  and print them on a single line, separated by a space.
 * Input Format
 * <p>
 * The first line contains a string . The second line contains another string . The strings are comprised of only
 * lowercase English letters.
 * <p>
 * Output Format
 * <p>
 * There are three lines of Output:
 * For the first line, sum the lengths of  and .
 * For the second line, write Yes if  is lexicographically larger than  or No if it is not.
 * For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
 * <p>
 * Sample Input
 * <p>
 * hello
 * java
 * Sample Output
 * <p>
 * 9
 * No
 * Hello Java
 * Explanation
 * <p>
 * String  is "hello" and  is "java".
 * <p>
 * has a length of , and  has a length of ; the sum of their lengths is .
 * When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore,  is not larger than  and the answer is No.
 * <p>
 * When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java"..
 */
public class JavaStringsIntroduction {

    static void compare(String str1, String str2) {
        System.out.println((str1 + str2).length());
        System.out.println(str1.compareToIgnoreCase(str2)>0 ? "Yes" : "No");
        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+" "+str2.substring(0,1).toUpperCase()+str2.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        compare(str1, str2);
    }
}
