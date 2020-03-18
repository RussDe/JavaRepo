package interview.hackerrank.java.data_structures.java_sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-sort
 * Created by rustem on 11/2/16.
 * You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
 * <p>
 * Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.
 * <p>
 * Input Format
 * <p>
 * The first line of input contains an integer , representing the total number of students. The next  lines contains a list of student information in the following structure:
 * <p>
 * ID Name CGPA
 * Constraints
 * <p>
 * The name contains only lowercase English letters. The  contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.
 * <p>
 * Output Format
 * <p>
 * After rearranging the students according to the above rules, print the first name of each student on a separate line.
 * <p>
 * Sample Input
 * <p>
 * 5
 * 33 Rumpa 3.68
 * 85 Ashis 3.85
 * 56 Samiha 3.75
 * 19 Samara 3.75
 * 22 Fahim 3.76
 * Sample Output
 * <p>
 * Ashis
 * Fahim
 * Samara
 * Samiha
 * Rumpa
 */
public class JavaSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] student = new Student[n];
        Sorter sorter = new Sorter();
        for (int i = 0; i < n; i++) {
            student[i] = new Student(scanner.nextInt(), scanner.next(), scanner.nextFloat());
        }
        Arrays.sort(student, sorter);
        for (int i = 0; i < n; i++) {
            System.out.println(student[i].name);
        }
    }
}
