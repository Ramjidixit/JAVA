public class s2{
	public static void main(String[] args){
		//creating of string two methods
		String s1="namaste";
		String s2="namaste";
		System.out.println(s1);
		System.out.println(s2);
		String s3=new String("Namaste");
		System.out.println(s3);
		char ch[]={'r','a','m'};
		String s4=new String(ch); //convering array to string
		System.out.println(s4);
		String s5=new String("Shreya");
		s5.concat("Dixit");
		System.out.println(s5);	//print only Shreya 
		String s6="Tanya";
		s6=s6.concat(" Pandey");
		System.out.println(s6); //print Tanya Pandey because we explicitly assign it to the reference variable
		
	}
}