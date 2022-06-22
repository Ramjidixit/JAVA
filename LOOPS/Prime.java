//Program to find whether an entered number is prime or not

import java.util.*;
public class Prime{
    public static void main(String[] args){
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        for(int i=2;i<a;i++){
            if(a%i==0){
                temp=temp+1;
            }
        }
        if(temp>0){
            System.out.println("Not prime");
        }
        else{
            System.out.println("Prime");
        }

    }
}