//handling exception using parent class exception 

public class exc7{
	public static void main(String[] args){
		try{
			int data=50/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("REst of the code.....");
	}
}
/*
java.lang.ArithmeticException: / by zero
REst of the code.....
*/