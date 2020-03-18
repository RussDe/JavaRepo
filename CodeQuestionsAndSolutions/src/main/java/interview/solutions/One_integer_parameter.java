package interview.solutions;

import java.io.IOException;
import java.util.Scanner;

/**
 * 9*. Write a method  that would take one integer parameter from 1 to ~.  That method would need to generate columns similar to Excel.
 * For example if I call  number_to_columns(3) it would return -- “A, B, C”.
 * If I call number_to_columns(28), it would return -- “A, B, C...Z, AA, AB”
 */

public class One_integer_parameter {
    public static void main(String[] args) throws IOException {
        int inputNumbers = 0;
        do {
            System.out.print("Input your number: ");
            Scanner sc = new Scanner(System.in);
            inputNumbers = sc.nextInt();
        } while (inputNumbers <= 0);

        //recursion
        System.out.println("Columns: " + GeneratorRecursion(inputNumbers));

        //while
        System.out.println("Columns: " + GeneratorWhile(inputNumbers));
    }

    //using recursion
    static String GeneratorRecursion(int inputNumbers) {
        StringBuilder newString = new StringBuilder();
        if (inputNumbers <= 26) {
            newString.append((char) (inputNumbers + 64));
            return newString.toString();
        }
        if (inputNumbers % 26 == 0) {
            return GeneratorRecursion((inputNumbers / 26) - 1) + GeneratorRecursion(26);
        }
        return GeneratorRecursion(inputNumbers / 26) + GeneratorRecursion(inputNumbers % 26);
    }

    //using while
    static String GeneratorWhile(int inputNumbers) {
        int iteration = inputNumbers;
        int i;
        String newString = "";
        int position;
        while (iteration > 0) {
            position = (iteration - 1) % 26;
            i = 65 + position;
            newString = Character.toString((char) i) + newString;
            iteration = (iteration - position) / 26;
        }
        return newString;
    }
}