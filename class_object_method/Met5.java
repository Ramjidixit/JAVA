//write a program whether a static method can access the instance variable or not 

class Test{
	//instance variable 
	int x;
	//parameterized constructor 
	Test(int x){
		this.x=x;
	}
	//static method accessing x value 
	static void access(){
		System.out.println("x="+x);
		
	}
}
class Met5{
	public static void main(String[] args){
		Test obj=new Test(55);
		Test.access();
	}
}