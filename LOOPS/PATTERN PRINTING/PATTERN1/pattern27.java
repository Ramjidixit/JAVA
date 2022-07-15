/*print the following pattern 
                            5
                           545
                          54345
                         5432345
                        543212345
                         5432345
                          54345
                           545
                            5                            */

public class pattern27 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            int p=5;
            for(int j=1;j<=i;j++){
                System.out.print(p);
                p=p-1;

            }
            int q=7-i;
            for(int j=1;j<=i-1;j++){
                System.out.print(q);
                q=q+1;
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            int r=5;
            for(int j=1;j<=5-i;j++){
                System.out.print(r);
                r=r-1;

            }
            int s=i+2;
            for(int j=1;j<=4-i;j++){
                System.out.print(s);
                s=s+1;
            }
            System.out.println();
        }
    }

    
}
