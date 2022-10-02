//method overloading

class A{
	void display(){
		System.out.println("Gla university.");
	}
	void display(int a){
		System.out.println("Value of int a="+a);
	}
}
class m_overload{
	public static void main(String[] args){
		A obj=new A();
		obj.display();
		obj.display(30);
		
	}
}
/*
Gla university.
Value of int a=30
*/