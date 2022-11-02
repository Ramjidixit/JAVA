//craeting file and implying some features on it 

import java.io.*;
class Fileh2{
	public static void main(String[] args) throws IOException{
		File f1=new File("Shreya.txt");
		System.out.println("Can file read="+f1.canWrite());
		System.out.println("IS file exist:"+f1.exists());
		System.out.println("File name:"+f1.getName());
		System.out.println("Length of file or character size or file size="+f1.length());
		
	}
}
/*
Can file read=false
IS file exist:false
File name:Shreya.txt
Length of file or character size or file size=0
*/

import java.io.*;
class Fileh2{
	public static void main(String[] args) throws IOException{
		File f1=new File("Shreya.txt");
		f1.createNewFile();
		System.out.println("Can file read="+f1.canWrite());
		System.out.println("IS file exist:"+f1.exists());
		System.out.println("File name:"+f1.getName());
		System.out.println("Length of file or character size or file size="+f1.length());
		
	}
}
/*
Can file read=true
IS file exist:true
File name:Shreya.txt
Length of file or character size or file size=0
*/

//after writing some data in file name Shreya.txt the out put become
/*
Can file read=true
IS file exist:true
File name:Shreya.txt
Length of file or character size or file size=12
*/