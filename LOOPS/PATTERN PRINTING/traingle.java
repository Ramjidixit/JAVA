/*print the pattern of 0-1 traingle
 1
 0 1 
 1 0 1
 0 1 0 1
 1 0 1 0 1                    */

import java.util.*;
public class traingle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){//even position on calculation of row+column
                    System.out.print(1+" ");
                }else{////odd position on calculation of row+column
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    
}
