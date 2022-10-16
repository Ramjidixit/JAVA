//Finally block 

public class Ex7{
	public static void main(String[] args){
		try{
			System.out.println("Try block executed");
			return ;
		}
		catch(ArithmeticException e){
			System.out.println("catch block executed");
		}
		finally{
			System.out.println("Finally block executed");
		}
		
	}
}
/*
Try block executed
Finally block executed
*/