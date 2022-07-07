/*print the following pattern
  5
  5 4 
  5 4 3
  5 4 3 2
  5 4 3 2 1                       */

public class pattern9 {
    public static void main(String[] args){
        
        for(int i=1;i<=5;i++){
            int num=5;
            for(int k=1;k<=i;k++){
                
                System.out.print(num+" ");
                num=num-1;

            }
            System.out.println();
        }
    }
    
}
