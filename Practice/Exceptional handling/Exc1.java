//using try and catch for exceptional handling 

public class Exc1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 5;
        int x;
        try {
            x = a / (b - c); // exception here
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

    }

}
//Division by zero
