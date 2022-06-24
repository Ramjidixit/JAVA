//write a program to find the sum of number entered using do while loop

import java.util.*;
public class sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        int b=0;
        int temp=0;
        do{
            b=a%10;
            temp=temp+b;
            a=a/10;
        }while(a>0);
        System.out.print("The sum of digit= "+temp);
    }
}
