package interview.hackerrank.java.object_oriented_programming.calculating_volume;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 */
public class Calculate {
    private double volume;
    private int int_val;
    private double double_val;
    Output output = new Output();
    Scanner scanner = new Scanner(System.in);

    //input integer
    int get_int_val() throws IOException {
        int val = scanner.nextInt();
        if (val <= 0)
            throw new NumberFormatException("All the values must be positive");
        else
            return val;
    }

    //input double
    double get_double_val() throws IOException {
        double val = scanner.nextDouble();
        if (val <= 0)
            throw new NumberFormatException("All the values must be positive");
        else
            return val;
    }

    //return new Object
    static Calculate do_calc() {
        return new Calculate();
    }

    //option 1 - Cube
    double get_volume(int a) {
        volume = a * a * a;
        return volume;
    }

    //option 2 - Cuboid
    double get_volume(int a, int b, int c) {
        volume = a * b * c;
        return volume;
    }

    //option 3 - Hemisphere
    double get_volume(double a) {
        volume = (2 * Math.PI * a * a * a) / 3;
        return volume;
    }

    //option 4 - Cylinder
    double get_volume(double a, double b) {
        volume = Math.PI * a * a * b;
        return volume;
    }
}
