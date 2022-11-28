//multiple catch block with try block 

public class Exc54 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("Divide by 0");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
/* Divide by 0 */

public class Exc54 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
// java.lang.ArithmeticException: / by zero

public class Exc54 {
    public static void main(String[] args) {
        try {
            System.out.println("Radhey");
            System.out.println(10 / 0);
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
/*
 * Radhey
 * java.lang.ArithmeticException: / by zero
 */

public class Exc54 {
    public static void main(String[] args) {
        try {
            System.out.println("Radhey");
            System.out.println(10 / 0);
        }

        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Rajeev");
    }
}
/*
 * Radhey
 * java.lang.ArithmeticException: / by zero
 * Rajeev
 */