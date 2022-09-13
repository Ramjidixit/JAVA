/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/

import java.util.*;
public class q5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		int a=sc.nextInt();
		if(a<25){
			System.out.print("Your grade is F");
		}
		if(a>=25){
			if(a<45){
				System.out.print("Your grade is E");
			}
		}
		if(a>=45){
			if(a<50){
				System.out.print("Your grade is D");
			}
		}
		if(a>=50){
			if(a<60){
				System.out.print("Your grade is c");
			}
		}
		if(a>=60){
			if(a<80){
				System.out.print("Your grade is B");
			}
		}
		if(a>=80){
			
				System.out.print("Your grade is A");
			
		}
		
	}
}