//program to convert a binary number to decimal number using while loop

import java.lang.Math;
import java.util.*;
public class binary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double c=0;
        double b=0;
        double rem=0;
        double d=0;
        System.out.print("Enter the number in binary:");
        int a=sc.nextInt();
        while(a>0){
            b=a%10;
            d=d+((Math.pow(2,c))*b);
            a=a/10;
            c=c+1;

        }
        System.out.println("The decimal number for the given binary input is:"+d);
    }
    
}
