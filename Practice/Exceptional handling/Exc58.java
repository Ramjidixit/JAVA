//throw keyword-The "throw" keyword is used to throw an exception. 

public class Exc58 {
    public static void main(String[] args) {
        int []x=new int[3];
        throw new ArrayIndexOutOfBoundsException(":5");

    }
}
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: :5
        at Exc58.main(Exc58.java:6) */

