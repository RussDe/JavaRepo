package interview.hackerrank.java.data_structures;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/java-stack?h_r=next-challenge&h_v=zen
 * In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added.(Wikipedia)
 * A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.
 * <p>
 * Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
 * <p>
 * Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
 * <p>
 * Given a string, determine if it is balanced or not.
 * <p>
 * Input Format
 * <p>
 * There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.
 * <p>
 * The part of the code that handles input operation is already provided in the editor.
 * <p>
 * Output Format
 * <p>
 * For each case, print 'true' if the string is balanced, 'false' otherwise.
 * <p>
 * Sample Input
 * <p>
 * {}()
 * ({()})
 * {}(
 * []
 * Sample Output
 * <p>
 * true
 * true
 * false
 * true
 */
public class JavaStack {
    static char[][] brackets = new char[][]{
            {'[', ']'},
            {'{', '}'},
            {'(', ')'}
    };

    static boolean isClosed(Character letter) {
        return (letter == brackets[0][1] || letter == brackets[1][1] || letter == brackets[2][1]);
    }

    static boolean isPaired(Character first, Character second) {
        return (brackets[0][0] == first && brackets[0][1] == second
                || brackets[1][0] == first && brackets[1][1] == second
                || brackets[2][0] == first && brackets[2][1] == second);
    }

    static boolean isBalanced(String string) {
        char[] charArray = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char each : charArray) {
            if (!isClosed(each))
                stack.push(each);
            else {
                if (!stack.isEmpty() && isPaired(stack.peek(), each))
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            System.out.println(isBalanced(string) ? "true" : "false");
        }
    }
}
