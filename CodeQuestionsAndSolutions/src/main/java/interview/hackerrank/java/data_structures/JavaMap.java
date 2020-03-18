package interview.hackerrank.java.data_structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/phone-book
 * You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.
 * <p>
 * Input Format
 * <p>
 * The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.
 * <p>
 * After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
 * <p>
 * Constraints:
 * A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
 * <p>
 * <p>
 * <p>
 * <p>
 * Output Format
 * <p>
 * For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.
 * <p>
 * To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.
 * <p>
 * Sample Input
 * <p>
 * 3
 * uncle sam
 * 99912222
 * tom
 * 11122222
 * harry
 * 12299933
 * uncle sam
 * uncle tom
 * harry
 * Sample Output
 * <p>
 * uncle sam=99912222
 * Not found
 * harry=12299933
 */
public class JavaMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            scanner.nextLine();
            map.put(name, phone);
        }
        while (scanner.hasNext()) {
            String name = scanner.nextLine();
            System.out.println(map.containsKey(name) ? name + "=" + map.get(name) : "Not found");
        }
    }

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        int n = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            Integer phone = (Integer) scanner.nextInt();
            map.put(name, phone);
        }
        Scanner scanner1 = new Scanner(System.in);
        while (scanner1.hasNext()) {

            String name = (String) scanner1.nextLine();
            System.out.println(map.containsKey(name) ? name + "=" + map.get(name) : "Not found");
        }
    }*/
}
