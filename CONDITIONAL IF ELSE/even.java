//Program to find whether an input number is even or odd.

import java.util.*;
public class even
 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        if(a%2==0)
        {
         System.out.println("The given number is even.");
        }
        else
        {
         System.out.println("The given number is odd.");
        }

    }
}
