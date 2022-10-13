//example of abstract class having abstract method
abstract class abs1{  
  abstract void run();  
}  
class Honda4 extends abs1{  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
 abs1 obj = new Honda4();  
 obj.run();  
}  
}  


//output-running safely  when save it with honda4