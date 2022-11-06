//Write a program to perform File merge(combine) operation.

import java.io.*;
public class Fileh15 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter("combine.txt");
        BufferedReader br=new BufferedReader(new FileReader("cricket.txt"));
        String line=br.readLine();
        while(line!=null){
            pw.println(line);
            line=br.readLine();
        }
        br=new BufferedReader(new FileReader("raju.txt"));
        line=br.readLine();
        while(line!=null){
            pw.println(line);
            line=br.readLine();

        }
        pw.flush();
        br.close();
        pw.close();
    
    }
}
