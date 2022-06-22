//Program to find the sum of digits of an entered number.

import java.util.*;
public class sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int rem;
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        for( ;n>0;n/=10){
            rem=n%10;
            sum+=rem;
        }
        System.out.println("The sum of the given number is:"+sum);
    }
    
}
