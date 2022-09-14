/*  A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.    */

import java.util.*;
public class q8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of classes held:");
		float a=sc.nextInt();
		System.out.print("Enter the number of classes attended:");
		float b=sc.nextInt();
		float c=(b/a)*100;
		System.out.println("The percentage of class attended: "+c+"%");
		if(c>75){
			System.out.println("Allowed to sit in exam.");
		}
		else{
			System.out.println("Not allowed to sit in exam.");
		}
		
	}
}