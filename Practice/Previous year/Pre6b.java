import java.io.*;
class A{
    void m1() throws IOException{
        System.out.println("IN m1 A");
    }
}
class B extends A{
    void m1() throws IOException{
        System.out.println("IN m1 B");
    }
}



public class Pre6b {
    public static void main(String[] args) {
        A a=new B();
        try{
            a.m1();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
//IN m1 B