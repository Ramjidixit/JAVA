//Program to input two numbers and subtract the smaller number from the greater number.

import java.util.*;
public class greater
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("The difference between two numbers is "+(a-b));
    
        }
        else
        {
            System.out.println("The difference between two numbers is "+(b-a));

        }

    }
}