//example other thing in try 

public class Exc10{
	public static void main(String[] args){
		try{
			int data=50/0;
			System.out.println("Rest of the code..");
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}/*
java.lang.ArithmeticException: / by zero
*/