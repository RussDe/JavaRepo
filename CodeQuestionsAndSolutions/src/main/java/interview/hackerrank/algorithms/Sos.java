package interview.hackerrank.algorithms;

import java.util.Scanner;

public class Sos {
    static int counter = 0;

    private static int countSos(String string) {
        if (string.length() < 3) {
            return counter;
        } else {
            if (string.charAt(0) == 's' && string.charAt(1) == 'o' && string.charAt(2) == 's') {
                counter++;
                countSos(string.substring(3));
            } else {
                countSos(string.substring(1));
            }

        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println("SOS = " + countSos(string.toLowerCase()));
    }
}