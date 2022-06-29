/** print the pattern of solid rectangle   
     *****
     *****
     *****
     *****                     **/

import java.util.*;
public class solid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int n=sc.nextInt();
        System.out.print("Enter the number of stars in each line:");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
        System.out.println();
        }

    }
}
