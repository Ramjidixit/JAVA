//write a program to take input of name,fathers name ,roll no ,married or not,marks of a student 
import java.util.*;
public class Basic_input2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String str=sc.nextLine();
		System.out.println("Name="+str);
		System.out.println("Enter your father's name:");
		String str1=sc.nextLine();
		System.out.println("Father's Name="+str1);
		System.out.println("Enter your marks:");
		int a=sc.nextInt();
		System.out.println("Marks="+a);
		sc.nextLine();
		System.out.println("Enter your marital status:");
		String str2=sc.nextLine();
		System.out.println("Marital status="+str2);
		System.out.println("Attend class Y or N:");
		char r=sc.next().charAt(0);
		System.out.println("Attend class:"+r);
		
		
		
		
	}
}