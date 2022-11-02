import java.io.*;
class Fileh3{
	public static void main(String[] args) throws IOException{
		int i;
		FileOutputStream r;
		r=new FileOutputStream("Rajeev.txt",true);
		String s="jai ho ";
		
		char ch[]=s.toCharArray();
		for(i=0;i<s.length();i++)
			r.write(ch[i]);
		r.close();
	}
}


