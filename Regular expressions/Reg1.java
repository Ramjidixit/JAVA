//regular expression in java 

public class Reg1 {
    public static void main(String[] args) {
        
        String s1="980 Maple St., Smalltown MO 96421";
        System.out.println(s1.matches(".*\\d.*"));

    }    
}
