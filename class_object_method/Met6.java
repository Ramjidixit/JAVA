//write a program to test whether a static method can access the static variable or not 

class Test{
	//static variable 
	static int x=69;
	
	
	//static method accessing x value 
	static void access(){
		System.out.println("x="+x);
		
	}
}
class Met6{
	public static void main(String[] args){
		
		Test.access();
	}
}
//x=69