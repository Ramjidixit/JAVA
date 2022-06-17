//Program to find the hypotenuse of a right angled triangle, when the base and height are entered by the user

import java.util.*;
import java.lang.Math;
class main 
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=((a*a)+(b*b));
        double d=0.5;
        double e=Math.pow(c,d);
        System.out.println("The hypotenuse of the triangle is="+e);


        
    }
    
}