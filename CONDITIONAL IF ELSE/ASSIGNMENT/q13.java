/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR".*/

import java.util.*;
public class q13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		if(a>20 && a<60)
		{
		System.out.println("Enter your sex in M and F only:");
		char s=sc.next().charAt(0);
		System.out.println("Enter your marital status in Y and N only:");
		char r=sc.next().charAt(0);
		if(s=='F'){
			System.out.println("Place of service=Urban area.");

		}
		if(s=='M' && a>20 && a<40){
			System.out.println("You can work anywhere.");
		}
		if(s=='M' && a>40 && a<60){
			System.out.print("Place of service=Urban area only.");
		}
		
		}
		else{
			System.out.println("Invalid input of age.");
		}
		
		
	}
	
}