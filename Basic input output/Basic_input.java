import java.util.*;
class Basic_input{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		//input of integer value 
		int a=sc.nextInt();
		System.out.println(a);
		
		//input of float
		float b=sc.nextFloat();
		System.out.println(b);
		
		sc.nextLine();   //write this otherwise it will not take input of word or line.
		//if u want input after int or float use sc.nextLine();
		
		//input of a word or line
		String str=sc.nextLine();
		System.out.println(str);
		
		//input of a character 
		char r=sc.next().charAt(0);
		System.out.println(r);
		
	}
}