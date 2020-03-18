package interview.hackerrank.java.data_structures;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-list?h_r=next-challenge&h_v=zen
 * For this problem, we have  types of queries you can perform on a List:
 * <p>
 * Insert  at index :
 * <p>
 * Insert
 * x y
 * Delete the element at index :
 * <p>
 * Delete
 * x
 * Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer,  (the initial number of elements in ).
 * The second line contains  space-separated integers describing .
 * The third line contains an integer,  (the number of queries).
 * The  subsequent lines describe the queries, and each query is described over two lines:
 * <p>
 * If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
 * If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
 * Constraints
 * <p>
 * <p>
 * <p>
 * Each element in is a 32-bit integer.
 * Output Format
 * <p>
 * Print the updated list  as a single line of space-separated integers.
 * <p>
 * Sample Input
 * <p>
 * 5
 * 12 0 1 78 12
 * 2
 * Insert
 * 5 23
 * Delete
 * 0
 * Sample Output
 * <p>
 * 0 1 78 12 23
 * Explanation
 * <p>
 * <p>
 * Insert 23 at index .
 * <p>
 * Delete the element at index .
 * <p>
 * Having performed all  queries, we print  as a single line of space-separated integers.
 */
public class JavaList {

    static void insertValue(ArrayList<Integer> list, int position, int value) {
        list.add(position, value);
    }

    static void deleteItem(ArrayList<Integer> list, int position) {
        list.remove(position);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        String command;
        for (int i = 0; i < numberOfElements; i++) {
            list.add(scanner.nextInt());
        }
        int numberOfQueries = scanner.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            command = scanner.next();
            if (command.equals("Insert")) {
                int position = scanner.nextInt();
                int value = scanner.nextInt();
                insertValue(list, position, value);

            } else {
                int position = scanner.nextInt();
                deleteItem(list, position - 1);
            }
        }
        // print out list
        for (int each : list)
            System.out.print(each + " ");
    }

}
