package interview.solutions;//Given an array of positive numbers, find the maximum sum of a subsequence
// with the constraint that no 2 numbers in the sequence should be adjacent in the array.
// So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).
// Answer the question in most efficient way.

public class AdjacentSum {
    public static void main(String[] arg) {
        int[] array = {3, 2, 5, 10 ,7};
        printArray(array);
        if (array == null) {
            System.out.println("Your array is empty!");
        } else {
            switch (array.length) {
                case 1:
                    System.out.println(array[0]);
                    break;
                case 2:
                    System.out.println(Math.max(array[0], array[1]));
                    break;
                default:
                    int item0 = array[0];
                    int item1 = array[1];
                    int sum = array[2] + array[0];
                    for (int i = 3; i < array.length; i++) {
                        int temp = array[i] + Math.max(item0, item1);
                        item1 = item0;
                        item0 = sum;
                        sum = temp;
                    }
                    System.out.println(Math.max(sum, item0));
            }
        }
    }

    private static void  printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("\n");
    }
}