/* print the following pattern 
 5 4 3 2 1 
 5 4 3 2
 5 4 3 
 5 4 
 5                                    */

public class pattern14 {
    public static void main(String[] args){
        
        for(int i=5;i>=1;i--){
            int num=5;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num-1;
            }
            System.out.println();
        }

    }
    
}