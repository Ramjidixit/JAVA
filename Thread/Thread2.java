//threads using thread class 

class A extends Thread {
    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("i=" + i + "Thread A");
        }
    }
}

class B extends Thread {
    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("i=" + i + "Thread B");
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        t1.start();
        t2.start();
    }

}
/*
 * i=1Thread A
 * i=2Thread A
 * i=1Thread B
 * i=2Thread B
 * i=3Thread A
 * i=4Thread A
 * i=5Thread A
 * i=3Thread B
 * i=4Thread B
 * i=6Thread A
 * i=7Thread A
 * i=5Thread B
 * i=6Thread B
 * i=8Thread A
 * i=9Thread A
 * i=7Thread B
 * i=8Thread B
 * i=9Thread B
 * i=10Thread A
 * i=10Thread B
 */
