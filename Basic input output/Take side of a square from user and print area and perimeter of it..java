//Take side of a square from user and print area and perimeter of it.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    System.out.print("Enter the side of square:");
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=a*a;
	    int c=4*a;
		System.out.println("Area of square is "+b+ " and perimeter is: "+c);
	}
}
//println after writing the whole line cursor moves to next line while 
// in print cursor remain in that line .