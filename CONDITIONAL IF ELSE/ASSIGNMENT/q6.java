/*take input of age of 3 people by user and determine oldest and youngest among them */

import java.util.*;
public class q6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of all 3 peoples:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b) && (a>c) && (b<c)){
			System.out.print("A is oldest and B is youngest.");
		}
		if((a>b) && (a>c) && (c<b)){
			System.out.print("A is oldest and C is youngest.");
		}
		if((b>a) && (b>c) && (a<c)){
			System.out.print("B is oldest and A is youngest.");
		}
		if((b>a) && (b>c) && (c<a)){
			System.out.print("B is oldest and C is youngest.");
		}
		if((c>b) && (c>a) && (b<a)){
			System.out.print("C is oldest and B is youngest.");
		}
		if((c>b) && (c>a) && (a<b)){
			System.out.print("C is oldest and A is youngest.");
		}
		
	
	
	}
}