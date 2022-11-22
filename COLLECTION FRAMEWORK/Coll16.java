//HashSet 

import java.util.*;

public class Coll16 {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("D");
        h.add("c");
        h.add(null);
        h.add(10);
        h.add("Shreya");
        System.out.println(h.add("Shreya"));

        h.add("Shreya"); // not allowed duplicate
        System.out.println(h);
    }
}
/*
 * false
 * [null, Shreya, c, D, 10]
 */
