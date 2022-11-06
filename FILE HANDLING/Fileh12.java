//using bufferwriter 

import java.io.*;
class Fileh12
{
	public static void main(String[] args)throws IOException 
	{
		FileWriter fw=new FileWriter("cricket.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch={'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("bhaskar");
		bw.newLine();
		bw.write("software solutions");
		bw.flush();
		bw.close();
		}
}
