package interview.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/**
 * 10. Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function two_sum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2.
 */
public class Find_two_numbers {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 15, 20, 25, 45, 50};
        Random rand = new Random();
        int minimum = 0;
        int maximum = 50;
        int randomNum = minimum + rand.nextInt((maximum - minimum) + 1);

        //int randomNum = 11;
        System.out.print(randomNum + " => ");

        for (int number : twoSum(myArray, randomNum))
            System.out.printf(" %d ", number);
        twoSum(myArray, randomNum);
    }

    public static int[] twoSum(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int index = map.get(array[i]);
                result[0] = index + 1;
                result[1] = i + 1;
                break;
            } else {
                map.put(target - array[i], i);
            }
        }
        return result;
    }

    // not sure if correctly works, needed to check
    public static void findTwoSum(int[] Array, int number) {
        Arrays.sort(Array);
        int start = 0;
        int end = Array.length - 1;
        boolean found = false;
        while (!found && start < end) {
            if (Array[start] + Array[end] == number)
                found = true;
            else if (Array[start] + Array[end] > number)
                end--;
        }
        System.out.println(start + " " + end);
    }
}