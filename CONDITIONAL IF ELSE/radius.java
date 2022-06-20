/**Program to input the centre of a circle, radius of the circle and an arbitrary point P(x,y) and 
determine whether the point is inside the circle, on the circle or outside the circle.**/

import java.util.*;
public class radius {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates of circle's centre:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the coordinates of point:");
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.print("Enter the radius of circle:");
        int e=sc.nextInt();
        if((a+e)<c){
            if((b+e)<d){
                System.out.println("Point is inside the circle.");
            }

            
        }
        if((a+e)==c){
            if((b+e)==d){
                System.out.println("Point is on the circle");
            }
            
        }
        if((a+e)>c){
            if((b+e)>d){
                System.out.println("Point is outside the circle.");
            }
            
        }
        
    }
}
