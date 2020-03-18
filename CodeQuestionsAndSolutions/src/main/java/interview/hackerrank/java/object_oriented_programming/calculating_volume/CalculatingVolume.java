package interview.hackerrank.java.object_oriented_programming.calculating_volume;

import java.io.IOException;

/**
 * https://www.hackerrank.com/challenges/calculating-volume
 * You are given a class Solution and its main method in the editor. In each test cases, it takes an input  which represents
 * a choice of the following:
 * <p>
 * represents the volume of a cube that has to be calculated where  represents the length of the sides of the cube.
 * represents the volume of a cuboid that has to be calculated where  represent the dimensions of a cuboid.
 * represents the volume of a hemisphere that has to be calculated where  represents the radius of a hemisphere.
 * represents the volume of a cylinder that has to be calculated where  represent the radius and height of the cylinder respectively.
 * Your task is to create the class Calculate and the required methods so that the code prints the volume of the figures rounded
 * to exactly  decimal places.
 * <p>
 * In case any of the dimensions of the figures are , print "java.lang.NumberFormatException: All the values must be positive"
 * without quotes
 * and terminate the program.
 * <p>
 * Note: Use Math.PI or  as the value of pi.
 * <p>
 * Input Format
 * <p>
 * First line contains , the number of test cases. Each test case contains ch, representing the choice as given in the problem
 * statement.
 * <p>
 * When ch=1, Next line contains , length of the sides of the cube.
 * When ch=2, Next three lines contain , ,  representing length, breadth and height of the cuboid respectively. , ,  will be in
 * three separate lines
 * When ch=3, Next line contains , the radius of the hemisphere
 * When ch=4, Next two lines contain ,  representing the radius and height of the cylinder respectively. ,  will be
 * in two separate lines.
 * Note: You have to determine the data type of each parameter by looking at the code given in the main method.
 * <p>
 * Constraints
 * <p>
 * <p>
 * There will be at most  digits after decimal point in input.
 * <p>
 * Output Format
 * <p>
 * For each test case, print the answer rounded up to exactly 3 decimal places in a single line. For example, 1.2345 should be
 * rounded to 1.235, 3.12995 should be rounded to 3.130.
 * <p>
 * Sample Input 1
 * <p>
 * 2
 * 1
 * 4
 * 4
 * 67.89
 * -98.54
 * Sample Output 1
 * <p>
 * 64.000
 * java.lang.NumberFormatException: All the values must be positive
 * Explanation
 * There are two test cases. In the first test case , means you have to calculate the volume of a cube.
 * The next line contains the =4, means the side of the cube is . So the volume of the cube is .
 * In the second test case, you have to calculate volume of a cylinder. But the height of the cylinder is negative,
 * so an exception is thrown.
 * <p>
 * Sample Input 2
 * <p>
 * 1
 * 3
 * 1.02
 * Sample Output 2
 * <p>
 * 2.223
 */
public class CalculatingVolume {

    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.get_int_val();
            while (T-- > 0) {
                double volume = 0.0;
                int ch = cal.get_int_val();
                if (ch == 1) {//option 1
                    int a = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(a);
                } else if (ch == 2) {//option 2
                    int l = cal.get_int_val();
                    int b = cal.get_int_val();
                    int h = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(l, b, h);

                } else if (ch == 3) {//option 3
                    double r = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r);

                } else if (ch == 4) {//option 4
                    double r = cal.get_double_val();
                    double h = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }


    }
}
