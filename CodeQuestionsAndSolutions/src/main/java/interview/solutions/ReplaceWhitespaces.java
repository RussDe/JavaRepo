package interview.solutions;//Write a method to replace all whitespaces in a string with #20

public class ReplaceWhitespaces {
    public static String replaceWhitespaces(String string) {
        StringBuilder sb = new StringBuilder();
        char charToReplace = ' ';
        String stringToReplace = "#20";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == charToReplace) {
                sb.append(stringToReplace);
            } else
                sb.append(string.charAt(i));
        }
        return sb.toString();
    }
}
