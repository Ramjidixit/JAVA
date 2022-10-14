public class Exc11{
	public static void main(String[] args){
		try{
			int data=80/0;
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("Hello");
		}
	}
}
/*
java.lang.ArithmeticException: / by zero
*/