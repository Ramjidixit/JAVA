//Write Java methods to calculate the area of a triangle.

import java.util.*;

public class Pra13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base :");
        double b = sc.nextDouble();
        System.out.println("Enter the height:");
        double h = sc.nextDouble();
        System.out.println("Area of a triangle=" + area(b, h));
    }

    public static double area(double b, double h) {
        return (0.5 * b * h);
    }
}
