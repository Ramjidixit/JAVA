//write a program for a method without parameters but  with a return type 

class Sample{
	//instance variables 
	private double num1,num2;
	//parameterized constructor 
	Sample(double x,double y){
		num1=x;
		num2=y;
	}
	double sum(){
		double res=num1+num2;
		return res;
	}
	
}
class Met2{
	public static void main(String[] args){
		Sample s=new Sample(10.5,22.6);
		double r=s.sum();
		System.out.println("sum="+r);
	}
}
