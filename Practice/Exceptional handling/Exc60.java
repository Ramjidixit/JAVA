//throw keyword ka use 

import java.util.*;

public class Exc60 {
    public static void validate(int a) {
        if (a < 18) {
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Eligible to vote ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int a=sc.nextInt();
        validate(a);

    }
}
/*
 * Enter your age:
 * 25
 * Eligible to vote
 */

/*
 * Enter your age:
 * 13
 * Exception in thread "main" java.lang.ArithmeticException: Person is not
 * eligible to vote
 * at Exc60.validate(Exc60.java:7)
 * at Exc60.main(Exc60.java:16)
 */