//parametrized constructor 

public class cons{
	cons(int a){
		System.out.println("i am parametrized constructor");
	}
	public static void main(String[] args){
		System.out.println("Hello world");
		cons obj=new cons(4);
		System.out.println("hiii everyone");
	}
	
} /*
Hello world
i am parametrized constructor
hiii everyone
*/