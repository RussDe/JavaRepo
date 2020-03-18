package interview.hackerrank.java.data_structures;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-1d-array?h_r=next-challenge&h_v=zen
 * You are playing a game on your cell phone. You are given an array of length , indexed from  to . Each element of the array
 * is either  or . You can only move to an index which contains . At first, you are at the position. In each move you can do
 * one of the following things:
 * <p>
 * Walk one step forward or backward.
 * Make a jump of exactly length  forward.
 * That means you can move from position  to ,  or  in one move, but at least one of the following conditions must be true:
 * <p>
 * The new position contains 0.
 * The new position is greater than .
 * You can't move backward from position . If you move to any position greater than , you win the game.
 * <p>
 * Given the array and the length of the jump, you need to determine if it's possible to win the game or not.
 * <p>
 * Input Format
 * <p>
 * In the first line there will be an integer  denoting the number of test cases. Each test case will consist of two lines.
 * The first line will contain two integers,  and . On the second line there will be  space-separated integers,
 * each of which is either  or .
 * <p>
 * Constraints:
 * <p>
 * <p>
 * <p>
 * <p>
 * The first integer of the array is always .
 * Output Format
 * <p>
 * For each case output YES if it's possible to win the game, output NO otherwise.
 * <p>
 * Sample Input
 * <p>
 * 4
 * 5 3
 * 0 0 0 0 0
 * 6 5
 * 0 0 0 1 1 1
 * 6 3
 * 0 0 1 1 1 0
 * 3 1
 * 0 1 0
 * Sample Output
 * <p>
 * YES
 * YES
 * NO
 * NO
 * Explanation
 * <p>
 * In the first case, you can just walk to reach the end of the array.
 * In the second case, you can walk to index  or  and jump from there. In the third case, jump length is too low,
 * and you can't reach the end of the array.
 * In the fourth case, jump length is , so it doesn't matter if you jump or walk, you can't reach the end.
 */
public class Java1DArray {

    static boolean checkIfWin(int[] array, int move, int position) {
        if (position < 0 || array[position] == 1)
            return false;
        if (position == array.length - 1 || ((position + move) > array.length - 1))
            return true;
        array[position] = 1;
        return (checkIfWin(array, move, position + move) ||
                checkIfWin(array, move, position + 1) ||
                checkIfWin(array, move, position - 1));
    }

    public static void main(String[] args) {
        int size;
        int move;
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        for (int i = 0; i < lines; i++) {
            size = scanner.nextInt();
            move = scanner.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < array.length; j++) {
                array[j] = scanner.nextInt();
            }
            System.out.println(checkIfWin(array, move, 0) ? "YES" : "NO");
        }
        scanner.close();
    }
}
