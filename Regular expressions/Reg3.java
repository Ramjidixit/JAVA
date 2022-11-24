/*Create a regular expression that accepts 10 digit numeric characters 
 starting with 7, 8 or 9 only.*/

import java.util.*;
import java.util.regex.*;

public class Reg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String a = sc.next(); // give integer value in string
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9632541189")); // true
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "5698745625")); // false
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7896325412")); // true
        System.out.println(Pattern.matches("[789]{1}[0-9]{2}", a)); // true
    }

}
