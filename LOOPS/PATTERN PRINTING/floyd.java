/* print the pattern of Floyd's triangle
  1
  2 3
  4 5 6
  7 8 9 10
  11 12 13 14 15             */

import java.util.*;
public class floyd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=1;
        System.out.print("Enter the number of rows of floyd's triangle:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;//number=number+1
            }
            System.out.println();
        }
    }
    
}
