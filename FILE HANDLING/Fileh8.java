/*Write code to create a directory named with bhaskar123 in current working directory 
and create a file named with abc.txt in that directory. */


import java.io.*;
class  Fileh8
{
	public static void main(String[] args)throws IOException 
	{
		File f1=new File("bhaskar123");
		f1.mkdir();
		File f2=new File("bhaskar123","abc.txt");
		f2.createNewFile();
	}
}
