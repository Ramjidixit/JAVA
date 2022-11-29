//to handle any type of exception 

public class Exc52a {
    public static void main(String[] args) {
        try {
            System.out.println(50 / 0);
        } catch (Exception e) {
            System.out.println("Exception hai isme");
            System.out.println(e);
        }
    }

}
/*
 * Exception hai isme
 * java.lang.ArithmeticException: / by zero
 */
