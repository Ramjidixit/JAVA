//to print custom message on exception

public class exc8{
	public static void main(String[] args){
		try{
			int data=60/0;
		}
		catch(Exception e){
			System.out.println("Can't divided by x=zero");
		}
	}
	
}
/*
Can't divided by x=zero
*/