/**Program to input the number of overs in a Cricket match and output the maximum runs a player 
can score in the match. Assume that there are no extra runs or NO balls in the match played.For example, 
in a 50 over match, the maximum runs scored are 1653.**/

import java.util.*;
public class runs
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of overs in the match:");
        int a=sc.nextInt();
        int b=((a-1)*33)+36;
        System.out.println("The total score by player="+b);
    }
} 
    

