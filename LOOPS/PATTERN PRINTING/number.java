/*print the following half pyramid with number pattrn
 1
 12
 123
 1234
 12345          */

import java.util.*;
public class number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");//printing j and space 
                
            }
            System.out.println();
        }
    }
    

}
