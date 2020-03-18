package interview.hackerrank.java.data_structures;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-dequeue?h_r=next-challenge&h_v=zen
 * Created by rustem on 11/2/16.
 * In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).
 * <p>
 * Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:
 * <p>
 * Deque deque = new LinkedList<>();
 * or
 * Deque deque = new ArrayDeque<>();
 * You can find more details about Deque here.
 * <p>
 * In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .
 * <p>
 * Note: Time limit is  second for this problem.
 * <p>
 * Input Format
 * <p>
 * The first line of input contains two integers  and : representing the total number of integers and the size of the subarray, respectively. The next line contains  space separated integers.
 * <p>
 * Constraints
 * <p>
 * The numbers in the array will range between .
 * <p>
 * Output Format
 * <p>
 * Print the maximum number of unique integers among all possible contiguous subarrays of size .
 * <p>
 * Sample Input
 * <p>
 * 6 3
 * 5 3 5 2 3 2
 * Sample Output
 * <p>
 * 3
 * Explanation
 * <p>
 * In the sample testcase, there are 4 subarrays of contiguous numbers.
 * <p>
 * - Has  unique numbers.
 * <p>
 * - Has  unique numbers.
 * <p>
 * - Has  unique numbers.
 * <p>
 * - Has  unique numbers.
 * <p>
 * In these subarrays, there are  unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is .
 */
public class JavaDequeue {


    public static void main(String[] args) {
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int n = scanner.nextInt();
        int subarraySize = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            deque.add(num);
            set.add(num);
            if (deque.size() == subarraySize) {
                max = max >= set.size() ? max : set.size();
                int temp = (int) deque.getFirst();
                deque.removeFirst();
                if (!deque.contains(temp)) {
                    set.remove(temp);
                }

            }
        }
        System.out.println(max);
    }
}
