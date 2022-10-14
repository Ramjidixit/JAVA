/*we generate NullPointerException, but didn't provide the corresponding exception type. In such case, the catch block 
containing the parent exception class Exception will invoked.*/

public class Exc16{
	public static void main(String[] args){
		try{
			
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception occur");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out ");
		}
		catch(Exception e){
			System.out.println("PArent exception occur");
		}
	}
}/*
PArent exception occur
*/