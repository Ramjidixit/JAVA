//constructor overloading example

class A{
	A(){
		System.out.println("Constructor overloading.");
	}
	A(int a){
		System.out.println("a="+a);
	}
}
class c_overload{
	public static void main(String[] args){
		A obj1=new A();
		A obj2=new A(20);
	}
}

/*
Constructor overloading.
a=20
*/