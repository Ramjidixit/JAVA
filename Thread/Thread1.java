//threads using runnable interface 

class A implements Runnable {
    public void run() {
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println("Thread A" + i);
        }
    }
}

class B implements Runnable {
    public void run() {
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println("Thread B" + i);
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.start();
        t2.start();
    }
}
/*
 * Thread A0
 * Thread A1
 * Thread A2
 * Thread A3
 * Thread A4
 * Thread A5
 * Thread A6
 * Thread B0
 * Thread B1
 * Thread A7
 * Thread A8
 * Thread B2
 * Thread B3
 * Thread A9
 * Thread A10
 * Thread B4
 * Thread B5
 * Thread B6
 * Thread B7
 * Thread B8
 * Thread B9
 * Thread B10
 */