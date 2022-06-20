/**Big Bazaar specifies its customers into three categories as Bronze, Silver and Gold. 
  If the shopping amount is greater than 25000, the category is GOLD. If the shopping 
  amount is between 10000 and 25000, the category is SILVER, otherwise the category is BRONZE.
   The discount offered for GOLD customers is 20% of the shopping amount, for SILVER customers
 is 10% of the shopping amount and 5% otherwise. Design a program in python that 
 asks the user to input the total shopping amount, outputs the category and amount to be paid. */

 import java.util.*;
 public class Big 
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the shopping amount:");
         int a=sc.nextInt();
         if(a>25000)
         {
             System.out.println("Category:Gold");
             System.out.println("Amount to be paid:"+(a-((a*20)/100)));
         }
         if(a>10000)
         {
             if(a<25000)
             {
             System.out.println("Category:Silver");
             System.out.println("Amount to be paid:"+(a-((a*10)/100)));
             }
         }
         if(a<10000)
         {
             System.out.println("Category:Bronze");
             System.out.println("Amount to be paid:"+(a-((a*05)/100)));
         }
         
     }
     
 }
 