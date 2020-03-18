package interview.solutions;

public class ReverseWord {

    private static String reverseWord(String first) {
        StringBuilder sb = new StringBuilder();
        int length = first.length();
        for (int i = length - 1; i >= 0; i--) {
            sb.append(first.charAt(i));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String first = "dad";
        System.out.println(first + " becomes " + reverseWord(first));
        if(first.equals(reverseWord(first)))
            System.out.println("YES!");
    }
}
