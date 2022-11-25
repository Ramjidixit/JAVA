/*use of throws-- when there is a possibility that a method might throw certain kinds of exception 
but there is no exceptional handling mechanism */

public class Exc6 {
    static void divide() throws ArithmeticException {
        int x = 22, y = 0, z;
        z = x / y;
    }

    public static void main(String[] args) {
        try {
            divide();

        } catch (ArithmeticException e) {
            System.out.println("Caught the exception" + e);
        }
    }

}
// Caught the exceptionjava.lang.ArithmeticException: / by zero
