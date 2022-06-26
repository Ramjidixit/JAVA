/**Write a currency program, that tells you how many number of 100, 50, 20, 10, 5, 2 and 1 
 * Rs notes will be needed for a given amount of money. For example if the total amount
 *  is Rs 545 then five 100 Rs notes, two 20 Rs note and one 5 Rs note will be needed.
 *  This sort of program can be used in ATM machines. */

import java.util.*;
public class notes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int notes;
        System.out.println("Enter the amount in rupee:");
        int n=sc.nextInt();
        System.out.println("Enter the value of note from which u want to begin:");
        int b=sc.nextInt();
        switch(b){
            default:
            System.out.println("Enter only valid values:");
            break;
        case 100:
            notes=n/100;
            System.out.println("Number of 100 rupee notes="+notes);
            n=n%100;
        case 50:
            notes=n/50;
            System.out.println("Number of 50 rupee notes="+notes);
            n=n%50;
        case 20:
            notes=n/20;
            System.out.println("Number of 20 rupee notes="+notes);
            n=n%20;
        case 10:
            notes=n/10;
            System.out.println("Number of 10 rupee notes="+notes);
            n=n%10;
        case 5:
            notes=n/5;
            System.out.println("Number of 5 rupee notes="+notes);
            n=n%5;
        case 2:
            notes=n/2;
            System.out.println("Number of 2 rupee notes="+notes);
            n=n%2;
        case 1:
            notes=n/1;
            System.out.println("Number of 1 rupee notes="+notes);
            n=n%1;

        }
        System.out.println();
    }
    
}
