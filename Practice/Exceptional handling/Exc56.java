//finally block is always used with try and catch 

import java.util.*;

public class Exc56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter your name :");
            String name=sc.next();
            System.out.println("Your name="+name);
        }
        catch(InputMismatchException e){
            System.out.println("Enter valid name");

        }
        finally{
            System.out.println("hiii  hiii");
        }
    }
    
}
/*
 * Enter your name :
 * ram
 * Your name=ram
 * hiii hiii
 */

import java.util.*;

public class Exc56 {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Enter your name :");
            String name = sc.next();
            System.out.println("Your name=" + name);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid name");

        } finally {
            System.out.println("hiii  hiii");
        }
    }

}
/*
 * Enter your name :
 * ram
 * Your name=ram
 * hiii hiii
 */