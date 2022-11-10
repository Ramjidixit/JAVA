//reading image from and write it in another 

import java.io.*;

public class Fileh22 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("hello.jpg");
        FileInputStream fis = new FileInputStream("dark.jpg");
        int i;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
        fos.close();
        fis.close();
    }
}
