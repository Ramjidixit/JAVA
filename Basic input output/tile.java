/**Program that calculates the number of rectangular tiles required to cover a rectangular floor 
if the dimensions of the floor and the dimensions of a tile are entered by the user.**/

import java.util.*;
public class tile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of floor:");
        System.out.print("Enter the length:");
        int a=sc.nextInt();
        System.out.print("Enter the breadth:");
        int b=sc.nextInt();
        System.out.println("Enter the dimensions of tile:");
        System.out.print("Enter the length:");
        int c=sc.nextInt();
        System.out.print("Enter the breadth:");
        int d=sc.nextInt();
        System.out.println("The number of tiles required:"+((a*b)/(c*d)));

        
    }
}