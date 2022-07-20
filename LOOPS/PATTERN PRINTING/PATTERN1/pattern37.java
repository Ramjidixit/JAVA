/*print the following pattern 
 1111
 222
 33
 4                */

public class pattern37 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
