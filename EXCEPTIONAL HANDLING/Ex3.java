/*•	If try with multiple catch blocks presents then 
order of catch blocks is very important it should be from
 child to parent by mistake if we are taking from parent to child then
 we will get  Compile time error saying “exception  xxx has already been caught”.*/
 
class Ex3{
	 public static void main(String[] args){
		 try{
			 System.out.println(10/0);
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 catch(ArithmeticException e){
			 e.printStackTrace();
		 }
	 }
 }/*Ex3.java:14: error: exception ArithmeticException has already been caught
                 catch(ArithmeticException e){
                 ^
1 error
*/
class Ex3{
	 public static void main(String[] args){
		 try{
			 System.out.println(10/0);
		 }
		 
		 
		 catch(ArithmeticException e){
			 e.printStackTrace();
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
	 }
 }
/*
java.lang.ArithmeticException: / by zero
        at Ex3.main(Ex3.java:26)
*/