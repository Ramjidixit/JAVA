/*print the following pattern 
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1                         */


public class pattern13 {
    public static void main(String[] args){
        
        for(int i=5;i>=1;i--){
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }

}
