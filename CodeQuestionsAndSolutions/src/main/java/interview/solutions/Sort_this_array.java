package interview.solutions;

import java.io.IOException;

/**
 * 8. You have array of [0,1,0,0,1,1,0]. Write method that will sort this array without using sort API and sort algorithms like
 * (i.e Bubble, Quick). You have to perform only one iteration.
 */
public class Sort_this_array {
    public static void main(String[] args) throws IOException {
        int a[] = {0, 1, 1, 1, 1, 1, 0, 1};
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
                a[j++] = 0;
            }
        }
        for (int item : a) {
            System.out.printf("%d ", item);
        }

    }
}