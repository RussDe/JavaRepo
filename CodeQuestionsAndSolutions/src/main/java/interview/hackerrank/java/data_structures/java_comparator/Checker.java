package interview.hackerrank.java.data_structures.java_comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2 ) {
        if (player1.score > player2.score) {
            return -1;
        }
        else if (player1.score < player2.score) {
            return 1;
        } else
            return player1.name.compareTo(player2.name);
    }
}
