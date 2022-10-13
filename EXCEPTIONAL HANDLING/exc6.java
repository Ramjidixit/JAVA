//problem without exception handling

public class exc6{
	public static void main(String[] args){
		int data=50/0;
		System.out.println("Rest of the code.....");
	}
}
/*Error: Could not find or load main class exe6
Caused by: java.lang.ClassNotFoundException: exe6
here the code is not executed finally to save such problems we 
use exceptional handling.*/

//now lets solve it by exceptional handling

public class exc6 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  /*java.lang.ArithmeticException: / by zero
	 rest of the code
	 */