//Program to find whether an entered number is prime or not using while loop

import java.util.*;
public class Prime2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temp=0;
        int i=2;
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        while(a>i){
            if(a%i==0){
                temp=temp+1;
                
            }
            i=i+1;
        }
        if(temp>0)
        {
            System.out.println("Not prime");
        }
        if(temp==0)
        {
            System.out.println("Prime");
        }


    }
    
}
