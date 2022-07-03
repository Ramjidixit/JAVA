/*print the following number pattern 
 2
 3 4 
 4 5 6
 5 6 7 8
 6 7 8 9 10                   */

public class pattern7 {
    public static void main(String[] args){
        int n=2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+j+" ");//printing the summation of i+j
                
            }
            System.out.println();
            
            
        }
    }
    
}
