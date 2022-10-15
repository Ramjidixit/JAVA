//finally block in java 
//when an exception does not occur
public class Exc22{
	public static void main(String[] args){
		try{
			int data=25/5;
			System.out.println(data);
			
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		finally{
			System.out.println("finally block is always executed");
		}
	}
}
/*
5
finally block is always executed
*/