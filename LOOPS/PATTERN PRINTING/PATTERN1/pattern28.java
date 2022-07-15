/*print the following pattern 
1
1 2 
1 2 3
1 2 3 4
1 2 3
1 2
1                                        */

public class pattern28 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int k=3;k>=1;k--){
            for(int l=1;l<=k;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
