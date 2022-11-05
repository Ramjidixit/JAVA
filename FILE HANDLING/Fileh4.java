import java.io.*;
class Fileh4{
    public static void main(String[] args) throws IOException  {
        File f=new File("Ramya.txt");
        System.out.println(f.exists()); //false
        f.createNewFile(); //creating new file 
        System.out.println(f.exists()); //true
    }
}
