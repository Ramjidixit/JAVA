//string concatenation using + and concat()

public class s4{
	public static void main(String[] args){
		String s1=" Shreya";
		String s2=" Dixit";
		String s3=new String(" Pagal");
		System.out.println(s1+ s2);   //Shreya Dixit
		System.out.println(s2+ s1); //Dixit Shreya
		System.out.println(s1+ s3);//Shreya Pagal
		
		String s4=50+60+"Ram"+30;
		System.out.println(s4);  //110Ram30
		
		String s5="priya";
		String s6=" gla";
		String s7=new String(" MAthura");
		s7.concat("India");
		String s8=s7.concat("India");
		System.out.println(s5.concat(s6)); //priya gla
		System.out.println(s6.concat(s7));  //gla MAthura
		System.out.println(s7);  //MAthura
		System.out.println(s8);  //MAthuraIndia
		
		
		
 
 
		
		
	}
}