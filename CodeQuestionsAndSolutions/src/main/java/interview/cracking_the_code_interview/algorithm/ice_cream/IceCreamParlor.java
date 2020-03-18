package interview.cracking_the_code_interview.algorithm.ice_cream;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool together  dollars for ice cream. On any given day, the parlor offers a line of  flavors. Each flavor, , is numbered sequentially with a unique ID number from  to  and has a cost, , associated with it.
 * <p>
 * Given the value of  and the cost of each flavor for  trips to the Ice Cream Parlor, help Sunny and Johnny choose two flavors such that they spend their entire pool of money () during each visit. For each trip to the parlor, print the ID numbers for the two types of ice cream that Sunny and Johnny purchase as two space-separated integers on a new line. You must print the smaller ID first and the larger ID second.
 * <p>
 * Note: Two ice creams having unique IDs  and  may have the same cost (i.e., ).
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the number of trips to the ice cream parlor. The  subsequent lines describe all of Sunny and Johnny's trips to the parlor; each trip is described as follows:
 * <p>
 * The first line contains .
 * The second line contains .
 * The third line contains  space-separated integers denoting the cost of each respective flavor. The  integer corresponds to the cost, , for the ice cream with ID number  (where ).
 * Constraints
 * <p>
 * , where
 * It is guaranteed that there will always be a unique solution.
 * Output Format
 * <p>
 * Print two space-separated integers denoting the respective ID numbers for the flavors they choose to purchase, where the smaller ID is printed first and the larger ID is printed second. Recall that each ice cream flavor has a unique ID number in the inclusive range from  to .
 * <p>
 * Sample Input
 * <p>
 * 2
 * 4
 * 5
 * 1 4 5 3 2
 * 4
 * 4
 * 2 2 4 3
 * Sample Output
 * <p>
 * 1 4
 * 1 2
 * Explanation
 * <p>
 * Sunny and Johnny make the following two trips to the parlor:
 * <p>
 * The first time, they pool together  dollars. There are five flavors available that day and flavors  and have a total cost of . Thus, we print 1 4 on a new line.
 * The second time, they pool together  dollars. There are four flavors available that day and flavors  and have a total cost of . Thus, we print 1 2 on a new line.
 */
public class IceCreamParlor {

    public static int binarySearch(int first, int last, IceCream[] arrayOfFlavors, int search) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trips = sc.nextInt();
        for (int i = 0; i < trips; i++) {
            int money = sc.nextInt();
            int flavors = sc.nextInt();
            IceCream[] arrayOfFlavors = new IceCream[flavors];
            for (int j = 0; j < flavors; j++) {
                arrayOfFlavors[j] = new IceCream(sc.nextInt(), j + 1);
            }
            Arrays.sort(arrayOfFlavors);
            for (int j = 0; j < flavors - 1; j++) {
                int search = money - arrayOfFlavors[j].price;
                if (search >= arrayOfFlavors[j].price) {
                    int index = binarySearch(j + 1, flavors - 1, arrayOfFlavors, search);
                    if (index != -1) {
                        System.out.println(Math.min(arrayOfFlavors[j].index, index) + " " + Math.max(arrayOfFlavors[j].index, index));
                        break;

                    }
                }
            }
        }
    }
}
