//StringTokenizer in Java
import java.util.StringTokenizer;
public class s8{
	public static void main(String[] args){
		StringTokenizer s1=new StringTokenizer("my name is dixit");
		while(s1.hasMoreTokens()){
			System.out.println(s1.nextToken()); 
			/*my
			name
			is
			dixit*/
			StringTokenizer st = new StringTokenizer("my,name,is,khan");  
        
            // printing next token  
			System.out.println("Next token is : " + st.nextToken(","));  
		}
	}
}