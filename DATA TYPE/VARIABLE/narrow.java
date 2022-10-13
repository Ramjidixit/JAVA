//java variable example:narrowing(typecasting)
public class narrow{
	public static void main(String[] args){
		float f=10.5f;
		//int a=f;  //compile time error
		int a=(int)f;
		System.out.println(f); // 10.5
		System.out.println(a); // 10
	}
}