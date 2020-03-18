package interview.cracking_the_code_interview.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * In an array, , the elements at indices  and  (where ) form an inversion if . In other words, inverted elements  and  are considered to be "out of order". To correct an inversion, we can swap adjacent elements.
 * <p>
 * For example, consider . It has two inversions:  and . To sort the array, we must perform the following two swaps to correct the inversions:
 * <p>
 * Given  datasets, print the number of inversions that must be swapped to sort each dataset on a new line.
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the number of datasets.
 * The  subsequent lines describe each respective dataset over two lines:
 * <p>
 * The first line contains an integer, , denoting the number of elements in the dataset.
 * The second line contains  space-separated integers describing the respective values of .
 * Constraints
 * <p>
 * Output Format
 * <p>
 * For each of the  datasets, print the number of inversions that must be swapped to sort the dataset on a new line.
 * <p>
 * Sample Input
 * <p>
 * 2
 * 5
 * 1 1 1 2 2
 * 5
 * 2 1 3 1 2
 * Sample Output
 * <p>
 * 0
 * 4
 * Explanation
 * <p>
 * We sort the following  datasets:
 * <p>
 * is already sorted, so there are no inversions for us to correct. Thus, we print  on a new line.
 * <p>
 * As we performed a total of  swaps to correct inversions, we print  on a new line.
 */


public class MergeSortCountingInversions {
    public static long countInversions(int[] a) {
        int n = a.length;

        // Base Case
        if (n <= 1) {
            return 0;
        }

        // Recursive Case
        int mid = n/2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);
        long inversions = countInversions(left) + countInversions(right);

        int range = n - mid;
        int iLeft = 0;
        int iRight = 0;
        for (int i = 0; i < n; i++) {
            if (
                    iLeft < mid
                            && (
                            iRight >= range || left[iLeft] <= right[iRight]
                    )
                    ) {
                a[i] = left[iLeft++];
                inversions += iRight;
            } else if (iRight < range) {
                a[i] = right[iRight++];
            }
        }

        return inversions;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            System.out.println(countInversions(a));
        }

        scanner.close();
    }
}
/*    private static long countInversions(int[] arr) {
        int[] aux = arr.clone();
        return countInversions(arr, 0, arr.length - 1, aux);
    }

    private static long countInversions(int[] arr, int lo, int hi, int[] aux) {
        if (lo >= hi) return 0;

        int mid = lo + (hi - lo) / 2;

        long count = 0;
        count += countInversions(aux, lo, mid, arr);
        count += countInversions(aux, mid + 1, hi, arr);
        count += merge(arr, lo, mid, hi, aux);

        return count;
    }

    private static long merge(int[] arr, int lo, int mid, int hi, int[] aux) {
        long count = 0;
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid || j <= hi) {
            if (i > mid) {
                arr[k++] = aux[j++];
            } else if (j > hi) {
                arr[k++] = aux[i++];
            } else if (aux[i] <= aux[j]) {
                arr[k++] = aux[i++];
            } else {
                arr[k++] = aux[j++];
                count += mid + 1 - i;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
        }
    }
}
*/

/*public class MergeSortCountingInversions {
    public static long countInversions(int[] array) {
        long counter = 0;
        int iteration = 1;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            int start = 0;
            for (int i = start; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    swap(array, i, i + 1);
                    counter++;
                    sorted = false;
                }
            }
        }
        return counter;
    }

    public static void swap(int[] array, int item1, int item2) {
        int temp = array[item1];
        array[item1] = array[item2];
        array[item2] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            int n = scanner.nextInt();
            int array[] = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
            }
            System.out.println(countInversions(array));
        }
    }
}
*/
