/*print the following pattern 
 5 5 5 5 5 
 4 4 4 4
 3 3 3
 2 2
 1                                    */

public class pattern12 {
    public static void main(String[] args){
        int num=5;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
            }
            num=num-1;
            System.out.println();
        }

    }
}
