//finally block in java 

public class Exc4 {
    public static void main(String[] args) {
        int a[] = { 5, 10 };
        int b = 5;
        try {
            int x = a[2] / b - a[1];

        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } catch (ArrayStoreException e) {
            System.out.println("Wrong data type");
        } finally {
            System.out.println("Mai to chaluga hee mujhe rok nhi skte");
        }

    }
}
/*
 * Array index error
 * Mai to chaluga hee mujhe rok nhi skte
 */