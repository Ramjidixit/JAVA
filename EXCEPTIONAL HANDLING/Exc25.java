//When an exception occurs and is handled by the catch block
public class Exc25{
	public static void main(String[] args){
		try{
			System.out.println("Namaste g");
			int d=52/0;
			System.out.println(d);
		}
		catch(ArithmeticException e){
			System.out.println("HA hA ha");
			System.out.println(e);
		}
		finally{
			System.out.println("MAi to aauga hee");
		}
		
	}
}/*
Namaste g
HA hA ha
java.lang.ArithmeticException: / by zero
MAi to aauga hee
*/