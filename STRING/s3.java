//comparison of string--using equals,==,and compareTo

public class s3{
	public static void main(String[] args){
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4="helo";
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1.equals(s3));  //true
		System.out.println(s1.equals(s4));   //false
		
		String s5="RAJAT";
		String s6="rajat";
		System.out.println(s5.equals(s6)); //false
		System.out.println(s5.equalsIgnoreCase(s6)); //true
		
		//note: equals compare the original content of the string while == compare reference not values
		String s7="hello";
		String s8="hello";
		String s9=new String("hello");
		System.out.println(s7==s8); //true
		System.out.println(s7==s9);  //false
		
		//using compareTo--return 0 if equals if greater return positive value if less than return negative value
		String s10="hello";
		String s11="hello";
		String s12=new String("ratan");
		System.out.println(s10.compareTo(s11));
		System.out.println(s11.compareTo(s12));
		System.out.println(s12.compareTo(s11));
		
		
	}
}