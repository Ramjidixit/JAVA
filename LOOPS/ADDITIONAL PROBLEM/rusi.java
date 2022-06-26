//program to multiply two number by using russian peasant method

import java.util.*;
public class rusi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        System.out.println("Enter the two values:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=x;
        int b=y;
        while(a>=1){
            if(a%2!=0){
                s=s+b;
            }
            a/=2;
            b*=2;
        }
        
        System.out.print("The multiplication of two number= "+s);
    }
    
}