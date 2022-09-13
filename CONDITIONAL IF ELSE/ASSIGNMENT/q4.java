/* A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/

import java.util.*;
public class q4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year of service:");
		int a=sc.nextInt();
		
		if(a>5){
			System.out.println("Enter your salary:");
		    int b=sc.nextInt();
			double s=0.05*b;
			System.out.println("Net bonus amount="+s);
			
		}
		else{
			System.out.println("Not applicable for bonus.");
		}
	}
}