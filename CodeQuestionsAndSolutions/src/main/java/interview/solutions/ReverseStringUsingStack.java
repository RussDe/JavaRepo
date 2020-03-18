package interview.solutions;

import java.util.Scanner;
import java.util.Stack;

/**
 * Reverse a string using a stack
 */
public class ReverseStringUsingStack {
    String reverse(String string) {
        Stack<Character> myStack = new Stack<>();
        for (Character each: string.toCharArray()){
            myStack.push(each);
        }
        StringBuilder sb = new StringBuilder();
        while (!myStack.isEmpty()){
            sb.append(myStack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        ReverseStringUsingStack rev = new ReverseStringUsingStack();
        System.out.print(rev.reverse(string));

    }
}
