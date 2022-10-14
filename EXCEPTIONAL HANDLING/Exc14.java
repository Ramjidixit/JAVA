public class Exc14{
	public static void main(String[] args){
		try{
			
			int a[]=new int[5];
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

//Array index out