//program to print the multiplication of digit of any number using while loop

import java.util.*;
public class multi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rem=1;
        int b=1;
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        while(a>1){
            rem=a%10;
            b=b*rem;
            a=a/10;

        }
        System.out.println("The multiplication of digits="+b);


    }
    
}
