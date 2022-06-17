//Program to find the area and circumference of a circle,
//when the radius is entered by the user. However, the user can input radius in integer or float.

import java.util.*;
public class  Main 
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=3.14*a*a;
        double c=2*3.14*a;
        System.out.print("Area of the circle is= "+b+" and circumference is="+c);
        
        
    }
}