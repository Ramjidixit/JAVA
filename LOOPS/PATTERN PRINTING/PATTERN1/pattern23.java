/*print the following pattern 
               *********
                *******
                 *****
                  ***
                   *                               */
import java.util.*;
public class pattern23 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of rows:");
    int a=sc.nextInt();
    for(int i=1;i<=a;i++){
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=((2*a)+1)-(2*i);j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }   
}
