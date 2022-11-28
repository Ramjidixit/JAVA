/*to print exception information-1.printStackTrace()
 * 2.toString()
 * 3.getMessage()
*/

public class Exc57 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();

        }
    }
}
/*
 * java.lang.ArithmeticException: / by zero
 * at Exc57.main(Exc57.java:9)
 */

public class Exc57 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());

        }
    }
}
// java.lang.ArithmeticException: / by zero

public class Exc57 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
    }
}
// by zero