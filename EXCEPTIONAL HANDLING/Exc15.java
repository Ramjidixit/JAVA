/*try block contains two exceptions. But at a time only one exception occurs and its corresponding catch block is executed.*/
public class Exc15{
	public static void main(String[] args){
		try{
			
			int a[]=new int[5];
			a[5]=30/0;
			System.out.println(a[20]);
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
}

//Arithmetic exception occur