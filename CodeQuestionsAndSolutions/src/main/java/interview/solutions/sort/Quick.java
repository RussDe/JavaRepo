package interview.solutions.sort;

import java.util.Random;

// Quick sort
public class Quick {

    public static int[] sortQuick(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    static void quickSort(int[] array, int left, int right) {
        int index = partition(array, left, right);
        if (left < index-1)
            quickSort(array, left, index-1);
        if (index < right)
            quickSort(array, index, right);
    }

    static int partition(int[] array, int left, int right) {
        //int pivot = array[(left + right) / 2];
        Random rand = new Random();
        int pivot = array[left + rand.nextInt(right - left)];

        while (left <= right) {
            while (array[left] < pivot)
                left++;
            while (pivot < array[right])
                right--;
            if (left <= right) {
                Sort.swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
}


