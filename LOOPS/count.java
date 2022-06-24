//program to count the digit in any number.

import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        int temp=0;
        int b=0;
        do{
            b=a%10;
            if(b>=0){

                    temp=temp+1;
                }
            a=a/10;
        }while(a>0);
        System.out.println("The digits in the given number is:"+temp);
    }
}
/**
  another method 
  do{
            a=a/10;
            temp++;
        }while(a>0); 
**/
