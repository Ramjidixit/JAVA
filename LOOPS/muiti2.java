import java.util.Scanner;

//multiply two number without using * operator

public class muiti2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.print("Enter the number a:");
        int a=sc.nextInt();
        System.out.print("Enter the number b:");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            c=c+a;
        }
        System.out.println("The multiplication="+c);
    }
    
}
