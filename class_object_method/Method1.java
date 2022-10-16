//using parmetrized method

class Box{
	double width;
	double height;
	double depth;
	double volume(){
		
		return width*height*depth;
	}
	void setDim(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
}
class Method1{
	public static void main(String[] args){
		Box mybox1=new Box();
		Box mybox2=new Box();
		double vol;
		//initialize each box
		mybox1.setDim(10, 20, 15);
		mybox2.setDim(3, 6, 9);
		
		//getting volume of each box
		vol=mybox1.volume();
		System.out.println("Volume of first box=" +vol);
		
		vol=mybox2.volume(); 
		System.out.println("Volume of first box=" +vol);
		
	}
}
/*
Volume of first box=3000.0
Volume of first box=162.0
*/