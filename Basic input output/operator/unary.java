//unary operator in java
public class unary{
	public static void main(String[] args){
		int x=20;
		int a=10;
		int b=10;
		int c=96;
		int d=-96;
		boolean e=true;
		boolean f=false;
		System.out.println(x++); //20
		System.out.println(++x); //22
		System.out.println(x--); //22
		System.out.println(--x); //20
		System.out.println(a++ + ++a); //22
		System.out.println(b++ + b++); //21
		System.out.println(~c);  //-97
		System.out.println(~d); //95
		System.out.println(!e); //false
		System.out.println(!f); //true
		
	}
}