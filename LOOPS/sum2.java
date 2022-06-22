////Program to find the sum of digits of an entered number.using while loop

import java.util.*;
public class sum2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temp=0;
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        while(a>0){
            temp=temp+(a%10);
            a=a/10;
        }
        System.out.println("Sum of number="+temp);
    }
}