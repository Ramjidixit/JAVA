// make program that takes the radius of a circle as input ,
//      calculate its area and print its output to user.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter the radius of a circle:");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		double pi=3.14;
		double b=Math.PI*(a*a);   //we can also write it as: 3.14*a*a
		System.out.print("Area of the circle is: "+b);
	}
}
