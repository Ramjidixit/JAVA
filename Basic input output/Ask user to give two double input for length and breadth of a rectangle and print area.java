// Ask user to give two double input for length and breadth of a rectangle and print area

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length please:");
		int a=sc.nextInt();
		System.out.println("Enter the breadth please:");
		int b=sc.nextInt();
		System.out.println("Area of the rectange is:");
		System.out.println(2*(a+b));
	}
}
