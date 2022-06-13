//MAKE A CALCULATOR.TAKE TWO NUMBERS (A AND B) FROM THE USER AND AN OPERATION AS FOLLOWS:
// 1. +   2. -   3.*    4./   5.%

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("Enter the operator no.:");
		int n=sc.nextInt();
		switch(n){
		    case 1:
		        System.out.print(a+b);
		        break;
		    case 2:
		        System.out.print(a-b);
		        break;
		    case 3:
		        System.out.print(a*b);
		        break;
		    case 4:
		        System.out.print(a/b);
		        break;
		    case 5:
		        System.out.print(a%b);
		        break;
		}
	}
}
