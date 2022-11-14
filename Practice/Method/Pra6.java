//Write a Java method to compute the sum of the digits in an integer.

import java.util.*;
public class Pra6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        System.out.println("sum of digits of number="+sum(a));

    }
    public static int sum(int a){
        int res=0;
        while(a>0){
            res=res+(a%10);
            a=a/10;

        }
        return res;
    }
}
