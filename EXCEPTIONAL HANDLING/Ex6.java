//finally block 

public class Ex6{
	public static void main(String[] args){
		try{
			System.out.println("Try block executed");
			System.out.println(10/0);
			
	}
	catch(NullPointerException e){
		System.out.println("Catch block executed");
	}
	finally{
		System.out.println("BHAi tu na mere ko rok nhi skta");
	 }
	}
}
/*
Try block executed
BHAi tu na mere ko rok nhi skta
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Ex6.main(Ex6.java:7)
*/