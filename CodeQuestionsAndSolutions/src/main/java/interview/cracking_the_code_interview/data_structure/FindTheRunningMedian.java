package interview.cracking_the_code_interview.data_structure;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * The median of a set of integers is the midpoint value of the data set for which an equal number of integers are less than and greater than the value. To find the median, you must first sort your set of integers in non-decreasing order, then:
 * <p>
 * If your set contains an odd number of elements, the median is the middle element of the sorted sample. In the sorted set ,  is the median.
 * If your set contains an even number of elements, the median is the average of the two middle elements of the sorted sample. In the sorted set ,  is the median.
 * Given an input stream of  integers, you must perform the following task for each  integer:
 * <p>
 * Add the  integer to a running list of integers.
 * Find the median of the updated list (i.e., for the first element through the  element).
 * Print the list's updated median on a new line. The printed value must be a double-precision number scaled to decimal place (i.e.,  format).
 * Input Format
 * <p>
 * The first line contains a single integer, , denoting the number of integers in the data stream.
 * Each line  of the  subsequent lines contains an integer, , to be added to your list.
 * <p>
 * Constraints
 * <p>
 * <p>
 * <p>
 * Output Format
 * <p>
 * After each new integer is added to the list, print the list's updated median on a new line as a single double-precision number scaled to  decimal place (i.e.,  format).
 * <p>
 * Sample Input
 * <p>
 * 6
 * 12
 * 4
 * 5
 * 3
 * 8
 * 7
 * Sample Output
 * <p>
 * 12.0
 * 8.0
 * 5.0
 * 4.5
 * 5.0
 * 6.0
 * Explanation
 * <p>
 * There are  integers, so we must print the new median on a new line as each integer is added to the list:
 */
public class FindTheRunningMedian {

    static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if (lowers.size() == 0 || number < lowers.peek()) {
            lowers.add(number);
        } else {
            highers.add(number);
        }
    }

    static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap = new PriorityQueue<>();
        PriorityQueue<Integer> smallerHeap = new PriorityQueue<>();
        if (lowers.size() > highers.size()) {
            biggerHeap = lowers;
            smallerHeap = highers;
        } else {
            biggerHeap = highers;
            smallerHeap = lowers;
        }
        if (biggerHeap.size() - smallerHeap.size() >= 2) {
            smallerHeap.add(biggerHeap.poll());
        }
    }

    static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap = new PriorityQueue<>();
        PriorityQueue<Integer> smallerHeap = new PriorityQueue<>();
        if (lowers.size() > highers.size()) {
            biggerHeap = lowers;
            smallerHeap = highers;
        } else {
            biggerHeap = highers;
            smallerHeap = lowers;
        }
        if (biggerHeap.size() == smallerHeap.size()) {
            return ((double)biggerHeap.peek() + smallerHeap.peek()) / 2;
        } else {
            return (biggerHeap.peek());
        }
    }

    static double[] getMedians(int[] array) {
        PriorityQueue<Integer> highers = new PriorityQueue<>();
        PriorityQueue<Integer> lowers = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return -1 * a.compareTo(b);
            }
        });
        double[] medians = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            addNumber(number, lowers, highers);
            rebalance(lowers, highers);
            medians[i] = getMedian(lowers, highers);
        }
        return medians;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int array[] = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        double [] medians = getMedians(array);
        for (double median: medians) {
            System.out.println(median);
        }
    }
}
