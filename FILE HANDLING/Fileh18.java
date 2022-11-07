/*Write a program to write the sentences given below the file Demo1.txt
Hello, How are You?
Welcome to The chapter File Handling. 
Enjoy the session*/

import java.io.*;

class Fileh18 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Demo.txt");
        fw.write("Hello, How are You?\nWelcome to The chapter File Handling.\nEnjoy the session");
        fw.close();
    }
}