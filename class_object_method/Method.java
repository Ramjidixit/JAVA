//Method in java 
class Box{
	double width;
	double height;
	double depth;
	void volume(){
		System.out.println("Volume is");
		System.out.println(width*height*depth);
	}
}
class Method{
	public static void main(String[] args){
		Box mybox1=new Box();
		Box mybox2=new Box();
		//assign values to mybox1 instance variable
		mybox1.width=10;
		mybox1.height=20;
		mybox1.depth=9;
		//assign values to mybox2 instance variable
		mybox2.height=6;
		mybox2.width=3;
		mybox2.depth=9;
		
		mybox1.volume(); //display volume of first box
		
		mybox2.volume(); //display volume of second box
		
	}
}
/*
Volume is
1800.0
Volume is
162.0
*/