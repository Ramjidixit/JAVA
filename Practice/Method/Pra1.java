//Write a Java method to find the smallest number among three numbers.

import java.util.*;
public class Pra1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(small(a,b,c));
    }
    public static int small(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
}
