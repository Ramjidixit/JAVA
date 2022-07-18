/*PRINT THE following pattern 
                1
               212
              32123
             4321234
            543212345                         */

public class pattern32 {
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            int p=i;
            for(int j=1;j<=i;j++){
                System.out.print(p);
                p=p-1;
            }
            int q=2;
            for(int j=1;j<=i-1;j++){
                System.out.print(q);
                q=q+1;
            }
            System.out.println();

        }
    }
    
}
