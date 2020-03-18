package interview.hackerrank.java.data_structures;

import java.util.Scanner;

/**
 * You are given a  2D array. An hourglass in an array is a portion shaped like this:
 * <p>
 * a b c
 * d
 * e f g
 * For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
 * <p>
 * 1 1 1     1 1 0     1 0 0
 * 1         0         0
 * 1 1 1     1 1 0     1 0 0
 * The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
 * <p>
 * In this problem you have to print the largest sum among all the hourglasses in the array.
 * <p>
 * Input Format
 * <p>
 * There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.
 * <p>
 * Output Format
 * <p>
 * Print the answer to this problem on a single line.
 * <p>
 * Sample Input
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * Sample Output
 * <p>
 * 19
 * Explanation
 * <p>
 * The hourglass which has the largest sum is:
 * <p>
 * 2 4 4
 * 2
 * 1 2 4
 */
public class Java2DArray {

    static void findHourglassLargeSum(int[][] array) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 0; j < array.length - 2; j++) {
                sum = array[i][j] + array[i][j + 1] + array[i][j + 2] +
                        array[i + 1][j + 1] +
                        array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                if (sum > max)
                    max = sum;
            }
        }
        System.out.print(max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        findHourglassLargeSum(array);
    }
}
