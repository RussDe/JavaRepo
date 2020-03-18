package interview.hackerrank.java.data_structures.java_comparator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-comparator?h_r=next-challenge&h_v=zen
 * Created by rustem on 11/2/16.
 * Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.
 * <p>
 * The Player class is provided for you in your editor. It has  fields: a  String and a  integer.
 * <p>
 * Given an array of  Player objects, write a comparator that sorts them in order of decreasing score; if  or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
 * <p>
 * Input Format
 * <p>
 * Input from stdin is handled by the locked stub code in the Solution class.
 * <p>
 * The first line contains an integer, , denoting the number of players.
 * Each of the  subsequent lines contains a player's  and , respectively.
 * <p>
 * Constraints
 * <p>
 * players can have the same name.
 * Player names consist of lowercase English letters.
 * Output Format
 * <p>
 * You are not responsible for printing any output to stdout. The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.
 * <p>
 * Sample Input
 * <p>
 * 5
 * amy 100
 * david 100
 * heraldo 50
 * aakansha 75
 * aleksa 150
 * Sample Output
 * <p>
 * aleksa 150
 * amy 100
 * david 100
 * aakansha 75
 * heraldo 50
 * Submissions: 5751
 * Max Score: 10
 * Difficulty: Medium
 * Rate This Challenge:
 * <p>
 * More
 * Current Buffer (saved locally, editable)
 */
public class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
