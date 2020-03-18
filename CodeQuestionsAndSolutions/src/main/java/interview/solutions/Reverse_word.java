package interview.solutions;

/**
 * 2. reverse words in string “Hello World” => “olleH dlroW”
 */
public class Reverse_word {
    public static void main(String[] args) {
        String oldString = "Hello,my world";
        String reversedString = "";
        for (String stringSplitted:  oldString.split("\\s*(',')")){
            String temp = " ";
            for (int i = stringSplitted.length()-1; i >= 0; i--) {
                temp = temp + stringSplitted.charAt(i);
            }
            reversedString = reversedString + temp;
        }
        System.out.println(reversedString);
    }
}
