//enumeration in java.enumeration is the part of cursor

import java.util.*;

public class Coll9 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("one");
        v.addElement("Two");
        v.addElement("Three");
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            String s = (String) e.nextElement();
            System.out.println(s + " " + s.length());
        }
    }
}
/*
 * [one, Two, Three]
 * one 3
 * Two 3
 * Three 5
 */