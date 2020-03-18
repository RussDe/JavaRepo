package interview.solutions;

import static java.lang.Math.random;

// Creating an array of random integers
public class GetArray {
    public static int[] getArray(int min, int max, int size){
        int [] array = new int [size];
        int length = array.length;
        for (int i= 0; i < length; i++){
            array[i]=(int)(random()*(max-min));
        }
        for (int item: array){
            System.out.print(" " +item);
        }
        return array;
    }
}
