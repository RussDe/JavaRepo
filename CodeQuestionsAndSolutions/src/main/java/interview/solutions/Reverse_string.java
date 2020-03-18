package interview.solutions;

/**
 * 1. reverse string “Hello World” => “dlroW olleH” (without using ruby revert method)
 */

public class Reverse_string {
    public static void main(String[] args) {
        String oldString = "Hello world";
        char[] letter = oldString.toCharArray();
        char tempLetter;
        for (int i = 0; i < letter.length / 2; i++) {
            tempLetter = letter[i];
            letter[i] = letter[letter.length - i - 1];
            letter[letter.length - i - 1] = tempLetter;
        }

        StringBuilder newString = new StringBuilder();
        for (char item : letter) {
            newString.append(item);
        }

        System.out.println(newString);
    }
}
