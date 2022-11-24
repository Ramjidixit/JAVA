//to check whether character at position is or not 

import java.util.regex.*;

public class Reg5 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "as")); // true
        System.out.println(Pattern.matches("..s", "aas")); // true
        System.out.println(Pattern.matches("..s", "aaa")); // false
        System.out.println(Pattern.matches(".a", "Ram")); // false-has more than 2 character

    }

}
