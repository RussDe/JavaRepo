package interview.cracking_the_code_interview.algorithm.sorting_comparator;

public class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return this.name + ", score = " + this.score;
    }
}
