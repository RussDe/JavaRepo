package interview.solutions;

import java.io.IOException;

/*
11. Fizz buzz: https://en.wikipedia.org/wiki/Fizz_buzz
You have an array of integers 1..100
Iterate through each element of array, if element is divisible by 3 print Fizz,
if  element is divisible by 5 print Bizz, if s divisible by 15 print FIZZBIZZ
*/

public class FizzBuzz {

    //creating Array
    static int[] buildingArray(int size) {
        int[] array = new int[size + 1];
        for (int i = 0; i < size + 1; i++) {
            int randNumber = (int) Math.floor(Math.random() * (size + 1));
            array[i] = randNumber;
        }
        return array;
    }

    //printing Array
    static void printArray(int[] array) {
        for (int item : array) {
            System.out.printf("%d ", item);
        }
        System.out.println("\n");
    }

    //fizzing & buzzing
    static void checkingArray(int[] array) {
        for (int item : array) {
            if (item % 3 == 0) {
                if (item % 5 == 0)
                    System.out.printf(" %s", "FIZZBIZZ");
                else System.out.printf(" %s", "Fizz");
            } else if (item % 5 == 0)
                System.out.printf(" %s", "Bizz");
            else System.out.printf(" %d", item);
        }
    }


    public static void main(String[] args) throws IOException {
        int size = 30;
        int[] array = buildingArray(size);
        printArray(array);
        checkingArray(array);
    }

}
