/*  A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.   */

import java.util.*;
public class q3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of units of purchased quantity=");
int a=sc.nextInt();
int total=a*100;
if(total>1000){
double p=total*0.9;
System.out.print("Total cost="+p);
}
else{
System.out.print("Total cost="+total);
}
}
}