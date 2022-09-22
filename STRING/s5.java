/* stringbuilder class --StringBuilder is class provides append() method to perform concatenation operation. 
The append() method accepts arguments of different types like Objects, StringBuilder,
 int, char, CharSequence, boolean, float, double. StringBuilder is the most popular and fastet 
way to concatenate strings in Java. It is mutable class which means values stored in 
StringBuilder objects can be updated or changed. */

 
 
 public class s5{
	 public static void main(String[] args){
		 //String concatenation using StringBuilder class
		 StringBuilder s1=new StringBuilder("new ");
		 StringBuilder s2=new StringBuilder("Laptop");
		 StringBuilder s3=s1.append(s2);
		 System.out.println(s3);  //new Laptop
		 //String concatenation using format() method
		String s4=" Shreya";
		String s5=" Dixit";
		String s6=String.format("%s%s",s4,s5);
		System.out.println(s6);  //Shreya Dixit
		
		
		 
		 
	 }
 }