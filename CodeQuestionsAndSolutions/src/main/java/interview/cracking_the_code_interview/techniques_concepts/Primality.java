package interview.cracking_the_code_interview.techniques_concepts;

import java.util.Scanner;

/**
 * A prime is a natural number greater than  that has no positive divisors other than  and itself. Given  integers, determine the primality of each integer and print whether it is Prime or Not prime on a new line.
 * <p>
 * Note: If possible, try to come up with an  primality algorithm, or see what sort of optimizations you can come up with for an  algorithm. Be sure to check out the Editorial after submitting your code!
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the number of integers to check for primality.
 * Each of the  subsequent lines contains an integer, , you must test for primality.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * For each integer, print whether  is Prime or Not prime on a new line.
 * <p>
 * Sample Input
 * <p>
 * 3
 * 12
 * 5
 * 7
 * Sample Output
 * <p>
 * Not prime
 * Prime
 * Prime
 * Explanation
 * <p>
 * We check the following  integers for primality:
 * <p>
 * is divisible by numbers other than  and itself (i.e.: , , ), so we print Not prime on a new line.
 * is only divisible  and itself, so we print Prime on a new line.
 * is only divisible  and itself, so we print Prime on a new line.
 */
public class Primality {

    static boolean ifNumberIsPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ifNumberIsPrime(array[i]) ? "Prime" : "Not prime");
        }
    }
}
