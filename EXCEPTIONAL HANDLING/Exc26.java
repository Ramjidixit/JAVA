//finally block 
/*Rule: For each try block there can be zero or more catch blocks, 
but only one finally block.
Note: The finally block will not be executed if the program exits 
(either by calling System.exit() or by causing a fatal error that causes the process to abort).
*/

public class Exc26{
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
		finally{
			System.out.println("AB mai na aa rha mera try nhi bnaya ");
		}
		
	}
}/*
Exc26.java:22: error: 'finally' without 'try'
                finally{
                ^
1 error
*/