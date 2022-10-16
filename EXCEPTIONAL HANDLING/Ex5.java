//finally block 

public class Ex5{
	public static void main(String[] args){
		try{
			System.out.println("Try block executed");
			System.out.println(10/0);
			
		}
		catch(ArithmeticException e){
			System.out.println("hey ,Arithmetic Exception occur");
			System.out.println(e);
		}
		finally{
			System.out.println("mai to hr haal me run houga mere bhai");
		}
	}
}
/*
Try block executed
hey ,Arithmetic Exception occur
java.lang.ArithmeticException: / by zero
mai to hr haal me run houga mere bhai

*/