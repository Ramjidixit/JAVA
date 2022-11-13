//Write a Java method to compute the future investment value 
//at a given interest rate for a specified number of years.

import java.util.*;
public class Pra8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amt,rate , and time period in yr.");
        double a=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        System.out.println(inter(a,r,t));
    }
    public static double inter(double a,double r,double t){
        return (a+((a*r*t)/100));
    }
}
