public class s7{
	public static void main(String[] args){
		//stringBuffer 
		StringBuffer s1=new StringBuffer("Shreya");
		s1.append(" Dixit");
		System.out.println(s1); //Shreya Dixit
		//The insert() method inserts the given String with this string at the given position.
		s1.insert(1,"hello");
		System.out.println(s1);  //Shellohreya Dixit
		//The replace() method replaces the given String from the specified beginIndex and endIndex.
		StringBuffer s2=new StringBuffer("ankit");
		s2.replace(1,3,"pagal");
		System.out.println(s2);   //apagalit
		//The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex.
		StringBuffer s3=new StringBuffer("rajpal");
		s3.delete(1,3);
		System.out.println(s3); //rpal
		//The reverse() method of the StringBuilder class reverses the current String.
		StringBuffer s4=new StringBuffer("parth");
		s4.reverse();
		System.out.println(s4);  //htrap
		//StringBuffer capacity() Method
		StringBuffer s5=new StringBuffer();
		System.out.println(s5.capacity());   //16
		s5.append("hello");     
		System.out.println(s5.capacity());  //16
		s5.append("hello how are u");
		System.out.println(s5.capacity());  //34
		
		
		
	}
}