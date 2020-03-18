package interview.solutions;//Write a method that renders 2D array of characters on screen with a return statement after each line

class ArrayOfChars {
    static void printArray(char[][] array) {
        for (char[] a : array) {
            for (char ch : a) {
                System.out.print(ch);
            }
            System.out.println("\n");
        }
    }
}
