/*constructor--to initialize the instance variable .the constructor name and class 
name should be same and name should be end with simple braces() */

/*   write a program to craete Person class and an object Raju to Person class and use a
 default constructor to initialize the instance variables of person class   */

class Person{
	//instance variable 
	String name;
	int age;
	//default constructor
	Person(){
		name="Shreya";
		age=18;
	}
	//method
	void talk(){
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		
	}
}
class Cl2{
	public static void main(String[] args){
		//create Person class object:Shreya 
		Person Shreya=new Person();
		//call the talk method
		Shreya.talk();
		//Create another object Sita
		Person Sita=new Person();
		//call the talk method 
		Sita.name="Rohan";
		Sita.age=56;
		Sita.talk();
	}
}
/*
My name is Shreya
My age is 18
My name is Rohan
My age is 56
*/

