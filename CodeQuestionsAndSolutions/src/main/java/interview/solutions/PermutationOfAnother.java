package interview.solutions;

//Determine if one string is a permutation of another
public class PermutationOfAnother {
    public static boolean isPermutation(String a, String b) {
        if (a.length() != b.length())
            return false;
        char[] aFirst = a.toCharArray();
        char[] bSecond = b.toCharArray();

        int [] count = new int[128];
        for (char each : aFirst) {
            count[each]++;
        }

        for (char each : bSecond) {
            if (--count[each] < 0)
                return false;
        }
        return true;
    }
}
