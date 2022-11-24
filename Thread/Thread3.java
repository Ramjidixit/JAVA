//sleep in thread 

public class Thread3 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 10; i++) {
            System.out.println("hello " + i);
            Thread.sleep(1000); // time in milliseconds
        }
    }
}
/*
 * hello 0
 * hello 1
 * hello 2
 * hello 3
 * hello 4
 * hello 5
 * hello 6
 * hello 7
 * hello 8
 * hello 9
 * hello 10
 */