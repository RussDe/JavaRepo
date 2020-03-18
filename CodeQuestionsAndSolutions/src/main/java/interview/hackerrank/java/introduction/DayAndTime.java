package interview.hackerrank.java.introduction;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
 * <p>
 * You are given a date. Your task is to find what the day is on that date.
 * <p>
 * Input Format
 * <p>
 * A single line of input containing the space separated month, day and year, respectively, in   format.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Output the correct day in capital letters.
 * <p>
 * Sample Input
 * <p>
 * 08 05 2015
 * Sample Output
 * <p>
 * WEDNESDAY
 * Explanation
 * <p>
 * The day on August th  was WEDNESDAY.
 */
public class DayAndTime {

    private static void showDay(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase());

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        showDay(year, month, day);
    }
}

