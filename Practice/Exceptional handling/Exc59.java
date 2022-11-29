//if there are multiple try catch first one wil be executed 

public class Exc59 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[2] = 30 / 0;
            System.out.println(a[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("capacity se bahar ");
        } catch (ArithmeticException e) {
            System.out.println("divide by 0");
        }
    }
}
// divide by 0

// multiple try catch block

public class Exc59 {
    public static void main(String[] args) {
        try {
            System.out.println(30 / 0);
        } catch (ArithmeticException e) {
            System.out.println("divide by 0");

        }
        try {
            int a[] = new int[5];
            a[5] = 6;
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array limit out ");
        }
    }
}
/*
 * divide by 0
 * array limit out
 */

// kuchh kuchh naya krte hai

public class Exc59 {
    public static void main(String[] args) {
        try {
            System.out.println(30 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array limit out ");
        }

        try {
            int a[] = new int[5];
            a[5] = 6;
            System.out.println(a[10]);
        }

        catch (ArithmeticException e) {
            System.out.println("divide by 0");

        }
    }
}
/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at Exc59.main(Exc59.java:48)
 */

public class Exc59 {
    public static void main(String[] args) {
        try {
            System.out.println(30 / 0);
        } catch (Exception e) {
            System.out.println("divide by 0 ");
        }

        try {
            int a[] = new int[5];
            a[5] = 6;
            System.out.println(a[10]);
        }

        catch (Exception e) {
            System.out.println("array limit out");

        }
    }
}
/*
 * divide by 0
 * array limit out
 */