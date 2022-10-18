/*write a program to craete Person class and an object Raju to Person class .Display the hashcode 
number of object using hashcode() */

//creating class and object
import java.util.*;
class Person{
	//properties-variables
	String name;
	int age;
	
	//actions-method
	void talk(){
	System.out.println("Hello I am "+name);
	System.out.println("My age is "+age);
	}
}
class Cl1{
	public static void main(String[] args){
		Person Raju=new Person(); //creating Person class object:Raju 
		System.out.println("Hash code="+Raju.hashCode()); //finding hashcode
		Raju.name="Rahim";
		Raju.age=45;
		Raju.talk();  //call the talk() method
	}		
}
//
/*
Hash code=746292446
Hello I am Rahim
My age is 45
*/
