//Program to find the factorial of an entered number.

import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temp=1;
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        for(int i=a;i>0;i--){
            temp=temp*i;
        }
        System.out.println("Factorial of the number="+temp);
    
    }
    
}
