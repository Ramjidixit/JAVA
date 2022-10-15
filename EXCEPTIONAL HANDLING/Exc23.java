//when exception occur but not handled by catch block
public class Exc23{
	public static void main(String[] args){
		try{
			System.out.println("Insider try");
			int d=25/0;
			System.out.println(d);
			

		}
		catch(NullPointerException e){
			System.out.println("Exception ha ha");
		}
		finally{
			System.out.println("dekho yaha maine catch me exception nhi dee");
		}
	}
}
/*
Insider try
dekho yaha maine catch me exception nhi dee
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exc23.main(Exc23.java:6)
*/