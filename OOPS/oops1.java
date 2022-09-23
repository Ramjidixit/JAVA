//class and object
//class does not have any space in memory at run time 


//main outside the class

class Person{
	String name;
	int age;
}

public class oops1{
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
	}
} 


//main inside the class 
class student{
	int age;
	String name;
	public static void main(String[] args){
		student s1=new student();
		s1.name="ram";
		s1.age=25;
		System.out.println(s1.age+" "+s1.name); //25 ram
	}
	
}

