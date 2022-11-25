//nested try statements 

public class Exc2 {
    public static void main(String[] args) {
        try{
            int a=2,b=4,c=2,x=7,z;
            int p[]={2};
            p[3]=33;
            try{
                z=x/((b*b)-(4*a*c));
                System.out.println("The value of z="+z);
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic expression ");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds");
        }
    }
    
}
//Out of bounds