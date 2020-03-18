package interview.solutions.sort;

//Merge sort
public class Merge {
    static int[] sortMerge(int[] array) {
        mergeSort(array);
        return array;
    }

    static void mergeSort(int[] array) {
        if (array.length > 1) {
            // create left & right arrays
            int[] left = leftArray(array);
            int[] right = rightArray(array);

            // call recursion to divide arrays
            mergeSort(left);
            mergeSort(right);

            // merge and sort arrays
            mergeArrays(array, left, right);
        }
    }

    // creating a new left array
    static int[] leftArray(int[] array) {
        int size = array.length / 2;
        int[] newArray = new int[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    // creating a new right array
    static int[] rightArray(int[] array) {
        int size = array.length - (array.length / 2);
        int[] newArray = new int[size];
        System.arraycopy(array, array.length / 2, newArray, 0, size);
        return newArray;
    }

    // sorting and merging arrays
    static void mergeArrays(int[] result, int[] left, int[] right) {
        int iLeft = 0;
        int iRight = 0;
        for (int i = 0; i < result.length; i++) {
            if (iRight >= right.length ||
                    (iLeft < left.length && left[iLeft] <= right[iRight])) {
                result[i] = left[iLeft];
                iLeft++;
            } else {
                result[i] = right[iRight];
                iRight++;
            }
        }
    }
}