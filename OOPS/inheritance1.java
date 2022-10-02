//inheritance in java 

class animal{          //parent class or super class

	void eat(){
		System.out.println("I am eating");
	}
}
class inheritance1 extends animal{     //child class or sub class
	public static void main(String[] args){
		dog d=new dog();
		d.eat();
	}
} 

//I am eating