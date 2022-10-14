//to print custom message on exception 

public class Exc12{
	public static void main(String[] args){
		try{
			int data=80/0;
			
		}
		catch(ArithmeticException e){
			System.out.println("can't divide by zero");
			
		}
	}
}/*
can't divide by zero
*/