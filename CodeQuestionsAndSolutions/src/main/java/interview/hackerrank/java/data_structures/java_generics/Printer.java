package interview.hackerrank.java.data_structures.java_generics;

/**
 *
 */
public class Printer {

    <T> void printArray(T[] array) {
        for (T each: array) {
            System.out.println(each);
        }
    }

}