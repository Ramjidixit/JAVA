/*Create a regular expression that accepts alphanumeric characters only.  
Its length must be six characters long only.*/

import java.util.regex.*;

public class Reg2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-z0-9]{6}", "arun32")); // true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Ramio5")); // true
        System.out.println(Pattern.matches("[a-z0-9A-Z]{6}", "123Ram")); // true
        System.out.println(Pattern.matches("[A-Za-z0-9]{6}", "ramjidixit")); // false
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "123Rajeev")); // false
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "123eev")); // true

    }
}
