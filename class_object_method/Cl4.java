/*   write a program to craete Person class and an object Raju to Person class and use a
 default constructor to initialize the instance variables of person class   */

class Person{
	//instance variable 
	private String name;
	private int age;
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
class Cl4{
	public static void main(String[] args){
		//create Person class object:Shreya 
		Person Shreya=new Person();
		//call the talk method
		Shreya.talk();
		//Create another object Sita
		Person Sita=new Person();
		//call the talk method 
		
		Sita.talk();
	}
}
/*
My name is Shreya
My age is 18
My name is Shreya
My age is 18
*/
/*same data are stored in both the objects to mitigate this problem letus try 
parameterized constructor*/

class Person{
	//instance variable 
	private String name;
	private int age;
	//default constructor
	Person(){
		name="Shreya";
		age=18;
	}
	//parameterized constructor 
	Person(String s,int i){
		name=s;
		age=i;
	}
	//method
	void talk(){
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		
	}
}
class Cl4{
	public static void main(String[] args){
		//create Person class object:Shreya-here default constructor is called 
		Person Shreya=new Person();
		//call the talk method
		Shreya.talk();
		//Create another object Sita-parameterized constructor is called
		Person Sita=new Person("Sita",20);
		//call the talk method 
		
		Sita.talk();
	}
}
/*
My name is Shreya
My age is 18
My name is Sita
My age is 20
*/
/*suppose we dont give value in parameterized constructor then default construtor is 
   called
   we have written two constructors .both the constructors have same nature 
   ,but there is difference in the parameters.this is called constructor overloading.

