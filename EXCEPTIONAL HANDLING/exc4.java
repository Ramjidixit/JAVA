//NumberFormatException Error 

public class exc4{
	public static void main(String[] args){
		try{
			String s="abc";
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}
/*java.lang.NumberFormatException: For input string: "abc"
*/