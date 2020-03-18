package interview.solutions;

import java.util.Scanner;

/**
 * 3. count how many times character appears in string
 */
public class How_many_character {
    public static void main(String[] args) {
        System.out.print("input your string: ");
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        System.out.print("input your char: ");
        char mychar = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (mychar == myString.charAt(i))
                count++;
        }
        System.out.printf("%c appears %d times", mychar, count);
    }
}