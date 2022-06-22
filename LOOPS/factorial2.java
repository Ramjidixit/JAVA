//Program to find the factorial of an entered number.using while loop

import java.util.*;
public class factorial2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temp=1;
        int i=1;
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        while(a>=i){
            {
                temp=temp*i;
            }
            i=i+1;
        }
        System.out.println("The factorial of the given number is:"+temp);
    }
    
}
