/**Program to input the number of heads and feet in a farm and identify the number of chickens and goats in the farm. 
For example, if there are 340 heads and 1,060 feet, there are 150 chickens and 190 goats.**/

import java.util.*;
public class animal
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of head and feet:");
        int h=sc.nextInt();
        int f=sc.nextInt();
        int y=(f-(2*h))/2;
        int x=((4*h)-f)/2;
        System.out.println("The number of chickens="+x+" and the number of goats="+y);
    }
}