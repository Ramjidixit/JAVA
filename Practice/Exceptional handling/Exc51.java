//dont handle condition

public class Exc51 {
    public static void main(String[] args) {
        System.out.println("Hiiiiiiiii");
        System.out.println(10 / 0);
        System.out.println("Hello");
    }
}
/*
 * Hiiiiiiiii
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at Exc51.main(Exc51.java:4)
 */