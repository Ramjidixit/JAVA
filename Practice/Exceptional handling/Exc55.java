//two same catch block give error 

public class Exc55 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("divide by 0");
        } catch (ArithmeticException e) {
            System.out.println("Dubara se ");
        }
    }
}
/*
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
 * Unreachable catch block for ArithmeticException. It is already handled by the
 * catch block for ArithmeticException
 * 
 * at Exc55.main(Exc55.java:11)
 */
