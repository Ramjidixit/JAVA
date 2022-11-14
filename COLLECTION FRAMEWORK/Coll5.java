
//Array list example
import java.util.*;

public class Coll5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList a = new ArrayList();
        a.add("A");
        a.add(10);
        a.add("A");
        a.add("Parth");
        a.add("Singh");
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(4, "chauhan");
        System.out.println(a);
        a.add(null);
        System.out.println(a);
    }
}
/*
 * [A, 10, A, Parth, Singh]
 * [A, 10, Parth, Singh]
 * [A, 10, Parth, Singh, chauhan]
 * [A, 10, Parth, Singh, chauhan, null]
 */