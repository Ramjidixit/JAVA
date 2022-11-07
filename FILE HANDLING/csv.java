import java.io.*;

public class csv {
    public static void main(String[] args) throws IOException {
        FileWriter pq = new FileWriter("Raj.csv");
        BufferedWriter bw = new BufferedWriter(pq);
        bw.write("name,age,section");
        bw.newLine();
        bw.write("raju,19,d");
        bw.newLine();
        bw.write("RAdhika,96,e");
        bw.flush();
        bw.close();
    }
}
