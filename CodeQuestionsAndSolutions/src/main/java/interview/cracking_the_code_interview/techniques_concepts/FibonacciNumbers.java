package interview.cracking_the_code_interview.techniques_concepts;

import java.util.Scanner;

/**
 * The Fibonacci Sequence
 * The Fibonacci sequence begins with  and  as its respective first and second terms. After these first two elements, each subsequent element is equal to the sum of the previous two elements.
 * <p>
 * Here is the basic information you need to calculate :
 * <p>
 * Task
 * Given , complete the fibonacci function so it returns .
 * <p>
 * Input Format
 * <p>
 * Locked stub code in the editor reads a single integer denoting the value of  and passes it to the fibonacci function.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Locked stub code in the editor prints the value of  returned by the fibonacci function.
 * <p>
 * Sample Input
 * <p>
 * 3
 * Sample Output
 * <p>
 * 2
 * Explanation
 * <p>
 * Consider the Fibonacci sequence:
 * ...
 * <p>
 * We want to know the value of . If we look at the sequence above,  evaluates to . Thus, we print  as our answer.
 */

public class FibonacciNumbers {

// using dynamic approach
    public static int fibonacchiNumber(int number) {
        int[] array = new int[number+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i ++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[array.length-1];

        //return fibonacchiNumber(number - 1) + fibonacchiNumber(number - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print(fibonacchiNumber(number));
    }
}

//using recursion
//    public static int fibonacchiNumber(int number) {
//        if (number == 0 || number == 1) {
//            return number;
//        }
//        return fibonacchiNumber(number - 1) + fibonacchiNumber(number - 2);
//    }
//
//    public static void main(String[] args) {
//        Scanner scaner = new Scanner(System.in);
//        int number = scaner.nextInt();
//        System.out.print(fibonacchiNumber(number));
//    }
//}
