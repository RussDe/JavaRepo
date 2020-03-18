package interview.cracking_the_code_interview.data_structure;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket2 {
    public static char[][] BRACKETS = {{'(', ')'}, {'{', '}'}, {'[', ']'}};

    public static boolean opened(char ch) {
        for (char[] array : BRACKETS) {
            if (ch == array[0]) {
                return true;
            }
        }
        return false;
    }

    public static boolean closedMatches(char ch, char stackPop) {
        for (char[] array : BRACKETS) {
            if (ch == array[1] && stackPop==array[0]){
                return true;
            }
        }
        return false;
    }

    public static boolean isBalanced(String string) {
        Stack<Character> stack = new Stack<>();
        if (string.length() < 1) {
            return false;
        }
        for (char ch : string.toCharArray()) {
            if (opened(ch)) {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && closedMatches(ch, stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //passed all test cases!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberStrings = sc.nextInt();
        for (int i = 1; i <= numberStrings; i++) {
            String string = sc.next();
            System.out.println((isBalanced(string)) ? "YES" : "NO");
        }
    }
}