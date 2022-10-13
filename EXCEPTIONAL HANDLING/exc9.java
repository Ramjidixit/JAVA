//resolve exception in catch block 

public class exc9{
	public static void main(String[] args){
		int i=80;
		int j=0;  
		int data;
		try{
			data=i/j;
		}
		catch(Exception e){
			System.out.println(i/(j+2));
		}
	}
}