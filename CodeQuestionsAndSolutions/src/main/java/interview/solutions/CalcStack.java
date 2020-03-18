package interview.solutions;

import java.util.Scanner;
import java.util.Stack;

/**
 * calc implementation of stack
 */
public class CalcStack {
    static final char[] operator = {'+', '-', '*', '/'};

    static String code(String string) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (Character letter : string.toCharArray()) {
            for (Character each : operator) {
                if (letter == each) {

                } else {
                    sb.append(each);
                }
            }
        }


        return sb.toString();
    }

    static String uncode(String string) {
        return "";
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();
        String codedExpr = code(expression);
        System.out.print(codedExpr);
        System.out.print(uncode(codedExpr));

    }
}
