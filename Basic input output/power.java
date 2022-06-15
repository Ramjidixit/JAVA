//Program to input two integer values and calculate first number raised to the power second number.

import java.util.*;
import java.lang.Math;
public class Main 
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The result of raising second number in two numbers is:"+(Math.pow(a,b)));
    }
    
}
