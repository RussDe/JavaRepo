package interview.solutions;

public class Perm {
    public static void stringPermutation(String string){

        permutation("", string);
    }
    public static void permutation (String prefix, String string){
        int length = string.length();
        if (length == 0)
            System.out.println(prefix);
        for (int i = 0; i < length; i++){
            permutation(prefix + string.charAt(i), string.substring(0, i) + string.substring(i+1, length));
        }
    }
}
