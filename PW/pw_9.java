//Write a Java method to compute the average of three numbers
import java.util.*;
public class pw_9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(avg(a,b,c));

    }
    public static int avg(int a,int b,int c){
        return (a+b+c)/3;
    }
}