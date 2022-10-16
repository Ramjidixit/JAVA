//without try and catch
//all exceptions occur at runtime not at compile time

class Ex2{
	public static void main(String[] args){
		System.out.println("Statement1");
		System.out.println(10/0);
		System.out.println("Statement3");
	}
}
/*
Statement1
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Ex2.main(Ex2.java:6)
*/

class Ex2{
	public static void main(String[] args){
		try{
			System.out.println("Statement1");
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
	}
}
/*
Statement1
java.lang.ArithmeticException: / by zero

*/