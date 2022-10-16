/*•	The specialty of finally block is it will be executed always irrespective of whether the excepti
on raised or not raised and whether handled or not handled.*/

//finally block 

class Ex4{
	public static void main(String[] args){
		try{
			System.out.println("Try block executed");
		}
		catch(ArithmeticException e){
			System.out.println("catch block executed");
		}
		finally{
			System.out.println("Finally block executed.");
		}
	}
}
/*
Try block executed
Finally block executed.
*/