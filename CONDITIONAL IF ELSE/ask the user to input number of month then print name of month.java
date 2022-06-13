//ask the user to input number of month then print name of month.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month no.:");
		int n=sc.nextInt();
		switch(n){
		    case 1:
		        System.out.print("january");
		        break;
		    case 2:
		        System.out.print("february");
		        break;
		    case 3:
		        System.out.print("march");
		        break;
		    case 4:
		        System.out.print("april");
		        break;
		    case 5:
		        System.out.print("may");
		        break;
		    case 6:
		        System.out.print("june");
		        break;
		    case 7:
		        System.out.print("july");
		        break;
		    case 8:
		        System.out.print("august");
		        break;
		    case 9:
		        System.out.print("september");
		        break;
		    case 10:
		        System.out.print("october");
		        break;
		    case 11:
		        System.out.print("november");
		        break;
		    case 12:
		        System.out.print("december");
		        break;
		}
	}
}

