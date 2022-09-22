//substring of string
import java.util.*;
public class s6{
	public static void main(String[] args){
		String s1="hello";
		System.out.println(s1.substring(0,1)); //h
		System.out.println(s1.substring(0,2));  //he  
		System.out.println(s1.substring(0,3));  //hel
		System.out.println(s1.substring(2,4)); //ll
		System.out.println(s1.substring(3,5)); //lo
		//using string.split() method
		String s2="welcome to gla";
		String[] sentences = s2.split("\\."); 
		System.out.println(Arrays.toString(sentences)); //[welcome to gla]
		String s3=new String("Shreya");
		System.out.println(s3.toUpperCase());  //SHREYA
		System.out.println(s3.toLowerCase()); //shreya
		System.out.println(s3);  //Shreya
		//trim()-used to eliminate white space before and after string 
		String s4="   rajesh   ";
		System.out.println(s4.trim());  //rajesh
		//startswith and endswith
		String s5="rajeev kumar";
		System.out.println(s5.startsWith("ra")); //true
		System.out.println(s5.endsWith("ar"));  //true
		System.out.println(s5.startsWith("ku"));  //false
		System.out.println(s5.endsWith("ee"));  //false 
		//The String class charAt() method returns a character at specified index.
		System.out.println(s5.charAt(2));   //j
		System.out.println(s5.charAt(0));  //r
		//The String class length() method returns length of the specified String.
		System.out.println(s5.length());  //12
		/*The String class valueOf() method coverts given type such as int, long,
		float, double, boolean, char and char array into String.*/
		int a=10;
		String s=String.valueOf(a);
		System.out.println(s+10);  //1010
		/*The String class replace() method replaces all occurrence of first sequence
		of character with second sequence of character.*/
		String s6="Shreya is Mishra.";
		String s7=s6.replace("Mishra","Dixit");
		System.out.println(s7);
		
		
		
		
	}
}

