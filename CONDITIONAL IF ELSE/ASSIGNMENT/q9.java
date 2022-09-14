/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.Modify the above question to
allow student to sit if he/she has medical cause. Ask user if he/she has medical 
cause or not ( 'Y' or 'N' ) and print accordingly.*/

import java.util.*;
public class q9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of classes held:");
		float a=sc.nextInt();
		System.out.print("Enter the number of classes attended:");
		float b=sc.nextInt();
		System.out.println("Did you have any medical cause:");
		System.out.println("---------reply only y/n----------");
		
		char ch=sc.next().charAt(0);
		float c=(b/a)*100;
		System.out.println("The percentage of class attended: "+c+"%");
		if(c>75 || ch=='y'){
			System.out.println("Allowed to sit in exam.");
		}
		else{
			System.out.println("Not allowed to sit in exam.");
		}
		
	}
}