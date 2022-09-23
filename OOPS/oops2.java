//class object and method

class Person{
	String name;
	int age;
	void walk(){
		System.out.println(name+" is walking.");
	}
	void eat(){
		System.out.println(name+" is eating.");
	}
	//function or method with argument
	void walk(int steps){
		System.out.println(name+" has walked "+steps +"steps");
		
	}
}

public class oops2{
	public static void main(String[] args){
	//in one file there is only one main class
	Person p1=new Person();
	p1.age=24;
	p1.name="shreya";
	Person p2=new Person();
	p2.age=18;
	p2.name="priya";
	System.out.println(p1.name+" "+p1.age);  //shreya 24
	System.out.println(p2.name+" "+p2.age);   //priya 18
	//calling method
	p1.eat();   //shreya is eating.
	p2.walk(); //priya is walking.
	//when u call argumented method then it will it call like
	p1.walk(10);  //shreya has walked 10steps
	
	}
} 