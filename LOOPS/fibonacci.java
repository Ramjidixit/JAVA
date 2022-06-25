//program to generate fibonacci series upto n term using for loop 

import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n=sc.nextInt();
        int b=1;
        int a=1;
        int p;
        int c=0;
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        for(int z=1;z<(n-1);z++){
            c=a+b;
            System.out.print(c);
            System.out.print(" ");
            p=b;
            b=c;
            a=p;
        }
    }
}
