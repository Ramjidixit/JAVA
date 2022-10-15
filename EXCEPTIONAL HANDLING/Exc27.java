//throw exception in java 
//Throwing Unchecked Exception
public class Exc27{
	public static void validate(int age){
		if(age<18){
			throw new ArithmeticException("PErson is not allowed to vote");
		}
		else{
			System.out.println("Person is eligible to vote");
		}
	}
	public static void main(String[] args){
		//calling the function 
		validate(12);
		
		
	}
}/*
Exception in thread "main" java.lang.ArithmeticException: PErson is not allowed to vote
        at Exc27.validate(Exc27.java:5)
        at Exc27.main(Exc27.java:13)
*/
public class Exc27{
	public static void validate(int age){
		if(age<18){
			throw new ArithmeticException("PErson is not allowed to vote");
		}
		else{
			System.out.println("Person is eligible to vote");
		}
	}
	public static void main(String[] args){
		//calling the function 
		validate(22);
		
		
	}
}/*
Person is eligible to vote
*/