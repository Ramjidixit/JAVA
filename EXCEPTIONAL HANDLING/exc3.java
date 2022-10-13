//null pointer exception

public class exc3{
	public static void main(String[] args){
		try{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		System.out.println("Code completed...");
	}
}

/*java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
Code completed...
*/