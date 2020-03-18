package interview.solutions;

import java.util.Scanner;

/**
 * 5. Create function to verify if string == palindrome (“racecar” => true, “name” => false)
 */
public class Palindrome {
    public static boolean verifyPalindrome(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != myString.charAt(myString.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Input your string: ");
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine().toLowerCase();
        System.out.println(verifyPalindrome(myString) ? "True" : "False");
    }
}