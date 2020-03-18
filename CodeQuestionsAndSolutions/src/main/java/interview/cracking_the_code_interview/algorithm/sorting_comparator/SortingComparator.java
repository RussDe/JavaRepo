package interview.cracking_the_code_interview.algorithm.sorting_comparator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-comparator-sorting
 *
 * Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.
 * The Player class is provided in the editor below; it has two fields:
 * <p>
 * A string, .
 * An integer, .
 * Given an array of  Player objects, write a comparator that sorts them in order of decreasing score;
 * if  or more players have the same score, sort those players alphabetically by name.
 * To do this, you must create a Checker class that implements the SortingComparator interface,
 * then write an int compare(Player a, Player b) method implementing the SortingComparator.compare(T o1, T o2) method.
 * <p>
 * Input Format
 * <p>
 * Locked stub code in the Solution class handles the following input from stdin:
 * The first line contains an integer, , denoting the number of players.
 * Each of the  subsequent lines contains a player's respective  and .
 * <p>
 * Constraints
 * <p>
 * Two or more players can have the same name.
 * Player names consist of lowercase English alphabetic letters.
 * Output Format
 * <p>
 * You are not responsible for printing any Output to stdout. Locked stub code in Solution will create a Checker object,
 * use it to sort the Player array, and print each sorted element.
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
 * Explanation
 * <p>
 * As you can see, the players are first sorted by decreasing score and then sorted alphabetically by name.
 */
public class SortingComparator {

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
        //System.out.print(Arrays.toString(player));
        for (Player aPlayer : player) {
            System.out.printf("%s, %s\n", aPlayer.name, aPlayer.score);
        }
    }
}
