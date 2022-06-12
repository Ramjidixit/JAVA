//Write a program to take two integer inputs from user and print sum and product of them.
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int mul=a*b;
        System.out.println("addition of numbers:");
        System.out.println(sum);
        System.out.println("multiplication=");
        System.out.print(mul);
    }
}