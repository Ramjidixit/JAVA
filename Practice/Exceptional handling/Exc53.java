//if try block alone compile time error 

public class Exc53 {
    public static void main(String[] args) {
        try{
            System.out.println(20/0);
        }
    }

}
/*
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
 * Syntax error, insert "Finally" to complete BlockStatements
 * 
 * at Exc53.main(Exc53.java:7)
 */

public class Exc53 {
    public static void main(String[] args) {
        try {
            System.out.println(20 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error hai ");
        }
    }
}
/* Error hai */

public class Exc53 {
    public static void main(String[] args) {
        try {
            System.out.println(20 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error hai ");
        } finally {
            System.out.println("mai to chalega re");
        }
    }
}
/*
 * Error hai
 * mai to chalega re
 */

public class Exc53 {
    public static void main(String[] args) {
        try {
            System.out.println(20 / 0);
        }

        finally {
            System.out.println("mai to chalega re");
        }
    }
}
/*
 * mai to chalega re
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at Exc53.main(Exc53.java:49)
 */

public class Exc53 {
    public static void main(String[] args) {
        try {
            System.out.println("Namaste ji");
            System.out.println(20 / 0);
        }

        finally {
            System.out.println("mai to chalega re");
        }
    }
}
/*
 * Namaste ji
 * mai to chalega re
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at Exc53.main(Exc53.java:65)
 */
