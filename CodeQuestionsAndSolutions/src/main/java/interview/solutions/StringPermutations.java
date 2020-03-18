package interview.solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class StringPermutations {

    //5.1.
    public static void permutate(String str) {
        //calling recursion
        permutation("", str);

        //calling iteration
        System.out.println("_________");
        char[] temp = str.toCharArray();
        // Step 1. Sort the string
        Arrays.sort(temp);
        System.out.println("String " + String.valueOf(temp));
        int index = 0;
        int lowest = 0;
        while (true) {
            // Step 2. Rightmost char smallest than its neighbour
            for (int i = 0; i < temp.length - 1; i++) {
                if (temp[i] < temp[i + 1]) {
                    lowest = i;

                }
            }
            // index of CHAR1
            index = lowest;
            // Step3. Find the ceiling of the
            int j = findCeiling(temp, index);
            // Breaking condition at this juncture
            // all permutations are printed
            if (j == index) break;

            swap(temp, index, j);
            String a = String.valueOf(temp);
            // Step4. Sort the substring
            char[] b = a.substring(index + 1).toCharArray();
            Arrays.sort(b);
            a = a.substring(0, index + 1) + String.valueOf(b);
            temp = a.toCharArray();
            System.out.println("String " + String.valueOf(temp));
            //}
        }

    }
    //5.1.
    //using in iteration
    public static int findCeiling(char[] temp, int index) {
        int k = index;
        char test = temp[index];
        while (k < temp.length - 1) {
            if (temp[index] < temp[k + 1]) {
                index = k + 1;
                break;
            }
            k++;
        }
        k = index;
        while (k < temp.length - 1) {
            if ((temp[index] > temp[k + 1]) && (temp[k + 1] > test)) {
                index = k + 1;
            }
            k++;
        }
        return index;
    }
    //5.1.
    //using in iteration
    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    //5.1.
    //using recursion
    private static void permutation(String prefix, String remain) {
        int n = remain.length();
        System.out.println("n = "+n);
        // prefix - serves as an accumulator variable
        // base case: we print out ans since there are no more letters to be added
        if (n == 0) {
            System.out.println("******* After : prefix = "+prefix+" , remain = "+remain);
            System.out.println(prefix);
        }
        // recursive case
        else {
            for (int i = 0; i < n; i++) {
                // we call permutation, each time combining prefix with the individual letters in str
                // we also remove these letters from str
                System.out.println("Before : prefix = "+prefix+" , remain = "+remain +" ,n = "+n);
                permutation(prefix + remain.charAt(i), remain.substring(0, i) + remain.substring(i + 1, n));
                System.out.println("After-prefix = "+prefix+" ,remain = "+remain +" ,n = "+n);
            }
            System.out.println("- - - - - -Done with 'for' cycle - - - - - -");
        }
    }

    //*****************
    //5.2.
    public static ArrayList<String> permutation(String s) {
        // The result
        ArrayList<String> res = new ArrayList<String>();
        // If input string's length is 1, return {s}
        if (s.length() == 1) {
            res.add(s);
        } else if (s.length() > 1) {
            int lastIndex = s.length() - 1;
            // Find out the last character
            String last = s.substring(lastIndex);
            // Rest of the string
            String rest = s.substring(0, lastIndex);
            // Perform permutation on the rest string and
            // merge with the last character
            res = merge(permutation(rest), last);
        }
        return res;
    }
    //5.2.
    public static ArrayList<String> merge(ArrayList<String> list, String c) {
        ArrayList<String> res = new ArrayList<String>();
        // Loop through all the string in the list
        for (String s : list) {
            // For each string, insert the last character to all possible postions
            // and add them to the new list
            for (int i = 0; i <= s.length(); ++i) {
                String ps = new StringBuffer(s).insert(i, c).toString();
                res.add(ps);
            }
        }
        return res;
    }
}