//string in java

//how to declare string
public class s1{
	public static void main(String[] args){
		String s1=new String("he is a boy");
		System.out.println(s1);
		//string buffer
		StringBuffer s2=new StringBuffer("hello how are u");
		System.out.println(s2);
		s2.append(" namaste");  //append is used to add somrthing after any line
		System.out.println(s2);
		byte ascii[]={71,70,71};
		String s3=new String(ascii);
		String s4=new String(ascii,0,1);
		System.out.println(s3);
		System.out.println(s4);
		//construct one string from another
		char c[]={'g','f','g'};
		String s5=new String(c);
		System.out.println(s5);
		String s6=new String(s5);
		System.out.println(s6);
		//strings are immutable 
		String s7=new String("RAmlaal");
		s7.concat("hello");  // print only RAmlaal
		System.out.println(s7);
		//string cannot appended nor concat but stringbuffer can be 
		String s8="Radhe";
		s8=s8.concat("Shyam");
		System.out.println(s8);
	}
}


