package interview.cracking_the_code_interview.algorithm;

import java.util.Scanner;

/**
 * Consider the following version of Bubble Sort:
 * <p>
 * for (int i = 0; i < n; i++) {
 * // Track number of elements swapped during a single array traversal
 * int numberOfSwaps = 0;
 * <p>
 * for (int j = 0; j < n - 1; j++) {
 * // Swap adjacent elements if they are in decreasing order
 * if (a[j] > a[j + 1]) {
 * swap(a[j], a[j + 1]);
 * numberOfSwaps++;
 * }
 * }
 * <p>
 * // If no elements were swapped during a traversal, array is sorted
 * if (numberOfSwaps == 0) {
 * break;
 * }
 * }
 * Task
 * Given an -element array, , of distinct elements, sort array  in ascending order using the Bubble Sort algorithm above. Once sorted, print the following three lines:
 * <p>
 * Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
 * First Element: firstElement, where  is the first element in the sorted array.
 * Last Element: lastElement, where  is the last element in the sorted array.
 * Hint: To complete this challenge, you must add a variable that keeps a running tally of all swaps that occur during execution.
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the number of elements in array .
 * The second line contains  space-separated integers describing the respective values of .
 * <p>
 * Constraints
 * <p>
 * ,
 * Output Format
 * <p>
 * You must print the following three lines of Output:
 * <p>
 * Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
 * First Element: firstElement, where  is the first element in the sorted array.
 * Last Element: lastElement, where  is the last element in the sorted array.
 * Sample Input 0
 * <p>
 * 3
 * 1 2 3
 * Sample Output 0
 * <p>
 * Array is sorted in 0 swaps.
 * First Element: 1
 * Last Element: 3
 * Explanation 0
 * The array is already sorted, so  swaps take place and we print the necessary three lines of Output shown above.
 * <p>
 * Sample Input 1
 * <p>
 * 3
 * 3 2 1
 * Sample Output 1
 * <p>
 * Array is sorted in 3 swaps.
 * First Element: 1
 * Last Element: 3
 * Explanation 1
 * The array is not sorted, and its initial values are: . The following  swaps take place:
 * <p>
 * At this point the array is sorted and we print the necessary three lines of Output shown above.
 */
public class BubbleSort {

    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private static void bubleSort(int[] array) {
        int swapCounter = 0;
        int lastItem = array.length - 1;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < lastItem; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapCounter++;
                    sorted = false;
                }
            }
            lastItem--;
        }
        System.out.printf("Array is sorted in %d swap(s).\n", swapCounter);
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[array.length - 1]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        bubleSort(array);
    }
}
