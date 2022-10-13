//ArrayIndexOutOfBoundsException

public class exc5{
	public static void main(String[] args){
		try{
			int a[]=new int[5];
			a[10]=50;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}

/*
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
*/