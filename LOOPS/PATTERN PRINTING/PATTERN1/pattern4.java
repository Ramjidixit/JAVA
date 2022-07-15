/*print the following pattern 
 *****
 *   *
 *   *
 *****                          */
        //note-check code again it is thoda thoda wrong 
import java.util.*;
public class pattern4{
    public static void main(String[] args){
        int n=4;
        int m=5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==m-1 || j==0 || j==n-1){
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}