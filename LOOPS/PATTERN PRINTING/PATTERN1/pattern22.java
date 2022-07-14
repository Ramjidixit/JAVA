/*print the following pattern 
             5
            545
           54345
          5432345
         543212345                             */

import java.util.*;
public class pattern22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of rows:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                
                System.out.print(" ");
            }
            int p=5;
            for(int j=1;j<=i;j++){
                System.out.print(p);
                p=p-1;

            }
            int q=7-i;
            for(int j=1;j<=i-1;j++){
                System.out.print(q);
                q=q+1;
            }
            

            
            System.out.println();
        }
    }
}
