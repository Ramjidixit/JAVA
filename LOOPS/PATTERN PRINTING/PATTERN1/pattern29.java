/*print the following pattern 
    *      *
    **    **
    ***  ***
    ********
    ********
    ***  ***
    **    **
    *      *                                  */

public class pattern29 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            for(int j=1;j<=8-(2*i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*i)-2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
