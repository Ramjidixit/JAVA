/**Program to find the Simple Interest and the total 
amount when the Principal, Rate of Interest and Time are entered by the user.**/

import java.util.*;
public class Simple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal amount:");
        int a=sc.nextInt();
        System.out.print("Enter the rate of interest:");
        int b=sc.nextInt();
        System.out.print("Enter the time:");
        int c=sc.nextInt();        
        double si=(a*b*c)/100;
        System.out.print("The simple interest is :"+si);

    }
    
}
