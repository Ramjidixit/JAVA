//FileReader--to read character data from the file 

//approach 2

import java.io.*;
public class Fileh11 {
    public static void main(String[] args) throws IOException {
        File f=new File("Ramya.txt");
        FileReader fr=new FileReader(f);
        char[] ch=new char[(int)f.length()];
        fr.read(ch);
        for(char ch1:ch){
            System.out.print(ch1);
        }
    }
}
