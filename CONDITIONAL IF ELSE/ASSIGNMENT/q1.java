/*take values of length and breadth of a rectangle from user and check whether its square or not  */

import java.util.*;
public class q1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int l=sc.nextInt();
		System.out.println("Enter the breadth:");
		int b=sc.nextInt();
		if(l==b){
			System.out.println("Yes,it is a square.");
		}
		else{
			System.out.println("It is not a square.");
		}
	}
}
