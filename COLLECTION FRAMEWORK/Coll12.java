//list iterator

import java.util.*;

public class Coll12 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("Gla");
        a.add("University");
        a.add("Mathura");
        System.out.println(a);
        ListIterator itr = a.listIterator();
        while (itr.hasNext()) {
            String s = (String) itr.next();
            if (s.equals("Mathura")) {
                // itr.remove();
                // itr.set("Noida");
                itr.add("Lucknow"); // [Gla, University, Mathura, Lucknow]

            }
        }
        System.out.println(a);
    }

}
