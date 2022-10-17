/*autoboxing in java :
The automatic conversion of primitive data type into its corresponding wrapper
 class is known as autoboxing, for example, byte to Byte, char to Character, int to Integer,
 long to Long,float to Float, boolean to Boolean, double to Double, and short to Short.*/
 
public class Wc1{
	public static void main(String[] args){
		int a=20;
		Integer i=Integer.valueOf(a);//conerting int into Integer example
		Integer j=a; //autoboxing now compiler will write Integer.valueof(a) internally
		System.out.println(a+" "+i+" "+j);
	}
/*
20 20 20
*/