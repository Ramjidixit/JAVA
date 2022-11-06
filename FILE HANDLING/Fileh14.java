//using printwriter

import java.io.*;
public class Fileh14 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("raju.txt");
        PrintWriter out=new PrintWriter(fw);
        out.write(100);  //d
        out.println(100);  //100
        out.println(true);  //true
        out.println('c');   //c
        out.println("bhaskar");   //bhaskar
        out.flush();
        out.close();
    }
}
