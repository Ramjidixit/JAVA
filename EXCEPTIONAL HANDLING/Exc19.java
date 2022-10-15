//nested try block 

public class Exc19{
	public static void main(String[] args){
		try{
			try{
				System.out.println("Going to divide by 0");
				int b=39/0;
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
			try{
				int a[]=new int[5];
				a[5]=4;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			System.out.println("Jai Ho");
		}
		catch(Exception e){
			System.out.println("handeled the exception");
		}
	}
}
/*
Going to divide by 0
java.lang.ArithmeticException: / by zero
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
Jai Ho
*/