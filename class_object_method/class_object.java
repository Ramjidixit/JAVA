//a simple class 

public class Box{
	double width;
	double height;
	double depth;
}
/*
Error: Main method not found in class Box, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/

class Box{
	double width;
	double height;
	double depth;
	
}
class Boxdemo{
	public static void main(String[] args){
		Box mybox=new Box();
		mybox.width=10;
		mybox.height=20;
		mybox.depth=15;
		double vol=mybox.width*mybox.height*mybox.depth;
		System.out.println("volume is="+vol);
	}
}

//volume is=3000.0