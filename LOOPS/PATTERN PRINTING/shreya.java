/*print the following pattern
    1
    22
    333
    4444
    5555           */

import java.util.*;
public class shreya{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
               
                System.out.print(i+" ");
            }
        System.out.println();
        }
    }
    
}
