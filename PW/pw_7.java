//java program to add two number using methods

import java.util.*;
class Test {
    public int sum(int a,int b){
        int sum=a+b;
        return sum;
        
    }
    
}
class pw_7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Test t=new Test();
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int q=t.sum(a,b);
        System.out.println("Result="+q);
    }
}

