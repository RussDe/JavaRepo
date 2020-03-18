package interview.hackerrank.java.data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-arraylist?h_r=next-challenge&h_v=zen
 * Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.
 * <p>
 * You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.
 * <p>
 * Take your input from System.in.
 * <p>
 * Input Format
 * The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .
 * <p>
 * Constraints
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * Each number will fit in signed integer.
 * Total number of integers in  lines will not cross 100000.
 * <p>
 * Output Format
 * In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"
 * <p>
 * Sample Input
 * <p>
 * 5
 * 5 41 77 74 22 44
 * 1 12
 * 4 37 34 36 52
 * 0
 * 3 20 22 33
 * 5
 * 1 3
 * 3 4
 * 3 1
 * 4 3
 * 5 5
 * Sample Output
 * <p>
 * 74
 * 52
 * 37
 * ERROR!
 * ERROR!
 */
public class JavaArraylist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int linesNumber = scanner.nextInt();
        List<ArrayList<Integer>> arrayMain = new ArrayList<>();
        for (int i = 0; i < linesNumber; i++) {
            ArrayList<Integer> arrayTemp = new ArrayList<>();
            int size = scanner.nextInt();
            for (int j = 0; j < size; j++) {
                arrayTemp.add(scanner.nextInt());
            }
            arrayMain.add(arrayTemp);
        }
        int queriesNumber = scanner.nextInt();
        /*int[][] array = new int[queriesNumber][];
        for (int i = 0; i < array.length; i ++) {
            array[i] = new int[2];
            for (int j = 0; j < array[i].length; j ++) {
                array[i][j] = scanner.nextInt();
            }
        }*/
        int line;
        int position;
        for (int i = 0; i < queriesNumber; i++) {
            line = scanner.nextInt();
            position = scanner.nextInt();
            ArrayList<Integer> arr = arrayMain.get(line - 1);
            System.out.println(((arr.size() + 1) > position) ? arr.get(position - 1) : "ERROR!");
        }
        scanner.close();
    }
}