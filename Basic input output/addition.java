//Program to add two entered integer values.

import java.util.*;
public class Main 
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The addition of two entered value is:"+(a+b));
    }
}