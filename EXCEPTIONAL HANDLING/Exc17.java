/*to handle the exception without maintaining the order of exceptions*/
public class Exc17{
	public static void main(String[] args){
		try{
			
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out ");
		}
		catch(Exception e){
			System.out.println("PArent exception occur");
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception occur");
		}
		
	}
}
/*
Exc17.java:15: error: exception ArithmeticException has already been caught
                catch(ArithmeticException e){
                ^
1 error
*/