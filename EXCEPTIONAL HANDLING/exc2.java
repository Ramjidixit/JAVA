//example of exceptional handling

import java.util.*;
public class exc2{
	public static void main(String[] args){
		try{
			int data=100/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Rest of the code......");
	}
}

/*java.lang.ArithmeticException: / by zero
Rest of the code......
*/