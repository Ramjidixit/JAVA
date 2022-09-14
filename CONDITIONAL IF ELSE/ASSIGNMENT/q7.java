/*Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1
*/

import java.util.*;
import java.lang.Math;
public class q7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value:");
		int a=sc.nextInt();
		if(a>0){
			System.out.print("The absolute value of given value="+a);
		}
		else{
			if(a==0){
			System.out.print("The absolute value of given value=0");
			}
			else{
				System.out.print("The absolute value of given value="+Math.abs(a));
			}
			
		}
	}
}