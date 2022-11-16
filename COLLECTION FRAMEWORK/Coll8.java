//child class of vector-stack

import java.util.*;

public class Coll8 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("RAM");
        s.push("Rinku");
        s.push("Shreya");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.search("RAM"));
        System.out.println(s.search("Harshit"));
        System.out.println(s.empty());
    }
}
/*
 * [A, RAM, Rinku, Shreya]
 * Shreya
 * Rinku
 * 2
 * -1
 * false
 */
