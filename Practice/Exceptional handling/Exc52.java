//handled situation

public class Exc52 {
    public static void main(String[] args) {
        try {
            System.out.println("hiiiiiiiiiiii");
            System.out.println(20 / 0);
            System.out.println("hello");

            System.out.println("hello");
        } catch (ArithmeticException e) {
            System.out.println("divide by 0");

        }
        System.out.println("Namaste");

    }
}
/*
 * hiiiiiiiiiiii
 * divide by 0
 * Namaste
 */

public class Exc52 {
    public static void main(String[] args) {
        try {
            System.out.println("hiiiiiiiiiiii");
            System.out.println("hello");
            System.out.println(20 / 0);

            System.out.println("hello");
        } catch (ArithmeticException e) {
            System.out.println("divide by 0");

        }

    }
}
/*
 * hiiiiiiiiiiii
 * hello
 * divide by 0
 */
