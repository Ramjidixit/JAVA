//primitive data type in java 

public class data_type{
	public static void main(String[] args){
		//byte-- -128 to 127
		byte b1=-126;
		System.out.println(b1);  //-126
		//byte b2=-139;
		//System.out.println(b2); //incompatible types: possible lossy conversion from int to byte
		byte b3=127;
		System.out.println(b3);
		
		//short-- -32768 to 32767
		short c1=32767;    //32767
		System.out.println(c1);
		short c2=23;   //23
		System.out.println(c2);
		
		//int-- -2147483648 to 2147483647
		int d1=-456;
		System.out.println(d1);
		
		//long--  
		long d2=78963589;
		System.out.println(d2);
		
		//float-- 32 bit storage
		 //  float d3=2.5;
		//  System.out.println(d3);  //incompatible types: possible lossy conversion from int to byte
		float d3=2.5f;
		System.out.println(d3);  //2.5  f is compulsory 
		
		//double--  64 bit storage 
		double d4=2.36;
		System.out.println(d4);
		
		//boolean-- true or false
		boolean d5=true;   //it is case sensitive write here true in this way 
		System.out.println(d5);
		boolean d6=false;
		System.out.println(d6);
		
		//char-- to store characters 
		   //char ch='abcd';      litral not char
		   //System.out.println(ch);
		char chh='a'; 
		System.out.println(chh);  //a
		
		
		
		
		
		
		
	}
}