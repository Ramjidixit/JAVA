/*print the following pattern 
        1
       123
      12345
     1234567
    123456789                */

import java.util.*;
public class pattern20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int num=1;
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(num);
                num=num+1;
            }
            System.out.println();
        }
    }
    

}
