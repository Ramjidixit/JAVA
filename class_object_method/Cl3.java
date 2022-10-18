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
class Cl3{
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
C:\Users\DELL\Downloads\JAVA>javac Cl3.java
Cl3.java:29: error: name has private access in Person
                Sita.name="Rohan";
                    ^
Cl3.java:30: error: age has private access in Person
                Sita.age=56;
                    ^
2 errors
*/