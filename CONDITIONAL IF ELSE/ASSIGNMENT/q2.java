/*Take two int values from user and print greatest among them.*/

import java.util.*;
public class q2{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a>b){
		System.out.println(a+" is greatest.");
	}
	
	else{
		if(a==b){
			System.out.println("Numbers are equal.");
		}
		else{
			System.out.println(b+" is greatest.");
		}
	
	}
	
	}	
}
