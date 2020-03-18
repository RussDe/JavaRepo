package interview.cracking_the_code_interview.data_structure;

import java.util.Scanner;

/**
 * A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
 * <p>
 * Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().
 * <p>
 * A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].
 * <p>
 * By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:
 * <p>
 * It contains no unmatched brackets.
 * The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
 * Given  TagContentExtractor of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, print YES on a new line; otherwise, print NO on a new line.
 * <p>
 * Input Format
 * <p>
 * The first line contains a single integer, , denoting the number of TagContentExtractor.
 * Each line  of the  subsequent lines consists of a single string, , denoting a sequence of brackets.
 * <p>
 * Constraints
 * <p>
 * <p>
 * , where  is the length of the sequence.
 * Each character in the sequence will be a bracket (i.e., {, }, (, ), [, and ]).
 * Output Format
 * <p>
 * For each string, print whether or not the string of brackets is balanced on a new line. If the brackets are balanced, print YES; otherwise, print NO.
 * <p>
 * Sample Input
 * <p>
 * 3
 * {[()]}
 * {[(])}
 * {{[[(())]]}}
 * Sample Output
 * <p>
 * YES
 * NO
 * YES
 * Explanation
 * <p>
 * The string {[()]} meets both criteria for being a balanced string, so we print YES on a new line.
 * The string {[(])} is not balanced, because the brackets enclosed by the matched pairs [(] and (]) are not balanced. Thus, we print NO on a new line.
 * The string {{[[(())]]}} meets both criteria for being a balanced string, so we print YES on a new line.
 */
public class BalancedBrackets {

    private static class Node {
        private char bracket;
        private Node next;

        private Node(char bracket) {
            this.bracket = bracket;
        }
    }

    static Node top;

    private static boolean isEmpty() {
        return top == null;
    }

    private static char peek() {
        return top.bracket;
    }

    private static void push(char bracket) {
        Node temp = new Node(bracket);
        temp.next = top;
        top = temp;
    }

    private static void pop() {
        top = top.next;
    }

    private static boolean isBalanced(String string) {
        if (string.length() < 1
                || (string.length() % 2 != 0)) {
            return false;
        }
        char bracket1opened = '(';
        char bracket1closed = ')';
        char bracket2opened = '[';
        char bracket2closed = ']';
        char bracket3opened = '{';
        char bracket3closed = '}';
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == bracket1opened
                    || string.charAt(i) == bracket2opened
                    || string.charAt(i) == bracket3opened) {
                push(string.charAt(i));
            } else {
                if (isEmpty()) {
                    return false;
                } else {
                    if ((peek() == bracket1opened) && (string.charAt(i) == bracket1closed)
                            || ((peek() == bracket2opened) && (string.charAt(i) == bracket2closed))
                            || ((peek() == bracket3opened) && (string.charAt(i) == bracket3closed))) {
                        pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return isEmpty();
    }

    //did not pass all test cases!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberStrings = sc.nextInt();
        for (int i = 1; i <= numberStrings; i++) {
            String string = sc.next();
            if (isBalanced(string)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
