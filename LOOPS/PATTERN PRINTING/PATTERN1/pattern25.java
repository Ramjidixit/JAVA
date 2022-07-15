/*print the following pattern 
         1
        123
       12345
      1234567
     123456789
      1234567
       12345
        123
         1                         */


public class pattern25 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            int p=1;
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(p);
                p=p+1;
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            int q=1;
            for(int j=1;j<=9-(2*i);j++){
                System.out.print(q);
                q=q+1;
            }
            System.out.println();
        }
    }
    
}
