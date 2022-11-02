//creating a file 

import java.io.*;
class Fileh1{
	public static void main(String[] args) throws IOException{
		File p=new File("siyaRam.txt");
		System.out.println("File created.");
		p.createNewFile();
		
	}
}