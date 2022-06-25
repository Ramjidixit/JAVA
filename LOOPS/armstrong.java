//program to print armstrong number from 100 to 999 using nested loop 

public class armstrong{
    public static void main(String[] args){
        System.out.println("Armstong numbers are:");
        int num=0;
        int n=0;
        int cube=0;
        int d=0;
        int sum=0;
        for(num=100;num<=999;num++)
        {
            n=num;
            sum=0;
            while(n>0){
                d=n%10;
                n=n/10;
                cube=d*d*d;
                sum=sum+cube;
            }
            if(num==sum){
                System.out.print(sum);
                System.out.print("     ");
            }
        }
    }
}