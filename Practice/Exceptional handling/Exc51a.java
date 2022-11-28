//common scenarios of java exception 

//1.A scenario where ArithmeticException occurs-If we divide any number by zero
public class Exc51a {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by 0");
        }
        
    }
}
//Divide by 0

//2.A scenario where NullPointerException occurs-If we have a null value in any variable
public class Exc51a {
    public static void main(String[] args) {
        try{
            String a=null;
            System.out.println(a.length());
        }
        catch(NullPointerException e){
            System.out.println("Null value");
        }
        
    }
}
//Null value



// A scenario where NumberFormatException occurs-If the formatting of any variable or number is mismatched
public class Exc51a {
    public static void main(String[] args) {
        try{
            String a="abc";
            int i=Integer.parseInt(a);
            System.out.println(i);
        }
        catch(NumberFormatException e){
            System.out.println("galat baat hai ");
        }
        
    }
}
//galat baat hai 


//A scenario where ArrayIndexOutOfBoundsException occurs

public class Exc51a {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[10]=50;
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("galat baat hai ");
        }
        
    }
}
//galat baat hai