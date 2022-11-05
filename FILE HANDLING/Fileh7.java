//: Write code to create a file named with demo.txt in current working directory.
import java.io.*;
public class Fileh7 {
    public static void main(String[] args) throws IOException {
        File f=new File("demo.txt");
        f.createNewFile();
    }
    
}
