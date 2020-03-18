package interview.solutions;

/**
 * 1. Find out duplicate number between 1 to N numbers.s
 * You have got a range of numbers between 1 to N, where one of the number is
 * repeated. You need to write a program to find out the duplicate number.
 * - See more at: http://www.java2novice.com/java-interview-programs/duplicate-number/#sthash.iityOBAE.dpuf
 */
public class DuplicateNumber {
    public static void findDuplicate() {
        int[] array = new int[]{1, 2, 3, 9, 8, 5, 4, 3, 10};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Found duplicate = " + array[i]);
                }
            }
        }
    }
}
