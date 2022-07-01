/* print the pattern of inverted half pyramid(rotated by 180 degree)
                  *
                 **
                ***
               ****                                                      */
import java.util.*;
public class pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            //inner loop for printing spaces
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            //inner loop for printing stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
              
            }
            System.out.println();
              
            }
        }
                  
}
              
