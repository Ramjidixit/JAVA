//USING DIFFERENT METHODS IN JAVA using FileWriter()  used to write something to the file 

import java.io.*;
class Fileh9{
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("raju.txt",true);
        fw.write(98);  //covert it to it's ASCII value or character value b
        fw.write("haskar\nsoftware solutions "); //to write string to the file 
        fw.write("\n");
        char[] ch={'a','b','c','d'}; //to write an array of character to the file 
        fw.write(ch);
        fw.flush(); //to give the guarantee that the last character of the data also added to the file 
        fw.close(); //to close the stream 

    }
}