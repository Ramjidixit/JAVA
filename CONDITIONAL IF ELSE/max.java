//Program to find the maximum of the three entered numbers.

import java.util.*;
public class max
 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers please:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is greatest."+a);
            }
        }
        if(b>a)
        {
            if(b>c)
            {
                System.out.println("B is greatest."+b);
            }
        }
        if(c>a){
            if(c>b){
                System.out.println("c is gratest."+c);
            }
        }
        
    }
    
}
