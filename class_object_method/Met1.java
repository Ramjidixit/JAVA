//write a program for a method without parameters and without a return type 

class Sample{
	//instance variables 
	private double num1,num2;
	//parameterized constructor 
	Sample(double x,double y){
		num1=x;
		num2=y;
	}
	void sum(){
		double res=num1+num2;
		System.out.println("sum="+res);
	}
	
}
class Met1{
	public static void main(String[] args){
		Sample s=new Sample(10.5,22.6);
		s.sum();
	}
}