//java catch multiple eceptions

public class Exc13{
	public static void main(String[] args){
		try{
			
			int a[]=new int[5];
			a[5]=90/0;
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
Arithmetic exception occur
*/