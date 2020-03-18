package interview.solutions;

//
public class Substring {

    public static boolean isSubstring(String a, String b) {
        // we first check the length of the TagContentExtractor
        if (a.length() < b.length()) {
            return b.contains(a);
        }
        // feel free to use indexO
        return a.contains(b);
    }

    // assuming that a is the rotated string
    public static boolean isRotation(String a, String b) {

        return (a.length() == b.length() && isSubstring(a + a, b));
    }
}



