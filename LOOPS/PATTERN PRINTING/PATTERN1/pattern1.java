/*print the following star pattern for n number of rows 
 *****
 ****
 ***
 **
 *                              */

import java.util.*;
public class pattern1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int a=sc.nextInt();
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
