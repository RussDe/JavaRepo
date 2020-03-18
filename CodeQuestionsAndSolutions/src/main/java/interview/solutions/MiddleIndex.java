package interview.solutions;

/**
 * 2. Find out middle index where sum of both ends are equal.
 * - See more at: http://www.java2novice.com/java-interview-programs/find-middle-index/#sthash.bqd7YFZi.dpuf
 * You are given an array of numbers. Find out the array index or position where sum of numbers preceeding the index
 * is equals to sum of numbers succeeding the index.
 */
public class MiddleIndex {
    public static void findIndex() {
        int [] array = new int [] {1,5,2,3,2,6};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= array.length; i++) {
            if (i < array.length / 2)
                sum1 += sum1 + array[i];
            else
                sum2 += sum2 + array[i];
        }
        if (sum1 == sum2)
            System.out.println("They are equal");
        else System.out.println("NOT equal");
    }
}
