package interview.solutions;

//Reverse a string
public class ReverseString {
    public static String reverse(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseWords(String string) {
        StringBuilder sb = new StringBuilder();
        String[] words = string.split(" ");
//        for (int i = 0; i < words.length; i++) {
//            sb.append(reverse(words[i])).append(" ");
//        }

//        for (int i = words.length-1; i >=0; i--) {
//            sb.append(reverse(words[i])).append(" ");
//        }

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append((words[i])).append(" ");
        }

        return sb.toString();
    }
}
