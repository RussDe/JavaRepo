package interview.hackerrank.java.data_structures;

import java.util.Scanner;

/**
 * We define the following:
 * <p>
 * A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
 * The sum of an array is the total sum of its elements.
 * An array's sum is negative if the total sum of its elements is negative.
 * An array's sum is positive if the total sum of its elements is positive.
 * Given an array of  integers, find and print its number of negative subarrays on a new line.
 * <p>
 * Input Format
 * <p>
 * The first line contains a single integer, , denoting the length of array .
 * The second line contains  space-separated integers describing each respective element, , in array .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the number of subarrays of  having negative sums.
 * <p>
 * Sample Input
 * <p>
 * 5
 * 1 -2 4 -5 1
 * Sample Output
 * <p>
 * 9
 * Explanation
 * <p>
 * There are nine negative subarrays of :
 */
public class JavaSubarray {

    static void findNumberNegativeSubarrays(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0)
                    counter++;
            }
        }
        System.out.print(counter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        findNumberNegativeSubarrays(array);
    }
}
