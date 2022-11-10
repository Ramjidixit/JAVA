//to show password using java file handling

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileInputStream;
import java.io.*;

public class Fileh23 {
    public static void main(String[] args) throws IOException {
        Console c = System.console();
        // String s = c.readLine();
        char[] pass = c.readPassword();
        System.out.println(pass);
        // FileInputStream f=new FileInputStream(System.in);
        // BufferedReader br=new BufferedReader(f);
        // String s2=br.readLine();
    }
}
