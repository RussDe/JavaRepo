package interview.solutions;

/**
 * In number theory, a perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is,
 * the sum of its positive divisors excluding the number itself (also known as its aliquot sum).
 * Equivalently, a perfect number is a number that is half the sum of all of its positive divisors (including itself) i.e. σ1(n) = 2n.
 */
public class PerfectNumber {
    public static void findNumber() {

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                int x = 1;
                int sum = 0;
                while (x <= i / 2) {
                    if (i % x == 0) {
                        sum += x;
                    }
                    x++;
                }
                if (sum == i)
                    System.out.println("Found number = " + i);
            }
        }
    }
}
