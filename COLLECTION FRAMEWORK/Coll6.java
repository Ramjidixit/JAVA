//LinkedList example

import java.util.*;

public class Coll6 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Shreya");
        l.add("Ram");
        l.add(30);
        l.add(null);
        System.out.println(l);
        l.set(0, "hiiiii");
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.addFirst("namaste");
        System.out.println(l);

    }
}
/*
 * [Shreya, Ram, 30, null]
 * [hiiiii, Ram, 30, null]
 * [hiiiii, Ram, 30]
 * [namaste, hiiiii, Ram, 30]
 */