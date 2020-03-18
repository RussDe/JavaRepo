package interview.solutions;

//refverse using recursion
public class ReverseStringRecursion {

    public static String reverse(String s) {
        if (s.length() == 0)
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
