//program to understand the use of continue statement 


public class cont {
    public static void main(String[] args){
        
        for(int i=0;i<11;i++){
            if(i==4){
                System.out.print("hi hi hi four print na hone dooga");
                System.out.print(" ");
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }
    }
    
}
