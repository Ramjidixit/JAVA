//program to find the sum and average  of 10 positive numbers only 

import java.util.*;
public class positive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<11;i++){
            System.out.print("Enter the number please:");
            int b=sc.nextInt();
            if(b<0){
                System.out.println("Enter positive number please.");
                continue;
            }
            sum=sum+b;

        }
        System.out.println("Sum="+sum);
        System.out.println("Average="+(sum/10));
    }
    
}
