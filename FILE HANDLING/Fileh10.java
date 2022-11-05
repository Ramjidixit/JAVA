//FileReader--to read character data from the file 

//approach 1

import java.io.*;

public class Fileh10 {
    public static void main(String[] args) throws IOException {
        FileReader f1 = new FileReader("Ramya.txt");
        int i = f1.read();
        while (i != -1) {
            System.out.print((char) i);
            i = f1.read();
        }
    }
}
